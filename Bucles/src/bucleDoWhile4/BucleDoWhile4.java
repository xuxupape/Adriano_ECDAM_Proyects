package bucleDoWhile4;
import java.util.Scanner;

public class BucleDoWhile4 {

	public static void main(String[] args) {
		
		int clave;
		int intentos=0;
		
		do
		{
			
			System.out.println("Introduce el código de la caja fuerte");
			Scanner entrada = new Scanner(System.in);
			clave = entrada.nextInt();	
			if (clave == 4339);
			else System.out.println("Clave denegada");
			intentos++;
		}while(clave != 4339 && intentos<4);
		
		if(intentos == 4)
		{
			System.out.println("Se han excedido los intentos, intentelo de nuevo más tarde");
			
		}
		else System.out.println("Clave correcta, Acceso permitido");

	}

}
