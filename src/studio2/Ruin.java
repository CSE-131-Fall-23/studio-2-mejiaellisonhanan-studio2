package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in); 
		
		int startAmount;
		System.out.println("What is your starting amount of money?");
		startAmount = in.nextInt();
		
		
		double winChance = 0.5;
		
		
		int winLimit; 
		System.out.println("What is the win limit?");
		winLimit = in.nextInt();
		
		int currentBalance = startAmount; 
		double fred = Math.random();
		
		int winCount = 0;
		int loseCount = 0;
		int totalGames = 0;
		int days = 0;
		
		while ((currentBalance > 0) && (currentBalance < winLimit ));
		{	
			if (fred <= winChance) 
			{
				currentBalance++;
			}
			else 
			{
				currentBalance--; 
			}
		totalGames++;	
		}
		
		
		
		if (currentBalance == winLimit) 
		{
			winCount++;
		}
		else 
		{
			loseCount++;
		}
		
		days = (winCount + loseCount);
		
		System.out.println(totalGames);
		
		
		
	
		
		
			
		
		
		
		
		
		
	}

}
