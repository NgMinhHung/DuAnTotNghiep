/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.outfitme.outfitme;

import com.outfitme.dao.ChiTietHoaDonDAO;
import com.outfitme.dao.KhachHangDAO;
import com.outfitme.dao.LichSuMuaHangDAO;
import com.outfitme.entity.ChiTietHoaDon;
import com.outfitme.entity.KhachHang;
import com.outfitme.entity.LichSuMuaHang;
import com.outfitme.utils.XJdbc;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ChiTietHoaDonJDialog extends javax.swing.JDialog {

    private ChiTietHoaDonDAO cthdDao = new ChiTietHoaDonDAO();
    private KhachHangDAO khDao = new KhachHangDAO();
    private LichSuMuaHangDAO lsmhDao = new LichSuMuaHangDAO();

    /**
     * Creates new form ChiTietHoaDon1JDialog
     */
    public ChiTietHoaDonJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fillTable();
        fillCustomerComboBox();
        calculateTotalPrice();

        cboDSKhachHang.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
                    filterTableByMaKH(); // Lọc bảng theo MaKH
                    calculateTotalPrice(); // Tính lại tổng tiền sau khi lọc
                }
            }
        });
    }

    private void fillCustomerComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        List<KhachHang> customers = khDao.selectAll();
        for (KhachHang kh : customers) {
            model.addElement(kh.getMaKH() + " - " + kh.getTenKH());
        }
        cboDSKhachHang.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tblChiTietHoaDon = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblHoaDon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnXoa = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtGhiChu = new javax.swing.JTextField();
        rdo5 = new javax.swing.JRadioButton();
        rdo10 = new javax.swing.JRadioButton();
        rdo15 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboDSKhachHang = new javax.swing.JComboBox<>();
        btnKiemTraDiem = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thông tin chi tiết"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SoHD", "Ngày lập HD", "MaSP", "Tên sản phẩm", "Số lượng", "Giá tiền", "Tổng tiền", "Nhân viên lập HD", "MaKH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChiTietHoaDon.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblChiTietHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tblChiTietHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        lblHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHoaDon.setText("Chi tiết hóa đơn");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Công cụ"));

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Tổng Tiền");

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("Tiền mặt");

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Chuyển khoản");

        buttonGroup1.add(rdo5);
        rdo5.setText("5%");
        rdo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdo10);
        rdo10.setText("10%");
        rdo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo10ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdo15);
        rdo15.setText("15%");
        rdo15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo15ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Giảm giá");

        jLabel3.setText("THÀNH VIÊN BẠC");

        jLabel4.setText("THÀNH VIÊN VÀNG");

        jLabel5.setText("THÀNH VIÊN KIM CƯƠNG");

        jLabel6.setText("Tích Điểm Khách hàng");

        btnKiemTraDiem.setText("Kiểm tra điểm");
        btnKiemTraDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiemTraDiemActionPerformed(evt);
            }
        });

        jLabel7.setText("Ghi chú");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdo5)
                                    .addComponent(rdo15))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnKiemTraDiem)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cboDSKhachHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7))))
                            .addComponent(rdo10))
                        .addGap(12, 12, 12)
                        .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThanhToan))
                    .addComponent(jLabel1)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(rdo5)
                                .addComponent(cboDSKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(rdo10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdo15)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnKiemTraDiem)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtGhiChu)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHoaDon)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // Kiểm tra xem đã chọn phương thức thanh toán chưa
        if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn hình thức thanh toán!");
            return; // Dừng thực hiện nếu không chọn phương thức thanh toán
        }

        int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                "Bạn có chắc chắn muốn thanh toán và xóa toàn bộ sản phẩm của khách hàng này?",
                "Xác nhận thanh toán",
                javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            int selectedIndex = cboDSKhachHang.getSelectedIndex();
            if (selectedIndex >= 0) {
                String selectedCustomer = (String) cboDSKhachHang.getSelectedItem();
                String maKH = selectedCustomer.split(" - ")[0];
                KhachHang kh = khDao.selectById(maKH);

                if (kh != null) {
                    // Tính điểm tích lũy từ hóa đơn
                    int newPoints = calculatePoints(totalPrice);
                    int currentPoints = kh.getDiem();

                    // Trừ điểm nếu có áp dụng giảm giá
                    int pointsToDeduct = 0;
                    if (discountPercentage == 5.0) {
                        pointsToDeduct = 50;
                    } else if (discountPercentage == 10.0) {
                        pointsToDeduct = 100;
                    } else if (discountPercentage == 15.0) {
                        pointsToDeduct = 200;
                    }

                    // Cập nhật điểm khách hàng: cộng điểm mới, trừ điểm đã dùng để giảm giá
                    int updatedPoints = currentPoints + newPoints - pointsToDeduct;
                    if (updatedPoints < 0) {
                        updatedPoints = 0; // Đảm bảo điểm không âm
                    }
                    kh.setDiem(updatedPoints);
                    khDao.update(kh);

                    // Lưu lịch sử mua hàng
                    savePurchaseHistory(maKH);

                    // Xóa các bản ghi của khách hàng
                    cthdDao.deleteByMaKH(maKH);
                    filterTableByMaKH();

                    // Đặt lại tổng tiền và giảm giá
                    totalPrice = 0.0;
                    discountPercentage = 0.0; // Đặt lại giảm giá về 0
                    rdo5.setSelected(false); // Bỏ chọn các radio button
                    rdo10.setSelected(false);
                    rdo15.setSelected(false);
                    updateTotalPriceWithDiscount();

                    // Bỏ chọn phương thức thanh toán
                    jRadioButton1.setSelected(false);
                    jRadioButton2.setSelected(false);

                    javax.swing.JOptionPane.showMessageDialog(this, "Thanh toán thành công!", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng với mã: " + maKH);
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một khách hàng trước khi thanh toán!");
            }
        }
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void savePurchaseHistory(String maKH) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (model.getRowCount() == 0) {
            System.out.println("Không có sản phẩm để lưu vào lịch sử mua hàng!");
            return;
        }

        StringBuilder sanPham = new StringBuilder();
        double tongTien = totalPrice * (1 - discountPercentage / 100);

        for (int i = 0; i < model.getRowCount(); i++) {
            String tenSP = (String) model.getValueAt(i, 3);
            int soLuong = (int) model.getValueAt(i, 4);
            sanPham.append(tenSP).append(" (").append(soLuong).append("), ");
        }
        if (sanPham.length() > 0) {
            sanPham.setLength(sanPham.length() - 2);
        }

        LichSuMuaHang history = new LichSuMuaHang();
        history.setMaKhachHang(maKH);
        history.setThoiGian(new Date());
        history.setSanPham(sanPham.toString());
        history.setTongTien(tongTien);

        try {
            lsmhDao.insert(history);
            System.out.println("Đã lưu lịch sử mua hàng: MaKhachHang=" + history.getMaKhachHang() + ", SanPham=" + history.getSanPham());
        } catch (Exception e) {
            System.err.println("Lỗi khi lưu lịch sử mua hàng: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void rdo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo10ActionPerformed
        int selectedIndex = cboDSKhachHang.getSelectedIndex();
        if (selectedIndex >= 0) {
            String selectedCustomer = (String) cboDSKhachHang.getSelectedItem();
            String maKH = selectedCustomer.split(" - ")[0];
            KhachHang kh = khDao.selectById(maKH);

            if (kh != null) {
                int currentPoints = kh.getDiem();
                if (currentPoints >= 100) {
                    discountPercentage = 10.0;
                    updateTotalPriceWithDiscount();
                } else {
                    rdo10.setSelected(false); // Bỏ chọn radio button
                    discountPercentage = 0.0; // Đặt lại giảm giá về 0
                    updateTotalPriceWithDiscount();
                    javax.swing.JOptionPane.showMessageDialog(this, "Bạn chưa đủ điểm! Cần ít nhất 100 điểm để giảm 10%.");
                }
            } else {
                rdo10.setSelected(false);
                javax.swing.JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng với mã: " + maKH);
            }
        } else {
            rdo10.setSelected(false);
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một khách hàng trước!");
        }

    }//GEN-LAST:event_rdo10ActionPerformed

    private void rdo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo5ActionPerformed
        int selectedIndex = cboDSKhachHang.getSelectedIndex();
        if (selectedIndex >= 0) {
            String selectedCustomer = (String) cboDSKhachHang.getSelectedItem();
            String maKH = selectedCustomer.split(" - ")[0];
            KhachHang kh = khDao.selectById(maKH);

            if (kh != null) {
                int currentPoints = kh.getDiem();
                if (currentPoints >= 50) {
                    discountPercentage = 5.0;
                    updateTotalPriceWithDiscount();
                } else {
                    rdo5.setSelected(false); // Bỏ chọn radio button
                    discountPercentage = 0.0; // Đặt lại giảm giá về 0
                    updateTotalPriceWithDiscount();
                    javax.swing.JOptionPane.showMessageDialog(this, "Bạn chưa đủ điểm! Cần ít nhất 50 điểm để giảm 5%.");
                }
            } else {
                rdo5.setSelected(false);
                javax.swing.JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng với mã: " + maKH);
            }
        } else {
            rdo5.setSelected(false);
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một khách hàng trước!");
        }
    }//GEN-LAST:event_rdo5ActionPerformed

    private void rdo15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo15ActionPerformed
        int selectedIndex = cboDSKhachHang.getSelectedIndex();
        if (selectedIndex >= 0) {
            String selectedCustomer = (String) cboDSKhachHang.getSelectedItem();
            String maKH = selectedCustomer.split(" - ")[0];
            KhachHang kh = khDao.selectById(maKH);

            if (kh != null) {
                int currentPoints = kh.getDiem();
                if (currentPoints >= 200) {
                    discountPercentage = 15.0;
                    updateTotalPriceWithDiscount();
                } else {
                    rdo15.setSelected(false); // Bỏ chọn radio button
                    discountPercentage = 0.0; // Đặt lại giảm giá về 0
                    updateTotalPriceWithDiscount();
                    javax.swing.JOptionPane.showMessageDialog(this, "Bạn chưa đủ điểm! Cần ít nhất 200 điểm để giảm 15%.");
                }
            } else {
                rdo15.setSelected(false);
                javax.swing.JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng với mã: " + maKH);
            }
        } else {
            rdo15.setSelected(false);
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một khách hàng trước!");
        }
    }//GEN-LAST:event_rdo15ActionPerformed

    private void btnKiemTraDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiemTraDiemActionPerformed
        int selectedIndex = cboDSKhachHang.getSelectedIndex();
        if (selectedIndex >= 0) {
            String selectedCustomer = (String) cboDSKhachHang.getSelectedItem();
            String maKH = selectedCustomer.split(" - ")[0]; // Lấy mã khách hàng
            KhachHang kh = khDao.selectById(maKH);
            if (kh != null) {
                int newPoints = calculatePoints(totalPrice); // Điểm từ hóa đơn hiện tại
                int currentPoints = kh.getDiem(); // Không cần kiểm tra null vì diem là int
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Khách hàng: " + kh.getTenKH()
                        + "\nĐiểm hiện tại: " + currentPoints
                        + "\nĐiểm tích lũy từ hóa đơn này: " + newPoints
                        + "\nTổng điểm sau khi thanh toán: " + (currentPoints + newPoints));
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng với mã: " + maKH);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một khách hàng!");
        }

    }//GEN-LAST:event_btnKiemTraDiemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChiTietHoaDonJDialog dialog = new ChiTietHoaDonJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKiemTraDiem;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JComboBox<String> cboDSKhachHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JRadioButton rdo10;
    private javax.swing.JRadioButton rdo15;
    private javax.swing.JRadioButton rdo5;
    private javax.swing.JScrollPane tblChiTietHoaDon;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

