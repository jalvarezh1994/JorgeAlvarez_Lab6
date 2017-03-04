/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarez_lab6;

import java.util.ArrayList;

/**
 *
 * @author ofici
 */
public class Baleada extends Articulo {

    ArrayList<String> Ingredientes = new ArrayList();

    public Baleada() {
        super();
    }

    public ArrayList<String> getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(ArrayList<String> Ingredientes) {
        this.Ingredientes = Ingredientes;
    }

    @Override
    public String toString() {
        return "Baleada L." + Precio;
    }
}
