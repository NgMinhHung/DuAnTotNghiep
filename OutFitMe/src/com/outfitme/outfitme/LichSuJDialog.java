/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.outfitme.outfitme;

import com.outfitme.dao.LichSuMuaHangDAO;
import com.outfitme.dao.SanPhamDAO;
import com.outfitme.entity.LichSuMuaHang;
import com.outfitme.entity.SanPham;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author netgi
 */
public class LichSuJDialog extends javax.swing.JDialog {

    private LichSuMuaHangDAO lsmhDao = new LichSuMuaHangDAO();
    private SanPhamDAO sanPhamDAO = new SanPhamDAO();
    private DefaultTableModel tableModel;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public LichSuJDialog() {
        this(null, false); // Gọi constructor khác với parent = null và modal = false
    }

    public LichSuJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tableModel = (DefaultTableModel) tblLichSu.getModel();
        tableModel.setRowCount(0);
        loadFromDatabase();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLichSu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSanPham = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTien = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMaGD = new javax.swing.JTextField();
        btnSapXep = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LỊCH SỬ MUA HÀNG");

        tblLichSu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Mã khách hàng", "Tên khách hàng", "thời gian", "Sản phẩm", "Số lượng", "Tiền", "Nhân viên lập"
            }
        ));
        tblLichSu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLichSuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLichSu);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mã khách hàng");

        txtMaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSPActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Sản phẩm");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Tiền");

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/outfitme/icon/Exit.png"))); // NOI18N
        btnClose.setText("Đóng");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/outfitme/icon/Delete.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Thời gian");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Tên Khách hàng");

        txtTenKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhachHangActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Mã giao dịch");

        btnSapXep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/outfitme/icon/sapxep.png"))); // NOI18N
        btnSapXep.setText("Sắp xếp");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/outfitme/icon/Search.png"))); // NOI18N
        btnSearch.setText("Tìm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSapXep)
                        .addGap(110, 110, 110)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSanPham, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTime, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(txtTenKhachHang)
                            .addGap(10, 10, 10))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtMaGD, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMaGD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnDelete))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnSapXep)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSPActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      int selectedRow = tblLichSu.getSelectedRow();
        if (selectedRow >= 0) {
            int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                    "Bạn có chắc chắn muốn xóa giao dịch này?",
                    "Xác nhận xóa",
                    javax.swing.JOptionPane.YES_NO_OPTION);
            if (confirm == javax.swing.JOptionPane.YES_OPTION) {
                String maGiaoDichStr = tableModel.getValueAt(selectedRow, 0).toString();
                String[] maGiaoDichArray = maGiaoDichStr.split(", ");
                for (String maGiaoDich : maGiaoDichArray) {
                    lsmhDao.delete(maGiaoDich);
                }
                loadFromDatabase();
                clearForm();
                javax.swing.JOptionPane.showMessageDialog(this, "Đã xóa giao dịch!");
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn một giao dịch để xóa!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblLichSuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLichSuMouseClicked
        int selectedRow = tblLichSu.getSelectedRow();
        if (selectedRow >= 0) {
            // Cập nhật lại dữ liệu vào các trường
            txtMaGD.setText(tableModel.getValueAt(selectedRow, 0).toString());
            txtMaSP.setText(tableModel.getValueAt(selectedRow, 1).toString());
            txtTenKhachHang.setText(tableModel.getValueAt(selectedRow, 2).toString());
            txtTime.setText(tableModel.getValueAt(selectedRow, 3).toString());
            txtSanPham.setText(tableModel.getValueAt(selectedRow, 4).toString());
            txtTien.setText(tableModel.getValueAt(selectedRow, 6).toString());
        }
    }//GEN-LAST:event_tblLichSuMouseClicked

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtTenKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhachHangActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        sortByThoiGian();
    }//GEN-LAST:event_btnSapXepActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        searchByMaKhachHang();
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(LichSuJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LichSuJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LichSuJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LichSuJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LichSuJDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLichSu;
    private javax.swing.JTextField txtMaGD;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtSanPham;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTien;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables

    private void clearForm() {
        txtMaGD.setText("");
        txtMaSP.setText("");
        txtTenKhachHang.setText("");
        txtTime.setText("");
        txtSanPham.setText("");
        txtTien.setText("");
    }

    private void loadFromDatabase() {
        List<LichSuMuaHang> historyList = lsmhDao.selectAll();
        displayHistory(historyList);
    }

    private void displayHistory(List<LichSuMuaHang> historyList) {
        tableModel.setRowCount(0);

        // Sử dụng Map để nhóm các giao dịch theo MaKhachHang và ThoiGian
        Map<String, GroupedLichSuMuaHang> groupedHistory = new HashMap<>();

        for (LichSuMuaHang history : historyList) {
            // Tạo key để nhóm: MaKhachHang + ThoiGian
            String key = history.getMaKhachHang() + "|" + dateFormat.format(history.getThoiGian());

            // Nếu key đã tồn tại trong Map, cập nhật danh sách sản phẩm, số lượng và tiền
            if (groupedHistory.containsKey(key)) {
                GroupedLichSuMuaHang grouped = groupedHistory.get(key);
                grouped.maGiaoDichList.add(history.getMaGiaoDich());
                grouped.sanPhamList.add(history.getSanPham());
                grouped.soLuong += history.getSoLuong();
                grouped.tongTien += history.getTongTien();
            } else {
                // Nếu key chưa tồn tại, tạo mới GroupedLichSuMuaHang
                GroupedLichSuMuaHang grouped = new GroupedLichSuMuaHang();
                grouped.maGiaoDichList.add(history.getMaGiaoDich());
                grouped.maKhachHang = history.getMaKhachHang();
                grouped.tenKhachHang = history.getTenKhachHang();
                grouped.thoiGian = history.getThoiGian();
                grouped.sanPhamList.add(history.getSanPham());
                grouped.soLuong = history.getSoLuong();
                grouped.tongTien = history.getTongTien();
                grouped.maNhanVien = history.getMaNhanVien();
                groupedHistory.put(key, grouped);
            }
        }

        // Thêm các nhóm vào bảng
        for (GroupedLichSuMuaHang grouped : groupedHistory.values()) {
            String maGiaoDich = grouped.maGiaoDichList.toString().replace("[", "").replace("]", "");
            String sanPham = String.join(", ", grouped.sanPhamList);

            tableModel.addRow(new Object[]{
                maGiaoDich,
                grouped.maKhachHang,
                grouped.tenKhachHang,
                dateFormat.format(grouped.thoiGian),
                sanPham,
                grouped.soLuong,
                String.format("%,.0f", grouped.tongTien),
                grouped.maNhanVien
            });
        }
    }

    // Lớp hỗ trợ để lưu thông tin nhóm lịch sử mua hàng
    private static class GroupedLichSuMuaHang {

        List<Integer> maGiaoDichList;
        String maKhachHang;
        String tenKhachHang;
        java.util.Date thoiGian;
        List<String> sanPhamList;
        int soLuong;
        double tongTien;
        String maNhanVien;

        GroupedLichSuMuaHang() {
            maGiaoDichList = new ArrayList<>();
            sanPhamList = new ArrayList<>();
        }
    }

    public void loadPurchaseHistory() {
        List<LichSuMuaHang> historyList = lsmhDao.selectAll();
        displayHistory(historyList);
    }

    private void searchByMaKhachHang() {
        String maKhachHang = txtSearch.getText().trim();
        if (maKhachHang.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng nhập mã khách hàng để tìm kiếm!");
            loadFromDatabase(); // Tải lại toàn bộ danh sách nếu không nhập mã
            return;
        }

        List<LichSuMuaHang> historyList = lsmhDao.selectAll();
        List<LichSuMuaHang> filteredList = new ArrayList<>();
        for (LichSuMuaHang history : historyList) {
            if (history.getMaKhachHang().equalsIgnoreCase(maKhachHang)) {
                filteredList.add(history);
            }
        }

        if (filteredList.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Không tìm thấy giao dịch nào cho mã khách hàng: " + maKhachHang);
            tableModel.setRowCount(0);
        } else {
            displayHistory(filteredList);
        }
    }

    private void sortByThoiGian() {
        List<LichSuMuaHang> historyList = lsmhDao.selectAll();
        Collections.sort(historyList, new Comparator<LichSuMuaHang>() {
            @Override
            public int compare(LichSuMuaHang o1, LichSuMuaHang o2) {
                // Sắp xếp theo ThoiGian giảm dần (mới nhất trước)
                return o2.getThoiGian().compareTo(o1.getThoiGian());
            }
        });
        displayHistory(historyList);
    }
}
