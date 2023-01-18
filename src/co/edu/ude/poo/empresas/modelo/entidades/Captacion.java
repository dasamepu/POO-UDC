/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.modelo.entidades;

/**
 *
 * @author david
 */
public class Captacion {
    private String id;
    private String fecha_captación;

    public Captacion(String id, String fecha_captación) {
        this.id = id;
        this.fecha_captación = fecha_captación;
    }

    @Override
    public String toString() {
        return "Captacion{" + "id=" + id + ", fecha_captaci\u00f3n=" + fecha_captación + '}';
    }
    
}
