/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarez_lab6;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author ofici
 */
public class Jefe extends Persona {

    private String SeccionDeTrabajo;
    private ArrayList<Empleado> Empleados = new ArrayList();
    private int ClientesAtendidos;
    private float GananciaTotal;

    public Jefe() {
        super();
    }

    public Jefe(String SeccionDeTrabajo, int ClientesAtendidos, float GananciaTotal) {
        this.SeccionDeTrabajo = SeccionDeTrabajo;
        this.ClientesAtendidos = ClientesAtendidos;
        this.GananciaTotal = GananciaTotal;
    }

    public Jefe(String SeccionDeTrabajo, int ClientesAtendidos, float GananciaTotal, int Edad, String ID, String Nacionalidad, String LugarDeNacimiento, String Nombre, DefaultTreeModel ArbolGenealogico, Color ColorDePiel) {
        super(Edad, ID, Nacionalidad, LugarDeNacimiento, Nombre, ArbolGenealogico, ColorDePiel);
        setSeccionDeTrabajo(SeccionDeTrabajo);
        this.ClientesAtendidos = ClientesAtendidos;
        this.GananciaTotal = GananciaTotal;
    }

    public String getSeccionDeTrabajo() {
        return SeccionDeTrabajo;
    }

    public void setSeccionDeTrabajo(String SeccionDeTrabajo) {
        if (SeccionDeTrabajo.equalsIgnoreCase("Venta de baleadas")||
                SeccionDeTrabajo.equalsIgnoreCase("Venta de gatos")||
                SeccionDeTrabajo.equalsIgnoreCase("Cocina")) {
            this.SeccionDeTrabajo = SeccionDeTrabajo;
        }
    }

    public ArrayList<Empleado> getEmpleados() {
        return Empleados;
    }

    public void setEmpleados(ArrayList<Empleado> Empleados) {
        this.Empleados = Empleados;
    }

    public int getClientesAtendidos() {
        return ClientesAtendidos;
    }

    public void setClientesAtendidos(int ClientesAtendidos) {
        this.ClientesAtendidos = ClientesAtendidos;
    }

    public float getGananciaTotal() {
        return GananciaTotal;
    }

    public void setGananciaTotal(float GananciaTotal) {
        this.GananciaTotal = GananciaTotal;
    }

    @Override
    public String toString() {
        return Nombre;
    }

}
