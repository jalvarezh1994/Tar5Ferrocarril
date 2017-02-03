package tarea5_jahaziel;

public class Motores {
    protected int Nserie;
    protected String fabricante;
    protected String tipo;

    public Motores() {
    }

    public Motores(int Nserie, String fabricante, String tipo) {
        this.Nserie = Nserie;
        this.fabricante = fabricante;
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getNserie() {
        return Nserie;
    }

    public void setNserie(int Nserie) {
        this.Nserie = Nserie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Motores{" + "Nserie=" + Nserie + ", fabricante=" + fabricante + '}';
    }
    
    
    
    
}
