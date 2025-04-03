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

    @Override
    public void insert(HoaDon model) {
        String sql = "INSERT INTO HoaDon (NgayLap, MaNhanVien, MaKhachHang, SoLuong, MaSanPham) VALUES (?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getNgayLap(),
                model.getMaNV(),
                model.getMaKH(),
                model.getSoLuong(),
                model.getMaSP()
        );
    }

    @Override
    public void update(HoaDon model) {
        String sql = "UPDATE HoaDon SET NgayLap = ?, MaNhanVien = ?, MaKhachHang = ?, SoLuong = ?, MaSanPham = ? "
                + "WHERE SoHD = ?";
        XJdbc.update(sql,
                model.getNgayLap(),
                model.getMaNV(),
                model.getMaKH(),
                model.getSoLuong(),
                model.getMaSP(), // Thêm MaSanPham vào câu lệnh UPDATE
                model.getSoHD()
        );
    }

    @Override
    public void delete(String soHD) {
        String sql = "DELETE FROM HoaDon WHERE SoHD = ?";
        XJdbc.update(sql, soHD);
    }

    @Override
    public HoaDon selectById(String soHD) {
        String sql = "SELECT * FROM HoaDon WHERE SoHD = ?";
        List<HoaDon> list = this.selectBySql(sql, soHD);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<HoaDon> selectAll() {
        String sql = "SELECT * FROM HoaDon";
        return this.selectBySql(sql);
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    HoaDon entity = new HoaDon();
                    entity.setSoHD(rs.getInt("SoHD"));
                    entity.setNgayLap(rs.getDate("NgayLap"));
                    entity.setMaNV(rs.getString("MaNhanVien"));
                    entity.setMaKH(rs.getString("MaKhachHang"));
                    entity.setSoLuong(rs.getInt("SoLuong"));
                    entity.setMaSP(rs.getString("MaSanPham")); // Thêm MaSanPham vào entity
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
}
