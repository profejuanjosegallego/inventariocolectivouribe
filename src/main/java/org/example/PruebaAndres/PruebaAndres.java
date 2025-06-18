package org.example.PruebaAndres;
import java.util.Scanner;
public class PruebaAndres
{
        public static void main(String[] args)
        {
                //ENTRADAS
                Scanner keyEntry = new Scanner(System.in);
                Integer menuOption = null;
                String colorVerde = "\u001B[32m";
                //proceso 1 (CREAR EL MENU DE OPCIONES)
                System.out.println("\n*");
                System.out.println("💼 BIENVENIDO A URIBE APP - GESTOR DE PRENDAS");
                System.out.println("*\n");

                System.out.println(colorVerde + "📋 ¿Qué acción deseas realizar?");
                System.out.println("⿡  Crear una prenda en BD 🧥");
                System.out.println("⿢  Mostrar el inventario de prendas 📦");
                System.out.println("⿣  Modificar los datos de una prenda ✏");
                System.out.println("⿤  Eliminar una prenda 🗑");
                System.out.println("⿥  Salir de la aplicación 🚪");

                while (menuOption != 5)
                {
                    System.out.println("oe");
                 }
        }
}
