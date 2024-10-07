package segundoscan;
import java.util.Scanner;

public class Segundoscan {

	public static void main(String[] args) {
		
		Scanner edad = new Scanner(System.in);
		
		System.out.println("Introduzca su edad: ");
		
		int edadus;
		edadus = edad.nextInt();
		
		Scanner chicle = new Scanner(System.in);
		
		System.out.println("¿Cuanto cuesta un chicle melón? ");
		
		double precio;
		precio = chicle.nextDouble();
		
		Scanner nombrerio = new Scanner(System.in);
		
		System.out.println("¿Cual es tu rio favorito?");
		
		String rio;
		rio = nombrerio.next();
		
		System.out.printf("La edad es: %d\n" + "El precio del chicle melon es de: %.2f\n" + "Tu rio favorito es: %s",edadus, precio, rio);
		
		

	}

}
