/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Seccion_4;

import java.util.Scanner;

/**
 *
 * @author Mazo
 */
public class Tarea5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola = new Scanner(System.in);
        
        //Input
        System.out.println("Ingrese nro 1: ");
        int n1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese nro 2: ");
        int n2 = Integer.parseInt(consola.nextLine());
        //Logica
        var res = (n1>n2) ? n1: n2; //Operador ternario***
        System.out.println("El numero mayor es: \n" + res);
        
//        if(n1>n2){
//            System.out.println("El numero mayor es: \n" + n1);
//        }else{
//            System.out.println("El numero mayor es: \n"  + n2);
//        }
    }
    
}
