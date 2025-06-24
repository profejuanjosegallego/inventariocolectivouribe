package org.example.juanjosegallego;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {

        //ENTRADAS
        Scanner keyEntry = new Scanner(System.in);
        Integer menuOption=null;
        String colorVerde="\u001B[32m";
        ArrayList<Object> Products=new ArrayList<>();


        //PROCESO 1 (Crear el menu de opciones)
        System.out.println("\n******************");
        System.out.println("***** Uribe APP *****");
        System.out.println("******************");

        System.out.println("\n👕 Bienvenido a gestor de prendas...\n");
        System.out.println("¿Qué quieres realizar?");
        System.out.println(colorVerde+"1️⃣  Guardar una prenda en BD 📝");
        System.out.println("2️⃣  Mostrar el inventario de prendas 📦");
        System.out.println("3️⃣  Modificar los datos de una prenda ✏️");
        System.out.println("4️⃣  Eliminar una prenda del sistema 🗑️");
        System.out.println("5️⃣  Presiona 5 para SALIR ❌");

        System.out.println("Digite una opcion: ");
        menuOption=keyEntry.nextInt();

        while(true){
            HashMap<String, Object> diccionario= new HashMap<>();

            try {
                if (menuOption==1) {
                    System.out.println("Registrando un producto...");

                    //Agregando un elemento a una lista de Java
                   // System.out.println("Digita el producto que quieres agregar a la BD");
                   // keyEntry.nextLine();
                   // Products.add(keyEntry.nextLine());//

                    // creando objetos/diccionarios/hashmaps en java


                    //llenando un diccionario
                    System.out.println("Digita el ID del producto: ");
                    diccionario.put("id",keyEntry.nextInt());

                    System.out.println("Digita el Precio del producto: ");
                    diccionario.put("precio", keyEntry.nextInt());

                    System.out.println("Digita el Nombre del producto: ");
                    keyEntry.nextLine(); //limpio el bufer
                    diccionario.put("nombre", keyEntry.nextLine());
                    // llenando una lista con un diccionario
                    Products.add(diccionario);

                    System.out.println(Products);

                    } else if (menuOption==2) {
                    System.out.println("Mostrando el inventario...");
                    System.out.println(Products);

                    } else if (menuOption==3) {
                    System.out.println("Modificando un producto...");
                    } else if (menuOption==4) {
                    System.out.println("Eliminando un producto del inventario");
                    } else if (menuOption==5) {
                    System.out.println("Gracias por utilizar nuestra APP...");
                    break;
                    }

                System.out.println("Ahora digita otra opción: ");
                menuOption=keyEntry.nextInt();

                }catch (Exception error){
                System.out.println(error.getMessage());
            }
        }

        //PROCESO 2

        //PROCESO 3

        //SALIDAS

    }
}
