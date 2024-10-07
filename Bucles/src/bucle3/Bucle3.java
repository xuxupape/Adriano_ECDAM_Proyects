package bucle3;
import java.util.Scanner;

public class Bucle3 {

	public static void main(String[] args) {
		System.out.println("Introduce tu numero");
		Scanner entrada = new Scanner(System.in);
		double numero = entrada.nextDouble();
		int digitalizador = 10;
		int contador = 1;
		
		while (numero > digitalizador)
		{
			digitalizador*=10;
			contador++;
		}
		
		System.out.println("Tu número tiene " + contador + " digitos" );

	}

}
