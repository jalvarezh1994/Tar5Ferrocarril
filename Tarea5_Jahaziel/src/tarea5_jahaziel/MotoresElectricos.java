package tarea5_jahaziel;

public class MotoresElectricos extends Motores{
        private int CantCarros, Tcarga;

    public MotoresElectricos() {
        super();
    }

    public MotoresElectricos(int CantCarros, int Tcarga, int Nserie, String fabricante, String tipo) {
        super(Nserie, fabricante, tipo);
        if (CantCarros<=100&&CantCarros>0){
            this.CantCarros = CantCarros;
        }
        this.Tcarga = Tcarga;
    }

    public int getCantCarros() {
        return CantCarros;
    }

    public void setCantCarros(int CantCarros) {
        this.CantCarros = CantCarros;
    }

    public int getTcarga() {
        return Tcarga;
    }

    public void setTcarga(int Tcarga) {
        this.Tcarga = Tcarga;
    }

    @Override
    public String toString() {
        return super.toString()+"MotoresElectricos{" + "CantCarros=" + CantCarros + ", Tcarga=" + Tcarga + '}';
    }

    
          
}
