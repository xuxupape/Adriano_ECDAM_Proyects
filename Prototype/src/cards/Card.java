package cards;

public class Card {
	
	//Atributos para constructor
	
	private String color;
	private String numero;
	private int value;
	
	//Atributos opcionales
	
	private String type;
	private String medal;
	
	//Constructor
	
	public Card(String color, String numero, int value) {
		super();
		this.color = color;
		this.numero = numero;
		this.value = value;
	}
	
	//Getters y Setters

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMedal() {
		return medal;
	}

	public void setMedal(String medal) {
		this.medal = medal;
	}
	
	@Override
    public String toString() {
        return numero + " de " + color + " (Valor: " + value + ")";
    }
	
}
