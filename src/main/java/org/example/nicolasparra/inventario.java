package org.example.nicolasparra;

import java.util.Scanner;

public class inventario {
    public static void main(String[] args) {
        //ENTRADAS

        Scanner keyEntry = new Scanner(System.in);
        Integer menuOption=null;
        String ANSI_AZUL = "\u001B[34m";
        String RESET = "\u001B[0m";
        String ANSI_VERDE = "\u001B[32m";



        //1. Proceso --> Menu de opciones


        System.out.println(ANSI_AZUL+"\n*********************************");
        System.out.println("***********APP URIBE*************");
        System.out.println("*********************************"+RESET);

        System.out.println(ANSI_VERDE + "\n👕 Bienvenido al gestor de prendas");
        System.out.println("¿Qué quieres realizar? ");
        System.out.println("1️⃣ - 💾 Guardar una prenda en BD");
        System.out.println("2️⃣ - 📦 Mostrar el inventario de prendas");
        System.out.println("3️⃣ - ✏️ Modificar los datos de una prenda");
        System.out.println("4️⃣ - 🗑️ Eliminar una prenda del sistema");
        System.out.println("5️⃣ - ❌ Presiona 5 para SALIR" + RESET);
        menuOption = keyEntry.nextInt();
        while(menuOption!=5) {

        }
        }
    }

