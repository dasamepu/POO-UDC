/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.modelo.crud;

import co.edu.ude.poo.empresas.modelo.entidades.Pais;
import java.util.ArrayList;

/**
 *
 * @author renejk
 */
public class PaisCrud {
     ArrayList<Pais> paises = new ArrayList<>();
    
    public void agregar(Pais a ){
        paises.add(a);
        
    }
    
    public Pais buscar(String codigo){
        for (Pais p : paises) {
            if(p.getId().equals(codigo)){
               return p; 
            }}             
        
        return null;
    }
    
    public void editar(Pais p){
           for (Pais aux : paises) {
            if(aux.getId().equals(p.getId())){
              aux.setNombre(p.getNombre());
             aux.setNum_habitantes(p.getNum_habitantes());
             aux.setPib(p.getPib());
            }}             
        
    }
    
    public void eliminar(String codigo){
           for (Pais p : paises) {
            if(p.getId().equals(codigo)){
              paises.remove(p);
            }}       
    }
    
    public ArrayList<Pais> listarTodo(){       
        
        return paises;
    }
    
    public int contar() {
        return paises.size();
    }
}
