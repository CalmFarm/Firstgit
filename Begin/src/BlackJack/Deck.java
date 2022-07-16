package BlackJack;
import java.util.*;
public class Deck {
	
	//인스턴스
	private ArrayList<Card> cards;
	
	//생성자
	public Deck() {
		this.cards = new ArrayList<Card>();
	}

	public void createFullDeck() {
		//Generate Cards
		for(Suit cardSuit : Suit.values()) {
			for(Value cardValue : Value.values()) {
				//Add a new card to the mix
				this.cards.add(new Card(cardSuit,cardValue));
			}
		}
	}
	
	public void shuffle() {
		ArrayList<Card> tmpDeck = new ArrayList<Card>();
		//Use Random
		Random random = new Random();
		int randomCardIndex = 0;
		int originalSize = this.cards.size();
		
		for(int i =0;i<originalSize;i++) {
			randomCardIndex = random.nextInt((this.cards.size()-1 -0)+1)+0;
			tmpDeck.add(this.cards.get(randomCardIndex));
			this.cards.remove(randomCardIndex);
		}
		this.cards = tmpDeck;
	}
	
	
	public String toString() {
		String cardListOutput = "";
		for(Card acard : this.cards) {
			cardListOutput += "\n"+acard.toString();
		}return cardListOutput;
	}
	
	public void removeCard(int i) {
		this.cards.remove(i);
	}
	
	public Card getCard(int i) {
		return this.cards.get(i);
	}
	
	public void addCard(Card addCard) {
		this.cards.add(addCard);
	}
	//Draw from the deck
	public void draw(Deck comingFrom) {
		this.cards.add(comingFrom.getCard(0));
		
	}
	
	
	
}//class
