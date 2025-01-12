package bucleaceptaelreto1;
import java.util.Scanner;

public class BucleAceptaElReto1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String almacen ="";
		String fechas;
		String navidad = "25 12";
		
		
		System.out.println("Introduce cuantas fechas vas a pedir");
		int numero = entrada.nextInt();
		System.out.println("Introduce las fechas");
		
		
		fechas= entrada.nextLine();
		
		for (int contador = 0; numero > contador ;)
		{
			
			fechas= entrada.nextLine();
			//System.out.println(almacen + "+1");
			contador++;
			if(fechas.equalsIgnoreCase(navidad)) {
				fechas = fechas + " SI";
				//System.out.println(almacen + "+2");
				almacen = almacen + "\n" + fechas;
			}
			else {
				fechas = fechas + " NO";
				//System.out.println(almacen + "+3");
				almacen = almacen + "\n" + fechas;
			}
			System.out.println("¿Ya es navidad?");
			  
			}
	
		System.out.println(almacen);
	}

}
