/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Cliente;
import domain.Empleado;

/**
 *
 * @author Mazo
 */
public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(200000.00,"Sebastian");
        System.out.println("empleado1 = " + empleado1);
        Empleado empleado2 = new Empleado(350000.00, "Ana");
        System.out.println("empleado2 = " + empleado2);
        
        Cliente cliente1 = new Cliente(false, "Sebastian", 'M',20,"Cra 80 #40-40");
        System.out.println("cliente1 = " + cliente1);
    }
}
