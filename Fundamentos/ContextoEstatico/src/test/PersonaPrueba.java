/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import domain.Persona;

/**
 *
 * @author Mazo
 */
public class PersonaPrueba {
    //El contexto estatico no puede acceder al dinamico pero sí al revés
    
    private int contador; //Solo se puede acceder a esta variable en un contexto dinamico
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Desde un contexto estatico solo se pueden llamar metodos estaticos
        // TODO code application logic here
        Persona persona1 = new Persona("Sebastian");
        System.out.println(persona1.toString());
        Persona persona2 = new Persona("Jose");
        System.out.println(persona2.toString());
        Persona persona3 = new Persona("Andres");
        System.out.println(persona3.toString());
        imprimir(persona3); //Si imprimir no fuera estatico: non-static method imprimir(Persona) cannot be referenced from a static context
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    public int getContador(){
        return this.contador;
    }
}
