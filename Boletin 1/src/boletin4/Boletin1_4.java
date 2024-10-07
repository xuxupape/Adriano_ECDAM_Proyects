package boletin4;

public class Boletin1_4 {

	public static void main(String[] args) {
		int num=5;
		num += 1;
		num++;
		int resto=num%2;
		System.out.println("El numero es: " + num);
		System.out.println("Dividido entre 2 el resto es:" + resto);
		boolean par= (resto==0);
		System.out.println(par);
	}

}
