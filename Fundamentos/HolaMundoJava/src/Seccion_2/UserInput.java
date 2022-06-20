package Seccion_2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mazo
 */
public class UserInput {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre: ");
        
        Scanner consola = new Scanner(System.in);
        var nombreUsuario =  consola.nextLine();
        System.out.println("usuario = " + nombreUsuario);
        
        System.out.println("Edad: ");
        var edadUsuario = consola.nextInt();
        System.out.println("edadUsuario = " + edadUsuario);
        
        System.out.println("Titulo del usuario:");
        var tituloUsuario = consola.next();
        System.out.println("tituloUsuario = " + tituloUsuario);
        
        System.out.println(tituloUsuario + ": " + nombreUsuario + ", " + edadUsuario);
    }
}
