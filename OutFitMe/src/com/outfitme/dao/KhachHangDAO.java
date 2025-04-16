package com.outfitme.dao;

import com.outfitme.entity.KhachHang;
import com.outfitme.utils.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KhachHangDAO extends OutFitMeDAO<KhachHang, String> {

    @Override
    public void insert(KhachHang model) {
        String sql = "INSERT INTO KhachHang (MaKhachHang, TenKhachHang, SoDienThoai, GioiTinh, DiaChi, HinhAnh, Diem) VALUES (?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getMaKH(),
                model.getTenKH(),
                model.getSoDienThoai(),
                model.isGioiTinh(),
                model.getDiaChi(),
                model.getHinhAnh(), 
                model.getDiem());   
    }

    @Override
    public void update(KhachHang model) {
        String sql = "UPDATE KhachHang SET TenKhachHang = ?, GioiTinh = ?, DiaChi = ?, SoDienThoai = ?, HinhAnh = ?, Diem = ? WHERE MaKhachHang = ?";
        XJdbc.update(sql,
                model.getTenKH(),
                model.isGioiTinh(),
                model.getDiaChi(),
                model.getSoDienThoai(),
                model.getHinhAnh(),  
                model.getDiem(),    
                model.getMaKH());
    }

    @Override
 public void delete(String soDienThoai) {
    try {
        String sqlUpdateHoaDon = "UPDATE HoaDon SET MaKhachHang = NULL WHERE MaKhachHang = (SELECT MaKhachHang FROM KhachHang WHERE SoDienThoai = ?)";
        XJdbc.update(sqlUpdateHoaDon, soDienThoai);
        String sqlDeleteKhachHang = "DELETE FROM KhachHang WHERE SoDienThoai = ?";
        XJdbc.update(sqlDeleteKhachHang, soDienThoai);
    } catch (Exception e) {
        throw new RuntimeException("Không thể xóa khách hàng. Dữ liệu đang được sử dụng trong lịch sử mua hàng hoặc hóa đơn.");
    }
}

    public KhachHang selectById(String maKH) {
        String sql = "SELECT * FROM KhachHang WHERE MaKhachHang = ?";
        return selectOne(sql, maKH);
    }

    public List<KhachHang> selectByMaKH(String maKH) {
        String sql = "SELECT * FROM KhachHang WHERE MaKhachHang LIKE ?";
        return this.selectBySql(sql, maKH + "%");
    }

    public List<KhachHang> selectByKeyword(String keyWord) {
        String sql = "SELECT * FROM KhachHang WHERE SoDienThoai LIKE ?";
        return selectBySql(sql, "%" + keyWord + "%");
    }

    private KhachHang selectOne(String sql, Object... args) {
        List<KhachHang> list = selectBySql(sql, args);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public List<KhachHang> selectAll() {
        String sql = "SELECT * FROM KhachHang";
        return this.selectBySql(sql);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    KhachHang entity = new KhachHang();
                    entity.setMaKH(rs.getString("MaKhachHang"));
                    entity.setTenKH(rs.getString("TenKhachHang"));
                    entity.setSoDienThoai(rs.getString("SoDienThoai"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setHinhAnh(rs.getString("HinhAnh"));
                    entity.setDiem(rs.getInt("Diem"));      
                    list.add(entity);
                }
            } finally {
                if (rs != null) {
                    rs.getStatement().getConnection().close();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Lỗi khi truy vấn cơ sở dữ liệu: " + ex.getMessage());
        }
        return list;
    }
    public boolean isDuplicate(KhachHang model) {
        String sql = """
        SELECT COUNT(*) FROM KhachHang 
        WHERE TenKhachHang = ? AND DiaChi = ? AND GioiTinh = ? AND SoDienThoai = ? AND HinhAnh = ? 
    """;
        try (ResultSet rs = XJdbc.query(sql,
                model.getTenKH(),
                model.getDiaChi(),
                model.isGioiTinh(),
                model.getSoDienThoai(),
                model.getHinhAnh())) {
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
