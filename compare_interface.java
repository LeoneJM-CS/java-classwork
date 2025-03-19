package ClassWork;
import java.util.*;

class Employee {
	String name;
	int age;
	int id;
	int salary;
	public void AddEmployee(String name, int age, int id, int salary){
		
		Scanner scnr = new Scanner(System.in);
		this.name = scnr.nextLine();
		this.age = scnr.nextInt();
		this.id = scnr.nextInt();
		this.salary = scnr.nextInt();
	}
}

public class compare_interface {
	public static void main(String [] args) {
		ArrayList<Employee> al = new ArrayList<>();
		Scanner scnr = new Scanner(System.in);
		Employee em = new Employee();
		
		al.add(em.AddEmployee(null, 0, 0, 0));
		scnr.close();
	}
}
