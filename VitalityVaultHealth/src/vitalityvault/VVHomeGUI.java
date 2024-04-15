/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vitalityvault;





/**
 *
 * @author deand
 */
public class VVHomeGUI extends javax.swing.JFrame {

    /**
     * Creates new form VVJomeGUI
     */
    public VVHomeGUI() {
        initComponents();
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
        titleLbl = new javax.swing.JLabel();
        foodPlanBtn = new javax.swing.JButton();
        workoutPlanBtn = new javax.swing.JButton();
        bmiCalc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        titleLbl.setFont(new java.awt.Font("Verdana Pro Cond", 1, 40)); // NOI18N
        titleLbl.setText(" Vitality Vault");

        foodPlanBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        foodPlanBtn.setText("Food Plan");
        foodPlanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodPlanBtnActionPerformed(evt);
            }
        });

        workoutPlanBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        workoutPlanBtn.setText("Workout Plan");
        workoutPlanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workoutPlanBtnActionPerformed(evt);
            }
        });

        bmiCalc.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bmiCalc.setText("BMI Calculator");
        bmiCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmiCalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bmiCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(workoutPlanBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(foodPlanBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bmiCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(workoutPlanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(foodPlanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void foodPlanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodPlanBtnActionPerformed
        // TODO add your handling code here:
        VVCalTrackerGUI myGUI = new VVCalTrackerGUI();
        myGUI.setVisible(true);
    }//GEN-LAST:event_foodPlanBtnActionPerformed

    private void bmiCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmiCalcActionPerformed
        // TODO add your handling code here:
        VVHGUI myGUI = new VVHGUI();
        myGUI.setVisible(true);
    }//GEN-LAST:event_bmiCalcActionPerformed

    private void workoutPlanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workoutPlanBtnActionPerformed
        // Create a new instance of VVHGUI
        vvworkout myG = new vvworkout();
        myG.setVisible(true);
    }//GEN-LAST:event_workoutPlanBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VVHomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VVHomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VVHomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VVHomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VVHomeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bmiCalc;
    private javax.swing.JButton foodPlanBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton workoutPlanBtn;
    // End of variables declaration//GEN-END:variables
}