package fruteria;

public class Fruteria {

	String fruta, procedencia, comp;
	double kilos, costperkilo, ventperkilo, precfin;

	static double venta;

	Fruteria(String fru, String proc, double kilo, double costperkil, double ventperkil) {

		fruta = fru;
		procedencia = proc;
		kilos = kilo;
		costperkilo = costperkil;
		ventperkilo = ventperkil;
	}

	public void getFruta() {

		System.out.println("Fruta: " + fruta + "\n Procedencia: " + procedencia + "\n Kilos: " + kilos
				+ "\n Coste por kilo: " + costperkilo + "\n Venta por kilo: " + ventperkilo);
	}

	public String rebaja(double oferta) {
		if ((ventperkilo - oferta) >= costperkilo) {
			this.ventperkilo = ventperkilo - oferta;

		} else
			comp = "Error la rebaja es demasiada";
		return comp;
	}

	public double vender(double kilaje) {
		if (kilaje < kilos) {
			kilos -= kilaje;
			this.venta = (kilaje * ventperkilo) + this.venta;

		} else
			comp = "Error no hay tantos kilos para soportar la demanda ";
		return this.venta;
	}

	public String pro(String procedencia1, String precedencia2) {

		if (procedencia1.equalsIgnoreCase(precedencia2)) {
			comp = "Si, las procedencias son iguales";
		} else
			comp = "No, las procedencias no son iguales";

		return comp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
