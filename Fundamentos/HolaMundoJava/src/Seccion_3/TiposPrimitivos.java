/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Seccion_3;

/**
 *
 * @author Mazo
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
        Tipos primitivos enteros: byte, short, int, long
        Tipos primitivos flotantes:  float, double
         */
        System.out.println("Valor minimo tipo short : " + Short.MIN_VALUE);
        System.out.println("Valor maximo tipo short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo tipo int : " + Integer.MIN_VALUE);
        System.out.println("Valor maximo tipo int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo tipo long : " + Long.MIN_VALUE);
        System.out.println("Valor maximo tipo long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo tipo float : " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);
        System.out.println("Valor minimo tipo double : " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);
        
        //En inferencia de tipos con var, se puede poner que un numero sea float poniendo una F al final del numero var x = 10.0F
        //char sirve para imprimir caracteres unicode. Ejemplo: char caracter = '\u0021'; == !
        //Guardar un char en una variable int guarda el codigo unicode
        int x = 'a';
        System.out.println("x = " + x);
    }
    
}
