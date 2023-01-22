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
public class Pais {
    private String id;
    private String nombre;
    private String capital;
    private Integer num_habitantes;
    private Integer pib;
    private static HashMap<String, Pais> paisBD;
    
    public Pais(String id, String nombre, String capital, Integer num_habitantes, Integer pib) {
        this.id = id;
        this.nombre = nombre;
        this.capital = capital;
        this.num_habitantes = num_habitantes;
        this.pib = pib;
    }

    public Pais() {
    }

    @Override
    public String toString() {
        return "Pais{" + "id=" + id + ", nombre=" + nombre + ", capital=" + capital + ", num_habitantes=" + num_habitantes + ", pib=" + pib + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Integer getNum_habitantes() {
        return num_habitantes;
    }

    public void setNum_habitantes(Integer num_habitantes) {
        this.num_habitantes = num_habitantes;
    }

    public Integer getPib() {
        return pib;
    }

    public void setPib(Integer pib) {
        this.pib = pib;
    }

    public static HashMap<String, Pais> getPaisBD() {
        return paisBD;
    }

    public static void setPaisBD(HashMap<String, Pais> paisBD) {
        Pais.paisBD = paisBD;
    }
    
}
