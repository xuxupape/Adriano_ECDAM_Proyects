package calculo;

public class Calculo {
	
	public String compararent(int numero1, int numero2) {
		
		String resul;
		
		if(numero1 > numero2) {
			resul = ("mayor: " + numero1 + " menor : " + numero2);
		}else if (numero1 == numero2) {
			resul = ("Tanto " + numero1 + " como " + numero2 + " son iguales");
		}else {
			resul = ("mayor: " + numero2 + " menor : " + numero1);
		}
		return resul;
	}
	

}
