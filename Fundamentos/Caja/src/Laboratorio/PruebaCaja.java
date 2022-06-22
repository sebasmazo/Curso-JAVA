package Laboratorio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mazo
 */
public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja = new Caja(3,2,6);
        Caja caja2 = new Caja();
        caja2.setAncho(3);
        caja2.setAlto(2);
        caja2.setProfundo(6);
        int volCaja2 = caja2.calcularVolumen();
        System.out.println("volCaja2 = " + volCaja2);
        int volCaja = caja.calcularVolumen();
        System.out.println("volCaja = " + volCaja);
    }
}
