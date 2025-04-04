package com.outfitme.entity;

import java.util.Date;

public class LichSuMuaHang {
    private int maGiaoDich;
    private String maKhachHang;
    private Date thoiGian; 
    private String sanPham;
    private double tongTien;
    private String tenKhachHang; 

    public LichSuMuaHang() {
    }

    public LichSuMuaHang(String maKhachHang, Date thoiGian, String sanPham, double tongTien, String tenKhachHang) {
        this.maKhachHang = maKhachHang;
        this.thoiGian = thoiGian;
        this.sanPham = sanPham;
        this.tongTien = tongTien;
        this.tenKhachHang = tenKhachHang; // Khởi tạo tên khách hàng
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

    @Override
    public String toString() {
        return "LichSuMuaHang{" +
                "maGiaoDich=" + maGiaoDich +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", thoiGian=" + thoiGian +
                ", sanPham='" + sanPham + '\'' +
                ", tongTien=" + tongTien +
                ", tenKhachHang='" + tenKhachHang + '\'' + 
                '}';
    }
}