// Phương thức xóa dòng được chọn
    private void delete() {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            int soHD = (int) jTable1.getValueAt(selectedRow, 0);
            cthdDao.delete(String.valueOf(soHD));
            fillTable(); // Cập nhật lại bảng sau khi xóa
            calculateTotalPrice(); // Tính lại tổng tiền sau khi xóa
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa!");
        }
    }

    // Phương thức sửa dòng được chọn (cần thêm giao diện nhập liệu để sửa)
    private void update() {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            int soHD = (int) jTable1.getValueAt(selectedRow, 0);
            String maSP = (String) jTable1.getValueAt(selectedRow, 2);
            int soLuong = (int) jTable1.getValueAt(selectedRow, 4);

            ChiTietHoaDon cthd = new ChiTietHoaDon();
            cthd.setSoHD(soHD);
            cthd.setMaSP(maSP);
            cthd.setSoLuong(soLuong);

            cthdDao.update(cthd);
            fillTable(); // Cập nhật lại bảng sau khi sửa
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa!");
        }
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        List<ChiTietHoaDon> list = cthdDao.selectAll();
        System.out.println("Số dòng dữ liệu từ DAO: " + list.size()); // Debug
        for (ChiTietHoaDon cthd : list) {
            Object[] row = {
                cthd.getSoHD(),
                cthd.getNgayLap(),
                cthd.getMaSP(),
                cthd.getTenSP(),
                cthd.getSoLuong(),
                cthd.getGiaTien(),
                cthd.getTongTien(),
                cthd.getTenNV(),
                cthd.getMaKH()
            };
            model.addRow(row);
        }
    }
    private double totalPrice = 0.0; // Lưu tổng tiền trước khi giảm giá
    private double discountPercentage = 0.0; // Lưu phần trăm giảm giá được chọn

