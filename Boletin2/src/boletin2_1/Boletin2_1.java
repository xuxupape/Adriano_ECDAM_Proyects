package boletin2_1;

public class Boletin2_1 {

	public static void main(String[] args) {
		
		int a = 2;
		int b= 4;
		
		
		boolean andlogicotrue = (a == 2 && b == 4 );
		
		System.out.println(" AMBAS SON VERDADERAS (Puerta AND logica) ");
		System.out.println(andlogicotrue);
		
		boolean andlogicofalse = (a == 2 && b == 3);

		System.out.println("");
		System.out.println(" UNA VERDADERA OTRA FALSA (Puerta AND logica)  ");
		System.out.println(andlogicofalse);
		
		boolean orlogicotrue = (a == 2 || b == 4);
		
		System.out.println("");
		System.out.println(" AMBAS SON VERDADERAS ( Puerta OR logica) ");
		System.out.println(orlogicotrue);
		
		boolean orlogicofalse = (a == 2 || b == 5);
		
		System.out.println("");
		System.out.println(" UNA VERDADERA OTRA FALSA (Puerta OR logica) ");
		System.out.println(orlogicofalse);
		
		boolean orexclusivatrue = (a == 2 ^ b == 4);
		
		System.out.println("");
		System.out.println(" AMBAS SON VERDADERAS (Puerta OR exclusiva)");
		System.out.println(orexclusivatrue);
		
		boolean orexclusivafalse = ( a == 2 ^ b == 5);
		
		System.out.println("");
		System.out.println(" UNA VERDADERA OTRA FALSA (Puerta OR exclusiva)");
		System.out.println(orexclusivafalse);
		
		boolean negacion = !(a == 2);
		System.out.println("");
		System.out.println(" SOLO UNA VERDADERA (Negacion)");
		System.out.println(negacion);
		
		int c;
		System.out.println('c');
		
		
	}

}
