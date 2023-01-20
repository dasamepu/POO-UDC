/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.vistas.gui;
import co.edu.ude.poo.empresas.modelo.entidades.*;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author david
 */

public class VentanaCrudAsesor extends JDialog {
    private JLabel lblId, lblFecha_inicio, lblNombre, lblDireccion, lblTitulacion;
    private JTextField txtId, txtFecha_inicio, txtNombre, txtDireccion, txtTitulacion;
    private JButton btnAgregar, btnBuscar, btnEliminar, btnLimpiar, btnListar;
    private JPanel panelFormulario, panelBotones;
    private ImageIcon iconoAsesor;
    private String operacion;
    public VentanaCrudAsesor(JFrame frame,String operacion) {
        super(frame,true);
        this.operacion = operacion;
        setTitle("Asesor - " + operacion);
        // Crear etiquetas y campos de entrada
        lblId = new JLabel("Id:");
        txtId = new JTextField();
        lblFecha_inicio = new JLabel("Fecha de inicio:");
        txtFecha_inicio = new JTextField();
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField();
        lblDireccion = new JLabel("Direccion:");
        txtDireccion = new JTextField();
        lblTitulacion = new JLabel("Titulación:");
        txtTitulacion = new JTextField();
        
        // Crear botones
        btnAgregar = new JButton("Agregar", new ImageIcon("agregar.png"));
        btnBuscar = new JButton("Buscar", new ImageIcon("buscar.png"));
        btnEliminar = new JButton("Eliminar", new ImageIcon("eliminar.png"));
        btnLimpiar = new JButton("Limpiar", new ImageIcon("limpiar.png"));
        btnListar = new JButton("Listar", new ImageIcon("listar.png"));
        
        // Crear panel para los controles de entrada
        panelFormulario = new JPanel();
        panelFormulario.setLayout(new GridLayout(5, 2));
        panelFormulario.add(lblId);
        panelFormulario.add(txtId); 
        panelFormulario.add(lblFecha_inicio); 
        panelFormulario.add(txtFecha_inicio); 
        panelFormulario.add(lblNombre); 
        panelFormulario.add(txtNombre); 
        panelFormulario.add(lblDireccion); 
        panelFormulario.add(txtDireccion);
        panelFormulario.add(lblTitulacion); 
        panelFormulario.add(txtTitulacion);
        // Crear panel para los botones
    panelBotones = new JPanel();
    panelBotones.setLayout(new FlowLayout());
    panelBotones.add(btnAgregar);
    panelBotones.add(btnBuscar);
    panelBotones.add(btnEliminar);
    panelBotones.add(btnLimpiar);
    panelBotones.add(btnListar);
    
    // Crear imagen representativa de la clase
    iconoAsesor = new ImageIcon("asesor.png");
    JLabel lblImagen = new JLabel(iconoAsesor);
    
    // Establecer layout de la ventana y agregar componentes
    setLayout(new BorderLayout());
    add(lblImagen, BorderLayout.WEST);
    add(panelFormulario, BorderLayout.CENTER);
    add(panelBotones, BorderLayout.SOUTH);
    
    // Establecer acciones para los botones
    btnAgregar.addActionListener(e -> agregarAsesor());
    btnBuscar.addActionListener(e -> buscarAsesor());
    btnEliminar.addActionListener(e -> eliminarAsesor());
    btnLimpiar.addActionListener(e -> limpiarFormulario());
    btnListar.addActionListener(e -> listarAsesores());
    
    // Establecer características de la ventana
    setSize(600, 700);
    setLocationRelativeTo(frame);
    setVisible(true);
}

