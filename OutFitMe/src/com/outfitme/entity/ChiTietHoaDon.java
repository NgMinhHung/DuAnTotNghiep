package com.outfitme.entity;

import java.util.Date;

public class ChiTietHoaDon {

    private int soHD;
    private Date ngayLap;
    private String maNV;
    private String tenNV;
    private String maSP;
    private String tenSP;
    private int soLuong;
    private double giaTien;
    private double tongTien;
    private String maKH;

    public ChiTietHoaDon() {
    }

    // Constructor 8 tham số (tự tính tongTien)
    public ChiTietHoaDon(int soHD, Date ngayLap, String maNV, String tenNV, String maSP, String tenSP, int soLuong, double giaTien) {
        this.soHD = soHD;
        this.ngayLap = ngayLap;
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
        this.tongTien = soLuong * giaTien;
    }

    // Constructor 9 tham số (bao gồm maKH)
    public ChiTietHoaDon(int soHD, Date ngayLap, String maNV, String tenNV, String maSP, String tenSP, int soLuong, double giaTien, String maKH) {
        this.soHD = soHD;
        this.ngayLap = ngayLap;
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
        this.tongTien = soLuong * giaTien;
        this.maKH = maKH;
    }

    // Getters và Setters
    public int getSoHD() {
        return soHD;
    }

    public void setSoHD(int soHD) {
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