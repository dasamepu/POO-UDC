/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package co.edu.ude.poo.empresas.vistas.gui;

import co.edu.ude.poo.empresas.modelo.entidades.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class VentanaCrudHolding extends javax.swing.JDialog {
    Holding holding;
    /**
     * Creates new form VentanaCrudHolding
     */
    public VentanaCrudHolding(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        EtiquetaId = new javax.swing.JLabel();
        CampoId = new javax.swing.JTextField();
        EtiquetaNombre = new javax.swing.JLabel();
        CampoNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BotonAgregar = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        BotonEditar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        BotonListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Holding");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Formulario Holding");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "Datos del Holding:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 102, 204))); // NOI18N

        EtiquetaId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        EtiquetaId.setText("ID:");

        CampoId.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        CampoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIdActionPerformed(evt);
            }
        });

        EtiquetaNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        EtiquetaNombre.setText("NOMBRE:");

        CampoNombre.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        CampoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(EtiquetaNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(EtiquetaId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoId)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaId)
                    .addComponent(CampoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaNombre)
                    .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/ude/poo/empresas/vistas/iconos/holding.png"))); // NOI18N

        BotonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/ude/poo/empresas/vistas/iconos/guardar24px.png"))); // NOI18N
        BotonAgregar.setText("AGREGAR");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/ude/poo/empresas/vistas/iconos/buscar24px.png"))); // NOI18N
        BotonBuscar.setText("BUSCAR");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        BotonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/ude/poo/empresas/vistas/iconos/editar24px.png"))); // NOI18N
        BotonEditar.setText("EDITAR");
        BotonEditar.setEnabled(false);
        BotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarActionPerformed(evt);
            }
        });

        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/ude/poo/empresas/vistas/iconos/eliminar24px.png"))); // NOI18N
        BotonEliminar.setText("ELIMINAR");
        BotonEliminar.setEnabled(false);
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/ude/poo/empresas/vistas/iconos/limpiar24px.png"))); // NOI18N
        BotonLimpiar.setText("LIMPIAR");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        BotonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/ude/poo/empresas/vistas/iconos/cancel24px.png"))); // NOI18N
        BotonCancelar.setText("CANCELAR");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/ude/poo/empresas/vistas/iconos/reporte24px.png"))); // NOI18N
        BotonListar.setText("LISTAR");
        BotonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(BotonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAgregar)
                    .addComponent(BotonBuscar)
                    .addComponent(BotonEditar)
                    .addComponent(BotonEliminar)
                    .addComponent(BotonLimpiar)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonListar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIdActionPerformed

    private void CampoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNombreActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        //recuperar los datos ingresados en los campos del formulario
        String id = CampoId.getText();
        String nombre = CampoNombre.getText();
        //crear un objeto (variable tipo holding)
        Holding holding = new Holding();
        holding.setId(id);
        holding.setNombre_holding(nombre);
        //validar si el Map existe
        if(Holding.getHoldingBD() == null){
            Holding.setHoldingBD(new HashMap<String, Holding>());
        }
        //validar si el Map ya tiene el holding guardado, solo puede existir un holding
        if(Holding.getHoldingBD().size() == 1){
            String msj = "Solo puede exisitir un holding \n"
                    + "no se pueden agregar más.";
            JOptionPane.showMessageDialog(this, msj);
        }else if(Holding.getHoldingBD().containsKey(id)){
            String msj = "Ya existe el holding con id: " + id;
            JOptionPane.showMessageDialog(this, msj);
        }else if(id.isEmpty() || id.length() == 0 ||    //verificar si algun campo está vacio
                 nombre.isEmpty() || nombre.length() == 0) {
            String msj = "Hay campo(s) vacio(s), no se guardara nada hasta que el problema se solucione";
            JOptionPane.showMessageDialog(this, msj);
        }else if(!nombre.matches("[a-zA-Z\\s\\p{Punct}]+")){
            String msj = "El nombre no es texto valido \n "
                    + "no se guardara nada hasta que el problema se solucione \n "
                    + "Posible error: El nombre no puede llevar numeros" ;
            JOptionPane.showMessageDialog(this, msj);
        }else{
            //se pregunta si se quiere guardar la informacion
            int option = JOptionPane.showConfirmDialog(this
            , "Guardar la informacion?", "confirmar guardado"
            , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(option == JOptionPane.YES_OPTION){
                //se guarda el holding si no existia
                Holding.getHoldingBD().put(id, holding);
                //obtenemos el numero de holdings
                int cuentaHoldings = Holding.getHoldingBD().size();
                String msj = "el holding fue guardada. "
                        + "Existen: " + cuentaHoldings + " holding(s)";
                JOptionPane.showMessageDialog(this, msj);
                limpiarCampos();
            }
            
        }        
    }//GEN-LAST:event_BotonAgregarActionPerformed

    public void limpiarCampos(){
        CampoId.setText("");
        CampoNombre.setText("");
        
        BotonEditar.setEnabled(false);
        BotonEliminar.setEnabled(false);
    }
    
    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        //recuperar los datos ingresados en los campos del formulario
        String id = CampoId.getText();
        String nombre = CampoNombre.getText();
        //verificar si el map existe o si esta vacio
        if(Holding.getHoldingBD() == null || Holding.getHoldingBD().isEmpty()){
            String msj = "no hay holdings en la BD";
            JOptionPane.showMessageDialog(this, msj);
        }else{
            //buscar el holding a partir del id
            if(Holding.getHoldingBD().containsKey(id)){
                this.holding = Holding.getHoldingBD().get(id);
                CampoNombre.setText(this.holding.getNombre_holding());
            //se activan los botones si la busqueda fue exitosa
            BotonEditar.setEnabled(true);
            BotonEliminar.setEnabled(true);
            }else if(id.isEmpty() || id.length() == 0){
                String msj = "El campo id está vacio, es requerido para realizar la busqueda";
                JOptionPane.showMessageDialog(this, msj);
            }else{
                BotonEditar.setEnabled(false);
                BotonEliminar.setEnabled(false);
                String msj = "no hay holdings en la BD con ese id: " + id;
                JOptionPane.showMessageDialog(this, msj);
                limpiarCampos();
            }
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        //se pregunta si se quiere guardar la informacion
            int option = JOptionPane.showConfirmDialog(this
            , "Limpiar el formulario?", "confirmar limpieza"
            , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(option == JOptionPane.YES_OPTION){
                String msj = "Formulario limpiado con exito";
                JOptionPane.showMessageDialog(this, msj);
                limpiarCampos();
            }
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        int option = JOptionPane.showConfirmDialog(this
            , "Cerrar ventana?", "confirmar cierre"
            , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(option == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarActionPerformed
        //validamos que el campo cedula tenga algun dato
        if(CampoId.getText() == null || CampoId.getText().isEmpty()){
            String msj = "Para editar introduzca el id";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return;
        }
        //validar que el id coincida con el id consultado previamente
        if(CampoId.getText().equals(this.holding.getId()) != true){
            String msj = "El id no coincide con el id consultado previamente";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return;
        }
        
        //validando que el holding sí sea editada
        if(CampoNombre.getText().equals(this.holding.getNombre_holding()) == true){
            String msj = "No se ha cambiado nada";
            JOptionPane.showMessageDialog(this, msj);
            return;
        }
        
        //recuperamos el texto que haya en el CampoId y el mapa nos devuelve el usuario con ese id
        this.holding = Holding.getHoldingBD().get(CampoId.getText());
        
        //se pregunta si se quiere guardar la informacion
            int option = JOptionPane.showConfirmDialog(this
            , "Guardar los cambios?", "confirmar cambios"
            , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(option == JOptionPane.YES_OPTION){
                //recuperar los numevos datos ingresados en el formulario
                String id = CampoId.getText();
                String nombre = CampoNombre.getText();

                //Cambiar los datos anteriores del holding por los datos nuevos
                this.holding.setNombre_holding(String.valueOf(nombre));

                //Guardamos el holding con los nuevos datos
                Holding.getHoldingBD().put(this.holding.getId(), this.holding);

                //mostramos el mensaje
                String msj = "Holding modificada con exito";
                JOptionPane.showMessageDialog(this, msj);
                limpiarCampos();
            }
    }//GEN-LAST:event_BotonEditarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        //validamos que el campo cedula tenga algun dato
        if(CampoId.getText() == null || CampoId.getText().isEmpty()){
            String msj = "Para editar introduzca el id";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return;
        }
        
        //validar que el id coincida con el id consultado previamente
        if(CampoId.getText().equals(this.holding.getId()) != true){
            String msj = "El id no coincide con el id consultado previamente";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return;
        }
        String msj = "Seguro desea eliminar el holding?";
        int respuesta = JOptionPane.showConfirmDialog(this, msj
                , "CONFIRMAR ELIMINACION", JOptionPane.YES_NO_OPTION
                , JOptionPane.QUESTION_MESSAGE);
        if(respuesta == JOptionPane.YES_OPTION){
            Holding.getHoldingBD().remove(this.holding.getId());
            int total = Holding.getHoldingBD().size();
            String msj2 = "Holding eliminada exitosamente, hay " + total + " holding(s)";
            JOptionPane.showMessageDialog(this, msj2);
            limpiarCampos();
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarActionPerformed
        if(Holding.getHoldingBD() == null || Holding.getHoldingBD().isEmpty()){
            JOptionPane.showMessageDialog(this, "no hay holdings para listar"
            , "RESULTADO NEGATIVO", JOptionPane.WARNING_MESSAGE);
            return;
        }
            
        this.dispose();
            
        VentanaReporteHolding ventanaReporte = new VentanaReporteHolding(new JFrame(), true);
        ventanaReporte.setLocationRelativeTo(this);
        ventanaReporte.setVisible(true);
        
    }//GEN-LAST:event_BotonListarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCrudHolding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudHolding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudHolding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudHolding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaCrudHolding dialog = new VentanaCrudHolding(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonListar;
    private javax.swing.JTextField CampoId;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JLabel EtiquetaId;
    private javax.swing.JLabel EtiquetaNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
