/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.outfitme.dao;

import com.outfitme.entity.ChiTietHoaDon;
import com.outfitme.utils.XJdbc;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @autshor MINH HUNG
 */
public class ChiTietHoaDonDAO extends OutFitMeDAO<ChiTietHoaDon, String> {

    @Override
    public void insert(ChiTietHoaDon entity) {
        String sql = "INSERT INTO HoaDon (NgayLap, MaNhanVien, MaKhachHang, SoLuong, MaSanPham) VALUES (?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                entity.getNgayLap(),
                entity.getMaNV(),
                entity.getMaKH(),
                entity.getSoLuong(), 
                entity.getMaSP()
        );
    }

    @Override
    public void update(ChiTietHoaDon entity) {
        String sql = "UPDATE HoaDon SET NgayLap = ?, MaNhanVien = ?, MaKhachHang = ?, SoLuong = ?, MaSanPham = ? WHERE SoHD = ?";
        XJdbc.update(sql,
                entity.getNgayLap(),
                entity.getMaNV(),
                entity.getMaKH(),
                entity.getSoLuong(),
                entity.getMaSP(), 
                entity.getSoHD()
        );
    }

    @Override
    public void delete(String soHD) {
        String sql = "DELETE FROM HoaDon WHERE SoHD = ?";
        XJdbc.update(sql, soHD);
    }

   @Override
public ChiTietHoaDon selectById(String soHD) {
    String sql = """
        SELECT hd.SoHD, hd.NgayLap, nv.MaNhanVien, nv.TenNhanVien, 
               sp.MaSanPham, sp.TenSanPham, hd.SoLuong, sp.GiaBan, hd.MaKhachHang
        FROM HoaDon hd
        JOIN NhanVien nv ON hd.MaNhanVien = nv.MaNhanVien
        JOIN SanPham sp ON hd.MaSanPham = sp.MaSanPham
        WHERE hd.SoHD = ?
    """;
    List<ChiTietHoaDon> list = this.selectBySql(sql, soHD);
    return list.isEmpty() ? null : list.get(0);
}

@Override
public List<ChiTietHoaDon> selectAll() {
    String sql = """
        SELECT hd.SoHD, hd.NgayLap, nv.MaNhanVien, nv.TenNhanVien, 
               sp.MaSanPham, sp.TenSanPham, hd.SoLuong, sp.GiaBan, hd.MaKhachHang
        FROM HoaDon hd
        JOIN NhanVien nv ON hd.MaNhanVien = nv.MaNhanVien
        JOIN SanPham sp ON hd.MaSanPham = sp.MaSanPham
    """;
    return this.selectBySql(sql);
}

   @Override
protected List<ChiTietHoaDon> selectBySql(String sql, Object... args) {
    List<ChiTietHoaDon> list = new ArrayList<>();
    try (ResultSet rs = XJdbc.query(sql, args)) {
        while (rs.next()) {
            ChiTietHoaDon cthd = new ChiTietHoaDon(
                rs.getInt("SoHD"),           // Số hóa đơn
                rs.getDate("NgayLap"),       // Ngày lập hóa đơn
                rs.getString("MaNhanVien"),  // Mã nhân viên
                rs.getString("TenNhanVien"), // Tên nhân viên
                rs.getString("MaSanPham"),   // Mã sản phẩm
                rs.getString("TenSanPham"),  // Tên sản phẩm
                rs.getInt("SoLuong"),        // Số lượng
                rs.getDouble("GiaBan"),      // Giá bán
                rs.getString("MaKhachHang")  // Mã khách hàng
            );
            list.add(cthd);
        }
        System.out.println("Số dòng dữ liệu lấy được: " + list.size()); // Debug
    } catch (SQLException ex) {
        System.err.println("Lỗi khi truy vấn dữ liệu: " + ex.getMessage());
        ex.printStackTrace();
        throw new RuntimeException("Không thể lấy dữ liệu từ cơ sở dữ liệu", ex);
    }
    return list;
}
}