package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
			
		//INIZIALIZZAZIONE ARRAY
		String []guestParty = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
	
	
		//METODO INPUT
		Scanner input = new Scanner(System.in);
		System.out.print("- INSERISCI IL TUO NOME E COGNOME ---> ");
		String userParty = input.nextLine();
	
		//METOD CHECK
		boolean checkParty = false;
		
		for(int i = 0; i < guestParty.length; i++) {
			
			if(guestParty[i].equals(userParty)) {
				checkParty = true;
				break;
			}
		}
		
		if(checkParty)
			System.out.println("- ACCESSO CONSENTITO");
		else
			System.out.println("- ACCESSO NON CONSENTITO");
	}

}
