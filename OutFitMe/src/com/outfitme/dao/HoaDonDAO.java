/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.outfitme.dao;

import com.outfitme.entity.HoaDon;
import com.outfitme.utils.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MINH HUNG
 */
public class HoaDonDAO extends OutFitMeDAO<HoaDon, String> {

    public void insert(HoaDon model) {
        String sql = "INSERT INTO HoaDon (SoHoaDon, NgayLap, MaNhanVien, MaKhachHang, MaSanPham) VALUES (?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getSoHD(),
                model.getNgayLap(),
                model.getMaNV(),
                model.getMaKH(),
                model.getMaSP());
    }

    public void update(HoaDon model) {
        String sql = "UPDATE HoaDon SET NgayLap=?, MaNhanVien=?, MaKhachHang=?, MaSanPham=? WHERE SoHoaDon=?";
        try {
            XJdbc.update(sql,
                    model.getNgayLap(),
                    model.getMaNV(),
                    model.getMaKH(),
                    model.getMaSP(),
                    model.getSoHD());
        } catch (Exception e) {
            e.printStackTrace(); // Ghi log lỗi
            throw new RuntimeException("Lỗi cập nhật hóa đơn: " + e.getMessage());
        }
    }

    public void delete(String soHoaDon) {
        String sql = "DELETE FROM HoaDon WHERE SoHoaDon=?";
        XJdbc.update(sql, soHoaDon);
    }

    public List<HoaDon> selectAll() {
        String sql = "SELECT hd.SoHoaDon, hd.NgayLap, hd.MaNhanVien, hd.MaKhachHang, hd.MaSanPham, sp.TenSanPham "
                + "FROM HoaDon hd "
                + "LEFT JOIN SanPham sp ON hd.MaSanPham = sp.MaSanPham";
        return this.selectBySql(sql);
    }

    public HoaDon selectById(String soHoaDon) {
        String sql = "SELECT hd.SoHoaDon, hd.NgayLap, hd.MaNhanVien, hd.MaKhachHang, hd.MaSanPham, sp.TenSanPham "
                + "FROM HoaDon hd "
                + "LEFT JOIN SanPham sp ON hd.MaSanPham = sp.MaSanPham "
                + "WHERE hd.SoHoaDon=?";
        List<HoaDon> list = this.selectBySql(sql, soHoaDon);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<HoaDon> selectByMultipleConditions(String soHD, String maSP, String ngayLapHD, String maNV, String maKH) {
        String sql = "SELECT hd.SoHoaDon, hd.NgayLap, hd.MaNhanVien, hd.MaKhachHang, hd.MaSanPham, sp.TenSanPham "
                + "FROM HoaDon hd "
                + "LEFT JOIN SanPham sp ON hd.MaSanPham = sp.MaSanPham "
                + "WHERE (? IS NULL OR hd.SoHoaDon LIKE ?) "
                + "AND (? IS NULL OR hd.MaNhanVien LIKE ?) "
                + "AND (? IS NULL OR hd.NgayLap = ?) "
                + "AND (? IS NULL OR hd.MaSanPham LIKE ?) "
                + "AND (? IS NULL OR hd.MaKhachHang LIKE ?)";
        return this.selectBySql(sql,
                soHD.isEmpty() ? null : "%" + soHD + "%", soHD.isEmpty() ? null : "%" + soHD + "%",
                maNV.isEmpty() ? null : "%" + maNV + "%", maNV.isEmpty() ? null : "%" + maNV + "%",
                ngayLapHD.isEmpty() ? null : ngayLapHD, ngayLapHD.isEmpty() ? null : ngayLapHD,
                maSP.isEmpty() ? null : "%" + maSP + "%", maSP.isEmpty() ? null : "%" + maSP + "%",
                maKH.isEmpty() ? null : "%" + maKH + "%", maKH.isEmpty() ? null : "%" + maKH + "%");
    }

    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                HoaDon entity = new HoaDon();
                entity.setSoHD(rs.getString("SoHoaDon"));
                entity.setNgayLap(rs.getDate("NgayLap"));
                entity.setMaNV(rs.getString("MaNhanVien"));
                entity.setMaKH(rs.getString("MaKhachHang")); // ✅ Lấy MaKH
                entity.setMaSP(rs.getString("MaSanPham"));  // ✅ Lấy MaSP
                entity.setTenSP(rs.getString("TenSanPham")); // ✅ Lấy TenSP từ bảng SanPham
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    public List<String> layMaSanPhamTheoHoaDon(String soHoaDon) {
        List<String> danhSachMaSP = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT MaSanPham FROM HoaDon WHERE SoHoaDon = ?";
            ResultSet rs = XJdbc.query(sql, soHoaDon);
            while (rs.next()) {
                danhSachMaSP.add(rs.getString("MaSanPham"));
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return danhSachMaSP;
    }

    public List<String[]> laySanPhamTheoHoaDon(String soHoaDon) {
        List<String[]> danhSachSanPham = new ArrayList<>();
        try {
            String sql = "SELECT sp.MaSanPham, sp.TenSanPham "
                    + "FROM HoaDon hd "
                    + "JOIN SanPham sp ON hd.MaSanPham = sp.MaSanPham "
                    + "WHERE hd.SoHoaDon = ?";
            ResultSet rs = XJdbc.query(sql, soHoaDon);
            while (rs.next()) {
                String[] sanPham = {rs.getString("MaSanPham"), rs.getString("TenSanPham")};
                danhSachSanPham.add(sanPham);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return danhSachSanPham;
    }

    public String layTenSanPham(String maSP) {
        String tenSP = "";
        try {
            String sql = "SELECT TenSanPham FROM SanPham WHERE MaSanPham = ?";
            ResultSet rs = XJdbc.query(sql, maSP);
            if (rs.next()) {
                tenSP = rs.getString("TenSanPham");
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tenSP;
    }

public HoaDon findBySoHD(String soHD) {
    String sql = "SELECT SoHoaDon, NgayLap, MaNhanVien, MaSanPham, MaKhachHang FROM HoaDon WHERE SoHoaDon = ?";
    try {
        ResultSet rs = XJdbc.query(sql, soHD);
        if (rs.next()) {
            HoaDon hd = new HoaDon();
            hd.setSoHD(rs.getString("SoHoaDon"));
            hd.setNgayLap(rs.getDate("NgayLap"));
            hd.setMaNV(rs.getString("MaNhanVien")); // ✅ Đổi từ MaNV -> MaNhanVien
            hd.setMaSP(rs.getString("MaSanPham"));  // ✅ Đổi từ MaSP -> MaSanPham
            hd.setMaKH(rs.getString("MaKhachHang"));// ✅ Đổi từ MaKH -> MaKhachHang
            return hd;
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    return null;
}


}
