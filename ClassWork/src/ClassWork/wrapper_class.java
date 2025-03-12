package ClassWork;
import java.util.Scanner;
import java.util.*;

public class wrapper_class {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> students = new ArrayList<String>();
		System.out.println("Enter the number of students: ");
		int num_vals = scnr.nextInt();
		scnr.nextLine();
			for(int i = 0; i < num_vals; i++) {
				System.out.println("Enter Student's First Name");
				String name = scnr.nextLine();
				students.add(name);
				System.out.println();
			}
			System.out.println(students);
			System.out.println();
			
			System.out.println("Enter a new Student: ");
			students.set(0, scnr.nextLine());
			System.out.println(students);
			System.out.println();
			
			System.out.println("Enter a value between 1-5: ");
			int get_stu = scnr.nextInt();
			scnr.nextLine();
			System.out.println();
			System.out.println(students.get(get_stu - 1));
	scnr.close();
	}
}
