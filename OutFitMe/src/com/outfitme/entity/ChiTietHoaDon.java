/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.outfitme.entity;

/**
 *
 * @author MINH HUNG
 */
public class ChiTietHoaDon {
    private String soHD;
    private String maSP;
    private double donGia;
    private String tenSP;
    private int soLuong;
    private String size;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(String soHD, String maSP, double donGia, String tenSP, int soLuong, String size) {
        this.soHD = soHD;
        this.maSP = maSP;
        this.donGia = donGia;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.size = size;
    }

    public String getSoHD() {
        return soHD;
    }

    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
