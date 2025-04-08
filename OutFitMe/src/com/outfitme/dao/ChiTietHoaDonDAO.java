package com.outfitme.dao;

import com.outfitme.entity.ChiTietHoaDon;
//import com.outfitme.utils.XJdbc;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;

import com.outfitme.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MINH HUNG
 */
public class ChiTietHoaDonDAO extends OutFitMeDAO<ChiTietHoaDon, Integer> {  // Đổi String thành Integer vì khóa chính giờ là Id

    @Override
    public void insert(ChiTietHoaDon entity) {
        String sql = "INSERT INTO HoaDon (SoHD, NgayLap, MaNhanVien, MaKhachHang, SoLuong, MaSanPham) VALUES (?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                entity.getSoHD(),
                entity.getNgayLap(),
                entity.getMaNV(),
                entity.getMaKH(),
                entity.getSoLuong(),
                entity.getMaSP()
        );
    }

    @Override
    public void update(ChiTietHoaDon entity) {
        String sql = "UPDATE HoaDon SET SoHD = ?, NgayLap = ?, MaNhanVien = ?, MaKhachHang = ?, SoLuong = ?, MaSanPham = ? WHERE Id = ?";
        XJdbc.update(sql,
                entity.getSoHD(),
                entity.getNgayLap(),
                entity.getMaNV(),
                entity.getMaKH(),
                entity.getSoLuong(),
                entity.getMaSP(),
                entity.getId()
        );
    }

    @Override
    public void delete(Integer id) {  // Đổi tham số từ String soHD thành Integer id
        String sql = "DELETE FROM HoaDon WHERE Id = ?";
        XJdbc.update(sql, id);
    }

    // Thêm phương thức xóa theo MaKH
    public void deleteByMaKH(String maKH) {
        String sql = "DELETE FROM HoaDon WHERE MaKhachHang = ?";
        XJdbc.update(sql, maKH);
    }

    @Override
    public ChiTietHoaDon selectById(Integer id) {  // Đổi tham số từ String soHD thành Integer id
        String sql = """
        SELECT hd.Id, hd.SoHD, hd.NgayLap, nv.MaNhanVien, nv.TenNhanVien, 
               sp.MaSanPham, sp.TenSanPham, hd.Size, hd.SoLuong, sp.GiaBan, 
               (sp.GiaBan * hd.SoLuong) AS TongTien, hd.MaKhachHang
        FROM HoaDon hd
        JOIN NhanVien nv ON hd.MaNhanVien = nv.MaNhanVien
        JOIN SanPham sp ON hd.MaSanPham = sp.MaSanPham
        WHERE hd.Id = ?
    """;
        List<ChiTietHoaDon> list = this.selectBySql(sql, id);
        return list.isEmpty() ? null : list.get(0);
    }

    // Thêm phương thức tìm kiếm theo SoHD
    public ChiTietHoaDon selectBySoHD(String soHD) {
        String sql = """
        SELECT hd.Id, hd.SoHD, hd.NgayLap, nv.MaNhanVien, nv.TenNhanVien, 
               sp.MaSanPham, sp.TenSanPham, hd.Size, hd.SoLuong, sp.GiaBan, 
               (sp.GiaBan * hd.SoLuong) AS TongTien, hd.MaKhachHang
        FROM HoaDon hd
        JOIN NhanVien nv ON hd.MaNhanVien = nv.MaNhanVien
        JOIN SanPham sp ON hd.MaSanPham = sp.MaSanPham
        WHERE hd.SoHD = ?
    """;
        List<ChiTietHoaDon> list = this.selectBySql(sql, soHD);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public List<ChiTietHoaDon> selectAll() {
        String sql = """
        SELECT hd.Id, hd.SoHD, hd.NgayLap, nv.MaNhanVien, nv.TenNhanVien, 
               sp.MaSanPham, sp.TenSanPham, hd.Size, hd.SoLuong, sp.GiaBan, 
               (sp.GiaBan * hd.SoLuong) AS TongTien, hd.MaKhachHang
        FROM HoaDon hd
        JOIN NhanVien nv ON hd.MaNhanVien = nv.MaNhanVien
        JOIN SanPham sp ON hd.MaSanPham = sp.MaSanPham
    """;
        return this.selectBySql(sql);
    }

    @Override
    protected List<ChiTietHoaDon> selectBySql(String sql, Object... args) {
        List<ChiTietHoaDon> list = new ArrayList<>();
        try (ResultSet rs = XJdbc.query(sql, args)) {
            while (rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon(
                        rs.getInt("Id"),          // Thêm Id
                        rs.getString("SoHD"),     // Số hóa đơn nhập tay
                        rs.getDate("NgayLap"),    // Ngày lập hóa đơn
                        rs.getString("MaNhanVien"), // Mã nhân viên
                        rs.getString("TenNhanVien"), // Tên nhân viên
                        rs.getString("MaSanPham"),  // Mã sản phẩm
                        rs.getString("TenSanPham"), // Tên sản phẩm
                        rs.getString("Size"),      // Size
                        rs.getInt("SoLuong"),     // Số lượng
                        rs.getDouble("GiaBan"),   // Giá bán
                        rs.getDouble("TongTien"), // Tổng tiền
                        rs.getString("MaKhachHang") // Mã khách hàng
                );
                list.add(cthd);
            }
            System.out.println("Số dòng dữ liệu lấy được: " + list.size());
        } catch (SQLException ex) {
            System.err.println("Lỗi khi truy vấn dữ liệu: " + ex.getMessage());
            ex.printStackTrace();
            throw new RuntimeException("Không thể lấy dữ liệu từ cơ sở dữ liệu", ex);
        }
        return list;
    }

    public void deleteAll() {
        String sql = "DELETE FROM HoaDon";
        XJdbc.update(sql);
    }
    
     public List<Object[]> getBysoHD(String maKH1, String soHD1){
        String sql = "{CALL sp_bySoHD2(?, ?)}";
        String[] cols = {"SoHD", "NgayLap", "MaSanPham", "TenSanPham", "Size", "SoLuong", "GiaBan", "TongTien", "MaNhanVien", "MaKhachHang"};
        return this.getListOfArray(sql, cols, maKH1, soHD1);
    }

     
     public List<String> selectYears() {
    String sql = "SELECT DISTINCT hd.MaKhachHang FROM HoaDon hd ORDER BY hd.MaKhachHang DESC";
    List<String> list = new ArrayList<>();
    try {
        ResultSet rs = XJdbc.query(sql);
        while (rs.next()) {
            list.add(rs.getString(1)); 
        }
        rs.getStatement().getConnection().close();

        if (list.isEmpty()) {
            list.add("KH01");
        }

        return list;
    } catch (java.sql.SQLException ex) {
        throw new RuntimeException(ex);
    }
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

         public void deleteBySoHD(String soHD) {
        String sql = "DELETE FROM HoaDon WHERE SoHD = ?";
        XJdbc.update(sql, soHD);
    }
}