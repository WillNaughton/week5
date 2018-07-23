package cardDeck;

public class Card {
	
	private int value;
	private String name;
	
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	//Methods
	@Override
	public String toString() {
		return "Name: " + name + " - Value: " + value;
		
	}
	
	
	//getters and setter
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
