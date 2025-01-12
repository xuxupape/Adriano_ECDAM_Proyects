package celFar;

public class CelFar {
		
	double conversion;
	
	double temperatura() {
			return conversion;
		};
		
	double CelaFar (double far) {
		return (far*1.8)+32;
	}
	
	double FaraCel(double cel) {
		return  (cel-32)/1.8;
	}

}
