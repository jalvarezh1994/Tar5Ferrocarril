package tarea5_jahaziel;

import java.util.ArrayList;

public class ferrocarril {
    private int Nserie;
    private String Nombre;
    private ArrayList <Carros> c = new ArrayList();
    private Motores m;
    private ArrayList <Persona> p = new ArrayList<>();

    public ferrocarril() {
    }

    public ferrocarril(int Nserie, String Nombre, Motores m) {
        this.Nserie = Nserie;
        this.Nombre = Nombre;
        this.m = m;
    }

    public int getNserie() {
        return Nserie;
    }

    public void setNserie(int Nserie) {
        this.Nserie = Nserie;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Carros> getC() {
        return c;
    }

    public void setC(ArrayList<Carros> c) {
        this.c = c;
    }

    public Motores getM() {
        return m;
    }

    public void setM(Motores m) {
        this.m = m;
    }

    public ArrayList<Persona> getP() {
        return p;
    }

    public void setP(ArrayList<Persona> p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "ferrocarril{" + "Nserie=" + Nserie + ", Nombre=" + Nombre + ", c=" + c + ", m=" + m + ", p=" + p + '}';
    }
    
    
    
    
    
    
}
