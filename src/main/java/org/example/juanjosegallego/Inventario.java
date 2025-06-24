package org.example.juanjosegallego;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Inventario {
    public static void main(String[] args) {

        //ENTRADAS
        Scanner keyEntry = new Scanner(System.in);
        Integer menuOption=null;
        String colorVerde="\u001B[32m";
        ArrayList<Object> productos = new ArrayList<>();

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

        System.out.println("Apreciada gonorrea , digita una opción");
        menuOption = keyEntry.nextInt();
        while(menuOption!=5) {
            HashMap<String, Object> diccionary = new HashMap<>();
            try {

                if (menuOption == 1) {
                    System.out.println("Registrando  producto...");
                    //System.out.println("Digite el producto a1 registrar en la Base de Datos");
                    //keyEntry.nextLine();
                   // productos.add(keyEntry.nextLine());

                    //creando ojbetos/diccionarios/ hashmaps en js

                    //llenando un diccionario/objeto o hashmap
                    System.out.println("Digita el id del producto: ");
                    diccionary.put("id", keyEntry.nextInt());

                    System.out.println("Digita  el precio del producto: ");;
                    diccionary.put("precio", keyEntry.nextDouble());

                    System.out.println("Digita el nombre del producto: ");
                    keyEntry.nextLine(); //limpio el buffer
                   diccionary.put("nombre", keyEntry.nextLine());

                   //llenando lista con diccionario
                    productos.add(diccionary);


                    System.out.println(diccionary);
                } else if (menuOption == 2) {
                    System.out.println("Mostrando el inventario...");
                    System.out.println(productos);
                } else if (menuOption == 3) {
                    System.out.println("Modificando producto....");
                } else if (menuOption == 4) {
                    System.out.println("Eliminando producto....");
                } else if (menuOption == 5) {
                    System.out.println("Gracias por usar nuestro software...");
                    break;
                }
                System.out.println("Ahora digita otra opción");
                menuOption = keyEntry.nextInt();
            } catch (Exception error) {
                System.out.println(error.getMessage());
            }
        }
        //PROCESO 2
        //PROCESO 3
        //SALIDAS
    }
}
