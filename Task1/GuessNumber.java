import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		boolean play=true;
		int totalScore=0;
		System.out.println("*****Welcome to Guess the Number Game*****");
		while(play) {
			int number=r.nextInt(100)+1;
			int attempts=0;
			int mxaAttempts=3;
			boolean guessCorrectly=false;
			System.out.println("Guess the number. The Number is in Between 1 to 100");
			System.out.println("You have maximum attempts="+mxaAttempts);
			while(attempts<mxaAttempts && !guessCorrectly) {
				System.out.println("Attempt"+(attempts+1));
				System.out.println("Enter your Guessed Number-");
				int guess=sc.nextInt();
				attempts++;
				
				if(guess==number) {
					System.out.println("Congratulations!You win.....(:");
					guessCorrectly=true;
					totalScore=totalScore+(mxaAttempts-attempts+1);
				}
				else if(guess<number) {
					System.out.println("Too low number.Try again....):");
				}
				else{
					System.out.println("Too large number.Try again....):");
				}
			}
			if(!guessCorrectly) {
				System.out.println("You run out of attempts");
				System.out.println("Correct number was="+number);
				
			}
			System.out.println("Current Score="+totalScore);
			System.out.println("Do you want to play again.(Yes/No)-");
			String response=sc.next();
			play=response.equalsIgnoreCase("Yes");
		}
		System.out.println("You final Score="+totalScore);
		sc.close();
	}

}
