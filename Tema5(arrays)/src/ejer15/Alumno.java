package ejer15;

import java.util.Arrays;

public class Alumno {

	String nombre;
	double [] notas = new double [4];
	
	Alumno(String nombre, double [] notas) {
		
		this.nombre = nombre;
		for(int i = 0; i<notas.length;i++) {
			this.notas[i] = notas[i];
		}

	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return "Nombre = " + nombre + " notas = " + Arrays.toString(notas) + "]";
	}
	
	
	
}
