/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.modelo.entidades;

import java.util.HashMap;

/**
 *
 * @author david
 */
public class Holding {
    private String id;
    private String nombre_holding;
    private static HashMap<String, Holding> holdingBD;

    public Holding(String id, String nombre_holding) {
        this.id = id;
        this.nombre_holding = nombre_holding;
    }

    public Holding() {
    }
    
    @Override
    public String toString() {
        return "Holding{" + "id=" + id + ", nombre_holding=" + nombre_holding + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre_holding() {
        return nombre_holding;
    }

    public void setNombre_holding(String nombre_holding) {
        this.nombre_holding = nombre_holding;
    }

    public static HashMap<String, Holding> getHoldingBD() {
        return holdingBD;
    }

    public static void setHoldingBD(HashMap<String, Holding> holdingBD) {
        Holding.holdingBD = holdingBD;
    }
    
    
}
