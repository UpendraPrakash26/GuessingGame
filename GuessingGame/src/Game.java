import java.util.*;
public class Game 
{
	public static void main(String[] args) 
	{
		Umpire u=new Umpire();
		u.CollectNumberFromGuesser();
		u.CollectNumberFromPlayers();
		u.CompareNumber();
	}

}
class Guesser
{
	int guessNumber;
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser Enter your Number");
		guessNumber=scan.nextInt();
		return guessNumber;
	}
	
}
class Players
{
	int playerNum;
	int PlayerNumbers()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player please enter your number");
		playerNum=scan.nextInt();
		return playerNum;
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;	
	void CollectNumberFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void CollectNumberFromPlayers()
	{
		Players p1=new Players();
		Players p2=new Players();
		Players p3=new Players();
		numFromPlayer1=p1.PlayerNumbers();
		numFromPlayer2=p2.PlayerNumbers();
		numFromPlayer3=p3.PlayerNumbers();
	}
	void CompareNumber()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			System.out.println("Player 1 won the game!");
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			System.out.println("Player 2 won the game!");
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game!");
		}
		else
		{
			System.out.println("EVERYONE LOST THE GAME");
		}
	}
}
