/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DTO.dto_DangNhap;
import UI.ChuongTrinhUI.UI_ChuongTrinh;
import UI.LopHocUI.UI_LopHoc;
import UI.KhachHangUI.UI_KhachHang;
import UI.DangNhapUI.UI_DangNhap;
import UI.TaiKhoan.UI_TaiKhoan;
import java.awt.Color;

public class UI_Main extends javax.swing.JFrame {

    public UI_Main() {
        initComponents();
    }
    
    /*  =====================Khu vực của Tân======*/  
    
    
    //method giao diện cho nhân viên ghi danh 
    public void showGhiDanh(){
        ui_lop.hideBtnLop();
        btnTaiKhoan.setVisible(false);
        ui_ct.hideBtnCt();
    }
    //method giao diện cho nhân viên học vụ
    public void showHocVu(){
        ui_kh.hideBtnKh();
        btnTaiKhoan.setVisible(false);
        ui_ct.hideBtnCt();
    }
    //method hiển thị thông tin người dùng bên góc phải phía trên UI_Main
    public void setThongTinDangNhap(dto_DangNhap dn){
        txtThongTinDangNhap.setText(dn.getMa() + " | " + dn.getHoTen());
    }
    /*  ====================Hết khu vực của Tân
    */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        lblThongKe = new javax.swing.JLabel();
        btnKhachHang = new javax.swing.JButton();
        lblKhachHang = new javax.swing.JLabel();
        btnLopHoc = new javax.swing.JButton();
        lblLopHoc = new javax.swing.JLabel();
        btnCTHoc = new javax.swing.JButton();
        lblCTHoc = new javax.swing.JLabel();
        btnTaiKhoan = new javax.swing.JButton();
        lblTaiKhoan = new javax.swing.JLabel();
        pnBody = new javax.swing.JPanel();
        pnThongKe = new javax.swing.JPanel();
        txtThongTinDangNhap = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Trung Tâm Anh Ngữ");
        setSize(new java.awt.Dimension(1200, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnDangXuat.setBackground(new java.awt.Color(51, 153, 0));
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setBorder(null);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnThongKe.setBackground(new java.awt.Color(153, 255, 153));
        btnThongKe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thong k3.png"))); // NOI18N
        btnThongKe.setText("THỐNG KÊ");
        btnThongKe.setContentAreaFilled(false);
        btnThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongKe.setFocusable(false);
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        lblThongKe.setBackground(new java.awt.Color(0, 204, 106));
        lblThongKe.setOpaque(true);

        btnKhachHang.setBackground(new java.awt.Color(153, 255, 153));
        btnKhachHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/khach hang 2.png"))); // NOI18N
        btnKhachHang.setText("KHÁCH HÀNG");
        btnKhachHang.setContentAreaFilled(false);
        btnKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKhachHang.setFocusable(false);
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });

        lblKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        lblKhachHang.setOpaque(true);

