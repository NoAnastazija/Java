import java.util.Scanner;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Guess a number between 1 and 20");
	// Get random number 1 - 20
		int answer = rand.nextInt(20)+1;
		int guess = 0;
	// Guessing the number
		while(guess != answer) {
			guess = scan.nextInt();
			
			if(guess < answer) {
				System.out.println("Higher");			
			} 
    // When guess is right
      else if (guess > answer) {
				System.out.println("Lower");
			}
		}
		System.out.println("You have guessed the number");
	}	
}