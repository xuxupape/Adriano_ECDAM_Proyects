package bucle4; 
import java.util.Scanner;

public class Bucle4 {

	public static void main(String[] args) {
		
		int nota = 0;
		int juntanotas = 0;
		int divisor = -1;
		
		while (nota >= 0)
		{
			juntanotas = (juntanotas + nota);
			System.out.println("Introduce una nota");
			Scanner entrada = new Scanner(System.in);
			nota=entrada.nextInt();
			divisor++;
		}
		int notamedia = (juntanotas/divisor);
		System.out.println("Nota media: " + notamedia );
		

	}

}
