package persona;

public class Persona {

	private String nombre,DNI;
	private int edad;
	private double peso,altura;
	private char sexo;
	private String msj;
	
	Persona(){
		this.sexo = 'H';
		this.DNI = "00000000A";
	}
	
	Persona(String nombre, int edad, char sexo){
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
	}
	
	Persona(String nombre, char sexo, int edad){
		this(nombre,edad,sexo);
		this.DNI=DNI;
	}
	
	Persona(String nombre, char sexo, int edad, double peso, double altura){
		
		this(nombre,edad,sexo);
		this.DNI=DNI;
		this.peso=peso;
		this.altura=altura;
	}
	
	Persona(String nombre, String DNI, char sexo, int edad, double peso, double altura){
		
		this(nombre,edad,sexo);
		this.DNI=DNI;
		this.peso=peso;
		this.altura=altura;
	}
	
	public String setNombre(String nombre) {
		this.nombre=nombre;
		return nombre;
	}
	
	public String setDNI(String DNI) {
		this.DNI=DNI;
		return DNI;
	}
	
	public char setSexo(char sexo) {
		this.sexo=sexo;
		return sexo;
	}
	
	public int setEdad(int edad) {
		this.edad=edad;
		return edad;
	}
	
	public double setPeso(double peso) {
		this.peso=peso;
		return peso;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public String calcularIMC() {
		
		double alm=(peso/(altura*altura));
		
		
		if(peso!=0) {
			if(alm <= 20){
			msj="Tienes que comer más kebaps";
			}else if(alm > 20) {
			msj="Estás en un buen punto";
			}else {
			msj="Tienes que comer menos kebaps";
			}
		}
		else {
			msj="No has introducido valores en el atributo PESO";
		}
		return msj;
			
	}
	
	public boolean mayorEdad() {
		
		boolean mayoria = false;
		
		if(edad >= 18) {
			mayoria=true;
		}
		
		return mayoria;
	}
	
	
	public String comprobarSexo() {
		
		if(sexo != 'H' && sexo != 'F') {
			msj="No has introducido un sexo válido se vuelve al valor por defecto";
			sexo='H';
		}
		else {
			msj="Has introducido correctamente tu sexo";
		}
		return msj;
		
	}
	
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura
				+ ", sexo=" + sexo + "]\n";
	}
	
	public boolean iguales(Persona p1, Persona p2) {
		
		boolean igual = false;
		
		
		if(p1.equals(p2)) {
			igual=true;
		}
		
		return igual;
	}
	
	
	
}
