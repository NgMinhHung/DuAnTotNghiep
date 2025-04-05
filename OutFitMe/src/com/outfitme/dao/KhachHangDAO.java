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
        // Câu lệnh SQL INSERT đã thêm cột HinhAnh và Diem
        String sql = "INSERT INTO KhachHang (MaKhachHang, TenKhachHang, SoDienThoai, GioiTinh, DiaChi, HinhAnh, Diem) VALUES (?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getMaKH(),
                model.getTenKH(),
                model.getSoDienThoai(),
                model.isGioiTinh(),
                model.getDiaChi(),
                model.getHinhAnh(),  // Thêm cột HinhAnh
                model.getDiem());    // Thêm cột Diem
    }

    @Override
    public void update(KhachHang model) {
        // Cập nhật câu lệnh SQL cho cả HinhAnh và Diem
        String sql = "UPDATE KhachHang SET TenKhachHang = ?, GioiTinh = ?, DiaChi = ?, SoDienThoai = ?, HinhAnh = ?, Diem = ? WHERE MaKhachHang = ?";
        XJdbc.update(sql,
                model.getTenKH(),
                model.isGioiTinh(),
                model.getDiaChi(),
                model.getSoDienThoai(),
                model.getHinhAnh(),  // Thêm cột HinhAnh
                model.getDiem(),     // Thêm cột Diem
                model.getMaKH());
    }

    @Override
    public void delete(String soDienThoai) {
        String sqlUpdateHoaDon = "UPDATE HoaDon SET MaKhachHang = NULL WHERE MaKhachHang = (SELECT MaKhachHang FROM KhachHang WHERE SoDienThoai = ?)";
        XJdbc.update(sqlUpdateHoaDon, soDienThoai);
        String sqlDeleteKhachHang = "DELETE FROM KhachHang WHERE SoDienThoai = ?";
        XJdbc.update(sqlDeleteKhachHang, soDienThoai);
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
                    entity.setHinhAnh(rs.getString("HinhAnh")); // Lấy HinhAnh từ cơ sở dữ liệu
                    entity.setDiem(rs.getInt("Diem"));         // Lấy Diem từ cơ sở dữ liệu
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
}
