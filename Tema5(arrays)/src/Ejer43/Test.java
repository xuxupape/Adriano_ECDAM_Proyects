package Ejer43;
import java.util.Scanner;

public class Test {

	private int n_pregunta;
	private String enunciado;
	private String [] opciones = new String[4]; 
	private char valida;

	
	public void setNumero(int n_pregunta) {
		this.n_pregunta=n_pregunta;
	}
	
	public void setEnunciado(String enunciado) {
		this.enunciado=enunciado;
	}

	public void setOpciones(String[] opciones) {
		this.opciones = opciones;
	}
	
	public void setValida(char valida) {
		this.valida=valida;
	}
	
	public int getNumero() {
		return this.n_pregunta;
	}
	
	public String getEnunciado() {
		return this.enunciado;
	}
	
	public String [] getOpciones() {
		return this.opciones;
	}
	
	public char getValida() {
		return valida;
	}
	
	public void pregunta() {
		System.out.println("Pregunta número: " + n_pregunta);
		System.out.println(this.getEnunciado());
		for (int i = 0; i < opciones.length;i++) {
			System.out.println(opciones[i]);
		}
	}
}
