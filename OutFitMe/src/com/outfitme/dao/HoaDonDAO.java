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
public class HoaDonDAO extends OutFitMeDAO<HoaDon, Integer> { // Đổi kiểu khóa chính thành Integer (Id)

    @Override
    public void insert(HoaDon model) {
        String sql = "INSERT INTO HoaDon (SoHD, NgayLap, MaNhanVien, MaKhachHang, SoLuong, MaSanPham, Size) VALUES (?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getSoHD(),
                model.getNgayLap(),
                model.getMaNV(),
                model.getMaKH(),
                model.getSoLuong(), // Đảm bảo lưu đúng SoLuong
                model.getMaSP(),
                model.getSize()
        );
    }

    @Override
    public void update(HoaDon model) {
        String sql = "UPDATE HoaDon SET SoHD = ?, NgayLap = ?, MaNhanVien = ?, MaKhachHang = ?, SoLuong = ?, MaSanPham = ?, Size = ? WHERE Id = ?";
        XJdbc.update(sql,
                model.getSoHD(), // SoHD do người dùng nhập
                model.getNgayLap(),
                model.getMaNV(),
                model.getMaKH(),
                model.getSoLuong(),
                model.getMaSP(),
                model.getSize(),
                model.getId() // Sử dụng Id để xác định bản ghi
        );
    }

    @Override
    public void delete(Integer id) { // Đổi tham số thành Id
        String sql = "DELETE FROM HoaDon WHERE Id = ?";
        XJdbc.update(sql, id);
    }

    @Override
    public HoaDon selectById(Integer id) { // Đổi tham số thành Id
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
                    entity.setId(rs.getInt("Id"));              // Đọc cột Id
                    entity.setSoHD(rs.getString("SoHD"));       // Đọc SoHD dạng chuỗi
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

    // Thêm phương thức để tìm kiếm theo SoHD (vì SoHD không còn là khóa chính)
    public List<HoaDon> selectBySoHD(String soHD) {
        String sql = "SELECT * FROM HoaDon WHERE SoHD = ?";
        return this.selectBySql(sql, soHD);
    }

}
