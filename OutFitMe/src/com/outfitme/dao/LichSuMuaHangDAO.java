package com.outfitme.dao;

import com.outfitme.entity.LichSuMuaHang;
import com.outfitme.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LichSuMuaHangDAO {

    public void insert(LichSuMuaHang entity) {
        String sql = "INSERT INTO LichSuMuaHang (MaKhachHang, ThoiGian, SanPham, TongTien) VALUES (?, ?, ?, ?)";
        try {
            XJdbc.update(sql,
                    entity.getMaKhachHang(),
                    new java.sql.Timestamp(entity.getThoiGian().getTime()),
                    entity.getSanPham(),
                    entity.getTongTien()
            );
        } catch (Exception e) {
            throw new RuntimeException("Lỗi khi thêm lịch sử mua hàng: " + e.getMessage());
        }
    }

    public void delete(String maGiaoDich) {
        String sql = "DELETE FROM LichSuMuaHang WHERE MaGiaoDich = ?";
        XJdbc.update(sql, maGiaoDich);
    }

    public void update(LichSuMuaHang entity) {
        String sql = "UPDATE LichSuMuaHang SET MaKhachHang = ?, ThoiGian = ?, SanPham = ?, TongTien = ? WHERE MaGiaoDich = ?";
        XJdbc.update(sql,
                entity.getMaKhachHang(),
                new java.sql.Timestamp(entity.getThoiGian().getTime()),
                entity.getSanPham(),
                entity.getTongTien(),
                entity.getMaGiaoDich()
        );
    }

    public List<LichSuMuaHang> selectAll() {
        String sql = "SELECT LichSuMuaHang.*, KhachHang.TenKhachHang FROM LichSuMuaHang " +
                     "JOIN KhachHang ON LichSuMuaHang.MaKhachHang = KhachHang.MaKhachHang";
        return selectBySql(sql);
    }

    public LichSuMuaHang selectById(String maGiaoDich) {
        String sql = "SELECT LichSuMuaHang.*, KhachHang.TenKhachHang FROM LichSuMuaHang " +
                     "JOIN KhachHang ON LichSuMuaHang.MaKhachHang = KhachHang.MaKhachHang " +
                     "WHERE LichSuMuaHang.MaGiaoDich = ?";
        List<LichSuMuaHang> list = selectBySql(sql, maGiaoDich);
        return list.isEmpty() ? null : list.get(0);
    }

    public List<LichSuMuaHang> search(String keyword) {
        String sql = "SELECT LichSuMuaHang.*, KhachHang.TenKhachHang FROM LichSuMuaHang " +
                     "JOIN KhachHang ON LichSuMuaHang.MaKhachHang = KhachHang.MaKhachHang " +
                     "WHERE LichSuMuaHang.MaKhachHang LIKE ? OR LichSuMuaHang.SanPham LIKE ?";
        return selectBySql(sql, "%" + keyword + "%", "%" + keyword + "%");
    }

    private List<LichSuMuaHang> selectBySql(String sql, Object... args) {
        List<LichSuMuaHang> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                LichSuMuaHang entity = new LichSuMuaHang();
                entity.setMaGiaoDich(rs.getInt("MaGiaoDich"));
                entity.setMaKhachHang(rs.getString("MaKhachHang"));
                entity.setThoiGian(rs.getTimestamp("ThoiGian"));
                entity.setSanPham(rs.getString("SanPham"));
                entity.setTongTien(rs.getDouble("TongTien"));
                entity.setTenKhachHang(rs.getString("TenKhachHang")); 
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException e) {
            throw new RuntimeException("Lỗi khi truy vấn lịch sử mua hàng: " + e.getMessage());
        }
        return list;
    }
}
