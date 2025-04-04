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
        String sql = "INSERT INTO HoaDon (SoHoaDon, NgayLap, MaNV, MaKH, MaSP, TenSP, Size) VALUES (?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getSoHD(),
                model.getNgayLap(),
                model.getMaNV(),
                model.getMaKH(),
                model.getMaSP(),
                model.getTenSP(),
                model.getSize()
        );
    }

    @Override
    public void update(TimKiemKhachHang model) {
        String sql = "UPDATE HoaDon SET NgayLap = ?, MaNV = ?, MaKH = ?, MaSP = ?, TenSP = ?, Size = ? WHERE SoHoaDon = ?";
        XJdbc.update(sql,
                model.getNgayLap(),
                model.getMaNV(),
                model.getMaKH(),
                model.getMaSP(),
                model.getTenSP(),
                model.getSize(),
                model.getSoHD()
        );
    }

    @Override
    public void delete(String soHD) {
        String sql = "DELETE FROM HoaDon WHERE SoHoaDon = ?";
        XJdbc.update(sql, soHD);
    }

    public TimKiemKhachHang selectById(String soHD) {
        String sql = "SELECT * FROM HoaDon WHERE SoHoaDon = ?";
        return selectOne(sql, soHD);
    }

    @Override
    public List<TimKiemKhachHang> selectAll() {
        String sql = "SELECT * FROM HoaDon";
        return this.selectBySql(sql);
    }

    private TimKiemKhachHang selectOne(String sql, Object... args) {
        List<TimKiemKhachHang> list = selectBySql(sql, args);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    protected List<TimKiemKhachHang> selectBySql(String sql, Object... args) {
        List<TimKiemKhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    TimKiemKhachHang entity = new TimKiemKhachHang();
                    entity.setSoHD(rs.getString("SoHoaDon"));
                    entity.setNgayLap(rs.getDate("NgayLap"));
                    entity.setMaNV(rs.getString("MaNV"));

                    // Kiểm tra nếu cột MaKH tồn tại
                    try {
                        entity.setMaKH(rs.getString("MaKH"));
                    } catch (SQLException e) {
                        System.out.println("Cột 'MaKH' không tồn tại trong cơ sở dữ liệu.");
                        entity.setMaKH(""); // Gán giá trị rỗng nếu cột không tồn tại
                    }

                    entity.setMaSP(rs.getString("MaSP"));
                    entity.setTenSP(rs.getString("TenSP"));
                    entity.setSize(rs.getString("Size"));
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

    // Tìm kiếm hóa đơn theo số điện thoại khách hàng
    public List<TimKiemKhachHang> selectByKeyword(String soDienThoai) {
        String sql = "SELECT * FROM KhachHang WHERE SDT = ?";
        return selectBySql(sql, soDienThoai);
    }
}
