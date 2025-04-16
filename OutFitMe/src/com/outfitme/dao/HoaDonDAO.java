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
public class HoaDonDAO extends OutFitMeDAO<HoaDon, Integer> { 

    @Override
    public void insert(HoaDon model) {
        String sql = "INSERT INTO HoaDon (SoHD, NgayLap, MaNhanVien, MaKhachHang, SoLuong, MaSanPham, Size) VALUES (?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getSoHD(),
                model.getNgayLap(),
                model.getMaNV(),
                model.getMaKH(),
                model.getSoLuong(), 
                model.getMaSP(),
                model.getSize()
        );
    }

    @Override
    public void update(HoaDon model) {
        String sql = "UPDATE HoaDon SET SoHD = ?, NgayLap = ?, MaNhanVien = ?, MaKhachHang = ?, SoLuong = ?, MaSanPham = ?, Size = ? WHERE Id = ?";
        XJdbc.update(sql,
                model.getSoHD(),
                model.getNgayLap(),
                model.getMaNV(),
                model.getMaKH(),
                model.getSoLuong(),
                model.getMaSP(),
                model.getSize(),
                model.getId()
        );
    }

    @Override
    public void delete(Integer id) { 
        String sql = "DELETE FROM HoaDon WHERE Id = ?";
        XJdbc.update(sql, id);
    }

    @Override
    public HoaDon selectById(Integer id) {
        String sql = "SELECT * FROM HoaDon WHERE Id = ?";
        List<HoaDon> list = this.selectBySql(sql, id);
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
                    entity.setId(rs.getInt("Id"));             
                    entity.setSoHD(rs.getString("SoHD"));       
                    entity.setNgayLap(rs.getDate("NgayLap"));
                    entity.setMaNV(rs.getString("MaNhanVien"));
                    entity.setMaKH(rs.getString("MaKhachHang"));
                    entity.setSoLuong(rs.getInt("SoLuong"));
                    entity.setMaSP(rs.getString("MaSanPham"));
                    entity.setSize(rs.getString("Size"));
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
    public List<HoaDon> selectBySoHD(String soHD) {
        String sql = "SELECT * FROM HoaDon WHERE SoHD = ?";
        return this.selectBySql(sql, soHD);
    }


}
