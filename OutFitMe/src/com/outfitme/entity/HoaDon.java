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
public class HoaDon {

    private int Id;
    private String soHD;
    private Date ngayLap;
    private String maNV;
    private String maKH;
    private int soLuong;
    private String maSP;
    private String Size;

    public HoaDon() {
    }

    public HoaDon(int Id, String soHD, Date ngayLap, String maNV, String maKH, int soLuong, String maSP, String Size) {
        this.Id = Id;
        this.soHD = soHD;
        this.ngayLap = ngayLap;
        this.maNV = maNV;
        this.maKH = maKH;
        this.soLuong = soLuong;
        this.maSP = maSP;
        this.Size = Size;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

}
