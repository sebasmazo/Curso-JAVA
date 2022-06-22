/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seccion_11;

import Seccion_7.Persona;

/**
 *
 * @author Mazo
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.apellido = "Mazo Velez";
        persona1.nombre = "Sebastian";
        System.out.println("persona1 = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("persona1 = " + persona1.nombre);
    }
    public static void cambiarValor(Persona persona){ //Se cambia el valor, debido a que persona hace referencia al espacio de memoria, no una copia
        persona.nombre = "Juan Carlos";
    }
}
