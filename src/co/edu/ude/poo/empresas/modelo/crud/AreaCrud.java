/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.AreaCrud to edit this template
 */
package co.edu.ude.poo.empresas.modelo.crud;

import co.edu.ude.poo.empresas.modelo.entidades.Area;
import java.util.ArrayList;

/**
 *
 * @author renejk
 */
public class AreaCrud {
    ArrayList<Area> areas = new ArrayList<>();
    
    public void agregar(Area v ){
        areas.add(v);
        
    }
    
    public Area buscar(String codigo){
        for (Area a : areas) {
            if(a.getId().equals(codigo)){
               return a; 
            }}             
        
        return null;
    }
    
    public void editar(Area a){
           for (Area aux : areas) {
            if(aux.getId().equals(a.getId())){
              aux.setNombre(a.getNombre());
              aux.setDescripción(a.getDescripción());
            }}             
        
    }
    
    public void eliminar(String codigo){
           for (Area a : areas) {
            if(a.getId().equals(codigo)){
              areas.remove(a);
            }}       
    }
    
    public ArrayList<Area> listarTodo(){
        
        
        return areas;
    }
    
    public int contar() {
        return areas.size();
    }
}
