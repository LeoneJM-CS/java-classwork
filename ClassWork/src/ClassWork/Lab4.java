package ClassWork;
import java.util.*;

public class Lab4 {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> UnivCore = new ArrayList<>();
		int num_class;
		
		System.out.print("Enter the no. of core corses: ");
		num_class = scnr.nextInt();
		scnr.nextLine();
		System.out.println();
		
		for(int i = 0; i < num_class; i++) {
			System.out.println("Enter the corse code: ");
			String course = scnr.next();
			UnivCore.add(course);
			
		}
		UnivCore.sort(null);
		System.out.println("Courses to be completed by student: ");
		for (int i = 0; i < UnivCore.size(); i++) {
				System.out.println(UnivCore.get(i));
		}
		System.out.println();
		
		while(true) {
			System.out.println("Enter the course to be removed from your list: ");
			String findClass = scnr.next();
			int index = UnivCore.indexOf(findClass);
			System.out.println("Have you Completed the course? (Enter positive number if yes): ");
			int yes = scnr.nextInt();
			scnr.nextLine();
			
			if(yes > 0) {
				UnivCore.remove(index);
				System.out.println("Course has been removed from the list.");
				System.out.println("List of remaining courses: ");
				for (int i = 0; i < UnivCore.size(); i++) {
					System.out.println(UnivCore.get(i));
				}
			System.out.println();
			}
			
			else {
				System.out.println("The course cannot be removed as you have not completed the course.");
				System.out.println("List of remaining courses: ");
				for (int i = 0; i < UnivCore.size(); i++) {
					System.out.println(UnivCore.get(i));
				}
			System.out.println();
			}
		}
	}
}
