/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.vistas.gui;

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

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
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
        JMenu menuPrincipal = new JMenu("Clases");

        // Crea los items del menú
        JMenuItem itemArea = new JMenuItem("Area");
        JMenuItem itemAsesor = new JMenuItem("Asesor");
        JMenuItem itemEmpresa = new JMenuItem("Empresa");
        JMenuItem itemHolding = new JMenuItem("Holding");
        JMenuItem itemPais = new JMenuItem("Pais");
        JMenuItem itemSede = new JMenuItem("Sede");
        JMenuItem itemVendedor = new JMenuItem("Vendedor");

        // Añade los items al menú
        menuPrincipal.add(itemArea);
        menuPrincipal.add(itemAsesor);
        menuPrincipal.add(itemEmpresa);
        menuPrincipal.add(itemHolding);
        menuPrincipal.add(itemPais);
        menuPrincipal.add(itemSede);
        menuPrincipal.add(itemVendedor);

        // Añade el menú principal a la barra de menús
        barraDeMenu.add(menuPrincipal);

        // Añade la barra de menús a la ventana
        setJMenuBar(barraDeMenu);
    }
    // ...
}
