package ClassWork;
import java.util.Scanner;

class Overload{
	public void displayData(String name) {
		System.out.println("Your name is: " + name);
	}
	public void displayData(int id) {
		System.out.println("Your name is: " + id);
	}
	public void displayData(String father, String mother) {
		System.out.println("Your father is: " + father);
		System.out.println("Your mother is: " + mother);
	}
	public void displayData(char letter) {
		System.out.println("Your favorite letter is: " + letter);
	}
}
public class methodOverloading {
	public static void main(String [] args) {
		Overload ol = new Overload();
		Scanner scnr = new Scanner(System.in);
		String name = scnr.nextLine();
		int id = scnr.nextInt();
		String parents1 = scnr.next();
		String parents2 = scnr.next();
		char letter = scnr.next().charAt(0);
		
		ol.displayData(name);
		ol.displayData(id);
		ol.displayData(parents1, parents2);
		ol.displayData(letter);
		}
}
