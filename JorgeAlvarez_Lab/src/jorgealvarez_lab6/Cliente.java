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
public class Cliente extends Persona {

    private int Ticket;
    private float Dinero;
    private ArrayList<Venta> Ordenes = new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(int Ticket, float Dinero) {
        this.Ticket = Ticket;
        this.Dinero = Dinero;
    }

    public Cliente(int Ticket, float Dinero, int Edad, String ID, String Nacionalidad, String LugarDeNacimiento, String Nombre, DefaultTreeModel ArbolGenealogico, Color ColorDePiel) {
        super(Edad, ID, Nacionalidad, LugarDeNacimiento, Nombre, ArbolGenealogico, ColorDePiel);
        this.Ticket = Ticket;
        this.Dinero = Dinero;
    }

    public int getTicket() {
        return Ticket;
    }

    public void setTicket(int Ticket) {
        this.Ticket = Ticket;
    }

    public float getDinero() {
        return Dinero;
    }

    public void setDinero(float Dinero) {
        this.Dinero = Dinero;
    }

    public ArrayList<Venta> getOrdenes() {
        return Ordenes;
    }

    public void setOrdenes(ArrayList<Venta> Ordenes) {
        this.Ordenes = Ordenes;
    }

    @Override
    public String toString() {
        return Nombre;
    }

}
