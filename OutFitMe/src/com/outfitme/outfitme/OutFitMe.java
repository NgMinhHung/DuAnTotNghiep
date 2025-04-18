/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.outfitme.outfitme;

import com.outfitme.utils.Auth;
import com.outfitme.utils.MsgBox;
import com.outfitme.utils.XImage;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author netgi
 */
public class OutFitMe extends javax.swing.JFrame {

    /**
     * Creates new form OutFitMe
     */
    public OutFitMe() {
        initComponents();
        init();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnKhachHang = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        lblTrangThai = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        btnLichSu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCTHD = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        mniKetThuc = new javax.swing.JMenuItem();
        mnuQuanli = new javax.swing.JMenu();
        mniNhanVien = new javax.swing.JMenuItem();
        mniKhachHang = new javax.swing.JMenuItem();
        mniSanPham = new javax.swing.JMenuItem();
        mniHoaDon = new javax.swing.JMenuItem();
        mniCTHD = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mniGioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OutFitMe\n");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnKhachHang.setBackground(new java.awt.Color(51, 255, 51));
        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/outfitme/icon/thumbs-up-trust.png"))); // NOI18N
        btnKhachHang.setText("Khách hàng");
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });

        btnSanPham.setBackground(new java.awt.Color(51, 204, 255));
        btnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/outfitme/icon/shopping-cart (1).png"))); // NOI18N
        btnSanPham.setText("Sản phẩm");
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });

        btnHoaDon.setBackground(new java.awt.Color(255, 255, 51));
        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/outfitme/icon/otf-hoadon.png"))); // NOI18N
        btnHoaDon.setText("Hóa đơn");
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        btnThanhToan.setBackground(new java.awt.Color(255, 153, 0));
        btnThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/outfitme/icon/otf-dollar.png"))); // NOI18N
        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnThongKe.setBackground(new java.awt.Color(204, 0, 204));
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/outfitme/icon/signal-alt-2.png"))); // NOI18N
        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnNhanVien.setBackground(new java.awt.Color(255, 102, 102));
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/outfitme/icon/users-alt (1).png"))); // NOI18N
        btnNhanVien.setText("Nhân viên");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        lblTrangThai.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        lblTrangThai.setForeground(new java.awt.Color(255, 0, 0));
        lblTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/outfitme/icon/tshirt.png"))); // NOI18N
        lblTrangThai.setText("OutFitMe");

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/outfitme/icon/Alarm.png"))); // NOI18N
        lblDongHo.setText("13:57:50 AM");

        btnLichSu.setBackground(new java.awt.Color(0, 204, 204));
        btnLichSu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/outfitme/icon/time-past.png"))); // NOI18N
        btnLichSu.setText("Lịch sử");
        btnLichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichSuActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/outfitme/icon/otflogo.png"))); // NOI18N

        btnCTHD.setBackground(new java.awt.Color(0, 255, 153));
        btnCTHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/outfitme/icon/document-signed.png"))); // NOI18N
        btnCTHD.setText("Chi Tiết Hóa Đơn");
        btnCTHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSanPham, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addComponent(btnHoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThongKe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLichSu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnCTHD))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDongHo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mnuHeThong.setText("Hệ Thống");

        mniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mniDangNhap.setText("Đăng nhập");
        mniDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangNhapActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangNhap);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mniDangXuat.setText("Đăng xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);

        mniDoiMatKhau.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mniDoiMatKhau.setText("Đổi mật khẩu");
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDoiMatKhau);

        mniKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniKetThuc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mniKetThuc.setText("Kết thúc");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniKetThuc);

        jMenuBar1.add(mnuHeThong);

        mnuQuanli.setText("Quản lí");

        mniNhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mniNhanVien.setText("Nhân viên");
        mniNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNhanVienActionPerformed(evt);
            }
        });
        mnuQuanli.add(mniNhanVien);

        mniKhachHang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mniKhachHang.setText("Khách hàng");
        mniKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhachHangActionPerformed(evt);
            }
        });
        mnuQuanli.add(mniKhachHang);

        mniSanPham.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mniSanPham.setText("Sản phẩm");
        mniSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSanPhamActionPerformed(evt);
            }
        });
        mnuQuanli.add(mniSanPham);

        mniHoaDon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mniHoaDon.setText("Hóa đơn");
        mniHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHoaDonActionPerformed(evt);
            }
        });
        mnuQuanli.add(mniHoaDon);

        mniCTHD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniCTHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mniCTHD.setText("Chi tiết hóa đơn");
        mniCTHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCTHDActionPerformed(evt);
            }
        });
        mnuQuanli.add(mniCTHD);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem1.setText("Danh Sách Khách Hàng");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuQuanli.add(jMenuItem1);

        jMenuBar1.add(mnuQuanli);

        mnuTroGiup.setText("Trợ giúp");
        mnuTroGiup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTroGiupActionPerformed(evt);
            }
        });

        mniGioiThieu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniGioiThieu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mniGioiThieu.setText("Giới thiệu sản phẩm");
        mniGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGioiThieuActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniGioiThieu);

        jMenuBar1.add(mnuTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangNhapActionPerformed
        this.OpenDangNhap();
    }//GEN-LAST:event_mniDangNhapActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        this.ketThuc();
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void mniSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSanPhamActionPerformed

    }//GEN-LAST:event_mniSanPhamActionPerformed

    private void mniHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHoaDonActionPerformed
        this.OpenHoaDon();
    }//GEN-LAST:event_mniHoaDonActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        this.OpenDoiMatKhau();
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        this.dangXuat();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNhanVienActionPerformed
        this.OpenNhanVien();
    }//GEN-LAST:event_mniNhanVienActionPerformed

    private void mniKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhachHangActionPerformed
        this.OpenKhachHang();
    }//GEN-LAST:event_mniKhachHangActionPerformed

    private void mniCTHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCTHDActionPerformed
        this.OpenCTHD();
    }//GEN-LAST:event_mniCTHDActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        this.OpenNhanVien();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        this.OpenKhachHang();
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        // TODO add your handling code here:
        this.OpenSanPham();
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        this.OpenHoaDon();
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        this.OpenThanhToan();
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        this.OpenThongKe();
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichSuActionPerformed
        this.OpenLichSu();
    }//GEN-LAST:event_btnLichSuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.Opendskhachhang();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnCTHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTHDActionPerformed
        this.OpenCTHD();
    }//GEN-LAST:event_btnCTHDActionPerformed

    private void mniGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGioiThieuActionPerformed
        // TODO add your handling code here:
        this.OpenGioiThieu();
    }//GEN-LAST:event_mniGioiThieuActionPerformed

    private void mnuTroGiupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTroGiupActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnuTroGiupActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OutFitMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutFitMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutFitMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutFitMe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OutFitMe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCTHD;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnLichSu;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JMenuItem mniCTHD;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniHoaDon;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniKhachHang;
    private javax.swing.JMenuItem mniNhanVien;
    private javax.swing.JMenuItem mniSanPham;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanli;
    private javax.swing.JMenu mnuTroGiup;
    // End of variables declaration//GEN-END:variables
