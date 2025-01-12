package arrayList3;

import java.util.*;

public class Operar {

	public static void rellenar(ArrayList<Integer> listanum) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(
				"Introduce numeros en tu Array || No introduzca numeros menores que 0 || Para finalizar introduzca 0");
		int num;

		do {
			System.out.println("Introduce un nuevo numero");
			num = entrada.nextInt();

			if (num < 0) {
				System.out.println("El número introducido es menor que 0, no se añadirá al array");
			} else if (num > 0) {
				System.out.println("Número introducido correctamente");
				listanum.add(num);
			}

		} while (num != 0);

	}

	public static void espc(ArrayList<Integer> listanum) {

		boolean finalizador = false;
		int vueltas = 0;
		boolean repetido = false;

		for (int i = 0; i < listanum.size() && finalizador == false; i++) {

			for (int j = 0; j < listanum.size(); j++) {

				if (listanum.get(i) == listanum.get(j) && repetido == false) {
					repetido = true;
				} else if (listanum.get(i) == listanum.get(j) && repetido == true) {
					listanum.set(j, 0);
				}

			}

			if (i + 1 == listanum.size() && finalizador==false) {
				finalizador = true;
			}

			repetido = false;
		}

	}

	public static void mostar(ArrayList<Integer> listanum) {
		System.out.println(listanum);
	}

}
