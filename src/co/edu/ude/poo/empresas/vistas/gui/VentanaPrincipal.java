/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.ude.poo.empresas.vistas.gui;
import co.edu.ude.poo.empresas.vistas.iconos.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 *
 * @author david
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
         //Código de la ventana
        //...

        //Carga la imagen del icono
        ImageIcon icono = new ImageIcon("icono.png");
        Image iconoEscalado = icono.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        //Asigna el icono a la ventana
        setIconImage(iconoEscalado);
        
        // Crea una barra de menús
        JMenuBar barraDeMenu = new JMenuBar();

        // Crea el menú principal
        //JMenu menuPrincipal = new JMenu("Clases");

        // Crea los items del menú
        JMenu Area = new JMenu("Area");
        JMenu Asesor = new JMenu("Asesor");
        JMenu Empresa = new JMenu("Empresa");
        JMenu Holding = new JMenu("Holding");
        JMenu Pais = new JMenu("Pais");
        JMenu Sede = new JMenu("Sede");
        JMenu Vendedor = new JMenu("Vendedor");

        // Añade los items al menú
        //menuPrincipal.add(itemArea);
        //menuPrincipal.add(itemAsesor);
        //menuPrincipal.add(itemEmpresa);
        //menuPrincipal.add(itemHolding);
        //menuPrincipal.add(itemPais);
        //menuPrincipal.add(itemSede);
        //menuPrincipal.add(itemVendedor);

        // Añade el menú principal a la barra de menús
        //barraDeMenu.add(menuPrincipal);
        barraDeMenu.add(Area);
        barraDeMenu.add(Asesor);
        barraDeMenu.add(Empresa);
        barraDeMenu.add(Holding);
        barraDeMenu.add(Pais);
        barraDeMenu.add(Sede);
        barraDeMenu.add(Vendedor);
        
        // Añade la barra de menús a la ventana
        setJMenuBar(barraDeMenu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
