package ejer31;

public class Finanzas {
	
	public double cartera;
	
	double valorDolarAEuro;
	
	public Finanzas(double valor){
		valorDolarAEuro=valor;
	}
	
	double dolaresToEuros(double euros) {
		return cartera = euros * valorDolarAEuro;
	}
	
	double eurosToDolares (double dolares) {
		return cartera = dolares/valorDolarAEuro;
	}
	

}
