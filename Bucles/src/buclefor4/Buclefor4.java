package buclefor4;
import java.util.Scanner;

public class Buclefor4 {

	public static void main(String[] args) {
		
		System.out.println("Introduce tu número");
		
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		entrada.close();
		int contador;
		int sumador = numero;
		
		for(contador=0; contador < 100 && numero>=0; contador++) 
		{
			System.out.println(numero);
			
			numero+=sumador;
			sumador++;
			
		}
		
		System.out.println(numero);
	}

}
