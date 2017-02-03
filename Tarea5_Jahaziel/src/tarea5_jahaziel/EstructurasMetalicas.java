package tarea5_jahaziel;


public class EstructurasMetalicas {
    private int peso, material;

    public EstructurasMetalicas() {
        
    }

    public EstructurasMetalicas(int peso, int material) {
        this.peso = peso;
        this.material = material;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "EstructurasMetalicas{" + "peso=" + peso + ", material=" + material + '}';
    }
       
    
}
