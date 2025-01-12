package ejer3Consonantes;
import java.util.Scanner;

public class Ejer3Consonantes {

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
					
					if(corte<=90 && corte>=65) {
						contmayus++;
					}
					else if(corte==32); 
					else contminus++;
					
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
