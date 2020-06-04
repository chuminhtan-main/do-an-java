/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.KhachHangUI;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author ThinkPro
 */
public class FormLichSuKH extends javax.swing.JFrame {

    /**
     * Creates new form FormLichSuKH
     */
    public FormLichSuKH() {
        initComponents();
        
        tbLichSu.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
        tbLichSu.getTableHeader().setOpaque(false);
        tbLichSu.getTableHeader().setForeground(new Color(22, 105, 158));
        tbLichSu.setSelectionBackground(new Color(204,204,204));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinField1 = new com.toedter.components.JSpinField();
        pnLichSuKH = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scLichSu = new javax.swing.JScrollPane();
        tbLichSu = new javax.swing.JTable();
        btnXacNhanLichSu = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lịch Sử Khách Hàng");
        setResizable(false);

        pnLichSuKH.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("LỊCH SỬ KHÁCH HÀNG");

        tbLichSu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbLichSu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Lớp", "Lớp", "Chương Trình", "Bắt Đầu", "Kết Thúc", "Nghe", "Nói", "Đọc", "Viết", "TB", "Trạng Thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLichSu.setPreferredSize(new java.awt.Dimension(300, 300));
        tbLichSu.setRowHeight(30);
        tbLichSu.setSelectionBackground(new java.awt.Color(232, 57, 95));
        scLichSu.setViewportView(tbLichSu);
        if (tbLichSu.getColumnModel().getColumnCount() > 0) {
            tbLichSu.getColumnModel().getColumn(0).setMinWidth(50);
            tbLichSu.getColumnModel().getColumn(0).setMaxWidth(50);
            tbLichSu.getColumnModel().getColumn(1).setMaxWidth(100);
            tbLichSu.getColumnModel().getColumn(6).setMinWidth(50);
            tbLichSu.getColumnModel().getColumn(6).setMaxWidth(50);
            tbLichSu.getColumnModel().getColumn(7).setMaxWidth(50);
            tbLichSu.getColumnModel().getColumn(8).setMaxWidth(50);
            tbLichSu.getColumnModel().getColumn(9).setMaxWidth(50);
            tbLichSu.getColumnModel().getColumn(10).setMaxWidth(50);
        }

        btnXacNhanLichSu.setBackground(new java.awt.Color(91, 155, 213));
        btnXacNhanLichSu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXacNhanLichSu.setForeground(new java.awt.Color(255, 255, 255));
        btnXacNhanLichSu.setText("XÁC NHẬN");
        btnXacNhanLichSu.setContentAreaFilled(false);
        btnXacNhanLichSu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacNhanLichSu.setFocusable(false);
        btnXacNhanLichSu.setOpaque(true);
        btnXacNhanLichSu.setPreferredSize(new java.awt.Dimension(209, 40));
        btnXacNhanLichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanLichSuActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Nguyễn Văn A - 947323");

        javax.swing.GroupLayout pnLichSuKHLayout = new javax.swing.GroupLayout(pnLichSuKH);
        pnLichSuKH.setLayout(pnLichSuKHLayout);
        pnLichSuKHLayout.setHorizontalGroup(
            pnLichSuKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLichSuKHLayout.createSequentialGroup()
                .addGroup(pnLichSuKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLichSuKHLayout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(btnXacNhanLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnLichSuKHLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(scLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnLichSuKHLayout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addGroup(pnLichSuKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnLichSuKHLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)))))
                .addGap(30, 30, 30))
        );
        pnLichSuKHLayout.setVerticalGroup(
            pnLichSuKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLichSuKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXacNhanLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLichSuKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLichSuKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnXacNhanLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanLichSuActionPerformed
        new FormThemKH().show();
    }//GEN-LAST:event_btnXacNhanLichSuActionPerformed

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
            java.util.logging.Logger.getLogger(FormLichSuKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLichSuKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLichSuKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLichSuKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLichSuKH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXacNhanLichSu;
    private javax.swing.JLabel jLabel1;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel pnLichSuKH;
    private javax.swing.JScrollPane scLichSu;
    private javax.swing.JTable tbLichSu;
    // End of variables declaration//GEN-END:variables
}