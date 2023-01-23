/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.modelo.crud;

import co.edu.ude.poo.empresas.modelo.entidades.Asesor;
import java.util.ArrayList;

/**
 *
 * @author renejk
 */
public class AsesorCrud {
    ArrayList<Asesor> asesores = new ArrayList<>();
    
    public void agregar(Asesor a ){
        asesores.add(a);
        
    }
    
    public Asesor buscar(String codigo){
        for (Asesor a : asesores) {
            if(a.getId().equals(codigo)){
               return a; 
            }}             
        
        return null;
    }
    
    public void editar(Asesor a){
           for (Asesor aux : asesores) {
            if(aux.getId().equals(a.getId())){
              aux.setNombre(a.getNombre());
              aux.setDireccion(a.getDireccion());
              aux.setFecha_inicio(a.getDireccion());
              aux.setTitulacion(a.getTitulacion());
            }}             
        
    }
    
    public void eliminar(String codigo){
           for (Asesor a : asesores) {
            if(a.getId().equals(codigo)){
              asesores.remove(a);
            }}       
    }
    
    public ArrayList<Asesor> listarTodo(){
        
        
        return asesores;
    }
    
    public int contar() {
        return asesores.size();
    }
}
