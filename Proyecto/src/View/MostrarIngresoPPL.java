package View;
import Controller.SistemaAdministracionCarcel;
import Model.PPL;
public class MostrarIngresoPPL extends javax.swing.JPanel {
    public MostrarIngresoPPL(PPL ppl) {
        initComponents();
        mostrarResultado(ppl);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        inicial = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajonsito = new javax.swing.JTextArea();

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INGRESA LOS DATOS:");

        inicial.setBackground(new java.awt.Color(102, 153, 255));
        inicial.setBorder(new javax.swing.border.MatteBorder(null));
        inicial.setForeground(new java.awt.Color(255, 255, 255));

        cajonsito.setColumns(20);
        cajonsito.setRows(5);
        jScrollPane1.setViewportView(cajonsito);

        javax.swing.GroupLayout inicialLayout = new javax.swing.GroupLayout(inicial);
        inicial.setLayout(inicialLayout);
        inicialLayout.setHorizontalGroup(
            inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        );
        inicialLayout.setVerticalGroup(
            inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
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
    public void mostrarResultado(PPL ppl){
        SistemaAdministracionCarcel sistema = new SistemaAdministracionCarcel();
        if(sistema.verificarPuestoPPL(sistema.getLstPPL().size())){
            sistema.insertarNuevoPPL(ppl);
            cajonsito.setText("PPL INSERTADO CORRECTAMENTE A LA BASE DE DATOS");
        }else{
            cajonsito.setText("NO SE PUEDE INGRESAR PORQUE NO HAY CUPO ");
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea cajonsito;
    private javax.swing.JPanel inicial;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
