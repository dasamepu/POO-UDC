/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.modelo.crud;

import co.edu.ude.poo.empresas.modelo.entidades.Holding;
import java.util.ArrayList;

/**
 *
 * @author renejk
 */
public class HoldingCrud {
     ArrayList<Holding> holdings = new ArrayList<>();
    
    public void agregar(Holding h ){
        holdings.add(h);
        
    }
    
    public Holding buscar(String codigo){
        for (Holding h : holdings) {
            if(h.getId().equals(codigo)){
               return h; 
            }}             
        
        return null;
    }
    
    public void editar(Holding h){
           for (Holding aux : holdings) {
            if(aux.getId().equals(h.getId())){
              aux.setNombre_holding(h.getNombre_holding());
             
            }}             
        
    }
    
    public void eliminar(String codigo){
           for (Holding h : holdings) {
            if(h.getId().equals(codigo)){
              holdings.remove(h);
            }}       
    }
    
    public ArrayList<Holding> listarTodo(){
        
        
        return holdings;
    }
}
