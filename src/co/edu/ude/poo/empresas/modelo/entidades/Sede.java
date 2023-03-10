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
public class Sede implements Serializable {
    private String id;
    private String ciudad_localiza;
    private static HashMap<String, Sede> sedeBD;
    
    public Sede(String id, String ciudad_localiza) {
        this.id = id;
        this.ciudad_localiza = ciudad_localiza;
    }
    
    public Sede() {
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

    public static HashMap<String, Sede> getSedeBD() {
         List<Sede> sedes = GestionDeAlmacenamiento.recuperarSedes();

        for (Sede s : sedes) {
            String id_a = s.getId();
            if (sedeBD == null) {
                setSedeBD(new HashMap<>());
            }
            if (!sedeBD.containsKey(id_a)) {
                sedeBD.put(s.getId(), s);
            }
        }
        return sedeBD;
    }

    public static void setSedeBD(HashMap<String, Sede> areaBD) {
        Sede.sedeBD = areaBD;
    }
}
