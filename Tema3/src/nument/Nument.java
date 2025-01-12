package nument;

public class Nument {
	
	int ent;
	
	Nument(int entero){
	
		ent=entero;
	}
	
	void c(int valor) {
		ent+=valor;
	}
	
	void resta(int rest) {
		ent-=rest;
	}
	
	int getValor() {
		return ent;
	}
	
	int getDoble() {
		return ent*2;
	}
	
	int getTriple() {
		return ent*3;
	}
	
		
	}
