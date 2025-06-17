package org.example.BraihanLopera;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Ejemplojavamenu{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String opcion = "";
        int OpcionMenu = 0;
        String Rojo = "\u001B[1;31m";
        String Azul = "\u001B[1;34m";
        String Verde = "\u001B[1;32m";
        String Ramdom = "\u001B[36m";
        String FondoRojo = "\u001B[41m";
        String Reset = "\u001B[0m";
        System.out.println(Rojo +  " ██████████ "+ Reset + Azul + " █████████ " + Reset + Verde +" █████████ " + Reset);
        System.out.println(Rojo +  " ██         "+ Reset + Azul + " ██        " + Reset + Verde +" ██     ██ " + Reset);
        System.out.println(Rojo +  " ██         "+ Reset + Azul + " ██        " + Reset + Verde +" ██     ██ " + Reset);
        System.out.println(Rojo +  " ██  ██████ "+ Reset + Azul + " ██        " + Reset + Verde +" ██     ██ " + Reset);
        System.out.println(Rojo +  " ██      ██ "+ Reset + Azul + " ██        " + Reset + Verde +" ██     ██ " + Reset);
        System.out.println(Rojo +  " ██████████ "+ Reset + Azul + " █████████ " + Reset + Verde +" █████████ " + Reset);
        System.out.println("¡Bienvenido a GCO!");
        System.out.print("Deseas ver nuestro menu? (SI/NO):");
        opcion = sc.nextLine();

        if(opcion.equals("SI")){
            System.out.println("Bienvenido a nuestro menu.\nEstas son nuestras ocpiones:\n1.Tipos de prendas \n2. Ver todo el catalogo de ropa \n3. Buscar una prenda en especifico");
        }

    }
}
