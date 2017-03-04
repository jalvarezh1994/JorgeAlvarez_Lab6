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
public class Persona {

    protected String Nombre;
    protected String ID;
    protected int Edad;
    protected String Nacionalidad;
    protected String LugarDeNacimiento;
    protected DefaultTreeModel ArbolGenealogico;
    protected Color ColorDePiel;
    protected ArrayList<Familiar> Familiares = new ArrayList();

    public Persona() {
    }

    public Persona(int Edad, String ID, String Nacionalidad, String LugarDeNacimiento, String Nombre, DefaultTreeModel ArbolGenealogico, Color ColorDePiel) {
        this.Edad = Edad;
        this.ID = ID;
        this.Nacionalidad = Nacionalidad;
        this.LugarDeNacimiento = LugarDeNacimiento;
        this.Nombre = Nombre;
        this.ArbolGenealogico = ArbolGenealogico;
        this.ColorDePiel = ColorDePiel;
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

    public DefaultTreeModel getArbolGenealogico() {
        return ArbolGenealogico;
    }

    public void setArbolGenealogico(DefaultTreeModel ArbolGenealogico) {
        this.ArbolGenealogico = ArbolGenealogico;
    }

    public Color getColorDePiel() {
        return ColorDePiel;
    }

    public void setColorDePiel(Color ColorDePiel) {
        this.ColorDePiel = ColorDePiel;
    }

    public ArrayList<Familiar> getFamiliares() {
        return Familiares;
    }

    public void setFamiliares(ArrayList<Familiar> Familiares) {
        this.Familiares = Familiares;
    }

    @Override
    public String toString() {
        return Nombre;
    }

}
