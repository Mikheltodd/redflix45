/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2m2e1.redflix45.views;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.SwingUtilities;

/**
 *
 * @author ESLUNAP
 */
public class CreateFrame extends javax.swing.JFrame {
    
    JPanelUsuarioC jpu = new JPanelUsuarioC();
    JPanelSerieC jps = new JPanelSerieC();
    JPanelPeliculaC jpp = new JPanelPeliculaC();
    CardLayout vista;
    
    /**
     * Creates new form CreateFrame
     */
    public CreateFrame() {
        initComponents();
        vista = (CardLayout) jPanelCreate.getLayout();
        jPanelCreate.add(jpu,"usuario");
        vista.show(jPanelCreate, "usuario");
        this.getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBoxCreate = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanelCreate = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(100, 100));

        jComboBoxCreate.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxCreate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Serie", "Película" }));
        jComboBoxCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCreateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Menú Crear");

        jPanelCreate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelCreate.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBoxCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //COMBO BOX VENTANA CREATE
    private void jComboBoxCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCreateActionPerformed
        // TODO add your handling code here:
        String opcion = jComboBoxCreate.getSelectedItem().toString();
        switch (opcion){
            case "Usuario":
                jPanelCreate.add(jpu,"usuario");
                vista.show(jPanelCreate, "usuario");
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();
                break;
            case "Serie":
                jPanelCreate.add(jps,"serie");
                vista.show(jPanelCreate, "serie");
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();
                break;
            case "Película":
                jPanelCreate.add(jpp,"pelicula");
                vista.show(jPanelCreate, "pelicula");
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();
                break;
        }
    }//GEN-LAST:event_jComboBoxCreateActionPerformed

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
                if ("FlatLaf Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelCreate;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
