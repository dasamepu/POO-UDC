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
public class Vendedor {
    public String id;
    private String nombre;
    private String direccion;
    private Integer numero_trabajos;
    private static HashMap<String, Vendedor> vendedorBD;

    public Vendedor(String id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public Vendedor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Vendedor{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", numero_trabajos=" + numero_trabajos + '}';
    }

    public Integer getNumero_trabajos() {
        return numero_trabajos;
    }

    public void setNumero_trabajos(Integer numero_trabajos) {
        if (numero_trabajos==1){
            this.numero_trabajos = numero_trabajos;
        }else{
            System.out.println("El vendedor solo puede trabajar para una empresa");
        }
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static HashMap<String, Vendedor> getVendedorBD() {
        return vendedorBD;
    }

    public static void setVendedorBD(HashMap<String, Vendedor> vendedorBD) {
        Vendedor.vendedorBD = vendedorBD;
    }
    
    
}
