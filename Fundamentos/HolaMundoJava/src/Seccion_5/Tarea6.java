/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Seccion_5;

import java.util.Scanner;

/**
 *
 * @author Mazo
 */
public class Tarea6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingrese la nota: ");
        double nota = Double.parseDouble(consola.nextLine());
        
        if(nota>=0 && nota<6){
            System.out.println("F");
        }else if(nota>=6 && nota<7){
            System.out.println("D");
        }else if(nota>=7 && nota<8){
            System.out.println("C");
        }else if(nota>=8 && nota<9){
            System.out.println("B");
        }else if(nota>=9 && nota<=10){
            System.out.println("A");
        }else{
            System.out.println("Valor desconocido");
        }
    }
    
}
