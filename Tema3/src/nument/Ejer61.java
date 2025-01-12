package nument;
import java.util.Scanner;

public class Ejer61 {

	public static void main(String[] args) {

		Nument p1 = new Nument(50);
		Scanner entrada= new Scanner(System.in);
		int numero;
		
		System.out.println("El número es: " + p1.ent);
		
		System.out.print("Si le sumas ");
		numero = entrada.nextInt();
		System.out.print(" tu número queda en: ");
		p1.c(numero);
		System.out.println(p1.ent);

	}

}
