package traductor;
import java.util.*;

public class Traductor {

	public static void main(String[] args) {
		
		HashMap<String, String> trad = new HashMap<String, String>();
		
		trad.put("arbol", "tree");
		trad.put("pan", "bread"  );
		trad.put("paragüas", "umbrella" );
		trad.put("valiente", "brave" );
		trad.put("coche", "car" );
		trad.put("hacha" , "axe" );
		trad.put("lista", "list" );
		trad.put("malo", "bad" );
		trad.put("bueno", "good" );
		trad.put("manzana","apple" );
		trad.put("platano", "banana" );
		trad.put("naranja", "orange");
		trad.put("morado", "purple");
		trad.put("vaca", "cow");
		trad.put("perro", "dog" );
		trad.put("gato", "cat" );
		trad.put("destino", "duty" );
		trad.put("arena", "sand" );
		trad.put("tronco", "oak");
		trad.put("escalera" ,"stair");
		
		HashMap<Integer, String> ran = new HashMap<Integer, String>();
		
		ran.put(1,"arbol");
		ran.put(2,"pan");
		ran.put(3,"paragüas");
		ran.put(4,"valiente");
		ran.put(5,"coche");
		ran.put(6,"hacha");
		ran.put(7,"lista");
		ran.put(8,"malo");
		ran.put(9,"bueno");
		ran.put(10,"manzana");
		ran.put(11,"platano" );
		ran.put(12,"naranja");
		ran.put(13,"morado");
		ran.put(14,"vaca");
		ran.put(15,"perro");
		ran.put(16,"gato");
		ran.put(17,"destino");
		ran.put(18,"arena");
		ran.put(19,"oak");
		ran.put(20,"stair");
		
		int elegido = 0;
		ArrayList <Integer> repes = new ArrayList<Integer>() ;
		Scanner entrada = new Scanner(System.in);
		String traducida = "";
		
		for(int i = 5; i > 0 ; i-- ) {
			
			elegido = (int) (((Math.random()*20)+1));
			
			if(repes.contains(elegido)) {
				i++;
			}else {
				
				System.out.println("La palabra elegida es: ");
				System.out.println(ran.get(elegido));
				traducida = entrada.next();

				if((trad.get(ran.get(elegido)).equalsIgnoreCase(traducida))) {
					System.out.println("Has traducido correctamente");
				}else{
					System.out.println("No has traducido correctamente");
				};
				repes.add(elegido);
				
			}
			
		}
		
	}

}
