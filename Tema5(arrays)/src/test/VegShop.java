package test;
import java.util.*;

public class VegShop {

	public static void main(String[] args) {
		
		HashMap <String, Double> listado = new HashMap<String,Double>();
		ArrayList <String> carrito = new ArrayList<String>();
		double totalprice = 0;
		
		listado.put("Garbanzos", 2.15);
		listado.put("Avena", 1.92);
		listado.put("Tomate", 2.08);
		listado.put("Jengibre", 2.55);
		listado.put("Quinoa", 1.95);
		listado.put("Guisantes", 3.02);
		Scanner entrada = new Scanner(System.in);
		String opcion = "";
		
		do {
		
			System.out.println("Elige el nombre del producto que quieras añadir al carrito");
			System.out.println("Productos disponibles: Garbanzos, Avena, Tomate, Jengibre, Quinoa, Guisantes");
			System.out.println("Escribre fin para finalizar la compra ");
			
			opcion = entrada.next();
			
		switch(opcion) {
		
		case "Garbanzos":
			carrito.add(opcion);
		break;
			
		case "Avena":
			carrito.add(opcion);
		break;	
		
		case "Tomate":
			carrito.add(opcion);
		break;	
		
		case "Jengibre":
			carrito.add(opcion);
		break;	
		
		case "Quinoa":
			carrito.add(opcion);
		break;	
		
		case "Guisantes":
			carrito.add(opcion);
		break;	
				
		}
		}while (!opcion.equalsIgnoreCase("fin"));
	
		System.out.println("Producto \t Precio");
		System.out.println("---------------------------------------");
		
		for(int i = 0 ; i < carrito.size() ; i++) {
			
			System.out.println(carrito.get(i) + "\t\t" + listado.get(carrito.get(i)) );
			totalprice+=listado.get(carrito.get(i));
		}
		
		System.out.println("Precio total:\t " + totalprice);
	
	}
	
}

	
