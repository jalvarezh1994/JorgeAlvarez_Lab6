/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarez_lab6;

/**
 *
 * @author ofici
 */
public class Empleado extends Persona {

    private String SeccionDeTrabajo;
    private int HoraDeLlegada, HoraDeSalida;
    private float Sueldo;
    private String Estado;

    public Empleado() {
        super();
    }

    public Empleado(String SeccionDeTrabajo, int HoraDeLlegada, int HoraDeSalida, float Sueldo, String Estado) {
        setSeccionDeTrabajo(SeccionDeTrabajo);
        this.HoraDeLlegada = HoraDeLlegada;
        this.HoraDeSalida = HoraDeSalida;
        this.Sueldo = Sueldo;
        setEstado(Estado);
    }

    public String getSeccionDeTrabajo() {
        return SeccionDeTrabajo;
    }

    public void setSeccionDeTrabajo(String SeccionDeTrabajo) {
        if (SeccionDeTrabajo.equalsIgnoreCase("Cocina")
                || SeccionDeTrabajo.equalsIgnoreCase("Venta de gatos")
                || SeccionDeTrabajo.equalsIgnoreCase("Venta de baleadas")) {
            this.SeccionDeTrabajo = SeccionDeTrabajo;
        }
    }

    public int getHoraDeLlegada() {
        return HoraDeLlegada;
    }

    public void setHoraDeLlegada(int HoraDeLlegada) {
        this.HoraDeLlegada = HoraDeLlegada;
    }

    public int getHoraDeSalida() {
        return HoraDeSalida;
    }

    public void setHoraDeSalida(int HoraDeSalida) {
        this.HoraDeSalida = HoraDeSalida;
    }

    public float getSueldo() {
        return Sueldo;
    }

    public void setSueldo(float Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        if (Estado.equalsIgnoreCase("Disponible") || Estado.equalsIgnoreCase("Ocupado")) {
            this.Estado = Estado;
        }
    }

    @Override
    public String toString() {
        return Nombre;
    }

}
