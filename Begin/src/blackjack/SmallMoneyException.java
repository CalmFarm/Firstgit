package blackjack;

/**
 * @author khs
 * 예외처리 클래스
 */
public class SmallMoneyException extends Exception{ 

		public SmallMoneyException() {
			super("SmallMoneyException");
		}
		public SmallMoneyException(String msg) {
			super(msg);
		}
		
	}////////////////////


