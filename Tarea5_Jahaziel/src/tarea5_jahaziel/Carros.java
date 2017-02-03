package tarea5_jahaziel;

public class Carros {
    private String funcion;
    private int capacidad, longitud, altura;
    private EstructurasMetalicas estructuraM; 
    public Carros() {
    }

    public Carros(String funcion, int capacidad, int longitud, int altura, EstructurasMetalicas estructuraM) {
        this.funcion = funcion;
        this.capacidad = capacidad;
        this.longitud = longitud;
        this.altura = altura;
        this.estructuraM=estructuraM;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public EstructurasMetalicas getEstructuraM() {
        return estructuraM;
    }

    public void setEstructuraM(EstructurasMetalicas estructuraM) {
        this.estructuraM = estructuraM;
    }

    @Override
    public String toString() {
        return "Carros{" + "funcion=" + funcion + ", capacidad=" + capacidad + 
                ", longitud=" + longitud + ", altura=" + altura + ", estructuraM=" + 
                estructuraM + '}';
    }
    
    
    
    
    
}
