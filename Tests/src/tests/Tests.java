/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author ofici
 */
public class Tests {

    static Scanner sc=new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date fecha=new Date();
        DateFormat df=new SimpleDateFormat("yyyy/MM/dd");
        String a=sc.next();
        df.parse(a);
        
        
        
    }
    
}
