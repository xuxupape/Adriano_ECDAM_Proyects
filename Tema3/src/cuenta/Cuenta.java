package cuenta;
import java.util.Scanner;

public class Cuenta {

	String titular;
	double cantidad;
	
	Cuenta(String titular){
		
		this.titular=titular;
		
	}
	
	Cuenta(String titular, double cantidad){
		
		this.titular=titular;
		this.cantidad=cantidad;
	}
	
	Cuenta(Cuenta c1){
		
		this.titular=c1.getTitular();
		this.cantidad=c1.getCantidad();
		
	}

	public String getTitular(){
		return titular;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
	public String setTitular(String titular) {
		this.titular=titular;
		return titular;
	}
	
	public double setCantidad(double cantidad) {
		this.cantidad=cantidad;
		return cantidad;
	}

	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "] \n";
	}
	
	public static String iguales(Cuenta c1, Cuenta c2) {
		
		String msj;
		
		if(c1.equals(c2)) {
			msj="Los parametros que has pasado son iguales";
		}else msj= "Los parametros que has pasado son diferentes";
		
		return msj;
		
	}
	
	public String ingresar(double ingre) {
		
		String resul="";
		
		if(ingre>0) {
			cantidad+=ingre;
			resul="Los " + ingre + "€ han sido ingresados con exito";
		}else resul = "No se ha podido ingresar el dinero porque se ha introducido una cantidad incorrecta";	
		
		return resul;
	}
	
	public String retirar(double retir) {
		
		String resul="";
		
		if(retir<=cantidad) {
			cantidad-=retir;
			resul="Los " + retir + "€ han sido retirados con exito";
		}else resul = "No hay suficiente saldo";	
		
		return resul;
	}
	
	
}
