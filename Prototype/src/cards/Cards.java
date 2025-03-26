package cards;
import java.util.*;
import java.lang.Math;

public class Cards {
		
		//Atributos
	
		static int tamañoMano = 8;
		static int manos = 4;
		static int descartes = 3;
		
		
		static ArrayList<Card> Mano = new ArrayList<Card>();
		static ArrayList<Card> Baraja = new ArrayList<Card>();
		
		public static void GenerateBaraja () {
		
			String [] colores = {"Corazones", "Diamante", "Treboles", "Picas"};
			String [] numeros = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K", "As"};		
			
			for (String color: colores) {
				
				 for (String numero : numeros) {
		                int valor;
		                if (numero.equals("J") || numero.equals("Q") || numero.equals("K")) {
		                    valor = 10;
		                } else if (numero.equals("As")) {
		                    valor = 11;
		                } else {
		                    valor = Integer.parseInt(numero);
		                }
		                Baraja.add(new Card(color, numero, valor));
		            }
				
			}
		}	
		
		public static void printBaraja() {
	        for (Card carta : Baraja) {
	            System.out.println(carta);
	        }
	    }
		
		public static void startRound() {
			
			for(int i = 0; i < tamañoMano; i++) {
				
				int cartaRan=(int) ((Math.random()*52));
				
				if(Baraja.get(cartaRan) == null || Mano.contains(Baraja.get(cartaRan))) {
					i--;
				}else {
					Mano.add(Baraja.get(cartaRan));
				}	
			}
			
			for (Card carta : Mano) {
	            System.out.println(carta);
	        }
			
		}
		
		public static void removeCard(Card c) {
			
			Baraja.remove(c);
			
		}
		
}