        btnLopHoc.setBackground(new java.awt.Color(153, 255, 153));
        btnLopHoc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLopHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/class2.png"))); // NOI18N
        btnLopHoc.setText("LỚP HỌC");
        btnLopHoc.setContentAreaFilled(false);
        btnLopHoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLopHoc.setFocusable(false);
        btnLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLopHocActionPerformed(evt);
            }
        });

        lblLopHoc.setBackground(new java.awt.Color(255, 255, 255));
        lblLopHoc.setOpaque(true);

        btnCTHoc.setBackground(new java.awt.Color(153, 255, 153));
        btnCTHoc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCTHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chuong trinh hoc 1.png"))); // NOI18N
        btnCTHoc.setText("CHƯƠNG TRÌNH HỌC");
        btnCTHoc.setContentAreaFilled(false);
        btnCTHoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCTHoc.setFocusable(false);
        btnCTHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTHocActionPerformed(evt);
            }
        });

        lblCTHoc.setBackground(new java.awt.Color(255, 255, 255));
        lblCTHoc.setOpaque(true);

        btnTaiKhoan.setBackground(new java.awt.Color(153, 255, 153));
        btnTaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tai khoan 1.png"))); // NOI18N
        btnTaiKhoan.setText("TÀI KHOẢN");
        btnTaiKhoan.setContentAreaFilled(false);
        btnTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTaiKhoan.setFocusable(false);
        btnTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiKhoanActionPerformed(evt);
            }
        });

        lblTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        lblTaiKhoan.setOpaque(true);

        pnBody.setBackground(new java.awt.Color(204, 255, 255));
        pnBody.setLayout(new java.awt.CardLayout());

        pnThongKe.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnThongKeLayout = new javax.swing.GroupLayout(pnThongKe);
        pnThongKe.setLayout(pnThongKeLayout);
        pnThongKeLayout.setHorizontalGroup(
            pnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        pnThongKeLayout.setVerticalGroup(
            pnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnBody.add(pnThongKe, "card4");

        txtThongTinDangNhap.setEditable(false);
        txtThongTinDangNhap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtThongTinDangNhap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtThongTinDangNhap.setText("<Tên Nhân Viên>-<Mã NV>");
        txtThongTinDangNhap.setBorder(null);
        txtThongTinDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThongTinDangNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnThongKe))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKhachHang)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnCTHoc))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCTHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnTaiKhoan))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(20, 20, 20)
                .addComponent(txtThongTinDangNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnBody, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnKhachHang)
                            .addComponent(btnLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCTHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtThongTinDangNhap, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThongKe)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCTHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 7, Short.MAX_VALUE)
                    .addComponent(lblThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addComponent(pnBody, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1216, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        lblThongKe.setBackground(new Color(0, 204, 106));

        lblKhachHang.setBackground(new Color(255, 255, 255));
        lblLopHoc.setBackground(new Color(255, 255, 255));
        lblCTHoc.setBackground(new Color(255, 255, 255));
        lblTaiKhoan.setBackground(new Color(255, 255, 255));

        pnBody.removeAll();
        pnBody.repaint();
        pnBody.add(pnThongKe);
        pnBody.repaint();
        pnBody.revalidate();
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        lblKhachHang.setBackground(new Color(255,0,151));

        lblThongKe.setBackground(new Color(255, 255, 255));
        lblLopHoc.setBackground(new Color(255, 255, 255));
        lblCTHoc.setBackground(new Color(255, 255, 255));
        lblTaiKhoan.setBackground(new Color(255, 255, 255));

        pnBody.removeAll();
        pnBody.repaint();
        pnBody.revalidate();
        pnBody.add(ui_kh);
        pnBody.repaint();
        pnBody.revalidate();
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLopHocActionPerformed
        lblLopHoc.setBackground(new Color(96,60,186));

        lblThongKe.setBackground(new Color(255, 255, 255));
        lblKhachHang.setBackground(new Color(255, 255, 255));
        lblCTHoc.setBackground(new Color(255, 255, 255));
        lblTaiKhoan.setBackground(new Color(255, 255, 255));

        pnBody.removeAll();
        pnBody.repaint();
        pnBody.revalidate();
        pnBody.add(ui_lop);
        pnBody.repaint();
        pnBody.revalidate();
    }//GEN-LAST:event_btnLopHocActionPerformed

    private void btnCTHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTHocActionPerformed
        lblCTHoc.setBackground(new Color(0,171,169));
        lblThongKe.setBackground(new Color(255, 255, 255));
        lblKhachHang.setBackground(new Color(255, 255, 255));
        lblLopHoc.setBackground(new Color(255, 255, 255));
        lblTaiKhoan.setBackground(new Color(255, 255, 255));

        pnBody.removeAll();
        pnBody.repaint();
        pnBody.revalidate();
        pnBody.add(ui_ct);
        pnBody.repaint();
        pnBody.revalidate();

    }//GEN-LAST:event_btnCTHocActionPerformed

    private void btnTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiKhoanActionPerformed
        lblTaiKhoan.setBackground(new Color(255,196,13));
        lblThongKe.setBackground(new Color(255, 255, 255));
        lblKhachHang.setBackground(new Color(255, 255, 255));
        lblLopHoc.setBackground(new Color(255, 255, 255));
        lblCTHoc.setBackground(new Color(255, 255, 255));

        pnBody.removeAll();
        pnBody.repaint();
        pnBody.revalidate();
        pnBody.add(ui_tk);
        pnBody.repaint();
        pnBody.revalidate();
    }//GEN-LAST:event_btnTaiKhoanActionPerformed

    private void txtThongTinDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThongTinDangNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThongTinDangNhapActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        dispose();
        new UI_DangNhap().show();
    }//GEN-LAST:event_btnDangXuatActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Main().setVisible(true);
            }
        });
    }

    //Biến tự định nghĩa
    private UI_LopHoc ui_lop = new UI_LopHoc();
    private UI_KhachHang ui_kh = new UI_KhachHang();
    private UI_ChuongTrinh ui_ct = new UI_ChuongTrinh();
    private UI_TaiKhoan ui_tk = new UI_TaiKhoan();
    //Kết thúc biến tự định nghĩa
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCTHoc;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnLopHoc;
    private javax.swing.JButton btnTaiKhoan;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCTHoc;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblLopHoc;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JPanel pnBody;
    private javax.swing.JPanel pnThongKe;
    private javax.swing.JTextField txtThongTinDangNhap;
    // End of variables declaration//GEN-END:variables
}
