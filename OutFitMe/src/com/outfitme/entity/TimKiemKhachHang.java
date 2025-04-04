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
    private String maSP;
    private String tenSP; // Thêm thuộc tính tên sản phẩm
    private String size;

    public TimKiemKhachHang(String soHD, Date ngayLap, String maNV, String maKH, String maSP, String tenSP, String size) {
        this.soHD = soHD;
        this.ngayLap = ngayLap;
        this.maNV = maNV;
        this.maKH = maKH;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.size = size;
    }

    public TimKiemKhachHang() {
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public TimKiemKhachHang(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
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

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
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
}
