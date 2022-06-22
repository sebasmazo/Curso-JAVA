/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio;

/**
 *
 * @author Mazo
 */
public class Caja {
    private int ancho, alto, profundo;
    
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public int getAlto() {
        return alto;
    }
    public void setAlto(int alto) {
        this.alto = alto;
    }
    public int getProfundo() {
        return profundo;
    }
    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }
    
    //Constructor vacio
    public Caja(){
        System.out.println("Caja inicializada");
    }
    //Sobrecarga con args
    public Caja(int ancho, int alto, int profundo){
        setAncho(ancho);
        setAlto(alto);
        setProfundo(profundo);
    }
    
    public int calcularVolumen(){
        return (this.ancho * this.alto * this.profundo);
    }
}
