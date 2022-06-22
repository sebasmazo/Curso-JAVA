/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

/**
 *
 * @author Mazo
 */
public class Aritmetica {
    //Atributos de la clase
    private int a;
    private int b;
    
    /**
     * @return the a
     */
    public int getA() {
        return a;
    }
    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }
    /**
     * @return the b
     */
    public int getB() {
        return b;
    }
    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }
    
    
    //Constructor vacio
    public Aritmetica(){
        
    }
    //Constructor con argumentos
    public Aritmetica(int n1, int n2){
        this.setA(n1);
        this.setB(n2);
    }
    
    public void sumar(int a,int b){
        this.setA(a);
        this.setB(b);
        int resultado = this.getA()+this.getB();
        System.out.println("resultado = " + resultado);
    }
    public int restar(){
        return this.getA()-this.getB();
    }
    
    
}
