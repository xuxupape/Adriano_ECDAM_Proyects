package fruteria;

public class Ejer32 {

	public static void main(String[] args) {
		
		Fruteria f1 = new Fruteria("Melón", "Rusia", 35 , 0.90 , 1.90);
		Fruteria f2 = new Fruteria("Melocoton", "Rusia", 90 , 1.20 , 2.90);
		Fruteria f3 = new Fruteria("Sandia", "Mauritania", 45 , 0.60 , 1.70);
		
		f1.getFruta();
		f2.getFruta();
		f3.getFruta();
		
		f1.pro(f1.procedencia, f2.procedencia);
		
		f3.rebaja(0.20);
		
		f3.getFruta();
		
		f1.vender(5);
		f2.vender(10);
		f3.vender(25);
		
		System.out.println(f1.venta);
		
		System.out.println(f1.rebaja(2334));

	}

}