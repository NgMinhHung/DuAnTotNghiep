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
                + "(MaNhanVien, TenNhanVien, GioiTinh, NgaySinh, DiaChi, SoDienThoai, TenDangNhap, MatKhau, ChucVu) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getMaNV(),
                model.getTenNV(),
                model.isGioiTinh(),
                model.getNgaySinh(),
                model.getDiaChi(),
                model.getSoDienThoai(),
                model.getTenDangNhap(),
                model.getMatKhau(),
                model.isChucVu());
    }

    @Override
    public void update(NhanVien model) {
        String sql = "UPDATE NhanVien SET TenNhanVien = ?, GioiTinh = ?, NgaySinh = ?, DiaChi = ?, SoDienThoai = ?, "
                + "TenDangNhap = ?, MatKhau = ?, ChucVu = ? WHERE MaNhanVien = ?";
        XJdbc.update(sql,
                model.getTenNV(),
                model.isGioiTinh(),
                model.getNgaySinh(),
                model.getDiaChi(),
                model.getSoDienThoai(),
                model.getTenDangNhap(),
                model.getMatKhau(),
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
        List<NhanVien> list = this.selectBySql(sql,TenDangNhap );
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
    ResultSet rs = null; // Đảm bảo rs được khởi tạo ở ngoài try
    try {
        rs = XJdbc.query(sql, args);
        while (rs != null && rs.next()) { // Kiểm tra rs != null trước khi duyệt
            NhanVien entity = new NhanVien();
            entity.setMaNV(rs.getString("MaNhanVien")); // Sửa lại từ "MaNV" thành "MaNhanVien"
            entity.setTenNV(rs.getString("TenNhanVien"));
            entity.setGioiTinh(rs.getBoolean("GioiTinh"));
            entity.setNgaySinh(rs.getDate("NgaySinh"));
            entity.setDiaChi(rs.getString("DiaChi"));
            entity.setSoDienThoai(rs.getString("SoDienThoai"));
            entity.setTenDangNhap(rs.getString("TenDangNhap"));
            entity.setMatKhau(rs.getString("MatKhau"));
            entity.setChucVu(rs.getBoolean("ChucVu"));
            list.add(entity);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        throw new RuntimeException("Lỗi truy vấn dữ liệu", ex);
    } finally {
        // Đảm bảo luôn đóng kết nối nếu rs không null
        try {
            if (rs != null) {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    return list;
}

}
