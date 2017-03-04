/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarez_lab6;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ofici
 */
class Venta {

    private ArrayList<Articulo> Articulos = new ArrayList();
    private Cliente ClienteDeVenta;
    private Empleado Atendente;
    private int CantidadDeArticulos;
    private float Total;
    private Date FechaDeLaOrden;

    public Venta() {
    }

    public Venta(Cliente ClienteDeVenta, Empleado Atendente, int CantidadDeArticulos, float Total, Date FechaDeLaOrden) {
        this.ClienteDeVenta = ClienteDeVenta;
        this.Atendente = Atendente;
        this.CantidadDeArticulos = CantidadDeArticulos;
        this.Total = Total;
        this.FechaDeLaOrden = FechaDeLaOrden;
    }

    public ArrayList<Articulo> getArticulos() {
        return Articulos;
    }

    public void setArticulos(ArrayList<Articulo> Articulos) {
        this.Articulos = Articulos;
    }

    public Cliente getClienteDeVenta() {
        return ClienteDeVenta;
    }

    public void setClienteDeVenta(Cliente ClienteDeVenta) {
        this.ClienteDeVenta = ClienteDeVenta;
    }

    public Empleado getAtendente() {
        return Atendente;
    }

    public void setAtendente(Empleado Atendente) {
        this.Atendente = Atendente;
    }

    public int getCantidadDeArticulos() {
        return CantidadDeArticulos;
    }

    public void setCantidadDeArticulos() {
        this.CantidadDeArticulos = Articulos.size();
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal() {
        this.Total=0;
        for (int i = 0; i < Articulos.size(); i++) {
            this.Total += Articulos.get(i).getPrecio();
        }
    }

    public Date getFechaDeLaOrden() {
        return FechaDeLaOrden;
    }

    public void setFechaDeLaOrden(Date FechaDeLaOrden) {
        this.FechaDeLaOrden = FechaDeLaOrden;
    }

    @Override
    public String toString() {
        return "Orden{" + "Articulos=" + Articulos + ", ClienteDeVenta=" + ClienteDeVenta + ", Atendente=" + Atendente + ", CantidadDeArticulos=" + CantidadDeArticulos + ", Total=" + Total + ", FechaDeLaOrden=" + FechaDeLaOrden + '}';
    }

}
