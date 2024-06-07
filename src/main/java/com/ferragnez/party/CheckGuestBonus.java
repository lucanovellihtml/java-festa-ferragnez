package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuestBonus {

	/*
	  - VIENE INIZIALIZZATO L'ARRAY CON DELLE STRINGHE;
	  - VIENE ACCETTATO L'INPUT STRINGA DA TASTIERA;
	  - VIENE CREATO UN CICLO DO-WHILE DOVE VIENE CONFRONTATO L'UNPUT CON LA STRINGA DELL'ARRAY;
	  - IL CICLO SMETTE DI VIVERE QUANDO LA CONDIZIONE DELL' IF E' VERA, O QUANDO IL COUNT HA RAGGIUNTO LA LUNGHEZZA DELL'ARRAY;
	 */
	public static void main(String[] args) {
		
		//INIZIALIZZAZIONE ARRAY
		String []guestParty = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
			
			
		//METODO INPUT
		Scanner input = new Scanner(System.in);
		System.out.print("- INSERISCI IL TUO NOME E COGNOME ---> ");
		String userParty = input.nextLine();
	
		//METOD CHECK
		boolean checkParty = false;
		int i = 0;
		
		do {
		
			//System.out.println(guestParty[i]);
			if(guestParty[i].equals(userParty)) {
			    checkParty = true;
			    break;
			}
			
			i++;
			
		}while(i < guestParty.length);
		
		
		if(checkParty)
			System.out.println("- ACCESSO CONSENTITO");
		else
			System.out.println("- ACCESSO NON CONSENTITO");
	}

}
