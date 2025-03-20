/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.outfitme.entity;

import java.util.Date;

/**
 *
 * @author MINH HUNG
 */
public class ThongKe {
    private String maThongKe;
    private Date ngayLap;
    private int tongSoSP;
    private double tongTien;
    private String maNV;
    private double doanhThu;

    public ThongKe() {
    }

    public ThongKe(String maThongKe, Date ngayLap, int tongSoSP, double tongTien, String maNV, double doanhThu) {
        this.maThongKe = maThongKe;
        this.ngayLap = ngayLap;
        this.tongSoSP = tongSoSP;
        this.tongTien = tongTien;
        this.maNV = maNV;
        this.doanhThu = doanhThu;
    }

    public String getMaThongKe() {
        return maThongKe;
    }

    public void setMaThongKe(String maThongKe) {
        this.maThongKe = maThongKe;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public int getTongSoSP() {
        return tongSoSP;
    }

    public void setTongSoSP(int tongSoSP) {
        this.tongSoSP = tongSoSP;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
}
