package org.example.BraihanLopera;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
public class VectoresyArrays {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        /*Colores*/
        String Rojo = "\u001B[31m";
        String Verde = "\u001B[32m";
        String Reset = "\u001B[0m";

        /*ArrayList*/
        ArrayList<HashMap<String,Object>> productos = new ArrayList<>();

        /*diccionario/objeto7hasmaps en java*/
        HashMap<String, Object> diccionary = new HashMap<>(); /*String: todas las entradas seran palabras Integer:Los valores seran enteros*/

        //llenando un diccionario
        System.out.print("Id del producto:");
        diccionary.put("ID", sc.nextInt());
        sc.nextLine();
        System.out.print("Nombre del producto: ");
        diccionary.put("Nombre del producto:", sc.nextLine());
        System.out.print("Por ultimo, el precio del producto: ");
        diccionary.put("Precio", sc.nextLine());
        System.out.print("Listo, tu producto es: " + diccionary);
        productos.add(diccionary);
        System.out.println(productos);








    }
}
