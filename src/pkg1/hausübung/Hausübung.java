/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.hausübung;

import java.util.Scanner;

/**
 *
 * @author szabo
 */
public class Hausübung 
{
    
    public static void main(String args[]) 
    { 
        int eingabe;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Was ist der Wert bis wohin Primzahlen ausgegeben werden sollen?");
        eingabe = scanner.nextInt();
        System.out.print("Hier sind die Primzahlen bis zur Zahl " + eingabe); 
        EratosthenesPrimeSieve g = new EratosthenesPrimeSieve(); 
        g.sieveOfEratosthenes(eingabe); 
    } 
        
  
}
