package org.example.juanjosegallego;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {

        //ENTRADAS
        Scanner keyEntry = new Scanner(System.in);
        Integer menuOption=null;
        String colorVerde="\u001B[32m";


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
        while(menuOption!=5){
            try {
                if(menuOption==1){
                    ArrayList  <String> productos = new ArrayList();;
                }else if(menuOption==2){

                }else if(menuOption==3){

                }else if(menuOption==4){

                }else if(menuOption==5){

                }
            }
            catch(Exception error) {
                System.out.println("error, opción no valida, solo 1 a 5");
            }
        }

        //PROCESO 2

        //PROCESO 3

        //SALIDAS

    }
}
