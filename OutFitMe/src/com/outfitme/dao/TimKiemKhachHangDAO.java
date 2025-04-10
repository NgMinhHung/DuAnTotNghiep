/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.outfitme.dao;

import com.outfitme.entity.KhachHang;
import com.outfitme.entity.TimKiemKhachHang;
import com.outfitme.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class TimKiemKhachHangDAO extends OutFitMeDAO<TimKiemKhachHang, String> {
     @Override
    public void insert(TimKiemKhachHang model) {
        String sql = "INSERT INTO LichSuMuaHang (MaKhachHang, ThoiGian, SanPham, TongTien, MaNhanVien, SoLuong, MaSanPham) VALUES (?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getMaKH(),
                model.getNgayLap(),
                model.getTenSP(),
                model.getTongTien(), // ✅ Dùng đúng getter
                model.getMaNV(),
                Integer.parseInt(model.getSize()),
                model.getMaSP()
        );
    }

    @Override
    public void update(TimKiemKhachHang model) {
        String sql = "UPDATE LichSuMuaHang SET ThoiGian=?, SanPham=?, TongTien=?, MaNhanVien=?, SoLuong=?, MaSanPham=? WHERE MaGiaoDich=?";
        XJdbc.update(sql,
                model.getNgayLap(),
                model.getTenSP(),
                model.getTongTien(), // ✅ Cập nhật tổng tiền
                model.getMaNV(),
                Integer.parseInt(model.getSize()),
                model.getMaSP(),
                Integer.parseInt(model.getSoHD()) // SoHD dùng làm MaGiaoDich
        );
    }

    @Override
    public void delete(String maGiaoDich) {
        String sql = "DELETE FROM LichSuMuaHang WHERE MaGiaoDich=?";
        XJdbc.update(sql, maGiaoDich);
    }

    public TimKiemKhachHang selectById(String maGiaoDich) {
        String sql = "SELECT * FROM LichSuMuaHang WHERE MaGiaoDich=?";
        return selectOne(sql, maGiaoDich);
    }

    @Override
    public List<TimKiemKhachHang> selectAll() {
        String sql = """
        SELECT ls.*, kh.TenKhachHang 
        FROM LichSuMuaHang ls 
        JOIN KhachHang kh ON ls.MaKhachHang = kh.MaKhachHang
    """;
        return this.selectBySql(sql);
    }

    private TimKiemKhachHang selectOne(String sql, Object... args) {
        List<TimKiemKhachHang> list = selectBySql(sql, args);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    protected List<TimKiemKhachHang> selectBySql(String sql, Object... args) {
        List<TimKiemKhachHang> list = new ArrayList<>();
        try (ResultSet rs = XJdbc.query(sql, args)) {
            while (rs.next()) {
                TimKiemKhachHang entity = new TimKiemKhachHang();
                entity.setSoHD(String.valueOf(rs.getInt("MaGiaoDich")));
                entity.setNgayLap(rs.getTimestamp("ThoiGian"));
                entity.setMaNV(rs.getString("MaNhanVien"));
                entity.setMaKH(rs.getString("MaKhachHang"));
                entity.setTenKH(rs.getString("TenKhachHang")); // ✅ tên khách
                entity.setMaSP(rs.getString("MaSanPham"));
                entity.setTenSP(rs.getString("SanPham"));
                entity.setSize(String.valueOf(rs.getInt("SoLuong")));
                entity.setTongTien(rs.getDouble("TongTien"));  // ✅ tổng tiền
                list.add(entity);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }

// 🔍 Lấy dữ liệu lịch sử mua hàng theo số điện thoại
    public List<TimKiemKhachHang> selectByKeyword(String soDienThoai) {
        String sql = """
        SELECT ls.MaGiaoDich, ls.ThoiGian, ls.MaNhanVien, ls.MaKhachHang, kh.TenKhachHang,
               ls.MaSanPham, ls.SanPham, ls.SoLuong, ls.TongTien
        FROM LichSuMuaHang ls
        JOIN KhachHang kh ON ls.MaKhachHang = kh.MaKhachHang
        WHERE kh.SoDienThoai = ?
    """;
        return selectBySql(sql, soDienThoai);
    }

}
