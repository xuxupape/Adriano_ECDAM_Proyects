package ejer4Repaso;
import java.util.Scanner;

public class Ejer4Repaso {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int prin = 0, mayus, minus,i;
		String corte;
		int espacio;
		String cadena="";
		
		char caracter;
		
		do {
			System.out.println("Introduce tu cadena de texto");
			cadena = entrada.nextLine();
			if(!cadena.equalsIgnoreCase("Fin")) {
				i=0;
				mayus=0;
				minus=0;
				for(int contador=cadena.lastIndexOf(" "); contador < cadena.length(); contador++) 
				{
					corte = cadena.substring(cadena.lastIndexOf(" "), cadena.length());			
					caracter = corte.charAt(i);
					if (caracter==65 || caracter==69 || caracter ==73 || caracter == 79 || caracter == 85) {
						mayus++;
					}
					else if(caracter == 97 || caracter==101 || caracter == 105 || caracter == 111 || caracter ==117 )
						minus++;
					else;
					i++;
				}
			
				System.out.println("La ultima palbra de tu cadena contiene: ");
				System.out.println("\t Contiene " + mayus + " mayusculas");
				System.out.println("\t Contiene " + minus + " minusculas");
			}else break;
			
			
		}while (!cadena.equalsIgnoreCase("Fin"));
		
	}
}
