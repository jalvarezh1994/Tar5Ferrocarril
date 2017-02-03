/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.Scanner;

/**
 *
 * @author ofici
 */
public class Tarea2 {

    static String[][] tablero = new String[9][9];
    static boolean turno=true;
    // Se utiliza true para señalar turno de las piezas azules.
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        generaTablero();
        do {
            imprimeTablero(tablero);
            moverPieza();
            turno=!turno;
        } while (true);
    }

    static void generaTablero() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tablero[i][j] = "Espacio en blanco";
            }
        }
        tablero[0][0] = "Carro de Guerra R";
        tablero[0][1] = "Caballo R        ";
        tablero[0][2] = "Elefante R       ";
        tablero[0][3] = "Oficial R        ";
        tablero[0][4] = "General R        ";
        tablero[0][5] = "Oficial R        ";
        tablero[0][6] = "Elefante R       ";
        tablero[0][7] = "Caballo R        ";
        tablero[0][8] = "Carro de Guerra R";
        tablero[1][0] = "Soldado R        ";
        tablero[1][1] = "Cañón R          ";
        tablero[1][2] = "Soldado R        ";
        tablero[1][4] = "Soldado R        ";
        tablero[1][6] = "Soldado R        ";
        tablero[1][7] = "Cañón R          ";
        tablero[1][8] = "Soldado R        ";

        tablero[7][0] = "Soldado A        ";
        tablero[7][1] = "Cañón A          ";
        tablero[7][2] = "Soldado A        ";
        tablero[7][4] = "Soldado A        ";
        tablero[7][6] = "Soldado A        ";
        tablero[7][7] = "Cañón A          ";
        tablero[7][8] = "Soldado A        ";
        tablero[8][0] = "Carro de Guerra A";
        tablero[8][1] = "Caballo A        ";
        tablero[8][2] = "Elefante A       ";
        tablero[8][3] = "Oficial A        ";
        tablero[8][4] = "General A        ";
        tablero[8][5] = "Oficial A        ";
        tablero[8][6] = "Elefante A       ";
        tablero[8][7] = "Caballo A        ";
        tablero[8][8] = "Carro de Guerra A";
    }

    static void imprimeTablero(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    static void moverPieza() {
        boolean valido;
        String pieza;
        int[] m = new int[4];
        do {
            System.out.println("Ingrese la posición en i de la pieza que desea mover.");
            m[0] = validarValor();
            System.out.println("Ingrese la posición en j de la pieza que desea mover.");
            m[1] = validarValor();
            System.out.println("Ingrese la posición en i a la que desea mover la pieza.");
            m[2] = validarValor();
            System.out.println("Ingrese la posición en j a la que desea mover la pieza.");
            m[3] = validarValor();
            pieza = tablero[m[0]][m[1]];
            valido = validarMovimiento(pieza, m);
            
            if (turno) {
                if (!esAzul(m)) {
                    valido=false;
                }
            }
            if (!turno) {
                if (!esRojo(m)) {
                    valido=false;
                }
            }
            if (valido == false) {
                System.out.println("No es un movimiento válido.");
            }
        } while (valido == false);
        tablero[m[0]][m[1]] = "Espacio en blanco";
        tablero[m[2]][m[3]] = pieza;
    }

    static boolean esAzul(int m[]){
        boolean esazul;
        switch(tablero[m[0]][m[1]]){
            case "Soldado A        ":
            case "Caballo A        ":
            case "Elefante A       ":
            case "Oficial A        ":
            case "General A        ":
            case "Carro de Guerra A":
                esazul=true;
                break;
            default:
                esazul=false;
        }
        return esazul;
    }
    
    static boolean esRojo(int m[]){
        boolean esazul;
        switch(tablero[m[0]][m[1]]){
            case "Soldado R        ":
            case "Caballo R        ":
            case "Elefante R       ":
            case "Oficial R        ":
            case "General R        ":
            case "Carro de Guerra R":
                esazul=true;
                break;
            default:
                esazul=false;
        }
        return esazul;
    }
    
    static int validarValor() {
        int valor;
        do {
            System.out.println("Ingrese un número entre 0 y 8: ");
            valor = sc.nextInt();
            if (valor < 0 || valor > 8) {
                System.out.println("No es un numero válido.");
            }
        } while (valor < 0 || valor > 8);
        return valor;
    }

    static boolean validarMovimiento(String pieza, int[] m) {
        boolean valido;
        switch (pieza) {
            case "Soldado R        ":
                valido = soldadoR(m);
                break;
            case "Soldado A        ":
                valido = soldadoA(m);
                break;
            case "Caballo R        ":
            case "Caballo A        ":
                valido = caballo(m);
                break;
            case "Elefante A       ":
            case "Elefante R       ":
                valido = elefante(m);
                break;
            case "Oficial A        ":
            case "Oficial R        ":
                valido = oficial(m);
                break;
            case "General R        ":
            case "General A        ":
                valido = general(m);
                break;
            case "Carro de Guerra A":
            case "Carro de Guerra R":
                valido = carroDeGuerra(m);
                break;
            default:
                valido = false;
        }
        return valido;
    }

    static boolean esEnemiga(int[] m){
        boolean esenemiga=false;
        if (turno) {
            if (esRojo(m)) {
                esenemiga=true;
            }
        } else {
            if (esAzul(m)) {
                esenemiga=true;
            }
        }
        return esenemiga;
    }
    
    static boolean general(int[] m) {
        boolean validez = false;

        if (Math.abs(m[0] - m[2]) == 1 && Math.abs(m[1] - m[2]) == 0) {
            validez = true;
        }

        if (Math.abs(m[0] - m[2]) == 0 && Math.abs(m[1] - m[2]) == 1) {
            validez = true;
        }

        return validez;
    }

    static boolean soldadoR(int[] m) {
        boolean validez = false;
        if (m[0] < 5) {
            if (m[0] + 1 == m[2] && m[1] == m[3] && (tablero[m[0] + 1][m[1]] == "Espacio en blanco"||esEnemiga(m))) {
                validez = true;
            }
        } else {
            if (m[0] + 1 == m[2] && m[1] == m[3] && (tablero[m[0] + 1][m[1]] == "Espacio en blanco"||esEnemiga(m))) {
                validez = true;
            }
            if (m[0] == m[2] && (m[1] + 1 == m[3] || m[1] - 1 == m[3]) && (tablero[m[0]][m[1] + 1] == "Espacio en blanco" || tablero[m[0]][m[1] - 1] == "Espacio en blanco"||esEnemiga(m))) {
                validez = true;
            }
        }
        return validez;
    }

    static boolean soldadoA(int[] m) {
        boolean validez = false;
        if (m[0] > 5) {
            if (m[0] - 1 == m[2] && m[1] == m[3] && (tablero[m[0] - 1][m[1]] == "Espacio en blanco"||esEnemiga(m))) {
                validez = true;
            }
        } else {
            if (m[0] - 1 == m[2] && m[1] == m[3] && (tablero[m[0] - 1][m[1]] == "Espacio en blanco"||esEnemiga(m))) {
                validez = true;
            }
            if (m[0] == m[2] && (m[1] + 1 == m[3] || m[1] - 1 == m[3]) && (tablero[m[0]][m[1] + 1] == "Espacio en blanco" || tablero[m[0]][m[1] - 1] == "Espacio en blanco"||esEnemiga(m))) {
                validez = true;
            }
        }
        return validez;
    }

    static boolean caballo(int[] m) {
        boolean validez = false;
        if (Math.abs(m[0] - m[2]) == 2 && Math.abs(m[1] - m[3]) == 1 && (tablero[m[2]][m[3]] == "Espacio en blanco"||esEnemiga(m))) {
            validez = true;
        }
        if (Math.abs(m[0] - m[2]) == 1 && Math.abs(m[1] - m[3]) == 2 && (tablero[m[2]][m[3]] == "Espacio en blanco"||esEnemiga(m))) {
            validez = true;
        }
        return validez;
    }

    static boolean oficial(int[] m) {
        boolean validez = false;
        if (Math.abs(m[0] - m[2]) == 1 && Math.abs(m[1] - m[3]) == 1 && (tablero[m[2]][m[3]] == "Espacio en blanco"||esEnemiga(m))) {
            validez = true;
        }
        return validez;
    }

    static boolean elefante(int[] m) {
        boolean validez = false;
        if (Math.abs(m[0] - m[2]) == 2 && Math.abs(m[1] - m[3]) == 2 && (tablero[m[2]][m[3]] == "Espacio en blanco"||esEnemiga(m))) {
            validez = true;
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (Math.abs(i - m[0]) == 1 && Math.abs(j - m[1]) == 1 && (tablero[i][j] != "Espacio en blanco")) {
                    validez = false;
                }
            }
        }

        return validez;
    }

    static boolean carroDeGuerra(int[] m) {
        boolean validez = false;
        int i = 0, j = 1;
        do {
            if (m[0] + i > tablero.length || m[1] + j > tablero.length) {
                break;
            }
            if (tablero[m[0] + i][m[1] + j] != "Espacio en blanco") {
                break;
            }
            if (m[2] == m[0] + i && m[3] == m[1] + j && (tablero[m[0] + i][m[1] + j] == "Espacio en blanco"||esEnemiga(m))) {
                validez = true;
            }

            j++;
        } while (m[0] + i > tablero.length || m[1] + j > tablero.length);

        i = 0;
        j = -1;
        do {
            if (m[0] + i > tablero.length || m[1] + j < 0) {
                break;
            }
            if (tablero[m[0] + i][m[1] + j] != "Espacio en blanco") {
                break;
            }
            if (m[2] == m[0] + i && m[3] == m[1] + j && (tablero[m[0] + i][m[1] + j] == "Espacio en blanco"||esEnemiga(m))) {
                validez = true;
            }

            j--;
        } while (m[0] + i > tablero.length || m[1] + j < 0);

        i = 1;
        j = 0;
        do {
            if (m[0] + i < 0 || m[1] + j > tablero.length) {
                break;
            }
            if (tablero[m[0] + i][m[1] + j] != "Espacio en blanco") {
                break;
            }
            if (m[2] == m[0] + i && m[3] == m[1] + j && (tablero[m[0] + i][m[1] + j] == "Espacio en blanco"||esEnemiga(m))) {
                validez = true;
            }
            i--;

        } while (m[0] + i < 0 || m[1] + j > tablero.length);

        i = -1;
        j = 0;
        do {
            if (m[0] + i < 0 || m[1] + j < 0) {
                break;
            }
            if (tablero[m[0] + i][m[1] + j] != "Espacio en blanco") {
                break;
            }
            if (m[2] == m[0] + i && m[3] == m[1] + j && (tablero[m[0] + i][m[1] + j] == "Espacio en blanco"||esEnemiga(m))) {
                validez = true;
            }
            i--;

        } while (m[0] + i < 0 || m[1] + j < 0);

        return validez;
    }
    
    
}
