package bucleDoWhile6;
import java.util.Scanner;

public class BucleDoWhile6 {

	public static void main(String[] args) {
		
		System.out.println("Introduce 5 numeros");
		
		int contador = 0;
		int numero;
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextInt();
		
		System.out.println("Numero \t cuadrado \t cubo");
		do
		{
			
			
			int cuadrado = (numero*numero);
			int cubo = (cuadrado*numero);
			
			System.out.println(numero + "\t" + cuadrado + "\t\t" + cubo );
			
			numero++;
			contador++;
			
		}while (contador != 5);
		
			
	}
}			
		
	