    // Métodos para agregar, buscar, eliminar, limpiar y listar asesores
    private void agregarAsesor() {
        // Obtener los datos del formulario y crear un objeto Asesor
         // Recoger los datos del formulario
        int id = Integer.parseInt(txtId.getText());
        String fechaInicio = txtFecha_inicio.getText();
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String titulacion = txtTitulacion.getText();

    // Validar que los datos estén completos
        if (id <= 0 || fechaInicio.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || titulacion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos requeridos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

    // Crear un nuevo objeto de la clase Asesor con los datos ingresados
        Asesor asesor = new Asesor(id, fechaInicio, nombre, direccion, titulacion);

    // Agregar el asesor a la lista o base de datos
    // ...

    // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Asesor agregado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);

    // Limpiar el formulario
        limpiarFormulario();

    }

    private void buscarAsesor(){
     // Recoger el criterio de búsqueda (id, nombre, dirección o titulación)
        String criterio = txtCriterio.getText();

    // Validar que se haya ingresado un criterio de búsqueda
        if (criterio.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un criterio de búsqueda", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

    // Buscar el asesor en la lista o base de datos
        Asesor asesor = buscarAsesor(criterio);

    // Si se encuentra el asesor, mostrar sus datos en el formulario
        if (asesor != null) {
            txtId.setText(Integer.toString(asesor.getId()));
            txtFechaInicio.setText(asesor.getFechaInicio()); 
            txtNombre.setText(asesor.getNombre()); 
            txtDireccion.setText(asesor.getDireccion()); 
            txtTitulacion.setText(asesor.getTitulacion()); 
        } else { 
            JOptionPane.showMessageDialog(this, "Asesor no encontrado", "Error", JOptionPane.ERROR_MESSAGE); 
        } 
    }
    

    private void eliminarAsesor() {
        // Eliminar un asesor por sus datos
        // Recoger el criterio de búsqueda (id, nombre, dirección o titulación) 
        String criterio = txtCriterio.getText();
        // Validar que se haya ingresado un criterio de búsqueda
        if (criterio.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un criterio de búsqueda", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Buscar el asesor en la lista o base de datos
        Asesor asesor = buscarAsesor(criterio);
            
        // Si se encuentra el asesor, eliminarlo de la lista o base de datos
        if (asesor != null) {
            // Eliminar asesor
            // ...
            
            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "Asesor eliminado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                
            // Limpiar el formulario
            limpiarFormulario();
        } else {
            // Si no se encuentra el asesor,
        mostrar mensaje de error JOptionPane.showMessageDialog(this, "Asesor no encontrado", "Error", JOptionPane.ERROR_MESSAGE); 
        }   
    }

    private void limpiarFormulario() {
        // Limpiar los campos de entrada
        txtId.setText("");
        txtFecha_inicio.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTitulación.setText("");
    }

    private void listarAsesores() { 
// Obtener la lista de asesores de la base de datos o lista 
// ...
// Crear una tabla para mostrar los asesores
        JTable tabla = new JTable(asesores.size(), 5);
        tabla.setModel(new DefaultTableModel(
            new Object[][] {
                {"ID", "Fecha de Inicio", "Nombre", "Dirección", "Titulación"}
            },
            new String[] {
                "ID", "Fecha de Inicio", "Nombre", "Dirección", "Titulación"
            }
        ));
            
        // Llenar la tabla con los datos de los asesores
        for (int i = 0; i < asesores.size(); i++) {
            Asesor asesor = asesores.get(i);
            tabla.setValueAt(asesor.getId(), i+1, 0);
            tabla.setValueAt(asesor.getFechaInicio(), i+1, 1);
            tabla.setValueAt(asesor.getNombre(), i+1, 2);
            tabla.setValueAt(asesor.getDireccion(), i+1, 3);
            tabla.setValueAt(asesor.getTitulacion(), i+1, 4);
        }

// Crear un scrollpane para mostrar la tabla
            JScrollPane scrollPane = new JScrollPane(tabla);

// Añadir el scrollpane al formulario
            add(scrollPane);

// Mostrar el formulario 
            setVisible(true); 
        }

        menu[1].getItem(0).addActionListener(new ActionListener() { // Agregar
            @Override
            public void actionPerformed(ActionEvent e) {
            agregarAsesor();
            }
        });

        menu[1].getItem(1).addActionListener(new ActionListener() { // Buscar
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarAsesor();
            }
        });

        menu[1].getItem(2).addActionListener(new ActionListener() { // Editar
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para editar asesor
            }
        });

        menu[1].getItem(3).addActionListener(new ActionListener() { // Eliminar
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarAsesor();
            }
        });

        menu[1].getItem(4).getItem(0).addActionListener(new ActionListener() { // Reportes -> Listar Todo
            @Override
            public void actionPerformed(ActionEvent e) {
                listarAsesores();
            }
        });
}