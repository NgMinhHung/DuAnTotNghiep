/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.outfitme.outfitme;

import com.outfitme.dao.TimKiemKhachHangDAO;
import com.outfitme.entity.TimKiemKhachHang;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class TimKiemKhachHangJDialog extends javax.swing.JDialog {

    private static String soDienThoai;
    JTextField txtTimKiem = new JTextField();

    /**
     * Creates new form TimKiemKhachHangJDialog
     */
    public TimKiemKhachHangJDialog(java.awt.Frame parent, boolean modal, String timKiem) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);

        txtTimKiem.setText(timKiem);
        soDienThoai = timKiem;
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblTimKiem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblTimKiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Số Hóa Đơn", "Ngày Lập", "Mã Nhân Viên", "Mã Khách Hàng", "Mã Sản Phẩm", "Tên Sản Phẩm", "Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTimKiemMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTimKiem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTimKiemMouseClicked
        //        if (evt.getClickCount() == 2) {  // Chỉ xử lý khi click đúp
        //            this.row = tblTimKiem.getSelectedRow();
        //            if (this.row >= 0) {
        //                fillTable();
        //                loadTable();
        //            }
        //        }
    }//GEN-LAST:event_tblTimKiemMouseClicked

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
            java.util.logging.Logger.getLogger(TimKiemKhachHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimKiemKhachHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimKiemKhachHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimKiemKhachHangJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String timKiem = soDienThoai;
                TimKiemKhachHangJDialog dialog = new TimKiemKhachHangJDialog(new javax.swing.JFrame(), true, timKiem);
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTimKiem;
    // End of variables declaration//GEN-END:variables
    TimKiemKhachHangDAO dao = new TimKiemKhachHangDAO();
    int row = 0;

    void init() {
        setLocationRelativeTo(null);

        // Đặt lại model cho tblTimKiem với tên cột mới
        String[] columnNames = {
            "Mã GD", "Thời gian", "Mã NV", "Mã KH", "Tên KH", "Mã SP", "Tên SP", "Số lượng", "Tổng tiền"
        };
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        tblTimKiem.setModel(model);

        this.loadTable();
        this.row = -1;
    }

    private void loadTable() {
        DefaultTableModel model = (DefaultTableModel) tblTimKiem.getModel();
        model.setRowCount(0);

        try {
            List<TimKiemKhachHang> list = dao.selectByKeyword(soDienThoai);

            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Khách hàng này chưa có lịch sử mua hàng.");
                return; // Không cần tiếp tục
            }
            for (TimKiemKhachHang kh : list) {
                Object[] row = {
                    kh.getSoHD(), // MaGiaoDich
                    kh.getNgayLap(), // ThoiGian
                    kh.getMaNV(), // MaNhanVien
                    kh.getMaKH(), // MaKhachHang
                    kh.getTenKH(), // ✅ TenKhachHang (mới thêm)
                    kh.getMaSP(), // MaSanPham
                    kh.getTenSP(), // SanPham
                    kh.getSize(), // SoLuong (hiển thị là size)
                    kh.getTongTien() // ✅ Tổng tiền (mới thêm)
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu mua hàng của khách hàng!");
            e.printStackTrace();
        }
    }
}