void init() {
        setIconImage(XImage.getAppIcon());
        new ChaoJDialog(this, true).setVisible(true);
        new DangNhapJDialog(this, true).setVisible(true);

        // Cập nhật giao diện sau khi đăng nhập
        if (Auth.isLogin()) {
            updateUIVisibility();
        }

        this.startDongHo();
    }

    private void updateUIVisibility() {
        if (Auth.isManager()) {
            // Chủ shop: hiện nút và menu
            btnNhanVien.setVisible(true);
            btnThongKe.setVisible(true);
            mniNhanVien.setVisible(true);
        } else {
            // Nhân viên: ẩn nút và menu
            btnNhanVien.setVisible(false);
            btnThongKe.setVisible(false);
            mniNhanVien.setVisible(false);
        }
    }

    void startDongHo() {
        SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
        new Timer(1000, (ActionEvent e) -> {
            lblDongHo.setText(formater.format(new Date()));
        }).start();
    }

    void OpenDoiMatKhau() {
        if (Auth.isLogin()) {
            new DoiMatKhauJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void dangXuat() {
        Auth.clear();
        new DangNhapJDialog(this, true).setVisible(true);
        // Cập nhật giao diện sau khi đăng nhập lại
        if (Auth.isLogin()) {
            updateUIVisibility();
        }
    }

    void ketThuc() {
        if (MsgBox.confirm(this, "Bạn muốn kết thúc làm việc?")) {
            System.exit(0);
        }
    }

    void OpenDangNhap() {
        if (Auth.isLogin()) {
            new DangNhapJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void OpenThanhToan() {
        if (Auth.isLogin()) {
            new ThanhToanJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void OpenHoaDon() {
        if (Auth.isLogin()) {
            new HoaDonJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void OpenKhachHang() {
        if (Auth.isLogin()) {
            new KhachHangJDailog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void OpenNhanVien() {
        if (Auth.isLogin()) {
            if (Auth.isManager()) {
                new NhanVienJDialog(this, true).setVisible(true);
            } else {
                MsgBox.alert(this, "Chỉ chủ shop mới được truy cập chức năng này!");
            }
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void OpenThongKe() {
        if (Auth.isLogin()) {
            if (Auth.isManager()) {
                new ThongKeJDialog(this, true).setVisible(true);
            } else {
                MsgBox.alert(this, "Chỉ chủ shop mới được truy cập chức năng này!");
            }
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void OpenSanPham() {
        if (Auth.isLogin()) {
            new SanPhamJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void OpenLichSu() {
        if (Auth.isLogin()) {
            new LichSuJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void Opendskhachhang() {
        if (Auth.isLogin()) {
            new DanhSachKhachHang(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void OpenCTHD() {
        if (Auth.isLogin()) {
            new ChiTietHoaDonJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void OpenGioiThieu() {
        if (Auth.isLogin()) {
            new GioiThieuJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }
}
