/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Mazo
 */
public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(double sueldo, String nombre) { //super sirve para inicializar la clase padre
        super(nombre);
        this.sueldo = sueldo;
        this.idEmpleado = Empleado.contadorEmpleado++;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
}
