/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2m2e1.redflix45.views;

import co.g2m2e1.redflix45.Context;
import co.g2m2e1.redflix45.models.Users;
import co.g2m2e1.redflix45.repositories.UsersRepository;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ESLUNAP
 */
public class JPanelUsuarioD extends javax.swing.JPanel {

     UsersRepository userRepository;
    /**
     * Creates new form JPanelUsuario
     */
    public JPanelUsuarioD() {
        initComponents();
        userRepository = Context.getBean(UsersRepository.class);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldAlias = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextFieldCelular = new javax.swing.JTextField();
        jTextFieldFechaNto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonBorrarU = new javax.swing.JButton();
        jButtonLimpiarCampos = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldAlias.setBorder(javax.swing.BorderFactory.createTitledBorder("Alias"));
        jTextFieldAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAliasActionPerformed(evt);
            }
        });

        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombres"));

        jTextFieldApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellidos"));

        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña"));
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });

        jTextFieldCelular.setBorder(javax.swing.BorderFactory.createTitledBorder("Celular"));

        jTextFieldFechaNto.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha nacimiento"));

        jLabel9.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel9.setText("Ej: yyyy-MM-dd");

        jButtonBorrarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basura.png"))); // NOI18N
        jButtonBorrarU.setText("Borrar");
        jButtonBorrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarUActionPerformed(evt);
            }
        });

        jButtonLimpiarCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/escoba.jpeg"))); // NOI18N
        jButtonLimpiarCampos.setText("Limpiar Campos");
        jButtonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldApellido, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldFechaNto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonBorrarU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLimpiarCampos)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTextFieldAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFechaNto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpiarCampos)
                    .addComponent(jButtonBorrarU))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        // TODO add your handling code here:
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jButtonBorrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarUActionPerformed
        // TODO add your handling code here:
        try{
            String alias = jTextFieldAlias.getText();
            
            Optional <Users> optional =  userRepository.findById(jTextFieldAlias.getText());
            if (alias.isEmpty()){
                System.out.println("No ha digitado un alias");
                JOptionPane.showMessageDialog(null,"No ha digitado un alias","Warning",JOptionPane.WARNING_MESSAGE);
            }else if(optional.isPresent()){
                userRepository.deleteById(alias);
                jTextFieldAlias.requestFocus();
                System.out.println("Se elimino exitosamente el usuario: "+ optional.get().getUserUsername());
                JOptionPane.showMessageDialog(null, "Se elimino exitosamente el usuario: "+ optional.get().getUserUsername(),"Mensaje",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"No se encontro un alias","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }catch(Exception e){
            System.out.println("Error al eliminar usuario");
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error al eliminar usuario","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBorrarUActionPerformed

    private void jButtonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCamposActionPerformed
        // TODO add your handling code here:
        JTextField caja;
        for (int i = 0; i< this.getComponentCount();i++){
            if(this.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
                caja = (JTextField)this.getComponent(i);
                caja.setText("");            
            }        
        }
        jTextFieldAlias.requestFocus();
    }//GEN-LAST:event_jButtonLimpiarCamposActionPerformed

    private void jTextFieldAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAliasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrarU;
    private javax.swing.JButton jButtonLimpiarCampos;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldAlias;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFechaNto;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
