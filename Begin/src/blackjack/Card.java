package blackjack;

/**
 * @author khs
 * @Description : 카드의 정보들을 캡슐화
 * 
 */
public class Card {

	private Suit suit;
	private Value value;
	
	/**
	 * 생성자 : 카드
	 * @param suit
	 * @param value
	 */
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
	
	/**
	 * 카드의 가치를 얻어오는 메서드
	 * @return
	 */
	public Value getValue() {
		return this.value;
	}

}
