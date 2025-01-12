package Arrays;

public class prueba1arrays {

	public static void main(String[] args) {

		int suma=0, mayor= 0, menor
				;
		
		int [] nums = {123, 213, 50,3};
		
		menor = nums[1];
		
		for (int i = 0; i < nums.length ; i++) {
			
			suma+=nums[i];
			
			if(nums[i]<menor) {
				menor=nums[i];
			}
			
			if(nums[i]>mayor) {
				mayor=nums[i];
			}
			
		}
		
		System.out.println(mayor);
		System.out.println(menor);
		System.out.println(suma);

	}

}
