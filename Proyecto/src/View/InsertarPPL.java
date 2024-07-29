package View;

import Controller.SistemaAdministracionCarcel;
import Model.PPL;
public class InsertarPPL extends javax.swing.JPanel {
    public InsertarPPL() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicial = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        clasificacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        alias = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        delito = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nacimiento = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        genero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pena = new javax.swing.JTextField();

        inicial.setBackground(new java.awt.Color(102, 153, 255));
        inicial.setBorder(new javax.swing.border.MatteBorder(null));
        inicial.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INGRESA LOS DATOS:");

        nombre.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ALIAS:");

        clasificacion.setText("CLASIFICACION");
        clasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clasificacionActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CLASIFICACION:");

        alias.setText("ALIAS");
        alias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aliasActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("DELITO:");

        delito.setText("DELITO");
        delito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delitoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("EDAD:");

        edad.setText("EDAD");
        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("CEDULA:");

        cedula.setText("CEDULA");
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("LUGAR DE NACIMIENTO:");

        nacimiento.setText("NACIMIENTO");
        nacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacimientoActionPerformed(evt);
            }
        });

        jButton1.setText("INSERTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("GENERO:");

        genero.setText("GENERO");
        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("PENA:");

        pena.setText("PENA");
        pena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inicialLayout = new javax.swing.GroupLayout(inicial);
        inicial.setLayout(inicialLayout);
        inicialLayout.setHorizontalGroup(
            inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicialLayout.createSequentialGroup()
                .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicialLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jButton1))
                    .addGroup(inicialLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clasificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(delito)
                            .addComponent(alias)
                            .addComponent(genero)
                            .addComponent(nombre))
                        .addGap(49, 49, 49)
                        .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(inicialLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(146, 146, 146))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicialLayout.createSequentialGroup()
                                    .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(inicialLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(171, 171, 171)))
                        .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nacimiento)
                            .addComponent(pena)
                            .addComponent(edad)
                            .addComponent(cedula))))
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inicialLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel2)
                    .addContainerGap(590, Short.MAX_VALUE)))
        );
        inicialLayout.setVerticalGroup(
            inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicialLayout.createSequentialGroup()
                .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicialLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicialLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(alias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(delito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(pena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
            .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inicialLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jLabel2)
                    .addContainerGap(392, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clasificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clasificacionActionPerformed

    private void aliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aliasActionPerformed

    private void delitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delitoActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void nacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacimientoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SistemaAdministracionCarcel sis = new SistemaAdministracionCarcel();
        PPL ppl = new PPL( sis.getLstPPL().size() + 2, this.nombre.getText(), this.cedula.getText(), 
                Integer.parseInt(this.edad.getText()), this.nacimiento.getText(), 
                this.genero.getText(),this.alias.getText(), this.clasificacion.getText(), 
                "I90", "INCREIBLE","FECHA DEL MES", "KAANYE WEST", 
                Integer.parseInt(this.pena.getText()),8, 
                this.delito.getText(), 6);
        
        MostrarIngresoPPL seleccionar = new MostrarIngresoPPL(ppl);
        seleccionar.setSize(940, 450);
        seleccionar.setLocation(13, 0);
        
        inicial.removeAll();
        inicial.add(seleccionar);
        inicial.revalidate();
        inicial.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoActionPerformed

    private void penaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alias;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField clasificacion;
    private javax.swing.JTextField delito;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField genero;
    private javax.swing.JPanel inicial;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nacimiento;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField pena;
    // End of variables declaration//GEN-END:variables
}
