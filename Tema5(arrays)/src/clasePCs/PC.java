package clasePCs;

public class PC {

	int [] ipV4 = new int[4];
	String nombre;
	boolean ocu = false;
	
	PC(String nombre, int [] ipV4, boolean ocu){
		
		this.nombre=nombre;
		
		for(int i = 0; i < this.ipV4.length; i++) {
			this.ipV4[i] = ipV4[i];
		}
		
		this.ocu = true;
		
	}

	public boolean isOcu() {
		return ocu;
	}

	public void setOcu(boolean ocu) {
		this.ocu = ocu;
	}

	public int[] getIpV4() {
		return ipV4;
	}

	public void setIpV4(int[] ipV4) {
		this.ipV4 = ipV4;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void altaPC(PC p) {
		
		int i = 
		
		 for()
		
	}
	
	public void bajaPC(int [] cord) {
		int i = cord[0];
		int f = cord[1];
	}

}
