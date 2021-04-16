public class SnakeAndLadder{

	public static final int startPosition=0;
	public static final int noPlay=1;
	public static final int Ladder=2;
	public static final int Snake=3;
	public static final int minPosition=0;
	public static final int maxPosition=100;

	public static void main(String[] args){

		int playerPosition=startPosition;
		int numberOfDiceRolls=0;

		System.out.println("Player at Start Position "+startPosition);
		while(playerPosition<100){
			int diceRoll=((int)Math.floor(Math.random()*10)%6)+1;
			numberOfDiceRolls++;
			System.out.println("Dice Roll : "+diceRoll);
			int optionCheck=(int)Math.floor(Math.random()*10)%3+1;
			switch(optionCheck){
				case Ladder:
					System.out.println("Ladder");
					if(playerPosition+diceRoll>maxPosition)
					System.out.println("Stays at Player Position : "+playerPosition);
					playerPosition=(playerPosition+diceRoll)<=maxPosition?(playerPosition+diceRoll):playerPosition;
					break;
				case Snake:
					System.out.println("Snake");
					playerPosition=(playerPosition-diceRoll)>=minPosition?(playerPosition-diceRoll):minPosition;
					if(playerPosition==0)
					System.out.println("Restarts from 0 position");
					break;
				case noPlay:
					System.out.println("No Play");
					break;
				default:
			}
			System.out.println("Player Position : "+playerPosition);
		}
		System.out.println("The Dice was rolled "+numberOfDiceRolls+" times to win the game.");
	}
}
