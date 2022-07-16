package BlackJack;
import java.util.*;
public class Play {

	public static void main(String[] args) {
		System.out.println("Welcom to BlackJack!");
		
		Deck playingDeck = new Deck();
		playingDeck.createFullDeck();
		playingDeck.shuffle();
		Deck playerDeck = new Deck();
		
		Deck dealerDeck = new Deck();
		
		double playerMoney =100.00;
		
		Scanner userInput = new Scanner(System.in);
		
		while(playerMoney > 0) {
			System.out.println("You have a $"+playerMoney + "how much Would like ot bet?");
			double playerBet = userInput.nextDouble();
			if(playerBet > playerMoney) {
				System.out.println("You cannot bet more than you have. Please leave.");
				break;
			}
			
			playerDeck.draw(playingDeck);
			playerDeck.draw(playingDeck);
			
			dealerDeck.draw(playingDeck);
			dealerDeck.draw(playingDeck);
			
			while(true) {
				System.out.println("Your hand : ");
				System.out.println(playerDeck.toString());
			}
			
			
			
		}
		
		System.out.println("Game Over ! Join in the money!");
		
	}

}
