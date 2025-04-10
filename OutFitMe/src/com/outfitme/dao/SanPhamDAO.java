/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.outfitme.dao;
import com.outfitme.entity.SanPham;
import com.outfitme.utils.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MINH HUNG
 */
public class SanPhamDAO extends OutFitMeDAO<SanPham, String> {

    @Override
    public void insert(SanPham model) {
        String sql = "INSERT INTO SanPham (TenSanPham, LoaiSanPham, MoTa, GiaNhap, GiaBan, Size, SoLuongTonKho, PhanLoai, HinhAnh) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getTenSP(),
                model.getLoaiSP(),
                model.getMoTa(),
                model.getGiaNhap(),
                model.getGiaBan(),
                model.getSize(),
                model.getSoLuongTonKho(),
                model.getPhanLoai(),
                model.getHinhAnh()); // Thêm ảnh
    }

    @Override
    public void update(SanPham model) {
        String sql = "UPDATE SanPham SET TenSanPham = ?, LoaiSanPham = ?, MoTa = ?, GiaNhap = ?, GiaBan = ?, Size = ?, SoLuongTonKho = ?, PhanLoai = ?, HinhAnh = ? " +
                     "WHERE MaSanPham = ?";
        XJdbc.update(sql,
                model.getTenSP(),
                model.getLoaiSP(),
                model.getMoTa(),
                model.getGiaNhap(),
                model.getGiaBan(),
                model.getSize(),
                model.getSoLuongTonKho(),
                model.getPhanLoai(),
                model.getHinhAnh(), // Thêm ảnh
                model.getMaSP());
    }

    @Override
    public void delete(String maSP) {
        String sql = "DELETE FROM SanPham WHERE MaSanPham = ?";
        XJdbc.update(sql, maSP);
    }

    @Override
    public SanPham selectById(String maSP) {
        String sql = "SELECT * FROM SanPham WHERE MaSanPham = ?";
        List<SanPham> list = this.selectBySql(sql, maSP);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<SanPham> selectAll() {
        String sql = "SELECT * FROM SanPham";
        return selectBySql(sql);
    }

    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try (ResultSet rs = XJdbc.query(sql, args)) {
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getString("MaSanPham"));
                sp.setTenSP(rs.getString("TenSanPham"));
                sp.setLoaiSP(rs.getString("LoaiSanPham"));
                sp.setMoTa(rs.getString("MoTa"));
                sp.setGiaNhap(rs.getDouble("GiaNhap"));
                sp.setGiaBan(rs.getDouble("GiaBan"));
                sp.setSize(rs.getString("Size"));
                sp.setSoLuongTonKho(rs.getInt("SoLuongTonKho"));
                sp.setPhanLoai(rs.getString("PhanLoai"));
                sp.setHinhAnh(rs.getString("HinhAnh")); // Lấy ảnh
                list.add(sp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<String> getAllLoaiSanPham() {
        List<String> list = new ArrayList<>();
        String sql = "SELECT DISTINCT LoaiSanPham FROM SanPham";
        try (ResultSet rs = XJdbc.query(sql)) {
            while (rs.next()) {
                list.add(rs.getString("LoaiSanPham"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<SanPham> selectByLoaiSP(String loaiSP) {
        String sql = "SELECT * FROM SanPham WHERE LoaiSanPham = ?";
        return selectBySql(sql, loaiSP);
    }
    
    public SanPham selectLast() {
    String sql = "SELECT TOP 1 * FROM SanPham ORDER BY MaSanPham DESC";
    List<SanPham> list = selectBySql(sql);
    return list.isEmpty() ? null : list.get(0);
}
}


    

