package ClassWork;
import java.util.*;

class Institution{
	String name_inst;
	int year_inst;
	int num_fac;
	int num_stu;
}
class Department extends Institution{
	String name_dept;
	int dept_stu;
}
class Students extends Department{
	String stu_name;
	String stu_year;
	int stu_age;
	int stu_id;
}

public class inheritance {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		Students stu = new Students();
		
		System.out.print("Enter Institution Name: ");
		stu.name_inst = scnr.nextLine();
		
		System.out.print("Enter Founding Year of Institution: ");
		stu.year_inst = scnr.nextInt();
		scnr.nextLine();
		
		System.out.print("Enter Number of Faculty: ");
		stu.num_fac = scnr.nextInt();
		scnr.nextLine();
		
		System.out.print("Enter Number of Students: ");
		stu.num_stu = scnr.nextInt();
		scnr.nextLine();
		System.out.println();
		
		System.out.print("Enter Department Name: ");
		stu.name_dept = scnr.nextLine();
		
		System.out.print("Enter the Number of Students in Department: ");
		stu.dept_stu = scnr.nextInt();
		scnr.nextLine();
		
		for(int i=0; i < stu.dept_stu; i++) {
			System.out.print("Enter Student Name: ");
			stu.stu_name = scnr.nextLine();
			
			System.out.print("Enter Year of Student: ");
			stu.stu_year = scnr.nextLine();
			System.out.println();
		}	
			System.out.println("Name of Institution: " + stu.name_inst);
			System.out.println("Founded: " + stu.year_inst);
			System.out.println("Number of Faculty: " + stu.num_fac);
			System.out.println("Number of Students: " + stu.num_stu);
			System.out.println("Students to Faculty: " + (stu.num_stu / stu.num_fac) + " Students / Faculty");
			System.out.println("Department: " + stu.name_dept);
			System.out.println("Student Name: " + stu.stu_name);
			System.out.println("Year of Student: " + stu.stu_year);
		
	scnr.close();
	}
}
