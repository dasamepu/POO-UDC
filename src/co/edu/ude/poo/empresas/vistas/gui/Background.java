/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.vistas.gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class Background extends JPanel{
    Image fondo;
        
    public Background( ) {
        fondo = new ImageIcon(getClass( ).getResource("/co/edu/ude/poo/empresas/vistas/iconos/background.png")).getImage( );
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D)g.create( );
        gd.drawImage(fondo, 0, 0, getWidth( ),getHeight( ),null);
        gd.dispose( );
    }
}