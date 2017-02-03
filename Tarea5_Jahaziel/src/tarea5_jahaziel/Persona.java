package tarea5_jahaziel;

public class Persona {
    protected String nombre, cargo;
    protected int identidad, edad;

    public Persona() {
    }

    public Persona(String nombre, String cargo, int identidad, int edad) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.identidad = identidad;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cargo=" + cargo + ", identidad=" + identidad + ", edad=" + edad + '}';
    }
    
    
    
    
    
}
