package buclefor11;
import java.util.Scanner;

public class BucleFor11 {

	public static void main(String[] args) {
		
		System.out.println("Introduzca su número");
		Scanner entrada = new Scanner(System.in);
		int contador = 1;
		int contador2 = 1;
		
		for(int numero = entrada.nextInt();numero>=contador;contador++)
		{
			
			for (;numero < 1 || numero > 20;)
			{
				System.out.println("Introduce un número entre 1 y 20");
				numero = entrada.nextInt();		
			}
			
			entrada.close();
			for(contador2 =1; contador>=contador2;contador2++) 
			{
				System.out.print(contador);
			}
			System.out.println("");
		}
		

	}

}

