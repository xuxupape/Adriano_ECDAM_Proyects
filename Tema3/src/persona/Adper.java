package persona;
import java.util.Scanner;

public class Adper {

	
	
	public static String newPers() {
		
		Scanner entrada = new Scanner (System.in);
		String nombre,DNI;
		String alm="h";
		int edad;
		String sexo;
		char sex;
		double peso,altura;
		
		System.out.println("A continuación se te va a pedir el nombre, edad, sexo, peso y altura");
		
		System.out.println("¿Cuál es tu nombre?");
		
		nombre=entrada.next();
		
		System.out.println("¿Cuál es tu edad?");
		
		edad=entrada.nextInt();
		
		System.out.println("¿Cuál es tu DNI?");
		
		DNI=entrada.next();
		
		System.out.println("¿Cuál es tu sexo?");
		
		sexo=entrada.next();
		sex=sexo.charAt(0);
		
		System.out.println("¿Cuál es tu peso?");
		
		peso=entrada.nextDouble();
		
		System.out.println("¿Cual es tu altura?");
		
		altura=entrada.nextDouble();
		
		Persona p1 = new Persona(nombre,sex, edad, peso, altura);
		Persona p2 = new Persona(nombre,sex, edad);
		Persona p3 = new Persona();
		
		alm=p1.toString();
		alm+=p2.toString();
		alm+=p3.toString();
		
		System.out.println(alm);
		
		if(p1.mayorEdad()==true) {
			System.out.println("Persona 1 es mayor de edad");
		}else System.out.println("Persona 1 es menor de edad");
		
		if(p1.mayorEdad()==true) {
			System.out.println("Persona 1 es mayor de edad");
		}else System.out.println("Persona 1 es menor de edad");
		
		if(p2.mayorEdad()==true) {
			System.out.println("Persona 2 es mayor de edad");
		}else System.out.println("Persona 2 es menor de edad");
		
		if(p3.mayorEdad()==true) {
			System.out.println("Persona 3 es mayor de edad");
		}else System.out.println("Persona 3 es menor de edad");
		
		return alm;
		
	}
	
}
