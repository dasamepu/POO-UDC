/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.util;

import co.edu.ude.poo.empresas.modelo.entidades.Area;
import co.edu.ude.poo.empresas.modelo.entidades.Asesor;
import co.edu.ude.poo.empresas.modelo.entidades.Empresa;
import co.edu.ude.poo.empresas.modelo.entidades.Holding;
import co.edu.ude.poo.empresas.modelo.entidades.Pais;
import co.edu.ude.poo.empresas.modelo.entidades.Sede;
import co.edu.ude.poo.empresas.modelo.entidades.Vendedor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author renejk
 */
public class GestionDeAlmacenamiento {

//    guardar area en archivo
    public static void guardarAreas(List<Area> lista) {

        try {
            System.out.print("Guardando ArrayList en el fichero objetos.dat.. " + lista);
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(
                    new FileOutputStream("data/areas.txt"));
            escribiendoFichero.writeObject(lista);

            System.out.println("ok!");
        } catch (IOException e) {
            System.out.println("error al guardar " + e);
        }

    }
//recuperar lista de areas
    public static List<Area> recuperarArea() {
        List<Area> lista = new ArrayList<>();
        try {

            ObjectInputStream leyendoFichero = new ObjectInputStream(
                    new FileInputStream("data/areas.txt"));
           
            lista = (ArrayList<Area>) leyendoFichero.readObject();
            leyendoFichero.close();

            System.out.println("ok!");
            System.out.println("Datos leídos del fichero: " + lista);
            return lista;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("no se encontraron archivos " + e);
            return lista;
        }

    }
    
    
    //    guardar asesores en archivo
    public static void guardarAsesores(List<Asesor> lista) {

        try {
            System.out.print("Guardando ArrayList en el fichero objetos.dat.. " + lista);
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(
                    new FileOutputStream("data/asesores.txt"));
            escribiendoFichero.writeObject(lista);

            System.out.println("ok!");
        } catch (IOException e) {
            System.out.println("error al guardar " + e);
        }

    }
//recuperar lista de asesores
    public static List<Asesor> recuperarAsesor() {
        List<Asesor> lista = new ArrayList<>();
        try {

            ObjectInputStream leyendoFichero = new ObjectInputStream(
                    new FileInputStream("data/asesores.txt"));
           
            lista = (ArrayList<Asesor>) leyendoFichero.readObject();
            leyendoFichero.close();

            System.out.println("ok!");
            System.out.println("Datos leídos del fichero: " + lista);
            return lista;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("no se encontraron archivos " + e);
            return lista;
        }

    }
    
    
    //    guardar empresas en archivo
    public static void guardarEmpresas(List<Empresa> lista) {

        try {
            System.out.print("Guardando ArrayList en el fichero objetos.dat.. " + lista);
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(
                    new FileOutputStream("data/empresas.txt"));
            escribiendoFichero.writeObject(lista);

            System.out.println("ok!");
        } catch (IOException e) {
            System.out.println("error al guardar " + e);
        }

    }
//recuperar lista de empresas
    public static List<Empresa> recuperarEmpresas() {
        List<Empresa> lista = new ArrayList<>();
        try {

            ObjectInputStream leyendoFichero = new ObjectInputStream(
                    new FileInputStream("data/empresas.txt"));
           
            lista = (ArrayList<Empresa>) leyendoFichero.readObject();
            leyendoFichero.close();

            System.out.println("ok!");
            System.out.println("Datos leídos del fichero: " + lista);
            return lista;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("no se encontraron archivos " + e);
            return lista;
        }

    }
    
    
    
    //    guardar holdings en archivo
    public static void guardarHoldings(List<Holding> lista) {

        try {
            System.out.print("Guardando ArrayList en el fichero objetos.dat.. " + lista);
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(
                    new FileOutputStream("data/holdings.txt"));
            escribiendoFichero.writeObject(lista);

            System.out.println("ok!");
        } catch (IOException e) {
            System.out.println("error al guardar " + e);
        }

    }
//recuperar lista de holdings
    public static List<Holding> recuperarHoldings() {
        List<Holding> lista = new ArrayList<>();
        try {

            ObjectInputStream leyendoFichero = new ObjectInputStream(
                    new FileInputStream("data/holdings.txt"));
           
            lista = (ArrayList<Holding>) leyendoFichero.readObject();
            leyendoFichero.close();

            System.out.println("ok!");
            System.out.println("Datos leídos del fichero: " + lista);
            return lista;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("no se encontraron archivos " + e);
            return lista;
        }

    }
    
    
    //    guardar paises en archivo
    public static void guardarPaises(List<Pais> lista) {

        try {
            System.out.print("Guardando ArrayList en el fichero objetos.dat.. " + lista);
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(
                    new FileOutputStream("data/paises.txt"));
            escribiendoFichero.writeObject(lista);

            System.out.println("ok!");
        } catch (IOException e) {
            System.out.println("error al guardar " + e);
        }

    }
//recuperar lista de paises
    public static List<Pais> recuperarPaises() {
        List<Pais> lista = new ArrayList<>();
        try {

            ObjectInputStream leyendoFichero = new ObjectInputStream(
                    new FileInputStream("data/paises.txt"));
           
            lista = (ArrayList<Pais>) leyendoFichero.readObject();
            leyendoFichero.close();

            System.out.println("ok!");
            System.out.println("Datos leídos del fichero: " + lista);
            return lista;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("no se encontraron archivos " + e);
            return lista;
        }

    }
    
    
    //    guardar sedes en archivo
    public static void guardarSedes(List<Sede> lista) {

        try {
            System.out.print("Guardando ArrayList en el fichero objetos.dat.. " + lista);
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(
                    new FileOutputStream("data/sedes.txt"));
            escribiendoFichero.writeObject(lista);

            System.out.println("ok!");
        } catch (IOException e) {
            System.out.println("error al guardar " + e);
        }

    }
//recuperar lista de sedes
    public static List<Sede> recuperarSedes() {
        List<Sede> lista = new ArrayList<>();
        try {

            ObjectInputStream leyendoFichero = new ObjectInputStream(
                    new FileInputStream("data/sedes.txt"));
           
            lista = (ArrayList<Sede>) leyendoFichero.readObject();
            leyendoFichero.close();

            System.out.println("ok!");
            System.out.println("Datos leídos del fichero: " + lista);
            return lista;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("no se encontraron archivos " + e);
            return lista;
        }

    }
    
    
    //    guardar vendedores en archivo
    public static void guardarVendedores(List<Vendedor> lista) {

        try {
            System.out.print("Guardando ArrayList en el fichero objetos.dat.. " + lista);
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(
                    new FileOutputStream("data/vendedores.txt"));
            escribiendoFichero.writeObject(lista);

            System.out.println("ok!");
        } catch (IOException e) {
            System.out.println("error al guardar " + e);
        }

    }
//recuperar lista de vendedores
    public static List<Vendedor> recuperarVendedores() {
        List<Vendedor> lista = new ArrayList<>();
        try {

            ObjectInputStream leyendoFichero = new ObjectInputStream(
                    new FileInputStream("data/vendedores.txt"));
           
            lista = (ArrayList<Vendedor>) leyendoFichero.readObject();
            leyendoFichero.close();

            System.out.println("ok!");
            System.out.println("Datos leídos del fichero: " + lista);
            return lista;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("no se encontraron archivos " + e);
            return lista;
        }

    }
}
