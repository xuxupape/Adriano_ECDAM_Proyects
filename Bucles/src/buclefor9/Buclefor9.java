package buclefor9;
import java.util.Scanner;

public class Buclefor9 {

	public static void main(String[] args) {
		
		System.out.println("Escribe tu numero a factorizar");
		Scanner entrada = new Scanner(System.in);
		int f = 0 ;
		f=entrada.nextInt();
		int contador1=1;
		int factorial = 1;
		for(contador1=1; contador1<=f ;contador1++){
			
			factorial*=contador1;
		}
		
		System.out.println(factorial);
		
	}

}
