public class SnakeAndLadder{

	public static final int startPosition=0;
	public static final int noPlay=1;
	public static final int Ladder=2;
	public static final int Snake=3;
	public static final int minPosition=0;
	public static final int maxPosition=100;
	public static final int player1=0;
	public static final int player2=1;
	public static void main(String[] args){

		int player1Position=startPosition;
		int player2Position=startPosition;
		int counter=0;

		System.out.println("Players at Start Position "+startPosition);
		while(player1Position<100 && player2Position<100){
			int playerSelect=counter%2;
			int diceRoll=((int)Math.floor(Math.random()*10)%6)+1;
			System.out.println("Dice Roll : "+diceRoll);
			int optionCheck=(int)Math.floor(Math.random()*10)%3+1;
			switch(optionCheck){
				case Ladder:
					if(playerSelect==player1){
						player1Position=(player1Position+diceRoll)<=maxPosition?(player1Position+diceRoll):player1Position;
						System.out.println("PLAYER 1 Turn");
					}
					else{
						player2Position=(player2Position+diceRoll)<=maxPosition?(player2Position+diceRoll):player2Position;							System.out.println("PLAYER 2 Turn");
					}
					System.out.println("LADDER");
					counter++;
					break;
				case Snake:
					if(playerSelect==player1){
						player1Position=(player1Position-diceRoll)>=minPosition?(player1Position-diceRoll):minPosition;
						System.out.println("PLAYER 1 Turn");
					}
					else{
						player2Position=(player2Position-diceRoll)>=minPosition?(player2Position-diceRoll):minPosition;
						System.out.println("PLAYER 2 Turn");
					}
					System.out.println("SNAKE");
					break;
				case noPlay:
					System.out.println("NO PLAY");
					break;
				default:
			}
			System.out.println("Player 1 Position : "+player1Position);
			System.out.println("Player 2 Position : "+player2Position);
			counter++;
		}
	if(player1Position==100)
		System.out.println("PLAYER 1 WINS");
	else
		System.out.println("PLAYER 2 WINS");

	}
}
