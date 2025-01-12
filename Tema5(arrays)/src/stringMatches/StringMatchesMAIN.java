package stringMatches;

public class StringMatchesMAIN {

	public static void main(String[] args) {
		
		String prueba = "30/12/2024";	
		
		System.out.println("Ejer 1: " + prueba.matches("\\d{1,}"));

		System.out.println("Ejer 2: " + prueba.matches("[a-z || A-Z || 1-9]*[@][a-z || A-Z || 1-9]*[.][a-z || A-Z || 1-9]*"));
			
		System.out.println("Ejer 3: " + prueba.matches("[A-Z]+"));
		
		System.out.println("Ejer 4: " + prueba.matches("\\d{10}"));
		
		System.out.println("Ejer 5: " + prueba.matches("0[1-9][1-2][0-9]3[01]/0[1-9]1[1-2]/\\d{4}"));
		
		//System.out.println("Ejer 5: " + prueba.matches("[1-3]?[1-9][/][0-1]?[1-9][/]\\d{4}"));
	
		System.out.println("Ejer 6: " + prueba.matches("[a-z || A-Z || \\s]*"));
		
		System.out.println("Ejer 7: " + prueba.matches("[0-2][0-9][0-9].[0-2][0-9][0-9].[0-2][0-9][0-9].[0-2][0-9][0-9]"));
				
		System.out.println("Ejer 8: " + prueba.matches("\\d{5}"));
			
		System.out.println("Ejer 9: " + prueba.matches("\\w+"));
		
		System.out.println("Ejer 10: " + prueba.matches("\\w {3,15}"));
		
		System.out.println("Ejer 11: " + prueba.matches("[0-9 || A-F]+"));
	
		System.out.println("Ejer 12: " + prueba.matches("[aeiou || AEIOU].*"));
				
		System.out.println("Ejer 13: " + prueba.matches("[0-9]*,[0-9]*"));
				
		System.out.println("Ejer 14: " + prueba.matches(".*java.*"));
			
		System.out.println("Ejer 15: " + prueba.matches("#[0-9 || A-F]{6}"));
			
		System.out.println("Ejer 16: " + prueba.matches("[0-9]{4}-[A-Z]{3}"));
	}

}
