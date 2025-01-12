package valores100;
import java.util.Arrays;
import java.util.Scanner;

public class Valores100 {

	public static void main(String[] args) {
		
		int dif = -1;
		int [] nums = new int [10];
		int [] aux = new int [10];
		
		for(int i = 0 ; i < 10 ; i++) {
	
			
			
			do {
				aux[i] = (int)  ((Math.random()*30)+1);
			}while(Arrays.binarySearch(nums, aux[i]) >= 0	);	
			
			nums[i]=aux[i];			
		}
		
		Arrays.sort(nums);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu número y si está en la lista ganas 500€");
		
		int numele = entrada.nextInt();
		
		Arrays.sort(nums);
		
		
		if(Arrays.binarySearch(nums, numele) >= 0) {
			System.out.println("El número elegido SI está en el vector");
		}else System.out.println("El número elegido NO está en el vector");
		
		

		for(int cadena : nums) {
			System.out.println(cadena);
		}
		
	}

}
