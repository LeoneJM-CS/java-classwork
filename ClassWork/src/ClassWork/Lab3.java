package ClassWork;
import java.util.Scanner;

class Info{
	public void printInfo(String firstName, String lastName) {
		System.out.println("Hello " + firstName + " " + lastName + "!");
	}
	public void printInfo(String course1, String course2, String course3) {
		System.out.println("Congratulations on completing your" + course1 + ", " + course2 + ", and " + course3 + " courses.");
	}
	public void printInfo(float gpa, int id) {
		System.out.println("ID: " + id);
		System.out.println("GPA: " + gpa);
		
	}
}
public class Lab3 {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		Info info = new Info();
		System.out.print("Enter Your First Name: ");
		String firstName = scnr.nextLine();
		System.out.print("Enter Your Last Name: ");
		String lastName = scnr.nextLine();
		System.out.println();
		System.out.println("Enter Your Courses: ");
		String course1 = scnr.nextLine();
		String course2 = scnr.nextLine();
		String course3 = scnr.nextLine();
		System.out.println();
		System.out.print("Enter Your ID: ");
		int id = scnr.nextInt();
		System.out.print("Enter Your GPA: ");
		float gpa = scnr.nextFloat();
		System.out.println();

		info.printInfo(firstName, lastName);
		System.out.println();
		info.printInfo(course1, course2, course3);
		System.out.println();
		info.printInfo(gpa, id);
		
		scnr.close();
	}
}
