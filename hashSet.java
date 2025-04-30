package ClassWork;
import java.util.*;

public class hashSet {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		int setGuess = 7;
		int num = 5;
		
		for(int i=0; i<num; i++) {
			Integer newNum = scnr.nextInt();
			scnr.nextLine();
			set.add(newNum);
		}
		
		for(int i=0; i < setGuess; i++) {
			System.out.println("Enter Your Guess: ");
			Integer guess = scnr.nextInt();
			if(guess == 0) {
				System.out.println("You have Given Up");
				break;
			}
			else if (set.contains(guess) == true) {
				System.out.println("You Got It Right!!! " + set.remove(guess));
			}
			else {
				System.out.println("Guess Again.");
			}
		}
		System.out.println("You ran out of guesses");
		scnr.close();
	}
}
