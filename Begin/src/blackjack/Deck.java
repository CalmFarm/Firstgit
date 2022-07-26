package blackjack;
import java.util.*;


/**
 * @author khs
 * Deck 카드의 덱을 가지는 클래스
 * 
 */
public class Deck {
	
	/**
	 * @author khs
	 * @Date : 2022. 7. 23.
	 * @Description 카드들을 배열에 저장
	 * 
	 */
	private ArrayList<Card> cards;
	
	/**
	 * 생성자 : 카드를 덱에 저장
	 */
	public Deck() {
		this.cards=new ArrayList<Card>();
	}

	/**
	 * 카드를 뽑고 섞는 메서드
	 */
	public void creatFullDeck() {
		for(Suit cardSuit: Suit.values()) {
			for(Value cardValue : Value.values()) {
				//카드를 뽑고 섞기
				this.cards.add(new Card(cardSuit,cardValue));
			}
		}
	}
	
	/**
	 * 카드를 섞고 랜덤으로 고르는 메서드
	 */
	public void shuffle() {
		ArrayList<Card> tmpDeck=new ArrayList<Card>();
		
		Random random = new Random();
		int randomCardIndex = 0;
		int originalSize = this.cards.size();
		for(int i=0;i < originalSize ;i++) {
			randomCardIndex = random.nextInt((this.cards.size()-1-0)+1)+0;
			tmpDeck.add(this.cards.get(randomCardIndex));
			this.cards.remove(randomCardIndex);
		}
		
		this.cards=tmpDeck;
		
	}
	
	

	public String toString() {
		String cardListOutput = "";
		for(Card aCard : this.cards) {
			cardListOutput += "\n "+aCard.toString();
		}
		return cardListOutput;
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
	
	

	public void draw(Deck comingFrom) {
		this.cards.add(comingFrom.getCard(0));
		comingFrom.removeCard(0);
	}
	


	public int deckSize() {
		return this.cards.size();
	}
	
	

	public void moveAllToDeck(Deck moveTo) {
		int thisDeckSize = this.cards.size();
		
		for(int i = 0 ; i < thisDeckSize; i++) {
			moveTo.addCard(this.getCard(i));
		}
		
		for(int i=0;i < thisDeckSize; i++) {
			this.removeCard(0);
		}
	}
	
	

	public int cardsValue() {
		int totalValue =0;
		int aces = 0 ;
		
		for(Card aCard : this.cards) {
			switch(aCard.getValue()) {
			case TWO : totalValue += 2;break;
			case THREE : totalValue += 3;break;
			case FOUR : totalValue += 4;break;
			case FIVE : totalValue +=5;break;
			case SIX : totalValue += 6;break;
			case SEVEN : totalValue += 7;break;
			case EIGHT : totalValue += 8;break;
			case NINE : totalValue += 9;break;
			case TEN : totalValue += 10;break;
			case JACK : totalValue += 10;break;
			case QUEEN : totalValue += 10;break;
			case KING : totalValue += 10; break;
			case ACE : aces += 1;break;
			}
		}
		
		for(int i=0;i < aces; i++) {
			if(totalValue > 10) {
				totalValue +=1;
			}else {
				totalValue +=11;
			}
		}
		return totalValue;
		
	}
	
}
