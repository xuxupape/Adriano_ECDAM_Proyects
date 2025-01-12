package nombres;

public class Nombres {

	String almacen = "";
	static double numeros;
	
//	public static void setNombres (int ... v) {
		
//		for(int i = 0; nombre.length > i ; i++ ) {
//			System.out.println("El número de parametros es: " + nombre.length);
//			almacen = almacen + "Posición " + i  + ": " + nombre[i] + "\n" ;
//		}
//		
//		for(int i = 0; v.length >i ; i++) {
//			numeros+=v[i];
//		}
//	}
	
	public static void setComas (double q,double w, int...e) {
		
		for(int i = 0; i<2;i++) {
			numeros = numeros + q + w + e[i];
		}
	}
	public static 
	double getNum() {
		return numeros;
	}

}
	
	
