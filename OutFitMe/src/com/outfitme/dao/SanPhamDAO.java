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
        String sql = "INSERT INTO SanPham (MaSanPham, TenSanPham, LoaiSanPham, MoTa, GiaNhap, GiaBan, Size, SoLuongTonKho, PhanLoai) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getMaSP(),
                model.getTenSP(),
                model.getLoaiSP(),
                model.getMoTa(),
                model.getGiaNhap(),
                model.getGiaBan(),
                model.getSize(),
                model.getSoLuongTonKho(),
                model.getPhanLoai());
    }

    @Override
    public void update(SanPham model) {
        String sql = "UPDATE SanPham SET TenSanPham = ?, LoaiSanPham = ?, MoTa = ?, GiaNhap = ?, GiaBan = ?, Size = ?, SoLuongTonKho = ?, PhanLoai = ? WHERE MaSanPham = ?";
        XJdbc.update(sql,
                model.getTenSP(),
                model.getLoaiSP(),
                model.getMoTa(),
                model.getGiaNhap(),
                model.getGiaBan(),
                model.getSize(),
                model.getSoLuongTonKho(),
                model.getPhanLoai(),
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
        List<SanPham> list = new ArrayList<>();
        String sql = "SELECT * FROM SanPham";
        try (ResultSet rs = XJdbc.query(sql)) {
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
                list.add(sp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    SanPham entity = new SanPham();
                    entity.setMaSP(rs.getString("MaSanPham"));
                    entity.setTenSP(rs.getString("TenSanPham"));
                    entity.setLoaiSP(rs.getString("LoaiSanPham"));
                    entity.setMoTa(rs.getString("MoTa"));
                    entity.setGiaNhap(rs.getDouble("GiaNhap"));
                    entity.setGiaBan(rs.getDouble("GiaBan"));
                    entity.setSize(rs.getString("Size"));
                    entity.setSoLuongTonKho(rs.getInt("SoLuongTonKho"));
                    entity.setPhanLoai(rs.getString("PhanLoai"));
                    list.add(entity);
                }
            } finally {
                if (rs != null) {
                    rs.getStatement().getConnection().close();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
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
}

    

