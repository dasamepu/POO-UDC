/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.modelo.crud;


import co.edu.ude.poo.empresas.modelo.entidades.Sede;
import java.util.ArrayList;

/**
 *
 * @author renejk
 */
public class SedeCrud {
    ArrayList<Sede> sedes = new ArrayList<>();
    
    public void agregar(Sede s ){
        sedes.add(s);
        
    }
    
    public Sede buscar(String codigo){
        for (Sede s : sedes) {
            if(s.getId().equals(codigo)){
               return s; 
            }}             
        
        return null;
    }
    
    public void editar(Sede s){
           for (Sede aux : sedes) {
            if(aux.getId().equals(s.getId())){
              aux.setCiudad_localiza(s.getCiudad_localiza());
              
            }}             
        
    }
    
    public void eliminar(String codigo){
           for (Sede s : sedes) {
            if(s.getId().equals(codigo)){
              sedes.remove(s);
            }}       
    }
    
    public ArrayList<Sede> listarTodo(){
        
        
        return sedes;
    }
    
    public int contar() {
        return sedes.size();
    }
}
