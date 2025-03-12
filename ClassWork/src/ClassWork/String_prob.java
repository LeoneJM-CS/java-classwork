package ClassWork;
import java.util.Scanner;

public class String_prob {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		String relative;
		String food;
		String adjective;
		String time;
		System.out.print("Enter a Relative: ");
		relative = scnr.next();
		System.out.print("Enter a Food: ");
		food = scnr.next();
		System.out.print("Enter an Adjective: ");
		adjective = scnr.next();
		System.out.print("Enter a Time Period: ");
		time = scnr.next();
		System.out.println("My " + relative + " says eating " + food + " \n will make me more " + adjective + ", \n so now I eat it every " + time);
		scnr.close();
	}
}
