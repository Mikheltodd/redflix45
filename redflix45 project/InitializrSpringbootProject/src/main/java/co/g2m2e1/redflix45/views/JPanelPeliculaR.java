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
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 *
 * @author ESLUNAP
 */
public class JPanelPeliculaR extends javax.swing.JPanel {

    MoviesRepository movieRepository;
    DefaultListModel listModel = new DefaultListModel();
    SimpleAttributeSet attribs = new SimpleAttributeSet();
        
    /**
     * Creates new form JPanelPelicula
     */
    public JPanelPeliculaR() {
        initComponents();
        movieRepository = Context.getBean(MoviesRepository.class);
        //jLabelInfoTitulo.setVisible(false);
        jLabelInfoDirector.setVisible(false);
        jTextFieldNombreDir.setEnabled(false);
        jrbTitulo.setSelected(true);
        jtpResumen.setEnabled(false);
        jtfAnno.setEnabled(false);
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
        jButtonGuardarP = new javax.swing.JButton();
        jButtonLimpiarCampos = new javax.swing.JButton();
        jPanelTipoConsulta = new javax.swing.JPanel();
        jrbTitulo = new javax.swing.JRadioButton();
        jrbNombreDir = new javax.swing.JRadioButton();
        jLabelInfoTitulo = new javax.swing.JLabel();
        jLabelInfoDirector = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListPeliculas = new javax.swing.JList<>();
        jtfAnno = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtpResumen = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldPelicula.setBorder(javax.swing.BorderFactory.createTitledBorder("Título película"));
        jTextFieldPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPeliculaActionPerformed(evt);
            }
        });

        jTextFieldNombreDir.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre director"));

        jButtonGuardarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        jButtonGuardarP.setText("Consultar");
        jButtonGuardarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarPActionPerformed(evt);
            }
        });

        jButtonLimpiarCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basura.png"))); // NOI18N
        jButtonLimpiarCampos.setText("Limpiar Campos");
        jButtonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCamposActionPerformed(evt);
            }
        });

        jPanelTipoConsulta.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTipoConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar por:"));

        jrbTitulo.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupTipoConsulta.add(jrbTitulo);
        jrbTitulo.setText("Título");
        jrbTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTituloActionPerformed(evt);
            }
        });

        jrbNombreDir.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupTipoConsulta.add(jrbNombreDir);
        jrbNombreDir.setText("Nombre Director");
        jrbNombreDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNombreDirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTipoConsultaLayout = new javax.swing.GroupLayout(jPanelTipoConsulta);
        jPanelTipoConsulta.setLayout(jPanelTipoConsultaLayout);
        jPanelTipoConsultaLayout.setHorizontalGroup(
            jPanelTipoConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTipoConsultaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbTitulo)
                .addGap(58, 58, 58)
                .addComponent(jrbNombreDir)
                .addGap(59, 59, 59))
        );
        jPanelTipoConsultaLayout.setVerticalGroup(
            jPanelTipoConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTipoConsultaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelTipoConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbTitulo)
                    .addComponent(jrbNombreDir))
                .addContainerGap())
        );

        jLabelInfoTitulo.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        jLabelInfoTitulo.setText("Ingrese título");

        jLabelInfoDirector.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        jLabelInfoDirector.setText("Ingrese Nombre Director");

        jListPeliculas.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));
        jListPeliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListPeliculas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListPeliculasValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListPeliculas);

        jtfAnno.setBorder(javax.swing.BorderFactory.createTitledBorder("Año"));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen"));
        jScrollPane3.setViewportView(jtpResumen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanelTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtfAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jScrollPane3)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(jLabelInfoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jTextFieldPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabelInfoDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldNombreDir, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButtonGuardarP)
                        .addGap(63, 63, 63)
                        .addComponent(jButtonLimpiarCampos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInfoTitulo)
                    .addComponent(jLabelInfoDirector))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombreDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLimpiarCampos)
                    .addComponent(jButtonGuardarP))
                .addContainerGap())
        );
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
        jListPeliculas.setModel(listModel);
        jrbTitulo.setSelected(true);
    }//GEN-LAST:event_jButtonLimpiarCamposActionPerformed

    private void jButtonGuardarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarPActionPerformed
        // TODO add your handling code here
         
        if (jrbTitulo.isSelected()){
            jTextFieldNombreDir.setEnabled(true);
            jtfAnno.setEnabled(true);
            jtpResumen.setEnabled(true);
            try{
                List<Movies> peliculas = movieRepository.findByMovieTitle(jTextFieldPelicula.getText());
                if (!peliculas.isEmpty()){
                    for (Movies p : peliculas) {
                        System.out.println(p.toString());
                        listModel.addElement(p.getMovieTitle());
                        jtfAnno.setText(String.valueOf(p.getMovieYear()));
                        jtpResumen.setText(p.getMovieSummary());
                        jTextFieldNombreDir.setText(p.getMovieDirector());
                    }
                    jListPeliculas.setModel(listModel);
                }else{
                    System.out.println("La pelicula que busca no fue encontrada");
                    JOptionPane.showMessageDialog(null,"La pelicula que busca no fue encontrada","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(Exception e){
                System.out.println("Error al consultar película");
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Error al consultar película","Error",JOptionPane.WARNING_MESSAGE);
            }
           
        }
        if (jrbNombreDir.isSelected()){
            jtfAnno.setEnabled(true);
            jtpResumen.setEnabled(true);
            jTextFieldPelicula.setEnabled(true);
           
            try{
                List<Movies> peliculas = movieRepository.findByMovieDirectorContaining((jTextFieldNombreDir.getText()));
                if (!peliculas.isEmpty()){
                    for (Movies p : peliculas) {
                        System.out.println(p.toString());
                        listModel.addElement(p.getMovieTitle());   
                    }
                    jListPeliculas.setModel(listModel);                    
                }else{
                    System.out.println("El director que busca no fue encontrado");
                    JOptionPane.showMessageDialog(null,"El director que busca no fue encontrado","Error",JOptionPane.WARNING_MESSAGE);
                }
            }catch(Exception e){
                System.out.println("Error al consultar película");
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Error al consultar director","Error",JOptionPane.WARNING_MESSAGE);
            }
           
        }
    }//GEN-LAST:event_jButtonGuardarPActionPerformed

    private void jrbTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTituloActionPerformed
        // TODO add your handling code here:
        jTextFieldPelicula.setEnabled(true);
        jTextFieldPelicula.requestFocus();
        jLabelInfoDirector.setVisible(false);
        jLabelInfoTitulo.setVisible(true);
        jTextFieldNombreDir.setEnabled(false);
    }//GEN-LAST:event_jrbTituloActionPerformed

    private void jrbNombreDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNombreDirActionPerformed
        // TODO add your handling code here:
        jTextFieldNombreDir.setEnabled(true);
        jTextFieldNombreDir.requestFocus();
        jLabelInfoTitulo.setVisible(false);
        jLabelInfoDirector.setVisible(true);
        jTextFieldPelicula.setEnabled(false);
        
    }//GEN-LAST:event_jrbNombreDirActionPerformed

    private void jTextFieldPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPeliculaActionPerformed

    private void jListPeliculasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListPeliculasValueChanged
        // TODO add your handling code here:
        if (jrbNombreDir.isSelected()){
             List<Movies> peliculas = movieRepository.findByMovieTitle(jListPeliculas.getSelectedValue());
                if (!peliculas.isEmpty()){
                jtfAnno.setText(String.valueOf(peliculas.get(0).getMovieYear()));
                jtpResumen.setText(peliculas.get(0).getMovieSummary());
                jTextFieldPelicula.setText(peliculas.get(0).getMovieTitle());
                jTextFieldNombreDir.setEnabled(true);
             }else{
                    System.out.println("La pelicula que busca no fue encontrada");
                }
        }
    }//GEN-LAST:event_jListPeliculasValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupTipoConsulta;
    private javax.swing.JButton jButtonGuardarP;
    private javax.swing.JButton jButtonLimpiarCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelInfoDirector;
    private javax.swing.JLabel jLabelInfoTitulo;
    private javax.swing.JList<String> jListPeliculas;
    private javax.swing.JPanel jPanelTipoConsulta;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldNombreDir;
    private javax.swing.JTextField jTextFieldPelicula;
    private javax.swing.JRadioButton jrbNombreDir;
    private javax.swing.JRadioButton jrbTitulo;
    private javax.swing.JTextField jtfAnno;
    private javax.swing.JTextPane jtpResumen;
    // End of variables declaration//GEN-END:variables
}
