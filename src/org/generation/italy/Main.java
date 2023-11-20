package org.generation.italy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Esercizio: Ricette
		Scrivere un programma che consente di creare delle ricette personalizzate.
		All'avvio del programma è presente un elenco di ingredienti predefiniti.
		Per ogni ingrediente è specificato:
		nome dell'ingrediente
		calorie per unità (gr o ml)
		L'utente inserisce il nome della ricetta, e sceglie tra l'elenco degli ingredienti 
		disponibili (da visualizzare) uno o più ingredienti, indicando:
		nome dell'ingrediente
		quantità
		(dopo ogni ingrediente chiedere se se ne vuole aggiungere un altro)

		Alla fine dell'inserimento, mostrare il numero di calorie total */
		
		HashMap<String, Integer> ingredienti=new HashMap<>(); 
		Scanner sc=new Scanner(System.in); 
		String nomeRicetta, ingredienteScelto, risposta;
		ArrayList<String> ricetta=new ArrayList<>();
		HashMap<String, Integer> ricette=new HashMap<>();
		int calorieRicetta=0;
		int quantita;
			ingredienti.put("Burro", 758);
	        ingredienti.put("Lardo", 891);
	        ingredienti.put("Maionese", 655);
	        ingredienti.put("Margarina 100% Vegetale", 760);
	        ingredienti.put("Margarina 2/3 Animale 1/3 Vegetale", 760);
	        ingredienti.put("Olii Vegetali Oliva", 899);
	        ingredienti.put("Olio Arachide", 899);
	        ingredienti.put("Olio Cocco", 899);
	        ingredienti.put("Farina Di Frumento Integrale", 319);
	        ingredienti.put("Farina Di Frumento Tipo 0", 341);
	        ingredienti.put("Farina Di Frumento Tipo 00", 340);
	        ingredienti.put("Farina Di Mais", 362);
	        ingredienti.put("Farina Di Orzo", 357);
	        ingredienti.put("Panini Al Latte", 295);
	        ingredienti.put("Panini All'olio", 299);
	        ingredienti.put("Patate", 85);
	        ingredienti.put("Riso Brillato", 332);
	        ingredienti.put("Riso Integrale", 337);
	        ingredienti.put("Riso Parboiled", 337);
	        ingredienti.put("Riso Soffiato", 352);
	        ingredienti.put("Semola", 339);
	        ingredienti.put("Tapioca", 360);
	        ingredienti.put("Tortellini Freschi", 300);
	        ingredienti.put("Tortellini Secchi", 376);
	        ingredienti.put("Farina Di Frumento Integrale", 319);
	        ingredienti.put("Farina Di Frumento Tipo 0", 341);
	        ingredienti.put("Farina Di Frumento Tipo 00", 340);
	        ingredienti.put("Farina Di Mais", 362);
	        ingredienti.put("Farina Di Orzo", 357);
	        ingredienti.put("Panini Al Latte", 295);
	        ingredienti.put("Panini All'olio", 299);
	        ingredienti.put("Patate", 85);
	        ingredienti.put("Riso Brillato", 332);
	        ingredienti.put("Riso Integrale", 337);
	        ingredienti.put("Riso Parboiled", 337);
	        ingredienti.put("Riso Soffiato", 352);
	        ingredienti.put("Semola", 339);
	        ingredienti.put("Tapioca", 360);
	        ingredienti.put("Tortellini Freschi", 300);
	        ingredienti.put("Tortellini Secchi", 376);
	        ingredienti.put("Latte Bufala", 114);
	        ingredienti.put("Latte Capra", 76);
	        ingredienti.put("Latte Di Soja", 32);
	        ingredienti.put("Latte Pecora", 103);
	        ingredienti.put("Mascarpone", 455);
	        ingredienti.put("Mozzarella Di Bufala", 288);
	        ingredienti.put("Mozzarella Di Vacca", 253);
	        ingredienti.put("Parmigiano", 387);
	        ingredienti.put("Pecorino", 392);
	        ingredienti.put("Pecorino Romano", 409);
	        ingredienti.put("Pecorino Siciliano", 427);
	        ingredienti.put("Provolone", 374);
	        ingredienti.put("Ricotta Bufala", 212);
	        ingredienti.put("Ricotta Pecora", 157);
	        ingredienti.put("Ricotta Vacca", 146);
	        ingredienti.put("Robiola", 338);
	        ingredienti.put("Scamorza", 334);
	        ingredienti.put("Stracchino", 300);
	        ingredienti.put("Uova Gallina Intero", 128);
	        ingredienti.put("Anatra", 159);
	        ingredienti.put("Bovino Costata", 140);
	        ingredienti.put("Bovino Fesa", 103);
	        ingredienti.put("Bovino Filetto", 127);
	        ingredienti.put("Bresaola", 151);
	        ingredienti.put("Capocollo", 450);
	        ingredienti.put("Capretto", 122);
	        ingredienti.put("Carne Bovina In Gelatina In Scatola", 67);
	        ingredienti.put("Cavallo", 143);
	        ingredienti.put("Coniglio", 118);
	        ingredienti.put("Coppa Parma", 398);
	        ingredienti.put("Coratella Agnello", 109);
	        ingredienti.put("Coratella Vitello", 100);
	        ingredienti.put("Corned Beef In Scatola", 219);
	        ingredienti.put("Cotechino Confez. Precotto Crudo", 450);
	        ingredienti.put("Cuore Bovino", 123);
	        ingredienti.put("Cuore Equino", 146);
	        ingredienti.put("Cuore Ovino", 134);
	        ingredienti.put("Cuore Suino", 159);
	        ingredienti.put("Fagiano", 144);
	        ingredienti.put("Faraona", 121);
	        ingredienti.put("Birra Chiara", 34);
	        ingredienti.put("Brandy", 230);
	        ingredienti.put("Grappa", 242);
	        ingredienti.put("Liquori Da Dessert", 314);
	        ingredienti.put("Marsala All'uovo", 150);
	        ingredienti.put("Marsala Tipico", 203);
	        ingredienti.put("Spumante", 87);
	        ingredienti.put("Vermouth Dolce", 139);
	        ingredienti.put("Vermouth Secco", 121);
	        ingredienti.put("Vino Bianco", 70);
	        ingredienti.put("Vino Rosso", 75);
	        ingredienti.put("Whisky", 245);


	        
	do {	        
			
		System.out.println("Prodotti disponibili:");        
		for(String n:ingredienti.keySet()) 
		{
			System.out.println(n);
		}
			
		System.out.println("Inserisci il nome per una nuova RICETTA");
		nomeRicetta=sc.nextLine();
		ricette.put(nomeRicetta, 0 );
	      
		do {		
			System.out.println("Inserisci prodotto: ");
			ingredienteScelto=sc.nextLine();
			if (ingredienti.containsKey(ingredienteScelto))
			{
				System.out.println("ingrediente trovato e aggiunto.");
				System.out.println("aggiungere quantita");
				quantita=Integer.parseInt(sc.nextLine());
				calorieRicetta=calorieRicetta+(ingredienti.get(ingredienteScelto)*quantita);
				System.out.println("calorie ricetta momentanee: "+calorieRicetta);
			}
			else
			{
				System.out.println("ingrediente non disponibile!");        
				break;
			}
			
			System.out.println("Vuoi aggiungere un INGREDIENTE?");
			risposta=sc.nextLine();
		}while(risposta.equals("si"));
		
	System.out.println("Complimenti hai creato la ricetta: "+nomeRicetta+" con "+calorieRicetta+" calorie Totali.");
		
	System.out.println("Vuoi inserire una nuova RICETTA(si/no)?");
	risposta=sc.nextLine();	
	}while(risposta.equals("si"));	
		
	System.out.println("ARRIVEDERCI");
	sc.close();        
		}
	
	}
