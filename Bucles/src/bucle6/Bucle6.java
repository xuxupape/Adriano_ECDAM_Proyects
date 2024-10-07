package bucle6;
import java.util.Scanner;
public class Bucle6 {

	public static void main(String[] args) {
		
		boolean listo=false;
		int numeromenor = 0;
		int numeromayor = 0;
		int primernum = 0;
		int segundonum = 0;
		
		while (listo=true)
			{
			System.out.println("Introduce tu primer digito");
			Scanner entrada1= new Scanner(System.in);
			primernum = entrada1.nextInt();

			System.out.println("Introduce tu segundo digito");
			Scanner entrada2 = new Scanner(System.in);
			segundonum = entrada2.nextInt();
		
			if (primernum == segundonum) {
			System.out.println("los dígitos son iguales vuelve a introducirlos");
			}
			else break ;
			}
		
		if (segundonum > primernum) {
			numeromenor=primernum;
			numeromayor=segundonum;}
		else {
			numeromayor=primernum;
			numeromenor=segundonum;}
		
		
		System.out.println("Sumando 7 entre" + numeromenor + "y"+ numeromayor);
		numeromayor= (numeromayor-7);	
		
		while (numeromenor < numeromayor) 
		{	
			numeromenor+=7;
			System.out.println(numeromenor);
		}
			
		
	
		}

}
