package org.example.juanjosegallego;

import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

public class Inventario {
    public static void main(String[] args) {

        //ENTRADAS

        Vector<Vector<Object>> baseDeDatos = new Vector<>();
        Scanner keyEntry = new Scanner(System.in);
        Integer menuOption=0, contador = 0;
        String colorVerde="\u001B[32m";
        String reset="\u001B[0m";


        //PROCESO 1 (Crear el menu de opciones)
        System.out.println("\n*********************");
        System.out.println("***** Uribe APP *****");
        System.out.println("*********************");

        System.out.println("\n👕 Bienvenido a gestor de prendas...\n");
        System.out.println("¿Qué quieres realizar?");
        System.out.println(colorVerde+"1️⃣  Guardar una prenda en BD 📝");
        System.out.println("2️⃣  Mostrar el inventario de prendas 📦");
        System.out.println("3️⃣  Modificar los datos de una prenda ✏️");
        System.out.println("4️⃣  Eliminar una prenda del sistema 🗑️");
        System.out.println("5️⃣  Presiona 5 para SALIR ❌");

        System.out.println(reset+"\nopcion:");

        try {
            menuOption = keyEntry.nextInt();
            keyEntry.nextLine();
            while(menuOption!=5){

                if(menuOption == 1){
                    Vector<Object> prendas = new Vector<>();

                    System.out.println("introduzca el nombre de la prenda:");
                    String nombrePrenda = keyEntry.nextLine();
                    System.out.println("introduzca el color de la prenda:");
                    String colorPrenda = keyEntry.nextLine();
                    System.out.println("introduzca la talla de la prenda:");
                    String tallaPrenda = keyEntry.nextLine();

                    prendas.add(contador);
                    prendas.add(nombrePrenda);
                    prendas.add(colorPrenda);
                    prendas.add(tallaPrenda);

                    baseDeDatos.add(prendas);

                    System.out.println("prenda agregada exitosamente");
                    System.out.println(baseDeDatos);

                    contador++;

                } else if (menuOption == 2) {

                } else if (menuOption == 3) {

                } else if (menuOption == 4) {

                } else if (menuOption == 5) {

                }else throw new Exception();

                System.out.println("preciona enter para continuar.");
                keyEntry.nextLine();
                System.out.println("¿Qué quieres realizar?");
                System.out.println(colorVerde+"1️⃣  Guardar una prenda en BD 📝");
                System.out.println("2️⃣  Mostrar el inventario de prendas 📦");
                System.out.println("3️⃣  Modificar los datos de una prenda ✏️");
                System.out.println("4️⃣  Eliminar una prenda del sistema 🗑️");
                System.out.println("5️⃣  Presiona 5 para SALIR ❌");
                System.out.println(reset+"\nopcion:");
                menuOption = keyEntry.nextInt();
                keyEntry.nextLine();

        }
        }catch (Exception error){

            System.out.println("revisa!, lo escrito no es una opcion");

        }
        //PROCESO 2

        //PROCESO 3

        //SALIDAS

    }
}
