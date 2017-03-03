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
class Articulo {

    float Precio;

    public Articulo() {
    }

    public Articulo(float Precio) {
        this.Precio = Precio;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Articulo{" + "Precio=" + Precio + '}';
    }

}
