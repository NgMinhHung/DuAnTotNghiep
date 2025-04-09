package com.outfitme.entity;

import java.util.Date;

public class LichSuMuaHang {

    private int maGiaoDich;
    private String maKhachHang;
    private Date thoiGian;
    private String sanPham;
    private double tongTien;
    private String tenKhachHang;
    private String maNhanVien;
    private String maSanPham;
    private int soLuong;

    public LichSuMuaHang() {
    }

    public LichSuMuaHang(String maKhachHang, Date thoiGian, String sanPham, double tongTien, String tenKhachHang, String maNhanVien) {
        this.maKhachHang = maKhachHang;
        this.thoiGian = thoiGian;
        this.sanPham = sanPham;
        this.tongTien = tongTien;
        this.tenKhachHang = tenKhachHang;
        this.maNhanVien = maNhanVien; // Thêm maNhanVien vào constructor
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    @Override
    public String toString() {
        return "LichSuMuaHang{"
                + "maGiaoDich=" + maGiaoDich
                + ", maKhachHang='" + maKhachHang + '\''
                + ", thoiGian=" + thoiGian
                + ", sanPham='" + sanPham + '\''
                + ", tongTien=" + tongTien
                + ", tenKhachHang='" + tenKhachHang + '\''
                + ", maNhanVien='" + maNhanVien + '\''
                + // Thêm maNhanVien vào toString
                '}';
    }
}
