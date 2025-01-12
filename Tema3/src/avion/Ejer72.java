package avion;

public class Ejer72 {

	public static void main(String[] args) {
		
		Avion b1 = new Avion("Adriano","50793523G", "VIP");
		Avion b2 = new Avion("Manolo","50764523G", "Turista");
		Avion b3 = new Avion("Angel","503495641G", "Business");
		
		b1.setExtras(true, true, 25);
		b2.setExtras(true, false, 3);
		b3.setExtras(true, true, 5);
		
		b1.getBillete();
		b2.getBillete();
		b3.getBillete();
		
		b1.comprobacion();
		b2.comprobacion();
		b3.comprobacion();
		
		b1.getCoste();
		b2.getCoste();
		b3.getCoste();
		
		System.out.println();
		
		b1.getExtras();
		b2.getExtras();
		b3.getExtras();

	}

}
