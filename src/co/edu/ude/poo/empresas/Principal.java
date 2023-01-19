/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas;
import co.edu.ude.poo.empresas.modelo.crud.*;
import co.edu.ude.poo.empresas.modelo.entidades.*;
/**
 *
 * @author david
 */
public class Principal {
    public static void main(String[] args){
        Empresa empresa1 = new Empresa("12345", "ecopetrol", 
                "1/1/2022", 363563456, 354);
        empresa1.setNum_sedes(1);
        System.out.println(empresa1);
        System.out.println(empresa1.getNum_sedes());

        System.out.println("");
        
        Empresa empresa2 = new Empresa("54321", "terpel", 
                "2/1/2022", 1000000, 1000);
        System.out.println(empresa2);
        empresa2.setNum_sedes(2);
        System.out.println(empresa2.getNum_sedes());

        System.out.println("");
        
        Vendedor vendedor1 = new Vendedor("34566","Juan","Calle 80");
        vendedor1.setNumero_trabajos(1);
        System.out.println(vendedor1);
        System.out.println(vendedor1.getNumero_trabajos());
        
        System.out.println();
        
        Vendedor vendedor2 = new Vendedor("85678","Julian","Calle 60");
        System.out.println(vendedor2);
        vendedor2.setNumero_trabajos(2);
        System.out.println(vendedor2.getNumero_trabajos());
        
        System.out.println();
        
        AsesorCrud asesorCrud = new AsesorCrud();
        Asesor asesor1 = new Asesor("1654", "4/1/2023", "Diego", "Calle 24", "Asesoria financiera");
        asesorCrud.agregar(asesor1);
        
        Asesor asesor2 = new Asesor("7891", "8/6/2021", "Mateo", "Calle 64", "Asesoria Legal");
        asesorCrud.agregar(asesor2);
        
        System.out.println("Número de asesores en la lista: " + asesorCrud.contar());

        Asesor asesorEncontrado = asesorCrud.buscar("1654");
        if (asesorEncontrado != null) {
            System.out.println("Asesor encontrado:");
            System.out.println("    -Código: " + asesorEncontrado.getId());
            System.out.println("    -Nombre: " + asesorEncontrado.getNombre());
            System.out.println("    -Dirección: " + asesorEncontrado.getDireccion());
            System.out.println("    -Fecha de inicio: " + asesorEncontrado.getFecha_inicio());
            System.out.println("    -Titulación: " + asesorEncontrado.getTitulacion());
        } else {
            System.out.println("Asesor no encontrado.");
        }
    }
    
}
