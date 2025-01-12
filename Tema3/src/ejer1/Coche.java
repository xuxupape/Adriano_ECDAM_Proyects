package ejer1;

public class Coche {
	
		public int velocidad=50;
	
		public Coche() {
			
		}
		
		public int getVelocidad() {
			return  velocidad;
		}
		
		public void acelera (int incremento) {
			velocidad+=incremento;
		}
		
		public void frena (int decremento) {
			velocidad-=decremento;;
		}
	

}

