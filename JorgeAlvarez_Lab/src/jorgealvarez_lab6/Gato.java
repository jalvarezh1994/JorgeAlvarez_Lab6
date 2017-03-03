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
public class Gato extends Articulo {

    private float Altura, Peso;

    public Gato() {
        super();
    }

    public Gato(float Altura, float Peso, float Precio) {
        super(Precio);
        this.Altura = Altura;
        this.Peso = Peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Gato{" + "Altura=" + Altura + ", Peso=" + Peso + '}';
    }

}
