/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.modelo.crud;

import co.edu.ude.poo.empresas.modelo.entidades.Empresa;
import java.util.ArrayList;

/**
 *
 * @author renejk
 */
public class EmpresaCrud {
     ArrayList<Empresa> empresas = new ArrayList<>();
    
    public void agregar(Empresa e ){
        empresas.add(e);
        
    }
    
    public Empresa buscar(String codigo){
        for (Empresa e : empresas) {
            if(e.getId().equals(codigo)){
               return e; 
            }}             
        
        return null;
    }
    
    public void editar(Empresa e){
           for (Empresa aux : empresas) {
            if(aux.getId().equals(e.getId())){
              aux.setNombre_empresa(e.getNombre_empresa());
              aux.setNum_sedes(e.getNum_sedes() );
              aux.setNumero_vendedores(e.getNumero_vendedores());
              aux.setFacturacion_anual(e.getFacturacion_anual());
              aux.setFecha_entrada_holding(e.getFecha_entrada_holding());
            }}             
        
    }
    
    public void eliminar(String codigo){
           for (Empresa e : empresas) {
            if(e.getId().equals(codigo)){
              empresas.remove(e);
            }}       
    }
    
    public ArrayList<Empresa> listarTodo(){
        
        
        return empresas;
    }
}
