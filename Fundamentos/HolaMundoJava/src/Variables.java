/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mazo
 */
public class Variables {
    public static void main(String[] args) {
        int x = 0; //Variable primitiva de tipo entero
        System.out.println(x);
        x = 10; //Modificamos la variable
        System.out.println(x);
        
        String variableCadena = "Mi primera variable";
        System.out.println(variableCadena);
        variableCadena = "Modificado";
        System.out.println(variableCadena);
        
        //Inferencia de tipos en Java (var)
        var miCadenaInferencia = "Hola mundo";
        System.out.println("String: " + miCadenaInferencia); // Concatenar
    }
}
