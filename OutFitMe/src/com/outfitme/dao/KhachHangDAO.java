/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.outfitme.dao;

import com.outfitme.entity.KhachHang;
import com.outfitme.utils.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class KhachHangDAO extends OutFitMeDAO<KhachHang, String> {

    @Override
    public void insert(KhachHang model) {
        String sql = "INSERT INTO KhachHang "
                + "(MaKhachHang, TenKhachHang, SoDienThoai, GioiTinh, DiaChi) "
                + "VALUES (?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getMaKH(),
                model.getTenKH(),
                model.getSoDienThoai(),
                model.isGioiTinh(),
                model.getDiaChi());

    }

    @Override
    public void update(KhachHang model) {
        String sql = "UPDATE KhachHang SET TenKhachHang = ?, SoDienThoai = ?, GioiTinh = ?,  DiaChi = ? where MaKhachHang = ?";
        XJdbc.update(sql,
                model.getTenKH(),
                model.getSoDienThoai(),
                model.isGioiTinh(),
                model.getDiaChi(),
                model.getMaKH());
        

    
    }

    @Override
    public void delete(String maKH) {
        String sql = "DELETE FROM KhachHang WHERE MaKhachHang = ?";
        XJdbc.update(sql, maKH);
    }

    @Override
    public KhachHang selectById(String maKH) {
        String sql = "SELECT * FROM KhachHang WHERE MaKhachHang = ?";
        List<KhachHang> list = this.selectBySql(sql, maKH);
        return list.size() > 0 ? list.get(0) : null;
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
}
