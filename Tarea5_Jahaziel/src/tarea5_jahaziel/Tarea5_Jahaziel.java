package tarea5_jahaziel;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tarea5_Jahaziel {

    public static void main(String[] args) {
        String option = "";
        ArrayList <Persona> persona = new ArrayList();
        ArrayList <Motores> motor = new ArrayList();
        
        while (!option.equalsIgnoreCase("F")){
            option = JOptionPane.showInputDialog("Taggart Trascontinental\n"
                    + "A-Personal\n"
                    + "B-Motores\n"
                    + "C-Carros\n"
                    + "D-Ferrocarriles"
                    + "E-Boletos\n"
                    + "F-Salir");
            
            switch (option){
                case "a":
                case "A":
                    String o = JOptionPane.showInputDialog("Personal\n"
                    + "A-Agregar\n"
                    + "B-Listar\n"
                    + "C-Modificar\n"
                    + "D-Eliminar\n");
                    
                    switch (o){
                        case "a":
                        case "A":
                            String Nombre, cargo;
                            int edad, identidad;
                            Nombre = (JOptionPane.showInputDialog("Ingrese Nombre:"));      
                            cargo = (JOptionPane.showInputDialog("Ingrese cargo:"));
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad:"));
                            identidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de identidad:"));
                            
                            persona.add(new Persona(Nombre, cargo, identidad, edad));
                            break;
                        case "b":
                        case "B":
                            String p = "";
                            for (Object tempORAL : persona) {
                                p += persona.toString() + "\n";
                            }
                            JOptionPane.showMessageDialog(null, p);
                    
                            break;
                        case "c":
                        case "C":
                            int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion:"));
                            String Nombr, carg;
                            int eda, identida;
                            Nombr = (JOptionPane.showInputDialog("Ingrese Nombre:"));      
                            carg = (JOptionPane.showInputDialog("Ingrese cargo:"));
                            eda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad:"));
                            identida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de identidad:"));
                            
                            persona.get(pos).setCargo(carg);
                            persona.get(pos).setEdad(eda);
                            persona.get(pos).setNombre(Nombr);
                            persona.get(pos).setIdentidad(identida);
                            
                            break;
                        case "d":
                        case "D":
                            int po = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion de persona a eliminar:"));
                            persona.remove(po);
                            break;                      
                    }
                    break;
                case "B"://motores
                case "b":
                    String oa = JOptionPane.showInputDialog("Motores\n"
                    + "A-Agregar\n"
                    + "B-Listar\n"
                    + "C-Modificar\n"
                    + "D-Eliminar\n");
                    
                    switch (oa){
                        case "a":
                        case "A":
                            //git ignore --all git status 
                        String oc = JOptionPane.showInputDialog("Agregar\n"
                        + "A-Motores de carbon\n"
                        + "B-Motores diesel\n"
                        + "C-Motores Electricos\n");
                        switch (oc){
                            case "a":
                            case "A":
                                String tipo = "Motor de carbon", fabricante;
                                int Nserie, capacidad, Vmax;
                                fabricante = (JOptionPane.showInputDialog("Ingrese fabricante:"));      
                                capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cargo:"));
                                Nserie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de serie:"));
                                Vmax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de identidad:"));
                            
                                motor.add(new MotorCarbon(capacidad, Vmax, Nserie, fabricante, tipo));
                            
                                break;
                            case "b":
                            case "B":
                                String tip = "Motor de Diesel", fabricant;
                                int Nseri, Ccombustible, Ccarros;
                                fabricant = (JOptionPane.showInputDialog("Ingrese fabricante:"));
                                Nseri = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de serie:"));
                                Ccombustible = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de combustible consumida:"));
                                Ccarros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de carros que puede movilizar:"));
                                motor.add(new MotorDiesel(Ccombustible, Ccarros, Nseri, fabricant, tip));
                                break;
                            case "c":
                            case "C":
                                
                                break;
                        }
                        break;
                        
                    }
                    
                    
                    
                    break;
                
                
                
            }
            
        
        }
        
        
    }
    
}
