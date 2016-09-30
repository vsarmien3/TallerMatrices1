package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdAutomatico, cmdManual, cmdOperacion};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdAutomatico = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumerodefilas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumerodecolumnas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatrizResultante = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatrizInicial = new javax.swing.JTable();
        cmbOperacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("OPERACIONES CON MATRICES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel1.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        cmdAutomatico.setText("Automatico");
        cmdAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        cmdOperacion.setText("Operación");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel1.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 450, 70));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos iniciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Número de filas: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        jPanel2.add(txtNumerodefilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 50, -1));

        jLabel3.setText("Número de columnas:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 120, -1));
        jPanel2.add(txtNumerodecolumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 50, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 370, 70));

        tblMatrizResultante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMatrizResultante);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 330, 270));

        tblMatrizInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblMatrizInicial);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 330, 270));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diagonal secundaria", "Triangular superior", "Triangular inferior", "Matriz transpuesta", "Letra A", "Letra Z", "Letra T", "Letra V", "Letra E", "Letra F", "letra P", "letra I", "Letra N", "Letra Y", "Letra X" }));
        getContentPane().add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm, tm2;
        int nf, nc, sw = 1;
        tm = (DefaultTableModel) tblMatrizInicial.getModel();
        tm2 = (DefaultTableModel) tblMatrizResultante.getModel();
        
        if (txtNumerodefilas.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el número de filas", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumerodefilas.requestFocusInWindow();
            sw = 0;
        }else if (txtNumerodecolumnas.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese el número de columnas", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumerodecolumnas.requestFocusInWindow();
            sw = 0;            
        }else{
            try{
               nf = Integer.parseInt(txtNumerodefilas.getText()); 
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "La cantidad de filas debe ser un número valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtNumerodefilas.requestFocusInWindow();
                sw = 0;
        }
            try{
               nc = Integer.parseInt(txtNumerodecolumnas.getText());   
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "La cantidad de columnas debe ser un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                txtNumerodecolumnas.requestFocusInWindow();
                sw = 0;
        }        
    }   
        nf = Integer.parseInt(txtNumerodefilas.getText());
        nc = Integer.parseInt(txtNumerodecolumnas.getText());

        tm.setRowCount(nf);
        tm.setColumnCount(nc);

        tm2.setColumnCount(nc);
        tm2.setRowCount(nf);

        JButton botonesH[] = {cmdAutomatico, cmdLimpiar, cmdManual};
        JButton botonesD[] = {cmdCrear, cmdOperacion};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
        // TODO add your handling code here:
        int nf, nc, res, aux;
        double n;
        boolean sw = true;
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    aux = 1;
                    try {
                        n = Double.parseDouble(Helper.recibirDatos(this, "Digite el elemento en la posición: [" + i + "][" + j + "]"));
                        tblMatrizInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Digite la información correctamente", "Error", JOptionPane.ERROR_MESSAGE);
                        aux = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        System.out.println(res);
                        if (res == 0) {
                            aux = 1;
                            j = nc;
                            i = nf;
                            sw = false;
                            Helper.tablaPorDefecto(tblMatrizInicial);
                            Helper.tablaPorDefecto(tblMatrizResultante);
                            txtNumerodefilas.setText("");
                            txtNumerodecolumnas.setText("");
                        } else {
                            aux = 0;
                        }
                    }
                } while (aux == 0);
            }
        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdCrear, cmdAutomatico};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdManualActionPerformed

    private void cmdAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticoActionPerformed
        // TODO add your handling code here:
        int nf, nc;
        int n;
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 25 + 1);
                tblMatrizInicial.setValueAt(n, i, j);
            }
        }

        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdCrear, cmdAutomatico};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdAutomaticoActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:
        Helper.tablaPorDefecto(tblMatrizInicial);
        Helper.tablaPorDefecto(tblMatrizResultante);

        txtNumerodefilas.setText("");
        txtNumerodecolumnas.setText("");
        txtNumerodefilas.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);

        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdOperacion, cmdAutomatico};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed
        // TODO add your handling code here:
        int op, nf, nc, aux;
        
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();
        op = cmbOperacion.getSelectedIndex();
        
        Helper.limpiarTabla(tblMatrizResultante);
        switch (op){
            case 0: 
                Helper.DiagonalSecundaria(tblMatrizInicial, tblMatrizResultante);
                break;
            
            case 1:
                Helper.TriangularSuperior(tblMatrizInicial, tblMatrizResultante);
                break;
              
            case 2: 
                Helper.TriangularInferior(tblMatrizInicial, tblMatrizResultante);
                break;
                
            case 3: 
                Helper.MatrizTranspuesta(tblMatrizInicial, tblMatrizResultante);
                break;
                
            case 4:
                Helper.LetraA(tblMatrizInicial, tblMatrizResultante);
                break;
             
            case 5:
                Helper.LetraZ(tblMatrizInicial, tblMatrizResultante);
                break;    
                
            case 6:
                Helper.LetraT(tblMatrizInicial, tblMatrizResultante);
                break;    
                
            case 7:
                Helper.LetraV(tblMatrizInicial, tblMatrizResultante);
                break;    
                
            case 8:
                Helper.LetraE(tblMatrizInicial, tblMatrizResultante);
                break;    
                
            case 9:
                Helper.LetraF(tblMatrizInicial, tblMatrizResultante);
                break;    
                
            case 10:
                Helper.LetraP(tblMatrizInicial, tblMatrizResultante);
                break;    
                
            case 11:
                Helper.LetraI(tblMatrizInicial, tblMatrizResultante);
                break;    
                
            case 12:
                Helper.LetraN(tblMatrizInicial, tblMatrizResultante);
                break;    
                
            case 13:
                Helper.LetraY(tblMatrizInicial, tblMatrizResultante);
                break;
                
            case 14:
                Helper.LetraX(tblMatrizInicial, tblMatrizResultante);
                break;    
        }
        
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdCrear, cmdAutomatico};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdOperacionActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdAutomatico;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMatrizInicial;
    private javax.swing.JTable tblMatrizResultante;
    private javax.swing.JTextField txtNumerodecolumnas;
    private javax.swing.JTextField txtNumerodefilas;
    // End of variables declaration//GEN-END:variables
}
