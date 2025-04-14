package com.outfitme.entity;

import java.util.Date;

public class ThanhToan {
    private int id;              // Khóa chính tự tăng
    private String soHD;         // Mã hóa đơn nhập tay
    private Date ngayLap;        // Ngày lập hóa đơn
    private String maNV;         // Mã nhân viên
    private String tenNV;        // Tên nhân viên
    private String maSP;         // Mã sản phẩm
    private String tenSP;        // Tên sản phẩm
    private String size;         // Kích cỡ
    private int soLuong;         // Số lượng
    private double giaTien;      // Giá bán
    private double tongTien;     // Tổng tiền
    private String maKH;         // Mã khách hàng

    // Constructor mặc định
    public ThanhToan() {
    }

    // Constructor cho insert (không cần id vì tự tăng)
    public ThanhToan(String soHD, Date ngayLap, String maNV, String maSP, String size, int soLuong, String maKH) {
        this.soHD = soHD;
        this.ngayLap = ngayLap;
        this.maNV = maNV;
        this.maSP = maSP;
        this.size = size;
        this.soLuong = soLuong;
        this.maKH = maKH;
    }

    // Constructor đầy đủ (dùng khi select từ database)
    public ThanhToan(int id, String soHD, Date ngayLap, String maNV, String tenNV, 
                         String maSP, String tenSP, String size, int soLuong, 
                         double giaTien, double tongTien, String maKH) {
        this.id = id;
        this.soHD = soHD;
        this.ngayLap = ngayLap;
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.size = size;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
        this.tongTien = tongTien;
        this.maKH = maKH;
    }

    // Constructor 9 tham số (tự tính tongTien)
    public ThanhToan(String soHD, Date ngayLap, String maNV, String tenNV, 
                         String maSP, String tenSP, String size, int soLuong, double giaTien) {
        this.soHD = soHD;
        this.ngayLap = ngayLap;
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.size = size;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
        this.tongTien = soLuong * giaTien;
    }

    // Getters và Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSoHD() {
        return soHD;
    }

    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }


}