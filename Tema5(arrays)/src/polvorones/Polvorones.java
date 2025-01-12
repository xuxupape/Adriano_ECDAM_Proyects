package polvorones;
public class Polvorones {

	String sabor;
	double precio;
	
	Polvorones(String sabor, double precio){
		
		this.sabor=sabor;
		this.precio=precio;
		
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String toString() {
		return "Polvorones [sabor=" + sabor + ", precio=" + precio + "]";
	}
	
	

}
