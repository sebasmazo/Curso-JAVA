/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

/**
 *
 * @author Mazo
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        //System.gc();
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.setA(20);
        aritmetica1.setB(10);
        aritmetica1.sumar(20,10);
        System.out.println("Resta: " + aritmetica1.restar());
        prueba("sebastian");
    }
    public static void prueba(String nombre){ //Para poder ser llamado en main tiene que ser static tambien
        System.out.println("Hola: " + nombre);
    }
}
