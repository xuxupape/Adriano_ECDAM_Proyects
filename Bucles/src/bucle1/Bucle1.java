package bucle1;
import java.util.Scanner;

public class Bucle1 {

	public static void main(String[] args) {
		
		int multiplicador = 0;
		int multiplicado = 5;
		int multi = 0;
		
		while (multi < 100)
		{
			multi = multiplicador*multiplicado;
			System.out.println(multi);
			multiplicador++;
		}

	}

}
