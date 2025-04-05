/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.outfitme.entity;

/**
 *
 * @author MINH HUNG
 */
public class KhachHang {
    private String maKH;
    private String tenKH;
    private String diaChi;
    private boolean gioiTinh;
    private String soDienThoai;
    private int diem; // Thêm thuộc tính diem để lưu số điểm
    private String hinhAnh; // Thêm thuộc tính hinhAnh để lưu tên file hình ảnh

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, String diaChi, boolean gioiTinh, String soDienThoai, int diem, String hinhAnh) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.diem = diem;
        this.hinhAnh = hinhAnh; // Khởi tạo giá trị cho hinhAnh
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    @Override
    public String toString() {
        return tenKH; // Hiển thị tên khách hàng trong JComboBox
    }
}
