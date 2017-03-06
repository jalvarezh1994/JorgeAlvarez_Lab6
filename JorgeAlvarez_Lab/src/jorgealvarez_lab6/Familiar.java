/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarez_lab6;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author ofici
 */
class Familiar {

    protected String Nombre;
    protected String ID;
    protected int Edad;
    protected String Nacionalidad;
    protected String LugarDeNacimiento;
    protected Color ColorDePiel;

    private Familiar Padre;
    //private ArrayList<Familiar> Hijos = new ArrayList();

    public Familiar() {
        super();
    }

    public Familiar(int Edad, String ID, String Nacionalidad, String LugarDeNacimiento, String Nombre, Color ColorDePiel, Familiar Padre) {
        this.Edad = Edad;
        this.ID = ID;
        this.Nacionalidad = Nacionalidad;
        this.LugarDeNacimiento = LugarDeNacimiento;
        this.Nombre = Nombre;
        this.ColorDePiel = ColorDePiel;
        this.Padre = Padre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getLugarDeNacimiento() {
        return LugarDeNacimiento;
    }

    public void setLugarDeNacimiento(String LugarDeNacimiento) {
        this.LugarDeNacimiento = LugarDeNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Color getColorDePiel() {
        return ColorDePiel;
    }

    public void setColorDePiel(Color ColorDePiel) {
        this.ColorDePiel = ColorDePiel;
    }

    public Familiar getPadre() {
        return Padre;
    }

    public void setPadre(Familiar Padre) {
        this.Padre = Padre;
    }

    @Override
    public String toString() {
        return Nombre;
    }

}
