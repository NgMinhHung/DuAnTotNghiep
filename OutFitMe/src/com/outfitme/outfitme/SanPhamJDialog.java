/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.outfitme.outfitme;

import com.outfitme.dao.SanPhamDAO;
import com.outfitme.entity.SanPham;
import com.outfitme.utils.XImage;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class SanPhamJDialog extends javax.swing.JDialog {

    /**
     * Creates new form SanPhamJDialog
     */
    public SanPhamJDialog(java.awt.Frame parent, boolean modal) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cboLoai = new javax.swing.JComboBox<>();
        txtNhap = new javax.swing.JTextField();
        txtBan = new javax.swing.JTextField();
        txtSL = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblHinhanh = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        Search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel1.setText("Sản Phẩm");

        jLabel2.setText("Mã SP");

        jLabel3.setText("Tên SP");

        jLabel4.setText("Loại SP");

        jLabel5.setText("Gía nhập");

        jLabel6.setText("Số lượng");

        jLabel7.setText("Size");

        jLabel8.setText("Mô tả");

        jLabel9.setText("Search");

        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });

        cboLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoaiActionPerformed(evt);
            }
        });

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        buttonGroup1.add(rdNam);
        rdNam.setText("Nam");

        buttonGroup1.add(rdNu);
        rdNu.setText("Nữ");

        jLabel10.setText("Gía bán");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblHinhanh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhanh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblHinhanh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhanhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHinhanh, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHinhanh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Loại Sản Phẩm", "Giá Nhập", "Giá Bán", "Số Lương", "Phân Loại", "Size", "Mô Tả", "Hình ảnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSP);

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(12, 12, 12)
                                    .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBan, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rdNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdNu)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnNew)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSave))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnDelete)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdate))
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Search)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdNam)
                            .addComponent(rdNu))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        clearForm();
        JOptionPane.showMessageDialog(this, "Đã làm mới form");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        searchByMaSP();
    }//GEN-LAST:event_SearchActionPerformed

    private void cboLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiActionPerformed
        // TODO add your handling code here:
        loadTable();
    }//GEN-LAST:event_cboLoaiActionPerformed

    private void lblHinhanhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhanhMouseClicked
        // TODO add your handling code here:
        chonAnh();
    }//GEN-LAST:event_lblHinhanhMouseClicked

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
            java.util.logging.Logger.getLogger(SanPhamJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SanPhamJDialog dialog = new SanPhamJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Search;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboLoai;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHinhanh;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tblSP;
    private javax.swing.JTextField txtBan;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNhap;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
 private SanPhamDAO dao = new SanPhamDAO();
    private int row = -1;

    void init() {
        setLocationRelativeTo(null);
        loadLoaiSanPham();  // Load loại sản phẩm trước
        loadTable();  // Sau đó mới load bảng
        this.row = -1;
        
        lblHinhanh.setPreferredSize(new Dimension(100, 100)); // Đặt kích thước cố định cho JLabel


        // Sự kiện chọn ComboBox sẽ cập nhật bảng
        cboLoai.addActionListener(e -> loadTable());

        // Xử lý sự kiện click vào bảng
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
    }

    private void loadLoaiSanPham() {
        cboLoai.removeAllItems(); // Xóa dữ liệu cũ trước khi load mới
        try {
            List<String> listLoaiSP = dao.getAllLoaiSanPham();
            for (String loai : listLoaiSP) {
                cboLoai.addItem(loai);
            }
            if (cboLoai.getItemCount() > 0) {
                cboLoai.setSelectedIndex(0); // Chọn giá trị đầu tiên mặc định
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "⚠ Lỗi khi tải loại sản phẩm: " + e.getMessage());
        }
    }

    private void loadTable() {
        String loaiSP = cboLoai.getSelectedItem().toString().trim();

        DefaultTableModel model = (DefaultTableModel) tblSP.getModel();
        model.setRowCount(0);  // Xóa dữ liệu cũ trước khi thêm mới

        try {
            List<SanPham> list = dao.selectByLoaiSP(loaiSP);
            for (SanPham sp : list) {
                model.addRow(new Object[]{
                    sp.getMaSP(), sp.getTenSP(), sp.getLoaiSP(),
                    sp.getMoTa(), sp.getGiaNhap(), sp.getGiaBan(),
                    sp.getSize(), sp.getSoLuongTonKho(), sp.getPhanLoai(),
                    sp.getHinhAnh()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "⚠ Lỗi khi tải dữ liệu sản phẩm!\n" + e.getMessage());
            e.printStackTrace();
        }
    }

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {
        this.row = tblSP.getSelectedRow();
        if (this.row >= 0) {
            fillFormFromTable();
        }
    }

    private void fillFormFromTable() {
        if (this.row < 0) {
            return;
        }
        String maSP = (String) tblSP.getValueAt(this.row, 0);
        SanPham sp = dao.selectById(maSP);
        setForm(sp);
    }
    private void setForm(SanPham sp) {
        if (sp == null) {
            return;
        }

        // Cập nhật các trường thông tin khác
        txtMa.setText(sp.getMaSP());
        txtName.setText(sp.getTenSP());
        cboLoai.setSelectedItem(sp.getLoaiSP());
        txtMoTa.setText(sp.getMoTa());
        txtNhap.setText(String.valueOf(sp.getGiaNhap()));
        txtBan.setText(String.valueOf(sp.getGiaBan()));
        txtSize.setText(sp.getSize());
        txtSL.setText(String.valueOf(sp.getSoLuongTonKho()));
        if ("Nam".equals(sp.getPhanLoai())) {
            rdNam.setSelected(true);
        } else if ("Nu".equals(sp.getPhanLoai())) {
            rdNu.setSelected(true);
        } else {
            buttonGroup1.clearSelection();
        }

        // Kiểm tra nếu có ảnh
        if (sp.getHinhAnh() != null && !sp.getHinhAnh().isEmpty()) {
            // Đọc ảnh từ cơ sở dữ liệu (ví dụ hình ảnh lưu dưới dạng đường dẫn)
            ImageIcon icon = XImage.read(sp.getHinhAnh());
            Image img = icon.getImage();

            // Điều chỉnh kích thước hình ảnh sao cho phù hợp với JLabel
            Image scaledImage = img.getScaledInstance(167, 225, Image.SCALE_SMOOTH);

            // Đặt icon cho JLabel mà không làm thay đổi kích thước của JLabel
            lblHinhanh.setIcon(new ImageIcon(scaledImage));
            lblHinhanh.setToolTipText(sp.getHinhAnh());
        } else {
            lblHinhanh.setIcon(null);
            lblHinhanh.setToolTipText("");
        }
    }

        

    public void insert() {
        if (txtMa.getText().trim().isEmpty() || txtName.getText().trim().isEmpty() || txtNhap.getText().trim().isEmpty()
                || txtBan.getText().trim().isEmpty() || txtSize.getText().trim().isEmpty() || txtSL.getText().trim().isEmpty()
                || (!rdNam.isSelected() && !rdNu.isSelected())) {
            JOptionPane.showMessageDialog(this, "⚠ Vui lòng nhập đầy đủ thông tin!");
            return;
        }
        if (lblHinhanh.getIcon() == null) {
            JOptionPane.showMessageDialog(this, "⚠ Vui lòng chọn hình ảnh cho sản phẩm!");
            return;
        }

        SanPham sp = getForm();
        try {
            dao.insert(sp);
            JOptionPane.showMessageDialog(this, "✅ Thêm sản phẩm thành công!");
            loadTable();
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "❌ Thêm sản phẩm thất bại!\n" + e.getMessage());
        }
    }

    private void update() {
        if (this.row < 0) {
            JOptionPane.showMessageDialog(this, "⚠ Vui lòng chọn sản phẩm cần cập nhật!");
            return;
        }

        SanPham sp = getForm();
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn cập nhật sản phẩm này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            dao.update(sp);
            JOptionPane.showMessageDialog(this, "✅ Cập nhật sản phẩm thành công!");
            loadTable();
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "❌ Cập nhật sản phẩm thất bại!\n" + e.getMessage());
        }
    }

    private void delete() {
        String maSP = txtMa.getText();
        if (maSP.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "⚠ Vui lòng chọn sản phẩm cần xóa!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa sản phẩm này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            clearForm();
            return;
        }

        try {
            dao.delete(maSP);
            JOptionPane.showMessageDialog(this, "✅ Xóa sản phẩm thành công!");
            loadTable();
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "❌ Xóa sản phẩm thất bại!\n" + e.getMessage());
        }
    }

    private SanPham getForm() {
        SanPham sp = new SanPham();
        sp.setMaSP(txtMa.getText());
        sp.setTenSP(txtName.getText());
        sp.setLoaiSP(cboLoai.getSelectedItem().toString());
        sp.setMoTa(txtMoTa.getText());
        sp.setGiaNhap(Double.parseDouble(txtNhap.getText()));
        sp.setGiaBan(Double.parseDouble(txtBan.getText()));
        sp.setSize(txtSize.getText());
        sp.setSoLuongTonKho(Integer.parseInt(txtSL.getText()));
        if (rdNam.isSelected()) {
            sp.setPhanLoai("Nam");
        } else if (rdNu.isSelected()) {
            sp.setPhanLoai("Nu");
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn phân loại Nam hoặc Nữ!");
            return null;
        }
        sp.setHinhAnh(lblHinhanh.getToolTipText());

        return sp;
    }

    private void clearForm() {
        txtMa.setText("");
        txtName.setText("");
        cboLoai.setSelectedIndex(0);
        txtMoTa.setText("");
        txtNhap.setText("");
        txtBan.setText("");
        txtSize.setText("");
        txtSL.setText("");
        buttonGroup1.clearSelection();
        lblHinhanh.setToolTipText(null);
         lblHinhanh.setIcon(null);
    }

    private void searchByMaSP() {
        String maSP = txtSearch.getText().trim();  // Lấy mã sản phẩm từ ô nhập

        if (maSP.isEmpty()) {
            JOptionPane.showMessageDialog(this, "⚠ Vui lòng nhập mã sản phẩm để tìm kiếm!");
            return;
        }

        try {
            SanPham sp = dao.selectById(maSP); // Gọi DAO để lấy thông tin sản phẩm
            if (sp != null) {
                setForm(sp);  // Hiển thị thông tin sản phẩm lên form
                JOptionPane.showMessageDialog(this, "✅ Tìm thấy sản phẩm!");
            } else {
                JOptionPane.showMessageDialog(this, "❌ Không tìm thấy sản phẩm có mã: " + maSP);
                clearForm();  // Xóa form nếu không tìm thấy sản phẩm
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "❌ Lỗi khi tìm kiếm sản phẩm!\n" + e.getMessage());
            e.printStackTrace();
        }
    }

    
    void chonAnh() {
    JFileChooser fileChooser = new JFileChooser();
    if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        String fileName = file.getName();
        XImage.save(file); // Lưu ảnh vào thư mục cố định

        // Đọc ảnh từ file và điều chỉnh kích thước
        ImageIcon icon = XImage.read(fileName);
        Image img = icon.getImage();

        Image scaledImage = img.getScaledInstance(167,225, Image.SCALE_SMOOTH);

        // Đặt icon cho JLabel mà không làm thay đổi kích thước của JLabel
        lblHinhanh.setIcon(new ImageIcon(scaledImage));
        lblHinhanh.setToolTipText(fileName); // Lưu tên file vào tooltip của label
    }
}


}