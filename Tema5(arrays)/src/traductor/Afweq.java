package traductor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Afweq {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				Random r = new Random();
				HashMap<String, String> dic = new HashMap<String, String>();
				dic.put("rojo", "red");
				dic.put("azul", "blue");
				dic.put("negro", "black");
				dic.put("amarillo", "yellow");
				dic.put("blanco", "white");
				dic.put("morado", "purple");
				System.out.println(dic);
//				System.out.println(dic.values());
//				System.out.println(dic.get(2));

				ArrayList<String> palabras = new ArrayList<>(dic.keySet());
				ArrayList<String> p = new ArrayList<>();
				System.out.println(palabras);

				while (p.size() < 3) {
//					int pos=r.nextInt(palabras.size());
					String palabra = palabras.get(r.nextInt(palabras.size()));
					if (!p.contains(palabra)) {
						p.add(palabra);
					}
				}
				System.out.println(p);
				int respuestascorrecta = 0;
				// falta las respuestas incorrectas(pereza zzz)
				for (String pal : p) {
					System.out.println("traduce " + pal);
					String respuesta = sc.next();
					if (respuesta.equals(dic.get(pal))) {
						System.out.println("correcto");
						respuestascorrecta++;
					}
				}
				System.out.println(respuestascorrecta);

				// estructura del 9

//				String palabra=sc.next();
//				if(dic.containsKey(palabra)) {
//					System.out.println("traduccion "+dic.get(palabra));
//				}

//				String adivinar=sc.next();
//				do {
//					for (int i = 0; i < dic.size(); i++) {
//						System.out.println(dic.get(0+i));
//					}
//				}
//				while(!adivinar.equals("no"));
//				
//				
			}
		

	}


