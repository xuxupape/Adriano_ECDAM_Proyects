package scanner10;
import java.util.Scanner;

public class Scanner10 {

	public static void main(String[] args) {
		
		Scanner mbaconv = new Scanner(System.in);
		System.out.println("Introduce el número de MB que deseas convertir a KB");
		int mbreco = mbaconv.nextInt();
		int mbconv = mbreco * 1024 ;
		System.out.println(mbreco + " 1MB son: " + mbconv + "KB");
		
		//Lo mismo pero diviendo para ser al reves
	}

}
