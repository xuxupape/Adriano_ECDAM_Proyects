package empleados;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		
		Empleados p1 = new Empleados();
		Empleados p2 = new Empleados();
		
		System.out.println(p1.edad);
		System.out.println(p2.edad);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bienvenido");
		System.out.println("Introduce tu edad");
		p2.edad= entrada.nextInt();
		System.out.println("Introduce tu número de empleado");
		p2.numemp=entrada.nextInt();
		System.out.println("Introduce tu sueldo");
		p2.sueldo=entrada.nextInt();
		System.out.println("Introduce tu nombre");
		p2.nombre=entrada.nextLine();
		p2.nombre=entrada.nextLine();
		
		System.out.println("Datos actuales \t Empleado 1 \t Empleado 2 \n Nombre \t " + p1.nombre + " \t\t " + p2.nombre
				+ "\n edad \t\t " + p1.edad + " \t\t " + p2.edad + "\n Num empleado \t " + p1.numemp + " \t\t " + p2.numemp + 
				"\n Sueldo \t " + p1.sueldo + " \t\t " + p2.sueldo);
		
		//p1.setSalario(1500);
		//p2.setSalario(5700);
		
		//System.out.println("Salarios: " + p1.sueldo + "\t" + p2.sueldo );

		p1.subida(300);
		p2.subida(300);
		
		System.out.println("Teniendo en cuenta los plus que se les das a los mayores de 40 los sueldo quedan en: ");
		p1.getSalario();
		p2.getSalario();
		
		System.out.println("Teniendo en cuenta la retención del plus los sueldos quedan en:");
		p1.retencion(150, 300);
		p2.retencion(150, 300);
		
		p1.getSalario();
		p2.getSalario();
		
	}

}
