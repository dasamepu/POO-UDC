/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package co.edu.ude.poo.empresas.vistas.gui;

import co.edu.ude.poo.empresas.modelo.crud.VendedorCrud;
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
public class VentanaCrudVendedor extends javax.swing.JDialog {
    
    VendedorCrud vendedorCrud = new VendedorCrud();

    /**
     * Creates new form VentanaCrudVendedor
     */
    public VentanaCrudVendedor(java.awt.Frame parent, boolean modal) {
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
        EtiquetaDireccion = new javax.swing.JLabel();
        CampoDireccion = new javax.swing.JTextField();
        EtiquetaNumeroTrabajos = new javax.swing.JLabel();
        CampoNumeroTrabajos = new javax.swing.JTextField();
        EtiquetaCapturador = new javax.swing.JLabel();
        CampoCapturador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BotonAgregar = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        BotonEditar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        BotonListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendedor");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Formulario Vendedores");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "Datos del Vendedor:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 102, 204))); // NOI18N

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

        EtiquetaDireccion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        EtiquetaDireccion.setText("DIRECCION:");

        CampoDireccion.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        CampoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDireccionActionPerformed(evt);
            }
        });

        EtiquetaNumeroTrabajos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        EtiquetaNumeroTrabajos.setText("NUMERO TRABAJOS:");

        CampoNumeroTrabajos.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        CampoNumeroTrabajos.setText("0");
        CampoNumeroTrabajos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNumeroTrabajosActionPerformed(evt);
            }
        });

        EtiquetaCapturador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        EtiquetaCapturador.setText("ID DE QUIEN LO CAPTURÓ:");

        CampoCapturador.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        CampoCapturador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCapturadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EtiquetaId)
                            .addComponent(EtiquetaNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                            .addComponent(CampoId)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EtiquetaDireccion)
                            .addComponent(EtiquetaNumeroTrabajos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoDireccion)
                            .addComponent(CampoNumeroTrabajos)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EtiquetaCapturador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoCapturador)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaNombre)
                    .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDireccion)
                    .addComponent(CampoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNumeroTrabajos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaNumeroTrabajos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoCapturador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaCapturador))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/ude/poo/empresas/vistas/iconos/vendedor.png"))); // NOI18N

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)
                        .addGap(51, 51, 51)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonCancelar)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonAgregar)
                            .addComponent(BotonBuscar)
                            .addComponent(BotonEditar)
                            .addComponent(BotonEliminar)
                            .addComponent(BotonLimpiar)
                            .addComponent(BotonCancelar)
                            .addComponent(BotonListar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(86, 86, 86))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIdActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        //recuperar los datos ingresados en los campos del formulario
        String id = CampoId.getText();
        String nombre = CampoNombre.getText(); 
        String direccion = CampoDireccion.getText(); 
        int numero_trabajos = Integer.parseInt(CampoNumeroTrabajos.getText()); 
        String idVendedorCapturante = CampoCapturador.getText();
        //crear un objeto (variable tipo Vendedor) 
        Vendedor vendedor = new Vendedor(); 
        vendedor.setId(id); 
        vendedor.setNombre(nombre);
        vendedor.setDireccion(direccion); 
        vendedor.setNumero_trabajos(numero_trabajos);
        vendedor.setVendedorCapturante(idVendedorCapturante);
        
        

        
        if(id.isEmpty() || id.length() == 0 ||    
            nombre.isEmpty() || nombre.length() == 0 ||
            direccion.isEmpty() || direccion.length() == 0 ||
            numero_trabajos == 0){
            //verificar si algun campo está vacio
            String msj = "Hay campo(s) vacio(s), no se guardara nada hasta que el problema se solucione";
            JOptionPane.showMessageDialog(this, msj);
        }else if(!nombre.matches("^[\\p{L}\\s]+$")){
            String msj = "El nombre no es valido\n "
                    + "no se guardara nada hasta que el problema se solucione \n ";
            JOptionPane.showMessageDialog(this, msj);
        }else if(!direccion.matches("^[\\p{L}\\s]+$")){
            String msj = "La direccion no es valido\n "
                    + "no se guardara nada hasta que el problema se solucione \n ";
            JOptionPane.showMessageDialog(this, msj);
        }else if(!CampoNumeroTrabajos.getText().matches("1")){
            String msj = "El numero de trabajos no es valido \n "
                    + "solo puede tener un trabajo \n "
                    + "no se guardara nada hasta que el problema se solucione \n ";
            JOptionPane.showMessageDialog(this, msj);
        }else{
            
            if(!idVendedorCapturante.isEmpty()) {    
                vendedor.setVendedorCapturante(idVendedorCapturante); // se asigna el vendedor capturante al vendedor capturado
                vendedorCrud.agregar(vendedor); // se agrega el vendedor al diccionario de VendedorCrud
                 String msj = "Vendedor agregado con éxito \n "
                    + "exixte(n)" + vendedorCrud.contar() + "vendedor(es)";
                JOptionPane.showMessageDialog(this, msj);
                limpiarCampos(); // se limpian los campos del formulario
            } else {
                int option = JOptionPane.showConfirmDialog(this, "El vendedor capturante no existe, ¿Desea agregarlo de todos modos?", "Confirmar Agregar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(option == JOptionPane.YES_OPTION){
                    vendedor.setVendedorCapturante("-");
                    vendedorCrud.agregar(vendedor); // se agrega el vendedor al diccionario de VendedorCrud
                    String msj = "Vendedor agregado con éxito \n "
                            + "exixte(n) " + vendedorCrud.contar() + " vendedor(es)";
                    JOptionPane.showMessageDialog(this, msj);
                    limpiarCampos(); // se limpian los campos del formulario
                }
            }
        }
    }//GEN-LAST:event_BotonAgregarActionPerformed

    public void limpiarCampos(){
        CampoId.setText("");
        CampoNombre.setText("");
        CampoDireccion.setText("");
        CampoNumeroTrabajos.setText("0");
        CampoCapturador.setText("");
        
        BotonEditar.setEnabled(false);
        BotonEliminar.setEnabled(false);
    }
    
    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        //recuperar los datos ingresados en los campos del formulario
        String id = CampoId.getText();        
        
        
        Vendedor vendedor = vendedorCrud.buscar(id);
        if(vendedor != null) {
            CampoNombre.setText(vendedor.getNombre());
            CampoDireccion.setText(vendedor.getDireccion());
            CampoNumeroTrabajos.setText(Integer.toString(vendedor.getNumero_trabajos()));
            //se activan los botones si la busqueda fue exitosa
            BotonEditar.setEnabled(true);
            BotonEliminar.setEnabled(true);
        }else{
            BotonEditar.setEnabled(false);
            BotonEliminar.setEnabled(false);
            String msj = "no hay Vendedores en la BD con ese id: " + id;
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
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

        
        Vendedor vendedor = vendedorCrud.buscar(CampoId.getText());
    
        if(vendedor == null){
            String msj = "No se encontro el vendedor con ese id";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return;
        }
        //validando que el vendedor sí sea editado
        if(CampoNombre.getText().equals(vendedor.getNombre()) == true && 
           CampoDireccion.getText().equals(vendedor.getDireccion()) == true && 
           CampoNumeroTrabajos.getText().equals(Integer.toString(vendedor.getNumero_trabajos())) == true){
            String msj = "No se ha cambiado nada";
            JOptionPane.showMessageDialog(this, msj);
            return;
        }


        //se pregunta si se quiere guardar la informacion
            int option = JOptionPane.showConfirmDialog(this
            , "Guardar los cambios?", "confirmar cambios"
            , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(option == JOptionPane.YES_OPTION){
                //recuperar los numevos datos ingresados en el formulario
                String id = CampoId.getText();        
                String nombre = CampoNombre.getText();
                String direccion = CampoDireccion.getText();
                int numero_trabajos = Integer.parseInt(CampoNumeroTrabajos.getText());

                //Cambiar los datos anteriores del vendedor por los datos nuevos
                vendedor.setNombre(String.valueOf(nombre));
                vendedor.setDireccion(direccion);
                vendedor.setNumero_trabajos(numero_trabajos);

                //Guardamos el vendedor con los nuevos datos
                vendedorCrud.editar(vendedor);

                //mostramos el mensaje
                String msj = "vendedor modificado con exito";
                JOptionPane.showMessageDialog(this, msj);
                limpiarCampos();
            }

    }//GEN-LAST:event_BotonEditarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        
        //validamos que el campo Id tenga algun dato
        if(CampoId.getText() == null || CampoId.getText().isEmpty()){
            String msj = "Para editar introduzca el id";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return;
        }
        
        //validar que el id coincida con el id consultado previamente
        Vendedor vendedor = vendedorCrud.buscar(CampoId.getText());
        if(vendedor == null){
            String msj = "El id no coincide con el id consultado previamente";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return;
        }
        String msj = "Seguro desea eliminar el Vendedor?";
        int respuesta = JOptionPane.showConfirmDialog(this, msj
                , "CONFIRMAR ELIMINACION", JOptionPane.YES_NO_OPTION
                , JOptionPane.QUESTION_MESSAGE);
        if(respuesta == JOptionPane.YES_OPTION){
            vendedorCrud.eliminar(vendedor.getId());
            int total = vendedorCrud.contar();
            String msj2 = "Vendedor eliminada exitosamente, hay " + total + " Vendedor(s)";
            JOptionPane.showMessageDialog(this, msj2);
            limpiarCampos();
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarActionPerformed
        
        if(vendedorCrud.contar() == 0) { 
            JOptionPane.showMessageDialog(this, "no hay Vendedores para listar"
            , "RESULTADO NEGATIVO", JOptionPane.WARNING_MESSAGE);
            return;
        }
            
        this.dispose();
            
        VentanaReporteVendedor ventanaReporte = new VentanaReporteVendedor(new JFrame(), true);
        ventanaReporte.setLocationRelativeTo(this);
        ventanaReporte.setVisible(true);
        
    }//GEN-LAST:event_BotonListarActionPerformed

    private void CampoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNombreActionPerformed

    private void CampoNumeroTrabajosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNumeroTrabajosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNumeroTrabajosActionPerformed

    private void CampoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDireccionActionPerformed

    private void CampoCapturadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCapturadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCapturadorActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCrudVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaCrudVendedor dialog = new VentanaCrudVendedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField CampoCapturador;
    private javax.swing.JTextField CampoDireccion;
    private javax.swing.JTextField CampoId;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JTextField CampoNumeroTrabajos;
    private javax.swing.JLabel EtiquetaCapturador;
    private javax.swing.JLabel EtiquetaDireccion;
    private javax.swing.JLabel EtiquetaId;
    private javax.swing.JLabel EtiquetaNombre;
    private javax.swing.JLabel EtiquetaNumeroTrabajos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
