/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Seccion_3;

import java.util.Scanner;

/**
 *
 * @author Mazo
 */
public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        //Input
        System.out.println("Nombre libro:");
        var nombreLibro = consola.nextLine();
        System.out.println("ID Libro: ");
        var idLibro = Integer.parseInt(consola.nextLine());
        System.out.println("Precio libro: ");
        var precioLibro = Double.parseDouble(consola.nextLine());
        System.out.println("Envio gratuito: ");
        var envioLibro = Boolean.parseBoolean(consola.nextLine());

        //Output
        System.out.println(nombreLibro + " #" + idLibro);
        System.out.println("Precio: " + '\u0024' + precioLibro);
        System.out.println("Envio: " + envioLibro);
    }

}
