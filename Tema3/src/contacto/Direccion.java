package contacto;

public class Direccion {
	
	private String calle, nombre, puerta, provincia;
	private int numero, portal, piso, cp;
	
	Direccion(String calle, String nombre, int numero, int cp, String provincia){
		
		this.calle=calle;
		this.nombre=nombre;
		this.numero=numero;
		this.cp=cp;
		this.provincia=provincia;
		
	}
	
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", nombre=" + nombre + ", provincia=" + provincia + ", numero=" + numero
				+ ", cp=" + cp + "]";
	}


	public void setPuerta(String puerta) {
		this.puerta=puerta;
	}
	
	public void setPortal(int portal) {
		this.portal=portal;
	}

	public void setPiso(int piso) {
		this.piso=piso;
	}
}
