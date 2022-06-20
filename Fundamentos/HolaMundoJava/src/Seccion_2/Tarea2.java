package Seccion_2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Mazo
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola =  new Scanner(System.in);
        
        System.out.println("Titulo del libro: ");
        String tituloLibro = consola.nextLine();
        
        System.out.println("Autor del libro: ");
        String autorLibro = consola.nextLine();
        
        System.out.println(tituloLibro + " fue escrito por: " + autorLibro);
    }
    
}
