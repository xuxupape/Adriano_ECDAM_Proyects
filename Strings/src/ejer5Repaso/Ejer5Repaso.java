package ejer5Repaso;
import java.util.Scanner;

public class Ejer5Repaso {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		final String secreta = "patata";
		char corte1,corte2;
		
		
		for(int contador=3;contador != 0; contador--) 
		{
			String almacen="";
			int limitador= 0;
			System.out.println("Tienes " + contador +" intentos para adivinar la contraseña");
			
			String palabra = entrada.nextLine();
			
			if(!palabra.equalsIgnoreCase(secreta)) {
			
			for(;limitador < palabra.length();limitador++) 
				{
					corte1=palabra.charAt(limitador);
					corte2=secreta.charAt(limitador);
					
						if(corte1 == corte2) {	
							almacen=almacen + limitador + " ";}			
				}
			}else {System.out.println("Felicidades has acertado la contraseña");
				break;}
			
			System.out.println("La palabra que has dado coincide en: " + almacen);		
			
		}
		entrada.close();
	}

}
