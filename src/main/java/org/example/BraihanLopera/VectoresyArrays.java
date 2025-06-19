package org.example.BraihanLopera;
import java.awt.*;
import java.util.Scanner;
public class VectoresyArrays {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String Rojo = "\u001B[31m";
        String Reset = "\u001B[0m";
        Integer OpcionMenu = null;
        System.out.println(Rojo + "texto rojo" + Reset);
        System.out.print("1 para ver el menu:");
        OpcionMenu = sc.nextInt();

        while(OpcionMenu != 5){
            try{
                //Evaluar las condiciones del menu
                System.out.println("Opcion 1");
                System.out.println("Opcion 2");
                System.out.println("Opcion 3");
                System.out.print("Tu eleccion:");
                OpcionMenu = sc.nextInt();
                if(OpcionMenu == 1){
                    System.out.println("Elegiste la opcion 1");
                }else if (OpcionMenu == 2){
                    System.out.println("Elegiste la ocpion 2");
                }else if(OpcionMenu == 3){
                    System.out.println("Elegiste la opcion 3");
                }
            }catch(Exception error){
                System.out.println("Opcion incorrecta");
            }

        }
    }
}
