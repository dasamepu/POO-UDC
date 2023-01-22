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
public class VentanaCrudPais extends javax.swing.JDialog {
    Pais pais;
    /**
     * Creates new form VentanaCrudPais
     */
    public VentanaCrudPais(java.awt.Frame parent, boolean modal) {
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
        EtiquetaCapital = new javax.swing.JLabel();
        CampoCapital = new javax.swing.JTextField();
        EtiquetaNumeroHabitantes = new javax.swing.JLabel();
        CampoNumeroHabitantes = new javax.swing.JTextField();
        EtiquetaPib = new javax.swing.JLabel();
        CampoPib = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BotonAgregar = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        BotonEditar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        BotonListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("País");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Formulario País");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "Datos del País:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 102, 204))); // NOI18N

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

        EtiquetaCapital.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        EtiquetaCapital.setText("CAPITAL:");

        CampoCapital.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        CampoCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCapitalActionPerformed(evt);
            }
        });

        EtiquetaNumeroHabitantes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        EtiquetaNumeroHabitantes.setText("NUMERO HABITANTES:");

        CampoNumeroHabitantes.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        CampoNumeroHabitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNumeroHabitantesActionPerformed(evt);
            }
        });

        EtiquetaPib.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        EtiquetaPib.setText("PIB:");

        CampoPib.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        CampoPib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoPibActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(127, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EtiquetaId)
                                    .addComponent(EtiquetaNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CampoId, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                    .addComponent(CampoNombre)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EtiquetaPib)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoPib, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(EtiquetaNumeroHabitantes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoNumeroHabitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(EtiquetaCapital)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(EtiquetaCapital)
                    .addComponent(CampoCapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoNumeroHabitantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(EtiquetaNumeroHabitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaPib)
                    .addComponent(CampoPib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/ude/poo/empresas/vistas/iconos/pais.png"))); // NOI18N

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
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addGap(67, 67, 67)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(72, 72, 72)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAgregar)
                    .addComponent(BotonBuscar)
                    .addComponent(BotonEditar)
                    .addComponent(BotonEliminar)
                    .addComponent(BotonLimpiar)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonListar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        String capital = CampoCapital.getText();
        int num_habitantes = Integer.parseInt(CampoNumeroHabitantes.getText());
        int pib = Integer.parseInt(CampoPib.getText());
        //crear un objeto (variable tipo pais)
        Pais pais = new Pais();
        pais.setId(id);
        pais.setNombre(nombre);
        pais.setCapital(capital);
        pais.setNum_habitantes(num_habitantes);
        pais.setPib(pib);
        //validar si el Map existe
        if(Pais.getPaisBD() == null){
            Pais.setPaisBD(new HashMap<>());
        }
        //validar si el Map ya tiene el pais guardada
        if(Pais.getPaisBD().containsKey(id)){
            String msj = "Ya existe el pais con id: " + id;
            JOptionPane.showMessageDialog(this, msj);
        }else if(id.isEmpty() || id.length() == 0 ||    //verificar si algun campo está vacio
                nombre.isEmpty() || nombre.length() == 0 ||
                capital.isEmpty() || capital.length() == 0 ||
                num_habitantes == 0 ||
                pib == 0){
            String msj = "Hay campo(s) vacio(s), no se guardara nada hasta que el problema se solucione";
            JOptionPane.showMessageDialog(this, msj);
        }else if(!nombre.matches("^[\\p{L}\\s]+$")){
            String msj = "El nombre no es valido\n "
                    + "no se guardara nada hasta que el problema se solucione \n ";
            JOptionPane.showMessageDialog(this, msj);
        }else if(!capital.matches("^[\\p{L}\\s]+$")){
            String msj = "La capital no es valido\n "
                    + "no se guardara nada hasta que el problema se solucione \n ";
            JOptionPane.showMessageDialog(this, msj);
        }else if(!CampoNumeroHabitantes.getText().matches("\\d+")){
            String msj = "La facturacion no es valida \n "
                    + "no se guardara nada hasta que el problema se solucione \n ";
            JOptionPane.showMessageDialog(this, msj);
        }else if(!CampoPib.getText().matches("\\d+")){
            String msj = "El numero de vendedores no es valido \n "
                    + "no se guardara nada hasta que el problema se solucione \n ";
            JOptionPane.showMessageDialog(this, msj);
        }else{
            //se pregunta si se quiere guardar la informacion
            int option = JOptionPane.showConfirmDialog(this
            , "Guardar la informacion?", "confirmar guardado"
            , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(option == JOptionPane.YES_OPTION){
                //se guarda el pais si no existia
                Pais.getPaisBD().put(id, pais);
                //obtenemos el numero de Paises
                int cuentaPaises = Pais.getPaisBD().size();
                String msj = "el pais fue guardada. "
                        + "Existen: " + cuentaPaises + " pais(s)";
                JOptionPane.showMessageDialog(this, msj);
                limpiarCampos();
            }
            
        }        
    }//GEN-LAST:event_BotonAgregarActionPerformed

    public void limpiarCampos(){
        CampoId.setText("");
        CampoNombre.setText("");
        CampoNumeroHabitantes.setText("");
        CampoPib.setText("");
        
        BotonEditar.setEnabled(false);
        BotonEliminar.setEnabled(false);
    }
    
    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        //recuperar los datos ingresados en los campos del formulario
        String id = CampoId.getText();        
        String nombre = CampoNombre.getText();
        String capital = CampoCapital.getText();
        int num_habitantes = Integer.parseInt(CampoNumeroHabitantes.getText());
        int pib = Integer.parseInt(CampoPib.getText());
        //verificar si el map existe o si esta vacio
        if(Pais.getPaisBD() == null || Pais.getPaisBD().isEmpty()){
            String msj = "no hay Paises en la BD";
            JOptionPane.showMessageDialog(this, msj);
        }else{
            //buscar el pais a partir del id
            if(Pais.getPaisBD().containsKey(id)){
                this.pais = Pais.getPaisBD().get(id);
                CampoNombre.setText(this.pais.getNombre());
                CampoNumeroHabitantes.setText(Integer.toString(this.pais.getNum_habitantes()));
                CampoPib.setText(Integer.toString(this.pais.getPib()));
            //se activan los botones si la busqueda fue exitosa
            BotonEditar.setEnabled(true);
            BotonEliminar.setEnabled(true);
            }else if(id.isEmpty() || id.length() == 0){
                String msj = "El campo id está vacio, es requerido para realizar la busqueda";
                JOptionPane.showMessageDialog(this, msj);
            }else{
                BotonEditar.setEnabled(false);
                BotonEliminar.setEnabled(false);
                String msj = "no hay Paises en la BD con ese id: " + id;
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
        if(CampoId.getText().equals(this.pais.getId()) != true){
            String msj = "El id no coincide con el id consultado previamente";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return;
        }
        
        //validando que el pais sí sea editado
        if(CampoNombre.getText().equals(this.pais.getNombre()) == true && 
           CampoNumeroHabitantes.getText().equals(Integer.toString(this.pais.getNum_habitantes())) == true && 
           CampoPib.getText().equals(Integer.toString(this.pais.getPib())) == true){
            String msj = "No se ha cambiado nada";
            JOptionPane.showMessageDialog(this, msj);
            return;
        }
        
        //recuperamos el texto que haya en el CampoId y el mapa nos devuelve el pais con ese id
        this.pais = Pais.getPaisBD().get(CampoId.getText());
        
        //se pregunta si se quiere guardar la informacion
            int option = JOptionPane.showConfirmDialog(this
            , "Guardar los cambios?", "confirmar cambios"
            , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(option == JOptionPane.YES_OPTION){
                //recuperar los numevos datos ingresados en el formulario
                String id = CampoId.getText();        
                String nombre = CampoNombre.getText();
                String capital = CampoCapital.getText();
                int num_habitantes = Integer.parseInt(CampoNumeroHabitantes.getText());
                int pib = Integer.parseInt(CampoPib.getText());
        
                //Cambiar los datos anteriores del pais por los datos nuevos
                this.pais.setNombre(String.valueOf(nombre));
                this.pais.setCapital(capital);
                this.pais.setNum_habitantes(num_habitantes);
                this.pais.setPib(pib);

                //Guardamos el pais con los nuevos datos
                Pais.getPaisBD().put(this.pais.getId(), this.pais);

                //mostramos el mensaje
                String msj = "Pais modificado con exito";
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
        if(CampoId.getText().equals(this.pais.getId()) != true){
            String msj = "El id no coincide con el id consultado previamente";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
            return;
        }
        String msj = "Seguro desea eliminar el pais?";
        int respuesta = JOptionPane.showConfirmDialog(this, msj
                , "CONFIRMAR ELIMINACION", JOptionPane.YES_NO_OPTION
                , JOptionPane.QUESTION_MESSAGE);
        if(respuesta == JOptionPane.YES_OPTION){
            Pais.getPaisBD().remove(this.pais.getId());
            int total = Pais.getPaisBD().size();
            String msj2 = "Pais eliminada exitosamente, hay " + total + " pais(s)";
            JOptionPane.showMessageDialog(this, msj2);
            limpiarCampos();
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarActionPerformed
        if(Pais.getPaisBD() == null || Pais.getPaisBD().isEmpty()){
            JOptionPane.showMessageDialog(this, "no hay Paises para listar"
            , "RESULTADO NEGATIVO", JOptionPane.WARNING_MESSAGE);
            return;
        }
            
        this.dispose();
            
        VentanaReportePais ventanaReporte = new VentanaReportePais(new JFrame(), true);
        ventanaReporte.setLocationRelativeTo(this);
        ventanaReporte.setVisible(true);
        
    }//GEN-LAST:event_BotonListarActionPerformed

    private void CampoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNombreActionPerformed

    private void CampoNumeroHabitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNumeroHabitantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNumeroHabitantesActionPerformed

    private void CampoPibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPibActionPerformed

    private void CampoCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCapitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCapitalActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCrudPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                VentanaCrudPais dialog = new VentanaCrudPais(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField CampoCapital;
    private javax.swing.JTextField CampoId;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JTextField CampoNumeroHabitantes;
    private javax.swing.JTextField CampoPib;
    private javax.swing.JLabel EtiquetaCapital;
    private javax.swing.JLabel EtiquetaId;
    private javax.swing.JLabel EtiquetaNombre;
    private javax.swing.JLabel EtiquetaNumeroHabitantes;
    private javax.swing.JLabel EtiquetaPib;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
