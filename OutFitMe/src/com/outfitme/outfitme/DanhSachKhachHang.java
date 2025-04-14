/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.outfitme.outfitme;

import com.outfitme.dao.KhachHangDAO;
import com.outfitme.dao.LichSuMuaHangDAO;
import com.outfitme.entity.KhachHang;
import com.outfitme.entity.LichSuMuaHang;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author netgi
 */
public class DanhSachKhachHang extends javax.swing.JDialog {

    private KhachHangDAO khachHangDAO = new KhachHangDAO();
    private LichSuMuaHangDAO lichSuMuaHangDAO = new LichSuMuaHangDAO();
    private DefaultTableModel tableModel;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Map<String, String> khachHangMap = new HashMap<>(); // Lưu ánh xạ TenKH -> MaKH

    /**
     * Creates new form DanhSachKhachHang
     */
    public DanhSachKhachHang(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        cboDanhSachKhachHang = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtDiem = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblThanhVien = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Danh Sách Khách Hàng");

        cboDanhSachKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDanhSachKhachHangActionPerformed(evt);
            }
        });

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên Sản Phẩm", "Số Lượng", "Size", "Ngày Mua"
            }
        ));
        jScrollPane1.setViewportView(tblSanPham);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Điểm");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("SĐT");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Thành viên :");

        lblThanhVien.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lblThanhVien.setForeground(new java.awt.Color(255, 73, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cboDanhSachKhachHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSDT)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(cboDanhSachKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboDanhSachKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDanhSachKhachHangActionPerformed
        updateKhachHangInfo();
        fillTableSanPham();
    }//GEN-LAST:event_cboDanhSachKhachHangActionPerformed

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
            java.util.logging.Logger.getLogger(DanhSachKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DanhSachKhachHang dialog = new DanhSachKhachHang(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cboDanhSachKhachHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblThanhVien;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables

    private void init() {
        // Đặt vị trí giữa màn hình
        setLocationRelativeTo(null);

        // Khởi tạo tableModel
        tableModel = (DefaultTableModel) tblSanPham.getModel();
        tableModel.setRowCount(0);

        // Đặt font hỗ trợ tiếng Việt
        tblSanPham.setFont(new java.awt.Font("Arial", 0, 14));

        // Fill dữ liệu vào ComboBox
        fillComboBoxKhachHang();

        // Fill dữ liệu ban đầu (nếu có khách hàng được chọn)
        if (cboDanhSachKhachHang.getItemCount() > 0) {
            cboDanhSachKhachHang.setSelectedIndex(0);
            updateKhachHangInfo();
            fillTableSanPham();
        }
    }

    private void fillComboBoxKhachHang() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        List<KhachHang> khachHangList = khachHangDAO.selectAll();

        for (KhachHang kh : khachHangList) {
            model.addElement(kh.getTenKH());
            khachHangMap.put(kh.getTenKH(), kh.getMaKH());
        }

        cboDanhSachKhachHang.setModel(model);
    }

    private void updateKhachHangInfo() {
        String tenKH = (String) cboDanhSachKhachHang.getSelectedItem();
        if (tenKH != null) {
            String maKH = khachHangMap.get(tenKH);
            KhachHang kh = khachHangDAO.selectById(maKH);
            if (kh != null) {
                txtSDT.setText(kh.getSoDienThoai());
                txtDiem.setText(String.valueOf(kh.getDiem()));
                int diem = kh.getDiem();
                String capBac;
                if (diem >= 1500) {
                    capBac = "Kim Cương";
                } else if (diem >= 1000) {
                    capBac = "Vàng";
                } else if (diem >= 500) {
                    capBac = "Bạc";
                } else {
                    capBac = "Member";
                }
                lblThanhVien.setText(capBac);
            } else {
                txtSDT.setText("");
                txtDiem.setText("");
                lblThanhVien.setText("");
            }
        }
    }

    private void fillTableSanPham() {
        tableModel.setRowCount(0);

        String tenKH = (String) cboDanhSachKhachHang.getSelectedItem();
        if (tenKH == null) {
            return;
        }

        String maKH = khachHangMap.get(tenKH);
        List<LichSuMuaHang> lichSuList = lichSuMuaHangDAO.selectAll();

        for (LichSuMuaHang ls : lichSuList) {
            if (ls.getMaKhachHang().equals(maKH)) {
                // Giả định Size (cần điều chỉnh nếu Size nằm trong bảng SanPham)
                String size = "M"; // Giả định giá trị, bạn cần lấy từ dữ liệu thực tế
                tableModel.addRow(new Object[]{
                    ls.getSanPham(),
                    ls.getSoLuong(),
                    size,
                    dateFormat.format(ls.getThoiGian())
                });
            }
        }
    }

}
