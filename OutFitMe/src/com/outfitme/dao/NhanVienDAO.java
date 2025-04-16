/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.outfitme.dao;

import com.outfitme.entity.NhanVien;
import com.outfitme.utils.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MINH HUNG
 */
public class NhanVienDAO extends OutFitMeDAO<NhanVien, String> {

    @Override
    public void insert(NhanVien model) {
        String sql = "INSERT INTO NhanVien "
                + "(MaNhanVien, TenNhanVien, GioiTinh, NgaySinh, DiaChi, SoDienThoai, TenDangNhap, MatKhau, HinhAnh, ChucVu) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getMaNV(),
                model.getTenNV(),
                model.isGioiTinh(),
                model.getNgaySinh(),
                model.getDiaChi(),
                model.getSoDienThoai(),
                model.getTenDangNhap(),
                model.getMatKhau(),
                model.getHinhAnh(),
                model.isChucVu());
    }

    @Override
    public void update(NhanVien model) {
        String sql = "UPDATE NhanVien SET TenNhanVien = ?, GioiTinh = ?, NgaySinh = ?, DiaChi = ?, SoDienThoai = ?, "
                + "TenDangNhap = ?, MatKhau = ?, HinhAnh = ?, ChucVu = ? WHERE MaNhanVien = ?";
        XJdbc.update(sql,
                model.getTenNV(),
                model.isGioiTinh(),
                model.getNgaySinh(),
                model.getDiaChi(),
                model.getSoDienThoai(),
                model.getTenDangNhap(),
                model.getMatKhau(),
                model.getHinhAnh(),
                model.isChucVu(),
                model.getMaNV());
    }

    @Override
    public void delete(String maNV) {
        String sql = "DELETE FROM NhanVien WHERE MaNhanVien = ?";
        XJdbc.update(sql, maNV);
    }

    @Override
    public NhanVien selectById(String TenDangNhap) {
        String sql = "SELECT * FROM NhanVien WHERE TenDangNhap = ?";
        List<NhanVien> list = this.selectBySql(sql, TenDangNhap);
        return list.size() > 0 ? list.get(0) : null;
    }

    public NhanVien selectByIdMaNV(String maNV) {
        String sql = "SELECT * FROM NhanVien WHERE MaNhanVien = ?";
        List<NhanVien> list = this.selectBySql(sql, maNV);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<NhanVien> selectAll() {
        String sql = "SELECT * FROM NhanVien";
        return this.selectBySql(sql);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    NhanVien entity = new NhanVien();
                    entity.setMaNV(rs.getString("MaNhanVien"));
                    entity.setTenNV(rs.getString("TenNhanVien"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setNgaySinh(rs.getDate("NgaySinh"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setSoDienThoai(rs.getString("SoDienThoai"));
                    entity.setTenDangNhap(rs.getString("TenDangNhap"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    entity.setHinhAnh(rs.getString("HinhAnh"));
                    entity.setChucVu(rs.getBoolean("ChucVu"));
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
    public static String getTenNhanVienById(String maNV) {
        String sql = "SELECT TenNhanVien FROM NhanVien WHERE MaNhanVien = ?";
        try {
            ResultSet rs = XJdbc.query(sql, maNV);
            if (rs.next()) {
                return rs.getString("TenNhanVien");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
