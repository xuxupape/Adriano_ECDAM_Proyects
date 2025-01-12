package bucleaceptaelreto2;
import java.util.Scanner;

public class BucleAceptaElReto2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int largo,espacio=0;
		char letra;
		int contador= 0, contador1= 0;
		System.out.println("Cuantos mensajes quieres investigar");
		int numero=entrada.nextInt();
		entrada.nextLine();
		String almacen ="";
		int confirmador;
		String palabra, confirmado;
		
		for (;numero > contador;contador++) {
		
			System.out.println("Titular para encontrar el mensaje");
		
			String titular = entrada.nextLine();
			
			System.out.println("Mensaje a encontar");
			
			String mensaje = entrada.nextLine();	
			
			largo = titular.length();
			
			while(contador1 != mensaje.length() )
			{	
				
				letra = mensaje.charAt(contador1); 
				
				System.out.println("la letra " +letra);
				
				espacio = titular.indexOf(letra);
				
				if(espacio ==-1 && contador1 == mensaje.length()) 
				{
					confirmador = -1;
					break;
				}

				else { 
				System.out.println("el espacio que lee "+espacio);
			
				titular = titular.substring(espacio, largo);
				
				largo = titular.length();
				
				System.out.println("Corte: " + titular);
				
				contador1++;
				}
				
				if (espacio == -1 ) {
					
					confirmado = "Caso" + contador + "NO";
					almacen = almacen + "\n" + confirmado;
					
				}else {confirmado = "Caso" + contador + "SI";
						almacen = almacen + "\n" + confirmado;};
				
			}				
			
			System.out.println("bucle ha acabado");
			
		}
		System.out.println(almacen);
	}

}
