package primerscan;
import java.util.Scanner;

public class Primerscan {

	public static void main(String[] args) {

		Scanner nota1 = new Scanner(System.in);
		
		System.out.println("Introduzca su nota: ");
		
		int cantidad1;
		cantidad1 = nota1.nextInt();
		
		Scanner nota2 = new Scanner(System.in);
		
		System.out.println("Introduzca su segunda nota: ");
		
		int cantidad2;
		cantidad2 = nota2.nextInt();
		
		Scanner nota3 = new Scanner(System.in);
		
		System.out.println("Introduzca su nota numero 2: ");
		
		int cantidad3;
		cantidad3 = nota3.nextInt();
		
		double mediacantidad = cantidad1 + cantidad2 + cantidad3;
		double media = mediacantidad/3;
		
		System.out.println(media);
		
		System.out.println("La media de tus notas es: " + media);
		
	}

}
