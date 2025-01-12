package contacto;

public class Rep2 {

	public static void main(String[] args) {
		
		Direccion d1 = new Direccion("Calle","Convenio", 95, 28053,"Madrid");
		Contacto c1 = new Contacto("Adriano", 638232549,d1);

		System.out.println(c1);
	}

}
