package temperatura;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		boolean flag = false;
		int opcion;
		Scanner entrada = new Scanner(System.in);
		ArrayList<Double> temp = new ArrayList();

		while (!flag) {

			System.out.println("1. Añadir temperatura");
			System.out.println("2. Mostrar temperatura media");
			System.out.println("3. Mostrar temperaturas extremas");
			System.out.println("4. Mostrar la lista de temperaturas");
			System.out.println("5. Busca la temperatura y muestra su posición");
			System.out.println("6. Borrar la temperatura");
			System.out.println("7. Salir");

			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:
				
				Temperatura.addtemp(temp);
				break;

			case 2:
				
				System.out.print("La temperatura media es de: " + Temperatura.avgtemp(temp));
				System.out.println();
				break;
				

			case 3:

				System.out.println("Las temperatuas maximas son de: " + Temperatura.MaxMintemp(temp)[0]+ "Cº" + 
						"\n Las temperaturas minimas son de: " + Temperatura.MaxMintemp(temp)[1] + "Cº");
				break;

			case 4:
				
				Temperatura.listTemp(temp);
				break;

			case 5:

				break;

			case 6:

				break;

			case 7:

				break;

			}

		}

	}

}
