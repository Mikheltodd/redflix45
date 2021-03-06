/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2m2e1.redflix45.views;

import co.g2m2e1.redflix45.Context;
import co.g2m2e1.redflix45.models.Movies;
import co.g2m2e1.redflix45.repositories.MoviesRepository;
import java.util.List;
import java.util.Optional;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 *
 * @author ESLUNAP
 */
public class JPanelPeliculaU extends javax.swing.JPanel {

    MoviesRepository movieRepository;
    DefaultListModel listModel = new DefaultListModel();
    SimpleAttributeSet attribs = new SimpleAttributeSet();
        
    /**
     * Creates new form JPanelPelicula
     */
    public JPanelPeliculaU() {
        initComponents();
        movieRepository = Context.getBean(MoviesRepository.class);
       
        StyleConstants.setAlignment(attribs , StyleConstants.ALIGN_JUSTIFIED);
        jtpResumen.setParagraphAttributes(attribs,true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTipoConsulta = new javax.swing.ButtonGroup();
        jTextFieldPelicula = new javax.swing.JTextField();
        jTextFieldNombreDir = new javax.swing.JTextField();
        jButtonActualizarP = new javax.swing.JButton();
        jButtonLimpiarCampos = new javax.swing.JButton();
        jtfAnno = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtpResumen = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldPelicula.setToolTipText("Ingrese título de la película que desea consultar");
        jTextFieldPelicula.setBorder(javax.swing.BorderFactory.createTitledBorder("Título película"));
        jTextFieldPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPeliculaActionPerformed(evt);
            }
        });
        add(jTextFieldPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 35, 203, -1));

        jTextFieldNombreDir.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre director"));
        add(jTextFieldNombreDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 86, 218, -1));

        jButtonActualizarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editar.png"))); // NOI18N
        jButtonActualizarP.setText("Actualizar");
        jButtonActualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarPActionPerformed(evt);
            }
        });
        add(jButtonActualizarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jButtonLimpiarCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/escoba.jpeg"))); // NOI18N
        jButtonLimpiarCampos.setText("Limpiar Campos");
        jButtonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCamposActionPerformed(evt);
            }
        });
        add(jButtonLimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        jtfAnno.setBorder(javax.swing.BorderFactory.createTitledBorder("Año"));
        add(jtfAnno, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 131, 98, 38));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen"));
        jScrollPane3.setViewportView(jtpResumen);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 175, 256, 129));

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        jLabel1.setText("Búsqueda por Título película");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCamposActionPerformed
        // TODO add your handling code here:
        btnGroupTipoConsulta.clearSelection();
        JTextField caja;
        for (int i = 0; i< this.getComponentCount();i++){
            if(this.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
                caja = (JTextField)this.getComponent(i);
                caja.setText("");            
            }        
        }
        jtpResumen.setText("");
        listModel.clear();
       
    }//GEN-LAST:event_jButtonLimpiarCamposActionPerformed

    private void jButtonActualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarPActionPerformed
        // TODO add your handling code here
         String idPelicula=jTextFieldPelicula.getText();
         Optional<Movies> opt=movieRepository.findById(idPelicula);
         
         if(!idPelicula.isEmpty()){
             try{
                 if(opt.isPresent()){
                     Movies m=new Movies();
                     m.setMovieTitle(idPelicula);
                     m.setMovieDirector(jTextFieldNombreDir.getText());
                     m.setMovieSummary(jtpResumen.getText());
                     m.setMovieYear(Long.parseLong(jtfAnno.getText()));
                     movieRepository.save(m);
                     JOptionPane.showMessageDialog(null,"Se actualizo correctamente la pelicula: "+idPelicula,"Warning",JOptionPane.WARNING_MESSAGE);

                 }else{
                     JOptionPane.showMessageDialog(null,"No se encontro la pelicula: "+idPelicula,"Warning",JOptionPane.WARNING_MESSAGE);

                 
                 }
             }catch(Exception e){
             }
         }else{
           JOptionPane.showMessageDialog(null,"No se ha digitado un nombre de pelicula","Warning",JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_jButtonActualizarPActionPerformed

    private void jTextFieldPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPeliculaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupTipoConsulta;
    private javax.swing.JButton jButtonActualizarP;
    private javax.swing.JButton jButtonLimpiarCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldNombreDir;
    private javax.swing.JTextField jTextFieldPelicula;
    private javax.swing.JTextField jtfAnno;
    private javax.swing.JTextPane jtpResumen;
    // End of variables declaration//GEN-END:variables
}
