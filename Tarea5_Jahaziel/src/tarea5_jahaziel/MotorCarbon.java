package tarea5_jahaziel;

public class MotorCarbon extends Motores {
    protected int capacidad, velocidad;

    public MotorCarbon() {
        super();
    }

    public MotorCarbon(int capacidad, int velocidad, int Nserie, String fabricante, String tipo) {
        super(Nserie, fabricante, tipo);
        this.capacidad = capacidad;
        if (velocidad<=600&&velocidad>0){
            this.velocidad = velocidad;
        }
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad<=600&&velocidad>0){
            this.velocidad = velocidad;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"MotorCarbon{" + "capacidad=" + capacidad + ", velocidad=" + velocidad + '}';
    }

    
}
