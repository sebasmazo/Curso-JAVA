/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seccion_11;

/**
 *
 * @author Mazo
 */
public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        x = cambiarValor(15);
        System.out.println("x = " + x);
        
    }
    public static int cambiarValor(int arg1){
        return arg1;
    }
}
