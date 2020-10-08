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
        int grenze;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Was ist der Wert bis wohin Primzahlen ausgegeben werden sollen? ");
        eingabe = scanner.nextInt();
        EratosthenesPrimeSieve era = new EratosthenesPrimeSieve(eingabe); 
        era.printPrimes(); 
        
        
    } 
        
  
}
