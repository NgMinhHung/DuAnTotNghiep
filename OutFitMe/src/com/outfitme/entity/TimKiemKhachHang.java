/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.outfitme.entity;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class TimKiemKhachHang {

    private String soHD;
    private Date ngayLap;
    private String maNV;
    private String maKH;
    private String tenKH;     
    private String maSP;
    private String tenSP;    
    private String size;
    private double tongTien;  

    public TimKiemKhachHang() {
    }

    public TimKiemKhachHang(String soHD, Date ngayLap, String maNV, String maKH, String tenKH, String maSP, String tenSP, String size, double tongTien) {
        this.soHD = soHD;
        this.ngayLap = ngayLap;
        this.maNV = maNV;
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.size = size;
        this.tongTien = tongTien;
    }

    // Getters and Setters
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

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
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

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
}
