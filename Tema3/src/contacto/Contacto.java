package contacto;

public class Contacto {

	private String nombre;
	private Direccion dir;
	private int telefono, numContactos;
	
	Contacto(String nombre, int telefono){
		this.nombre=nombre;
		this.telefono=telefono;
	}
	
	Contacto(String nombre, int telefono, Direccion dir){
		this(nombre,telefono);
		this.dir=dir;
	}
	
	public void telefValido() {
		if(telefono<100000000 || telefono>999999999) {
			telefono=999999999;
			System.out.println("El teléfono no es válido, será asignado uno por defecto");
		}else System.out.println("Número de teléfono válido");
		
	}

	public void altaContacto() {
		if(numContactos > 3) {
			System.out.println("No se ha podido crear el contacto elimine 155");
		}
	}
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", dir=" + dir + ", telefono=" + telefono + "]";
	}
	
	
	
}
