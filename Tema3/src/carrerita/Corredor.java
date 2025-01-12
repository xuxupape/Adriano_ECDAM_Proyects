package carrerita;

public class Corredor {
	
	//Atributos
	
	private String nombre;
	private int velocidad;
	
	//Constructores
	
	Corredor(String nombre){
		
		this.nombre = nombre;
		this.velocidad = 10 ;
		
	}
	
	Corredor(String nombre, int velocidad){
		
		this.nombre=nombre;
		this.velocidad = velocidad;
		
	}
	
	//metodos
	
	public String getNombre() {
		return nombre;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad=velocidad;
	}
	
	public void aumentarVel() {
		velocidad++;
	}
}
