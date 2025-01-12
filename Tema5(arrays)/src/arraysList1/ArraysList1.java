package arraysList1;
import java.util.*;

public class ArraysList1 {

	public static void main(String[] args) {

// EJERCICIO 1 ESTRUCTURAS DE DATOS DINÁMICAS
		
//		ArrayList<Integer> numeros = new ArrayList<Integer>();
//		int numero = 0;
//		int newnum = 0;
//		
//		System.out.println("Introduce la cantidad de numeros a añadir en la lista");
//		
//		Scanner entrada = new Scanner(System.in);
//		numero = entrada.nextInt();
//		
//		for(int i = 0; i < numero;i++) {
//			
//			System.out.println("Por favor introduzca un número");
//			newnum = entrada.nextInt();
//			numeros.add(newnum);
//			
//		}
//		
//		System.out.println(numeros);
//		
//		numeros.add(1, numeros.get(3));
//		numeros.remove(4);
//		
//		
//		numeros.add(4, numeros.get(2));
//		numeros.remove(2);
//		
//		System.out.println(numeros);
		
		
//EJERCICIO 2 ESTRUCTURAS DE DATOS DINÁMICAS
		
		
		
		boolean bucle = false;
		int opcion;
		int cantidadcesta = 0;
		double total = 0;
		String nombre;
		double precio;
		int cantidad;
		
		Scanner entrada = new Scanner (System.in);
		
		while(!bucle) {
			
			if(cantidadcesta <8) {
			
			System.out.println("Crear Producto");
			System.out.println("2");
			System.out.println("Selecciona 3 Mostrar Ticket");
			
			opcion = entrada.nextInt();
			
			switch(opcion) {
			
			case 1:
				
				System.out.println("¿Qué producto necesitas?");
				System.out.println("1. Jamon \t 2. Queso \t 3. Pan");
				System.out.println("4. Mantequilla \t 5. Mermelada \t 6. Ropa");
				break;
				
			case 2:
				System.out.println("Has finalizado tu compra, este es tu ticket");
				bucle=true;
				
				break;			
							
			}
			}else {
				System.out.println("La cesta esta llena, este es su ticket");
				bucle=true;
				System.out.println("Gracias por comprar en Mercadona");
			}
			
		}
		

		
	}

}
