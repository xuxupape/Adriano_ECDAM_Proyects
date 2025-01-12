package Ejer43;

import java.util.Scanner;

public class ejer43 {
	
	public static void main(String[] args) {

		Test t1 = new Test();

		t1.setNumero(1);
		t1.setEnunciado("¿Cuántos campeones tiene el League of Legends?");
		String[] opciones1 = {"A) 169", "B) 163", "C) 153", "D) 159"};
		t1.setOpciones(opciones1);
		t1.setValida('A');

		Test t2 = new Test();

		t2.setNumero(2);
		t2.setEnunciado("¿En qué año se lanzó League of Legends?");
		String[] opciones2 = {"A) 2008", "B) 2011", "C) 2009", "D) 2010"};
		t2.setOpciones(opciones2);
		t2.setValida('C');

		Test t3 = new Test();

		t3.setNumero(3);
		t3.setEnunciado("¿Cuál es el nombre del creador de League of Legends?");
		String[] opciones3 = {"A) Brandon Beck", "B) Marc Merrill", "C) Ambos", "D) Ninguno"};
		t3.setOpciones(opciones3);
		t3.setValida('C');

		Test t4 = new Test();

		t4.setNumero(4);
		t4.setEnunciado("¿Cuál es el rol principal de Jinx?");
		String[] opciones4 = {"A) Soporte", "B) Tirador", "C) Jungla", "D) Mago"};
		t4.setOpciones(opciones4);
		t4.setValida('B');

		Test t5 = new Test();

		t5.setNumero(5);
		t5.setEnunciado("¿Qué región representa el campeón Yasuo?");
		String[] opciones5 = {"A) Demacia", "B) Noxus", "C) Ionia", "D) Freljord"};
		t5.setOpciones(opciones5);
		t5.setValida('C');

		Test t6 = new Test();

		t6.setNumero(6);
		t6.setEnunciado("¿Qué habilidad es la definitiva de Lux?");
		String[] opciones6 = {"A) Prisión de Luz", "B) Singularidad Brillante", "C) Barrera Prismática", "D) Chispa Final"};
		t6.setOpciones(opciones6);
		t6.setValida('D');

		Test t7 = new Test();

		t7.setNumero(7);
		t7.setEnunciado("¿Cuántos dragones elementales existen actualmente en el juego?");
		String[] opciones7 = {"A) 4", "B) 5", "C) 6", "D) 3"};
		t7.setOpciones(opciones7);
		t7.setValida('B');

		Test t8 = new Test();

		t8.setNumero(8);
		t8.setEnunciado("¿Qué significa el acrónimo CS en League of Legends?");
		String[] opciones8 = {"A) Creep Score", "B) Champion Skill", "C) Combat Score", "D) Critical Strike"};
		t8.setOpciones(opciones8);
		t8.setValida('A');

		Test t9 = new Test();

		t9.setNumero(9);
		t9.setEnunciado("¿Qué campeón utiliza el hechizo 'Acechador en las Sombras' como definitiva?");
		String[] opciones9 = {"A) Rengar", "B) Evelynn", "C) Nocturne", "D) Hecarim"};
		t9.setOpciones(opciones9);
		t9.setValida('C');

		Test t10 = new Test();

		t10.setNumero(10);
		t10.setEnunciado("¿Qué compañía es la desarrolladora de League of Legends?");
		String[] opciones10 = {"A) Blizzard", "B) Riot Games", "C) Valve", "D) Epic Games"};
		t10.setOpciones(opciones10);
		t10.setValida('B');
		
		Test [] examen = {t1, t2, t3, t4, t5, t6, t7 ,t8, t9, t10};
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i<examen.length-5; i++) {
			int pregunta_act = (int)((Math.random()*10)+1);
			
			
			examen[pregunta_act].pregunta();
			System.out.println("Selecciona la respuesta correcta");
			char respuesta = entrada.next().charAt(0);
			if(respuesta == examen[pregunta_act].getValida()) {
				System.out.println("Respuesta correcta");
			}else System.out.println("Respuesta incorrecta");
			
		}
		

		
		
	}

}
