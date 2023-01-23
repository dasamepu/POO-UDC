/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.modelo.entidades;

import co.edu.ude.poo.empresas.util.GestionDeAlmacenamiento;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author david
 */
public class Area implements Serializable{
    private String id;
    private String nombre;
    private String descripción;
    private static HashMap<String, Area> areaBD;

    public Area(String id, String nombre, String descripción) {
        this.id = id;
        this.nombre = nombre;
        this.descripción = descripción;
    }

    public Area() {
    }

    @Override
    public String toString() {
        return "Area{" + "id=" + id + ", nombre=" + nombre + ", descripci\u00f3n=" + descripción + '}';
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

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public static HashMap<String, Area> getAreaBD()  {
        List<Area> areas = GestionDeAlmacenamiento.recuperarArea();

        for (Area a : areas) {
            String id_a = a.getId();
            if (areaBD == null) {
                setAreaBD(new HashMap<>());
            }
            if (!areaBD.containsKey(id_a)) {
                areaBD.put(a.getId(), a);
            }
        }

        return areaBD;
    }

    public static void setAreaBD(HashMap<String, Area> areaBD) {
        Area.areaBD = areaBD;
      
    }
    
    
}
