package blackjack;
/**
 * @FileName : blckjack.java
 * @Project : BlackJack
 * @Date : 2022.07.20 
 * @author khs
 * @Description :
 *  ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022.07.20        khs                 최초 생성
 * 2022.07.22        sungwook park       예외 클래스 추가
 * 2022.07.23        khs                 abstract 클래스 추가
 */
import java.util.Scanner;

/**
 * @author khs
 * @Description : 추상크래스 선언
 * 
 */
abstract class Welcome{

	public void msg() {
		emo();
	}
	
	/**
	 * 멤버 메소드 중 추상 메소드 선언 
	 */
	abstract public void emo();
}

/**
 * @author khs
 * @Description : Welcome 메소드를 상속 받는 클래스 선언 
 * 
 */
class Hello extends Welcome{
	@Override
	public void emo() {
		System.out.println("Welcom to BlackJack!");
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
				+ "MMMMMMMWNX00KXWMMMWNK00KNWMMMMMMMMMMMMMMMMMMMWNWMMMMMMMMMMMMMMMMMMMMMMMMMN0OO0NMMMMMMMMMMMMMMMMMMMWKOOOOOOOOOXWMMMMMMMMM\r\n"
				+ "MMMMMWXxl:;;;coOX0dc;;;;cdKWMMMMMMMMMMMMMMMMNOldKWMMMMMMMMMMMMMMMMMMMMMNd,.  .,dNMMMMMMMMMMMMMMMMMWk'       'kWMMMMMMMMM\r\n"
				+ "MMMMW0l,,,,,,,,;c;,,,,,,',:OWMMMMMMMMMMMMMWXd;,,lOWMMMMMMMMMMMMMMMMMMMWd.      .dWMMMMMMMMMMMMMMMMMNo.     .oWMMMMMMMMMM\r\n"
				+ "MMMMXo,,,,,,,,,,,,,,,,,,,,,c0WMMMMMMMMMMMW0l,,,,,:xXWMMMMMMMMMMMMMMMMMWo        oWMMMMMMMMMMMMMMMWNNK:     :KNWWMMMMMMMM\r\n"
				+ "MMMW0c',,,,,,,,,,,,,,,,,,,,;kWMMMMMMMMMMNk:,',,,,,;oKWMMMMMMMMMMMMNKO0X0:      :0X0OKNMMMMMMMMWKd:,''.     .'',:dKWMMMMM\r\n"
				+ "MMMW0c,,,,,,,,,,,,,,,,,,,,,:kWMMMMMMMMWXd;',,,,,,,,,cONMMMMMMMMMXd,.  .:l,    ,l:.  .,dXMMMMMWx'                 .xWMMMM\r\n"
				+ "MMMMNd,,,,,,,,,,,,,,,,,,,,,lKWMMMMMMMW0l,,,,,,,,,,,,,:xXMMMMMMMNl        ..  ..        cNMMMM0'                   '0MMMM\r\n"
				+ "MMMMW0c,,,,,,,,,,,,,,,,,,,:kWMMMMMMMMKl,,,,,,,,,',,,,,;kWMMMMMM0,          ..          ,0MMMMO.                   .OMMMM\r\n"
				+ "MMMMMWOc,',,,,,,,,,,,,,,,;xNMMMMMMMMMW0l,,,,,,,,,,,,,:xXMMMMMMMNo.      .:l..l:.      .oNMMMMXc                   cXMMMM\r\n"
				+ "MMMMMMW0l,,,,,,,,,,,,,,,:kNMMMMMMMMMMMWXd;,,,,,,,,,,cONMMMMMMMMMNk:'..,l0Kc  cK0l,..':kNMMMMMMK;                 ;KMMMMM\r\n"
				+ "MMMMMMMWKd;,,,,,,,,,',;o0WMMMMMMMMMMMMMMNk:,',,',,;oKWMMMMMMMMMMMMWNKXNMWx.  .xWMNXXNWMMMMMMMMMXl.             .lXMMMMMM\r\n"
				+ "MMMMMMMMMNOl;,,,,,,,,ckXWMMMMMMMMMMMMMMMMW0l,',,,:xXWMMMMMMMMMMMMMMMMMMM0,    ,0MMMMMMMMMMMMMMMMWO;.         .;OWMMMMMMM\r\n"
				+ "MMMMMMMMMMMNOl;,,,,cxXWMMMMMMMMMMMMMMMMMMMWXd;',cOWMMMMMMMMMMMMMMMMMMMMNl      lNMMMMMMMMMMMMMMMMMNk:.     .:kNMMMMMMMMM\r\n"
				+ "MMMMMMMMMMMMWNOo:lkXWMMMMMMMMMMMMMMMMMMMMMMMNOldKWMMMMMMMMMMMMMMMMMMMMMO'      'OMMMMMMMMMMMMMMMMMMMW0l'.'l0WMMMMMMMMMMM\r\n"
				+ "MMMMMMMMMMMMMMMNXNWMMMMMMMMMMMMMMMMMMMMMMMMMMWNWMMMMMMMMMMMMMMMMMMMMMMMN0OOOOOO0NMMMMMMMMMMMMMMMMMMMMMMNKNMMMMMMMMMMMMMM");
	}
}

