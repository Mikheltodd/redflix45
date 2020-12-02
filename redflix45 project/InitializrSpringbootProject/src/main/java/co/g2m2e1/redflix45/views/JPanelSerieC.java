/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2m2e1.redflix45.views;

import co.g2m2e1.redflix45.Context;
import co.g2m2e1.redflix45.models.Shows;
import co.g2m2e1.redflix45.repositories.ShowsRepository;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ESLUNAP
 */
public class JPanelSerieC extends javax.swing.JPanel {

    ShowsRepository showRepository;
    /**
     * Creates new form JPanelSerie
     */
    public JPanelSerieC() {
        initComponents();
        showRepository = Context.getBean(ShowsRepository.class);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldTituloSerie = new javax.swing.JTextField();
        jTextFieldNoCaps = new javax.swing.JTextField();
        jTextFieldNoTemp = new javax.swing.JTextField();
        jButtonGuardarS = new javax.swing.JButton();
        jButtonLimpiarCampos = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldTituloSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Título serie"));

        jTextFieldNoCaps.setBorder(javax.swing.BorderFactory.createTitledBorder("No. Capítulos"));

        jTextFieldNoTemp.setBorder(javax.swing.BorderFactory.createTitledBorder("No. Temporadas"));

        jButtonGuardarS.setText("Crear");
        jButtonGuardarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarSActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTituloSerie)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldNoCaps, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButtonGuardarS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNoTemp)
                            .addComponent(jButtonLimpiarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTextFieldTituloSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNoCaps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNoTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardarS)
                    .addComponent(jButtonLimpiarCampos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarSActionPerformed
        // TODO add your handling code here:
        String titleShow = jTextFieldTituloSerie.getText();
        Optional<Shows> opt = showRepository.findById(jTextFieldTituloSerie.getText());
        if (!titleShow.isEmpty()){
            try{
                if (!opt.isPresent()){
                    Shows s = new Shows();
                    s.setShowTitle(jTextFieldTituloSerie.getText());
                    s.setShowEpisodes(jTextFieldNoCaps.getText());
                    s.setShowSeasons(jTextFieldNoTemp.getText());
                    showRepository.save(s);
                    jTextFieldTituloSerie.requestFocus();
                    System.out.println("Se registró correctamente la serie "+s.getShowTitle());
                    JOptionPane.showMessageDialog(null, "Se registró correctamente la serie "+ s.getShowTitle(),"Mensaje",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"Ya existe la serie ingresada","Warning",JOptionPane.WARNING_MESSAGE);
                }    
            }catch(Exception e){
                System.out.println("Error al ingresar la serie");
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Error al ingresar la serie","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"No ha ingresado nombre de la serie","Warning",JOptionPane.WARNING_MESSAGE);
        }    
    }//GEN-LAST:event_jButtonGuardarSActionPerformed

    private void jButtonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCamposActionPerformed
        // TODO add your handling code here:
        JTextField caja;
        for (int i = 0; i< this.getComponentCount();i++){
            if(this.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
                caja = (JTextField)this.getComponent(i);
                caja.setText("");            
            }        
        }
        jTextFieldTituloSerie.requestFocus();
    }//GEN-LAST:event_jButtonLimpiarCamposActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardarS;
    private javax.swing.JButton jButtonLimpiarCampos;
    private javax.swing.JTextField jTextFieldNoCaps;
    private javax.swing.JTextField jTextFieldNoTemp;
    private javax.swing.JTextField jTextFieldTituloSerie;
    // End of variables declaration//GEN-END:variables
}
