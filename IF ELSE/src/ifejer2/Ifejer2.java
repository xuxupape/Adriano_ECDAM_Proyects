package ifejer2;

import java.util.Scanner;

public class Ifejer2 {

	public static void main(String[] args) {
		
		System.out.println("Introduce una hora del día");
		
		Scanner hora = new Scanner(System.in);
		
		int horaactual = hora.nextInt();
		
		if (horaactual >= 6 && horaactual<=12)
			System.out.println("Buenos dias");
		else if (horaactual >=13 && horaactual<=20)
			System.out.println("Buenas tardes");
		else if (horaactual >=21 && horaactual<=24)
			System.out.println("Buenas noches");
		else if (horaactual >=0 && horaactual<=5)
			System.out.println("Buenas noches");
		else System.out.println("Hora erronea");
			

	}

}
