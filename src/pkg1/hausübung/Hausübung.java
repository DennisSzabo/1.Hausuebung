/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.hausübung;

import java.util.ArrayList;

/**
 *
 * @author szabo
 */
public class Hausübung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

		int zahl = 71;
		zahl++;
		ArrayList<Boolean> loesungListe = aussieben(zahl);

		System.out.println("Primzahlen sind: ");
		for (int i = 0; i <= zahl - 1; i++) {
			if (loesungListe.get(i) == true && i > 1) {
				System.out.print(i + " ");
			}
		}
	}

	public static ArrayList<Boolean> aussieben(double zahl) {

		// Legt eine neue Liste an
		ArrayList<Boolean> zahlenListe = new ArrayList<Boolean>();
		
		// Füllt die neue Liste mit lauter true-Elementen
		for (int i = 0; i <= zahl; i++) {
			zahlenListe.add(i, true);
		}

		for (int i = 2; i <= zahl; i++) {

			if (zahlenListe.get(i) == true) {
				int j = i;
				do {
					j = j + i;
					if (j <= zahl) {
						// Ist die Zahl ein Vielfaches einer 
						// Primzahl, dann wird sie mit false 
						// markiert
						zahlenListe.set(j, false);
					}
				} while (j <= zahl);
			}
		}
		return zahlenListe;
	}
    
}
