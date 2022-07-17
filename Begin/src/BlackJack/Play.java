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
			System.out.println("You have a $"+playerMoney + ",how much Would like ot bet?");
			double playerBet = userInput.nextDouble();
			if(playerBet > playerMoney) {
				System.out.println("You cannot bet more than you have. Please leave.");
				break;
			}
			
			boolean endRound = false;
			
			
			playerDeck.draw(playingDeck);
			playerDeck.draw(playingDeck);
			
			dealerDeck.draw(playingDeck);
			dealerDeck.draw(playingDeck);
			
			while(true) {
				System.out.println("Your hand : ");
				System.out.println(playerDeck.toString());
				System.out.println("Your deck is valued at : "+playerDeck.cardsValue());
				
				System.out.println("Dealer Hand : "+dealerDeck.getCard(0).toString()+"and [Hidden]");
				
				System.out.println("Would you like to [1]Hit or [2]Stand?");
				int respone =userInput.nextInt();
				
				if(respone ==1) {
					playerDeck.draw(playingDeck);
					System.out.println("Your draw a:"+playerDeck.getCard(playerDeck.deckSize()-1).toString());
					
					if(playerDeck.cardsValue()>21) {
						System.out.println("Bust. Currently valued at: "+playerDeck.cardsValue());
						playerMoney -= playerBet;
						endRound = true;
					}
					
				}
				
				if(respone == 2) {
					break;
				}
			}
			
			System.out.println("Dealer Cards "+dealerDeck.toString() );
			if(dealerDeck.cardsValue() > playerDeck.cardsValue() && endRound == false) {
				System.out.println("Dealer beats you!");
				playerMoney -= playerBet;
				endRound =true;
			}
			
			while((dealerDeck.cardsValue()<17) && endRound == false) {
				dealerDeck.draw(playerDeck);
				System.out.println("Dealer Draws : "+dealerDeck.getCard(dealerDeck.deckSize()-1).toString());
				
				if((dealerDeck.cardsValue()>21)&& endRound == false) {
					System.out.println("Dealer bust! You Win");
					playerMoney += playerBet;
					endRound = true;
				}
				if((playerDeck.cardsValue() == dealerDeck.cardsValue()) && endRound == false) {
					System.out.println("Push");
					endRound = true ;
				}
				
				if((playerDeck.cardsValue() > dealerDeck.cardsValue()) && endRound == false) {
					System.out.println("You win Hand!");
					playerMoney += playerBet;
					endRound = true ;
				}
				else if(endRound == false) {
					System.out.println("You lose the hand");
					playerMoney -= playerBet;
					endRound = true;
				}
				
				playerDeck.moveAlltoDeck(playingDeck);
				dealerDeck.moveAlltoDeck(playingDeck);
				System.out.println("End of Hand");
				
				
			}
		}
		
		System.out.println("Game Over ! Join in the money");
		
	}

}
