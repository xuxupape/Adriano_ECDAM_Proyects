package ejer3Vocales;
import java.util.Scanner;

public class Ejer3Vocales {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		String cadena="";
		int contmayus=0, contminus=0;
		char corte;
		
		do {
			System.out.println("Introduce un texto (Escribe 'Fin' para terminar)");
			cadena = entrada.nextLine();
			if(!cadena.equalsIgnoreCase("Fin")){
			for(int contador=0;contador < cadena.length();contador++)
				{
					corte=cadena.charAt(contador);
					
					if(corte==65 || corte==69 || corte ==73 || corte == 79 || corte == 85) {
						contmayus++;
					}
					else if(corte==32); 
					else if(corte == 97 || corte==101 || corte == 105 || corte == 111 || corte==117 ) 
					contminus++;
					else;
					
				}
			System.out.println("Número de mayusculas: " + contmayus );
			System.out.println("Número de minusculas: " + contminus);
			
			contmayus=0;
			contminus=0;
			}
			else System.out.println("Finalizando programa");
			
		}while(!cadena.equalsIgnoreCase("Fin"));		
		
		
	}
}
	
