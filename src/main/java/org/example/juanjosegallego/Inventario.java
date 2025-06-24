package org.example.juanjosegallego;

import java.util.*;

public class Inventario {
    public static void main(String[] args) {

        //ENTRADAS
        Scanner keyEntry = new Scanner(System.in);
        Integer menuOption=null;
        ArrayList<HashMap<String,Object>> products = new ArrayList<>();
        String product ;
        String colorVerde="\u001B[32m";

        boolean entradaValida = false;


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
        //while (!entradaValida || menuOption!=5) {
            //try {
                System.out.println("\nApreciado usuario, digite una opcion");
                menuOption = keyEntry.nextInt();
                entradaValida = true;
            //} catch (InputMismatchException e) {
                //System.out.println("¡Error! Debes ingresar un número entero.");
                //keyEntry.nextLine();
            //}
        //}


        while(true){
            HashMap<String,Object> diccionario = new HashMap<>();
                try {
                    //Evaluar las condiciones del menu
                    if(menuOption==1){
                        //System.out.println("\nGuarda un producto en el inventario...");
                        //System.out.println("\nDigita el producto el cual se quiera registrar: ");
                        //keyEntry.nextLine();
                        //products.add(keyEntry.nextLine());

                        //creando objetos/diccionarios/hashmaps en java

                        //llenando un diccionario
                        System.out.println("Digita el id de la prenda");
                        diccionario.put("id", keyEntry.nextInt());
                        System.out.println("Digita el precio de la prenda");
                        diccionario.put("precio", keyEntry.nextInt());
                        System.out.println("Digita el nombre de la prenda");
                        keyEntry.nextLine();
                        diccionario.put("nombre", keyEntry.nextLine());
                        //llenando una lista con un diccionario
                        products.add(diccionario);

                        System.out.println(diccionario);
                        System.out.println(products);


                    } else if (menuOption==2) {
                        System.out.println("\nMostrando el inventario...");
                        System.out.println(products);
                    } else if (menuOption==3) {
                        System.out.println("\nModificando un producto...");
                    } else if (menuOption==4) {
                        System.out.println("\nEliminar un producto del invetario...s");
                    } else if (menuOption==5) {
                        System.out.println("\nGracias por utilizar nuestra app...");
                        break;
                    }

                    System.out.println("\nAhora digita otra opcion: ");
                    menuOption = keyEntry.nextInt();

                }catch (Exception error){
                    //Captar el error de el proceso del ciclo
                    System.out.println(error.getMessage());

                }

            }
        }

        //PROCESO 2

        //PROCESO 3

        //SALIDAS

    }

