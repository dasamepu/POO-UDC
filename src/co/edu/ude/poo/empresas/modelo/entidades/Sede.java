/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.modelo.entidades;

/**
 *
 * @author david
 */
public class Sede {
    private String id;
    private String ciudad_localiza;

    public Sede(String id, String ciudad_localiza) {
        this.id = id;
        this.ciudad_localiza = ciudad_localiza;
    }

    public Sede() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Sede{" + "id=" + id + ", ciudad_localiza=" + ciudad_localiza + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCiudad_localiza() {
        return ciudad_localiza;
    }

    public void setCiudad_localiza(String ciudad_localiza) {
        this.ciudad_localiza = ciudad_localiza;
    }
    
    
}
