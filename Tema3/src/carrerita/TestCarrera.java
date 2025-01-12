package carrerita;

public class TestCarrera {

	public static void main(String[] args) {

		Corredor c1 = new Corredor("Paquito", 10);
		Corredor c2 = new Corredor("Usain Bolt");
		
		Carrera carrera1 = new Carrera(c1,c2);
		
		System.out.println(carrera1.calcularGanador());
		
		carrera1.competir();

		System.out.println(c1.getVelocidad());
		System.out.println(c2.getVelocidad());
	}

}
