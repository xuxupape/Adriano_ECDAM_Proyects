package avion;

public class Avion {
	
	String nombre;
	String nif;
	String clase;
	int asiento;
	int maletas;
	boolean catering;
	boolean baño;
	String alm;
	int coste;
	
	
	public Avion(String nombre, String nif){
		
		this.nombre = nombre;
		this.nif = nif;
		clase = "Turista";

	}
	
	public Avion(String nombre, String nif, String clase){
		
		this(nombre,nif);
		this.clase = clase;

	}
	
	public void setExtras(boolean baño, boolean catering, int maletas){
		this.baño = baño;
		this.catering = catering;
		this.maletas = maletas;
		this.asiento = asiento;
	}
	
	public void comprobacion() {
		if (clase.equalsIgnoreCase("turista") ) 
		{
			coste+=200;
			
			if((baño==true)&&(catering==true)) {
				coste+=30;
			}
			else if(baño==true && catering==false) {
				coste+=10;
			}
			else if(baño==false && catering==true) {
				coste+=20;
			}
			
			if(maletas > 1) 
			{
				coste+=((maletas-1)*50);
			}
			
		}
		else if(clase.equalsIgnoreCase("business")) 
		{
			coste+=400;
			baño=true;
			catering=true;
			
			if(maletas > 3) 
			{
				coste = coste + ((maletas- 3)*50);
			}
		}
		else if (clase.equalsIgnoreCase("vip")) 
		{
			coste+=600;
			baño=true;
			catering=true;
		}
	}
	
	public void getBillete() {
		alm = ("Los datos actuales de tu billete son: \n Nombre: " + nombre + "\n NIF: " + nif + "\n Clase: "+ clase + "\n");
		System.out.println(alm);
	}
	
	public void getExtras() {
		System.out.println(alm + "Los extras son: \n Baño: " + baño + "\n Catering: " + catering + "\n Asiento: " + 
				asiento + "\n maletas: " + maletas+ "\n");
	}
	
	public void getCoste() {
		System.out.println("\n El coste total de su billete es de: " + coste + "€");
	}
	
}
