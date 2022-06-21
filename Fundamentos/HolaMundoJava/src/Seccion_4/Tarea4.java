package Seccion_4;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Mazo
 */
public class Tarea4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola = new Scanner(System.in);
        
        //Input
        System.out.println("Ingrese altura del rectangulo: ");
        int alturaRectangulo =  Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese ancho del rectangulo: ");
        int anchoRectangulo =  Integer.parseInt(consola.nextLine());
        
        //Logica
        
        if( alturaRectangulo > 0){
            if(anchoRectangulo>0){
                int areaRectangulo = alturaRectangulo * anchoRectangulo;
                int perimetroRectangulo = (alturaRectangulo + anchoRectangulo)*2;
                
                
                //Output
                System.out.println("Area: " + areaRectangulo);
                System.out.println("Perimetro: " + perimetroRectangulo);
            }else{
                System.out.println("Error: El ancho debe ser mayor a 0");
            }
        }else{
            System.out.println("Error: La altura debe ser mayor a 0");
        }
        
        
    }
    
}
