package blackjack;

import java.util.Scanner;

public class BlackJack {
	public static void main(String[] args) {
		
		System.out.println("Welcom BlackJack!");
		//create out playing deck
		Deck playingDeck =new Deck();
		playingDeck.creatFullDeck();
		playingDeck.shuffle();
		//create ad deck for the player
		Deck playerDeck =new Deck();
		
		Deck dealerDeck =new Deck();
		
		double playerMoney = 100.00;
		
		Scanner userInput =new Scanner(System.in);
		
		//Game Loop
		while(playerMoney >0) {
			System.out.println("가진돈 "+playerMoney+"얼마베팅?");
			double playerBet=userInput.nextDouble();
			if(playerBet > playerMoney) {
				System.out.println("더이상 벳 ㄴ");
				break;
			}
			
			boolean endRound=false;
			
			//start dealing
			//player get 2cards
			playerDeck.draw(playingDeck);
			playerDeck.draw(playingDeck);
			
			//dealer get 2cards
			dealerDeck.draw(playingDeck);
			dealerDeck.draw(playingDeck);
			
			while(true) {
				System.out.println("you hand: ");
				System.out.println(playerDeck.toString());
				System.out.println("your deck is valued at:"+playerDeck.cardsValue());
				
				
				//display dealer hand
				System.out.println("Dealer Hand : "+dealerDeck.getCard(0).toString()+"and [Hidden]");
				
				//what does thepalyer wnawt todo ?
				System.out.println("1.Hti or 2.Stand ");
				int response = userInput.nextInt();
				
				//they hit
				if(response == 1) {
					playerDeck.draw(playingDeck);
					System.out.println("you draw a: "+playingDeck.getCard(playerDeck.deckSize()-1).toString());
					
					//bust if > 21
					if(playerDeck.cardsValue() > 21) {
						System.out.println("Bust. Valued at: "+playerDeck.cardsValue());
						playerMoney -= playerBet;
						endRound =true;
						break;
					}
				}
				if(response == 2 ) {
					break;
				}
			}
			
			//reveal dealer cards
			System.out.println("Dealer Cards:"+dealerDeck.toString());
			if((dealerDeck.cardsValue()>playerDeck.cardsValue()) && endRound ==false ) {
				System.out.println("Dealer beats you!");
				playerMoney -= playerBet;
				endRound = true;
			}
			//Dealer Draw at 16 , stand at17
			while((dealerDeck.cardsValue()<17) && endRound == false) {
				dealerDeck.draw(playingDeck);
				System.out.println("Dealer Draws: "+dealerDeck.getCard(dealerDeck.deckSize()-1).toString());
			}
			//display total value for dealer
			System.out.println("Dealer's Hand is valued at :"+dealerDeck.cardsValue());
			//if dealer bust
			if((dealerDeck.cardsValue()>21)&& endRound ==false) {
				System.out.println("딜러 버스트! 너의 승리 ");
				playerMoney += playerBet;
				endRound = true;
			}
			if((playerDeck.cardsValue()== dealerDeck.cardsValue()) && endRound ==false) {
				System.out.println("push");
				endRound = true;
			}
			
			if((playerDeck.cardsValue() > dealerDeck.cardsValue())&& endRound == false) {
				System.out.println("you win hand");
				playerMoney += playerBet;
				endRound = true;
			}
			
			playerDeck.moveAllToDeck(playingDeck);
			dealerDeck.moveAllToDeck(playingDeck);
			System.out.println("end of hand");
		
		}
		
	}

}
