package tarea5_jahaziel;

import java.sql.Time;

public class Boleto {
    private int hora_llegada, hora_partida;
    private String destino;
    private ferrocarril fer;

    public Boleto() {
    }

    public Boleto(int hora_llegada, int hora_partida, String destino, ferrocarril fer) {
        this.hora_llegada = hora_llegada;
        this.hora_partida = hora_partida;
        this.destino = destino;
        this.fer = fer;
    }

    public int getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(int hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public int getHora_partida() {
        return hora_partida;
    }

    public void setHora_partida(int hora_partida) {
        this.hora_partida = hora_partida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public ferrocarril getFer() {
        return fer;
    }

    public void setFer(ferrocarril fer) {
        this.fer = fer;
    }

    @Override
    public String toString() {
        return "Boleto{" + "hora_llegada=" + hora_llegada + ", hora_partida=" + hora_partida + ", destino=" + destino + ", fer=" + fer + '}';
    }
    
    
    
    
}
