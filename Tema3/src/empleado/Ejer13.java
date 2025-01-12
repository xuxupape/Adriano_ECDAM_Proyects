package empleado;

public class Ejer13 {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("Toño", 634234642);
		Empleado e2 = new Empleado("Susanita", 673849023);
		Empleado e3 = new Empleado("Suso", 675849034);
		
		System.out.println(Empleado.getEmpleados());
		
		System.out.println(e1.getNombre());
		System.out.println(e2.getTelefono());
		System.out.println(e3.getNombre());
		
		e1.setNombre("Alberto");
		
		System.out.println(e1.getNombre());
		

	}

}
