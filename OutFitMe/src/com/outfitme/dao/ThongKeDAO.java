/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.outfitme.dao;

import com.outfitme.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MINH HUNG
 */
public class ThongKeDAO {

    public List<Object[]> getDoanhThu(int nam) {
        String sql = "{CALL sp_DoanhThu(?)}";
        String[] cols = {"SoHoaDon", "DoanhThu", "ThapNhat", "CaoNhat", "TrungBinh"};
        return this.getListOfArray(sql, cols, nam);
    }

    public List<Object[]> getSLSP(String maSP, int year) {
        String sql = "{CALL sp_SLSP2 (?, ?)}";
        String[] cols = {"MaSanPham", "TenSanPham", "SoLuongTonKho", "SLDaBan"};
        return this.getListOfArray(sql, cols, maSP, year);
    }
    
    public List<Object[]> getDHNV(String maNV, int nam) {
        String sql = "{CALL sp_HDNV2(?, ?)}";
        String[] cols = {"MaNhanVien", "TenNhanVien", "TongSohoaDon"};
        return this.getListOfArray(sql, cols, maNV, nam);
    }

    public List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Integer> selectYears() {
        String sql = "SELECT DISTINCT YEAR(ThoiGian) AS Year FROM LichSuMuaHang ORDER BY Year DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (java.sql.SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Object[]> getDTTT(int month) {
        String sql = "{CALL sp_DTLS (?)}";
        String[] cols = {"TongGiaoDich", "TongDoanhThu", "ThapNhat", "caoNhat", "TrungBinh"};
        return this.getListOfArray(sql, cols, month);
    }

    public List<Integer> selectMonth() {
        String sql = "SELECT DISTINCT MONTH(ThoiGian) AS Month FROM LichSuMuaHang ORDER BY Month ASC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (java.sql.SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public Object[] selectDoanhThu() {
        String sql = "SELECT COUNT(*) AS SoHoaDon, SUM(TongTien) AS DoanhThu "
                + "FROM LichSuMuaHang";
        try {
            ResultSet rs = XJdbc.query(sql);
            if (rs.next()) {
                Object[] result = new Object[2];
                result[0] = rs.getInt("SoHoaDon");
                result[1] = rs.getDouble("DoanhThu");
                rs.getStatement().getConnection().close();
                return result;
            }
        } catch (java.sql.SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }

    public List<Object[]> getDoanhThuTheoNam(int nam) {
        String sql = "SELECT SUM(SoLuong) AS TongSanPham, "
                + "SUM(TongTien) AS TongDoanhThu, "
                + "MIN(TongTien) AS ThapNhat, "
                + "MAX(TongTien) AS CaoNhat, "
                + "AVG(TongTien) AS TrungBinh "
                + "FROM LichSuMuaHang "
                + "WHERE YEAR(ThoiGian) = ?";
        String[] cols = {"TongSanPham", "TongDoanhThu", "ThapNhat", "CaoNhat", "TrungBinh"};
        return this.getListOfArray(sql, cols, nam);
    }

}
