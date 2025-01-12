package empleado;

public class Empleado {
	
	private  String nombre;
	private int telefono;
	static private int numEmpleados;
	
	Empleado(String nombre, int telefono){
		this.nombre=nombre;
		this.telefono=telefono;
		numEmpleados++;
	}
	
	public int setTelefono(int telefono) {
		this.telefono=telefono;
		return telefono;
	}
	
	public String setNombre(String nombre) {
		this.nombre=nombre;
		return nombre;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public static int getEmpleados() {
		return numEmpleados;
	}

}
