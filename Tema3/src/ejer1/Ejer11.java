package ejer1;

public class Ejer11 {

		public static void main(String[] args) {
		
		Coche c1 = new Coche();
		
		
		System.out.print(c1.velocidad + " Si acelera se pone a " );
		c1.acelera(15);
		System.out.print(c1.velocidad);
		c1.frena(30);
		System.out.print(" si frena bastante se pone en " + c1.velocidad);
	}
}
