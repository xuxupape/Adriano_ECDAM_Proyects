package nombres;

public class ejer92 {

	public static void main(String[] args) {

		Nombres p1 = new Nombres();
		Nombres p2 = new Nombres();
		
//		p1.setNombres(5,5,5,5,342);
//		p2.setNombres(5,5,5,5);
//		
//		System.out.println("La suma de todos los números es: " + p1.getNum());

		Nombres.setComas(30.15,20,25, 10 , 10 , 10);
		System.out.println(Nombres.getNum());
		Nombres.setComas(10,15, 10,15, 20);
		System.out.println(Nombres.getNum());
	}

}
