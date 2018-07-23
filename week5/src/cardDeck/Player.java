package cardDeck;

import java.util.ArrayList;
import java.util.List;

public class Player {
		
	private List<Card> hand;
	private int score;
	private String name;
	
	public void checkHand() {
		for(Card card : hand) {
			System.out.println(card.toString());
		}
		
	}
	
	public Player(String name) {
		hand = new ArrayList<Card>();
		this.name = name;
	}
	
	public boolean discard(Card card) {
		
		return hand.remove(card);
	}
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	@Override
	public String toString() {
		return "name: " + name + " - Score: " + score;
		
	}
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
