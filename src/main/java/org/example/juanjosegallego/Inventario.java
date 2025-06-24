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

        ArrayList<Object> productos=new ArrayList<>();


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

        System.out.println("Digita una opcion: ");
        menuOption=keyEntry.nextInt();



        while(true){HashMap<String,Object> diccionario=new HashMap<>();

           try{

               if(menuOption==1) {
                   System.out.println("registrando un producto...");
                /* keyEntry.nextLine();
                   productos.add(keyEntry.nextLine());
                   System.out.println(productos);*/


                   System.out.println("DIGITA EL ID: ");
                   diccionario.put("ID",keyEntry.nextInt());

                   System.out.println("DIGITA EL PRECIO: ");
                   diccionario.put("PRECIO",keyEntry.nextInt());

                   System.out.println("DIGITA EN NOMBRE DEL PRODUCTO");
                   keyEntry.nextLine();
                   diccionario.put("NOMBRE",keyEntry.nextLine());
                   System.out.println(diccionario);

                   productos.add(diccionario);
                   }


               else if(menuOption==2){
                   System.out.println("mostrando el inventario...");
                   System.out.println(productos);
               }
               else if(menuOption==3){
                   System.out.println("modificando un producto...");
               }
               else if(menuOption==4){
                   System.out.println("eliminando el producto de el inventario...");
               }
               else if(menuOption==5){
                   System.out.println("gracias por usar nuestra app");
               }
               System.out.println("ahora digite otra opcion: ");
               menuOption=keyEntry.nextInt();

           }catch(Exception error){
               System.out.println(error.getMessage());
           }
        }
        //PROCESO 2

        //PROCESO 3

        //SALIDAS

    }
}