/**
 * @author khs
 */
public class BlackJack {

	public static void main(String[] args) {
		//입장문
		Hello a=new Hello();
		a.emo();
		
		//덱 구성하기
		Deck playingDeck =new Deck();
		playingDeck.creatFullDeck();
		playingDeck.shuffle();
	
		//플레이어 덱 추가
		Deck playerDeck =new Deck();
		
		Deck dealerDeck =new Deck();
		
		int playerMoney = 100;
		
		Scanner userInput =new Scanner(System.in);
		
		//베팅 진행 과정
		while(playerMoney >0) {
			System.out.println("당신이 가진 돈은 "+playerMoney+"원 입니다. 베팅하실 금액을 적어주세요.");
			int playerBet=userInput.nextInt();
			if(playerBet > playerMoney) {
				System.out.println("가진 돈보다 더 많이 베팅할 수 없습니다.");
				break;
			}
			
			boolean endRound=false;
			
			
			//게임 시작 => 플레이어와 딜러가 카드를 2장씩 뽑음
			playerDeck.draw(playingDeck);
			playerDeck.draw(playingDeck);
			
			dealerDeck.draw(playingDeck);
			dealerDeck.draw(playingDeck);
			
			
			//플레이어와 딜러의 카드 패와 숫자를 보여주는 코드
			while(true) {
				System.out.println("당신의 카드입니다 ");
				System.out.println(playerDeck.toString());
				System.out.println("\n당신의 카드숫자의 합은 "+playerDeck.cardsValue()+" 입니다");
				
				System.out.println("딜러의 카드는 : "+dealerDeck.getCard(0).toString()+" 그리고 [숨겨진 패]가 있습니다");
				
				System.out.println("-----------------");
				System.out.println("1.Hit 또는 2.Stay ");
				int response = userInput.nextInt();	
				
				//Hit 한 경우
				if(response == 1) {
					playerDeck.draw(playingDeck);
					System.out.println("당신이 뽑은 카드는 : "+playingDeck.getCard(playerDeck.deckSize()-1).toString());
					
					//Hit 후 Bust
					if(playerDeck.cardsValue() > 21) {
						System.out.println("버스트 되었습니다!! 숫자의 합 : "+playerDeck.cardsValue()+"\n");
						playerMoney -= playerBet;
						endRound =true;
						break;
					}
				}
				if(response == 2 ) {
					break;
				}
			}
			
			//딜러의 카드 공개 딜러의 승리 
			System.out.println("딜러의 카드는 : "+dealerDeck.toString()+" 입니다");
			if((dealerDeck.cardsValue()>playerDeck.cardsValue()) && endRound ==false ) {
				System.out.println("딜러가 당신을 이겼습니다!");
				playerMoney -= playerBet;
				endRound = true;
			}
			//딜러가 드로우16, 스탠드17
			while((dealerDeck.cardsValue()<17) && endRound == false) {
				dealerDeck.draw(playingDeck);
				System.out.println("딜러가 뽑은 카드는 "+dealerDeck.getCard(dealerDeck.deckSize()-1).toString()+"이었습니다");
			}
			//딜러의 밸류를 공개
			System.out.println("\n딜러카드 숫자의 합은 "+dealerDeck.cardsValue()+"입니다");
			//딜러가 버스트 했을경우
			if((dealerDeck.cardsValue()>21)&& endRound ==false) {
				System.out.println("\n☆★딜러 버스트! 당신이 승리하였습니다★☆");
				playerMoney += playerBet;
				endRound = true;
			}//무승부인 경우
			if((playerDeck.cardsValue()== dealerDeck.cardsValue()) && endRound ==false) {
				System.out.println("무승부입니다!! 다음 게임을 진행해주세요");
				endRound = true;
			}
			//플레이어 승리시
			if((playerDeck.cardsValue() > dealerDeck.cardsValue())&& endRound == false) {
				System.out.println("☆★당신이 승리하였습니다!!!★☆");
				playerMoney += playerBet;
				endRound = true;
			}//딜러 승리시
			if((dealerDeck.cardsValue() > playerDeck.cardsValue())&& endRound == false) {
				System.out.println("☆★딜러가 승리하였습니다!!!★☆");
				playerMoney -= playerBet;
				endRound = true;
			}
			//플레이어와 딜러의 카드 덱으로 이동
			playerDeck.moveAllToDeck(playingDeck);
			dealerDeck.moveAllToDeck(playingDeck);
			System.out.println("------------------");
		
		}
		
	}

}