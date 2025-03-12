package ClassWork;
import java.util.Scanner;

class Data{
	Scanner scnr = new Scanner(System.in);
	public void displayData(String a, int b, String father, String mother, char letter){
		System.out.println("Your name is: " + a);
		System.out.println("Your id is: " + b);
		System.out.println("Your father is: " + father);
		System.out.println("Your mother is: " + mother);
		System.out.println("Your favorite letter is: " + letter);
	
	}
}
public class methods {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		Data data = new Data();
		System.out.println("Enter your name: ");
		String name = scnr.nextLine();
		System.out.println("Enter your id: ");
		int id = scnr.nextInt();
		System.out.println("Enter your parents names: ");
		String father = scnr.next();
		String mother = scnr.next();
		System.out.println("Enter your favorite letter: ");
		char letter = scnr.next().charAt(0);
		data.displayData(name, id, father, mother, letter);
		scnr.close();
	}
}
