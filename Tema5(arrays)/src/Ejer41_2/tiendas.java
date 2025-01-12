package Ejer41_2;

import java.util.Scanner;

public class tiendas {

	public static void main(String[] args) {

		int mayor = 0, menor = 0, total = 0, temp = -1, posMenor = 0, posMayor = 0;
		boolean com = false;
		int[] tiendas = new int [5];

//		for(int i = 0; i<tiendas.length; i++) {
//			
//			if(i == 0) {
//				menor = tiendas[i];
//			}
//			
//			if(tiendas[i] > mayor) {
//				mayor = tiendas[i];
//			}
//			
//			if(tiendas[i] < menor) {
//				menor = tiendas[i];
//			}
//			
//			total+=tiendas[i];
//			
//		}
//		
//		System.out.println("La tienda que mejor ventas ha tenido ha vendido: " + mayor);
//		System.out.println("La tienda que menor venta ha tenido ha vendido: " + menor);
//		System.out.println("En total las tiendas han generado: " + total);
//		
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < tiendas.length; i++) {
	
			if (com == false) {
				System.out.println("Introduce las ventas de la tienda " + i + ": ");
				temp = entrada.nextInt();
				tiendas[i] = temp;
				total+=tiendas[i];

				
				if (tiendas[i] > mayor) {
					mayor = tiendas[i];
					posMayor = i;
				}

				if (tiendas[i] < menor || i == 0) {
					menor = tiendas[i];
					posMenor = i;
				}
			}
		
			
			if (com == false && i == (tiendas.length - 1)) {
				System.out.println("Introduce un número para comprobar si está en el vector");
				temp = entrada.nextInt();
				i = 0;
				com = true;
			}
			if (com == true && temp == tiendas[i]) {
				System.out.println("El número introducido se encuentra en la posicion: " + i);
			}
			
			

		}
		System.out.println("La tienda que mejor ventas ha tenido ha vendido: " + mayor + " su posición en la cadena es: " + posMayor);
		System.out.println("La tienda que menor venta ha tenido ha vendido: " + menor + " su posición en la cadena es: " + posMenor);
		System.out.println("En total las tiendas han generado: " + total);
	}
}
