
package co.edu.ude.poo.empresas.modelo.crud;

import co.edu.ude.poo.empresas.modelo.entidades.Vendedor;
import java.util.ArrayList;

/**
 *
 * @author renejk
 */
public class VendedorCrud {
    
    ArrayList<Vendedor> vendedores = new ArrayList<>();
    
    public void agregar(Vendedor v ){
        vendedores.add(v);
        
    }
    
    public Vendedor buscar(String codigo){
        for (Vendedor v : vendedores) {
            if(v.id.equals(codigo)){
               return v; 
            }}             
        
        return null;
    }
    
    public void editar(Vendedor v){
           for (Vendedor aux : vendedores) {
            if(aux.id.equals(v.id)){
              aux.setNombre(v.getNombre());
              aux.setNumero_trabajos(v.getNumero_trabajos());
              aux.setDireccion(v.getDireccion());
            }}             
        
    }
    
    public void eliminar(String codigo){
           for (Vendedor v : vendedores) {
            if(v.id.equals(codigo)){
              vendedores.remove(v);
            }}       
    }
    
    public ArrayList<Vendedor> listarTodo(){
        
        
        return vendedores;
    }
}
        