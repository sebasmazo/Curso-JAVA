/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domain;

/**
 *
 * @author Mazo
 */
public class Persona {

    private int idPersona;
    private String nombre;
    private static int contadorPersonas; //Static referencia a la clase y no a los objetos

    public Persona(String nombre) {
        setNombre(nombre);
        //Incrementar contador por cada objeto nuevo creado
        setContadorPersonas(); //Forma recomendada para acceder a atributos estaticos
        setIdPersona(getContadorPersonas());
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    private static void setContadorPersonas() {
        contadorPersonas++;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
}
