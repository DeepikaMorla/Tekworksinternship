import java.util.*;
import java.lang.Math;
class Guessgame{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
    boolean correct = false;
		//generate a random number between 1 to n
		int ans = (int) (Math.random() * 100) + 1;
		//number of trails that the user has to guess
		int k = 5;
		System.out.println("I'm thinking of a number between 1 to 100.\nYou have 5 tries to guess the number.");
		//Read user input and check if it is correct
		while(k > 0){
			System.out.println("Enter your guess: ");
			int guess = sc.nextInt();
			if(guess == ans){
				System.out.println("You guessed the number.\nYou win.");
				break;
			}
			// if the user guesses greater than the number, print the message and reduce the number of trials
			else if(guess > ans){
				System.out.println("Your guess is too high.\nYou have " + (k - 1) + " tries left.");
			}
      // if the user guesses lesser than the number, print the message and reduce the number of trials
			else{
				System.out.println("Your guess is too low.\nYou have " + (k - 1) + " tries left.");
			}
      
                	// after each trial decrease the number of trials by 1
           		k--;
        	}
   		// if the user has run out of trials, print the message and exit the program
		if (correct==false) {
        		System.out.println("You ran out of tries.\nYou lose!");
   		}
    }
}