// Phương thức tính tổng tiền từ bảng
    private void calculateTotalPrice() {
        totalPrice = 0.0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            Object value = jTable1.getValueAt(i, 6); // Lấy giá trị từ cột "Tổng tiền"
            if (value != null) {
                try {
                    double rowTotal = Double.parseDouble(value.toString());
                    totalPrice += rowTotal;
                } catch (NumberFormatException e) {
                    System.err.println("Lỗi khi phân tích tổng tiền ở dòng " + i + ": " + value);
                }
            }
        }
        updateTotalPriceWithDiscount(); // Cập nhật tổng tiền hiển thị với giảm giá hiện tại
    }

// Phương thức áp dụng giảm giá và cập nhật tổng tiền vào ô văn bản
    private void updateTotalPriceWithDiscount() {
        double discountedPrice = totalPrice;
        if (discountPercentage > 0) {
            double discountAmount = totalPrice * (discountPercentage / 100);
            discountedPrice = totalPrice - discountAmount;
        }
        txtTongTien.setText(String.format("%.1f", discountedPrice)); // Hiển thị giá đã giảm
    }

    private int calculatePoints(double total) {
        return (int) (total / 100000) * 10;
    }

    private void filterTableByMaKH() {
        String selectedCustomer = (String) cboDSKhachHang.getSelectedItem();
        if (selectedCustomer == null || selectedCustomer.isEmpty()) {
            fillTable();
            return;
        }

        String maKH = selectedCustomer.split(" - ")[0];
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        List<ChiTietHoaDon> list = cthdDao.selectAll();
        for (ChiTietHoaDon cthd : list) {
            if (cthd.getMaKH().equals(maKH)) {
                Object[] row = {
                    cthd.getSoHD(),
                    cthd.getNgayLap(),
                    cthd.getMaSP(),
                    cthd.getTenSP(),
                    cthd.getSoLuong(),
                    cthd.getGiaTien(),
                    cthd.getTongTien(),
                    cthd.getTenNV(),
                    cthd.getMaKH()
                };
                model.addRow(row);
            }
        }
    }

    public void deleteByMaKH(String maKH) {
        String sql = "DELETE FROM HoaDon WHERE MaKhachHang = ?";
        XJdbc.update(sql, maKH);
    }
}
