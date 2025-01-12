package carrerita;
import java.lang.Math;

public class Carrera {

	private final static int LONGITUD = 400;
	private int disRec1 = 0, disRec2 = 0;
	private String ganador;
	private Corredor c1,c2;
	
	Carrera(Corredor c1,Corredor c2){
		
		this.c1 = c1;
		this.c2 = c2;
		
	}
	
	public String mostrarDatosC() {
		String datos;
		datos= "Corredor 1: " + c1.getNombre() + " - Velocidad: " + c1.getVelocidad() + "km/h"
				 + "\n Corredor 2: " + c2.getNombre() + " - Velocidad: " + c2.getVelocidad();
		return datos;
	}
	
	public String calcularGanador() {
		
		int random1, random2;
		
		do {
		
		int velocidadTemp1 = c1.getVelocidad(); 
		int	velocidadTemp2 = c2.getVelocidad();	
			
		random1 =(int) (Math.random()*10);
		random2 =(int) (Math.random()*10);	
			
		if(random1 >= random2) {
			velocidadTemp1 = c1.getVelocidad() + 1;
		}else velocidadTemp2 = c2.getVelocidad() + 1; 
		
		
		System.out.println(c1.getNombre() + " tiene una velocidad de:" + velocidadTemp1 + "km/h ha recorrido: "+ disRec1 + "Metros");
		System.out.println(c2.getNombre() + " tiene una velocidad de:" + velocidadTemp2 + "km/h ha recorrido: "+ disRec2 + "Metros");
		System.out.println();
		
		disRec1+=velocidadTemp1;
		disRec2+=velocidadTemp2;
		
		
		}while((disRec1 <= LONGITUD)  && (disRec2 <= LONGITUD));
		
		if(disRec1 == disRec2) {
			ganador="Empate";
		} 
		else if(disRec1 > disRec2) {
			ganador=c1.getNombre() ;
		}else ganador = c2.getNombre();
		
		return "Ha ganado... " + ganador ;
	}
	
	public void competir() {
		
		if(ganador.equalsIgnoreCase(c1.getNombre())) {
			c1.aumentarVel();
		}else if(ganador.equalsIgnoreCase(c2.getNombre())) {
			c2.aumentarVel();
		}
		
		
	}
}
