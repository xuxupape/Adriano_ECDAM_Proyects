package empleados;
import java.util.Scanner;

public class Empleados {
	
	String nombre;
	int edad,numemp, sueldo;
	
	
	Empleados(){
		
	}
	
	Empleados(String nom,int ed,int num,int suel){
		nombre = nom;
		edad = ed;
		numemp = num;
		sueldo = suel;
	}
	
	
	public int setSalario(int sueldo) {
		this.sueldo = sueldo;
		return sueldo;
	}
	
	public void getSalario() {
		System.out.println(sueldo + "\t");
	}
	
	public int subida(int plus) {
		if(edad > 40) {
			sueldo+=plus;
		}
		return sueldo;

	}
	
	public int retencion(int retenido, int plus) {
		
		if(edad > 40) {
		sueldo = sueldo + plus - (plus*retenido/100);
		}
		return sueldo;
	}

}
