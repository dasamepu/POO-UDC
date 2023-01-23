
package co.edu.ude.poo.empresas.modelo.crud;

import co.edu.ude.poo.empresas.modelo.entidades.Empresa;
import co.edu.ude.poo.empresas.modelo.entidades.Vendedor;
import co.edu.ude.poo.empresas.util.GestionDeAlmacenamiento;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author renejk
 */
public class VendedorCrud {
    private static VendedorCrud instance; // static variable to hold the single instance of the class
    private static HashMap<String, Vendedor> vendedorBD;
    
    private VendedorCrud() {

        List<Vendedor> listaVendedoresRecuperadas = GestionDeAlmacenamiento.recuperarVendedores();
        
        for (Vendedor vendedor : listaVendedoresRecuperadas) {
            
            String id_vendedor = vendedor.getId();
            if (vendedorBD == null) {
                vendedorBD = new HashMap<>();
            }
            if (!vendedorBD.containsKey(id_vendedor)) {
                vendedorBD.put(vendedor.getId(), vendedor);
            }

        }   
    }
    
    public static VendedorCrud getInstance() { // static method to return the single instance of the class
        if (instance == null) {
            instance = new VendedorCrud();
        }
        return instance;
    }
    
    public void agregar(Vendedor v){
        vendedorBD.put(v.getId(), v);
    }

    public Vendedor buscar(String id){
        if(vendedorBD.containsKey(id)){
            return vendedorBD.get(id);
        }
        return null;
    }

    public void editar(Vendedor v){
        if(vendedorBD.containsKey(v.getId())){
            vendedorBD.put(v.getId(), v);
        }
    }

    public void eliminar(String id){
        if(vendedorBD.containsKey(id)){
            vendedorBD.remove(id);
        }
    }

    public Collection<Vendedor> listarTodo(){
        return vendedorBD.values();
    }

    public int contar() {
        return vendedorBD.size();
    }

}