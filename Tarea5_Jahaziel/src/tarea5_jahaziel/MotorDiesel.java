package tarea5_jahaziel;

public class MotorDiesel extends Motores{
    protected int ConsumoC, CantcarrosMov;

    public MotorDiesel() {
        super();
    }

    public MotorDiesel(int ConsumoC, int CantcarrosMov, int Nserie, String fabricante,String tipo) {
        super(Nserie, fabricante, tipo);
        this.ConsumoC = ConsumoC;
        if (CantcarrosMov<=60&&CantcarrosMov>0){
            this.CantcarrosMov = CantcarrosMov;
        }
    }

    public int getConsumoC() {
        return ConsumoC;
    }

    public void setConsumoC(int ConsumoC) {
        this.ConsumoC = ConsumoC;
    }

    public int getCantcarrosMov() {
        return CantcarrosMov;
    }

    public void setCantcarrosMov(int CantcarrosMov) {
        if (CantcarrosMov<=60&&CantcarrosMov>0){
            this.CantcarrosMov = CantcarrosMov;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"MotorDiesel{" + "ConsumoC=" + ConsumoC + ", CantcarrosMov=" + CantcarrosMov + '}';
    }
    
    
    
    
    
    
    
    
    
}
