package blackjack;

/**
 * @author khs
 * 카드의 정보들을 캡슐화
 * 카드의 문양과 가치 메소드
 * 
 */
public class Card {

	private Suit suit;
	private Value value;

	public Card(Suit suit,Value value) {
		
		this.value=value;
		this.suit=suit;
	}
	
	/**
	 * 카드의 문양과 숫자를 출력
	 */
	public String toString() {
		return this.suit.toString()+"-"+ this.value.toString();
	}

	public Value getValue() {
		return this.value;
	}

}
