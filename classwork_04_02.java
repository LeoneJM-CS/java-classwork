package ClassWork;
import java.util.*;

class Employee implements Comparable<Employee>{
	String name;
	Integer age;
	Integer id;
	Employee(String name, int age, int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}
	@Override
	public int compareTo(Employee e) {
		int age = this.age.compareTo(e.age);
		return age == 0? this.id.compareTo(e.id) : age;
	}
}
public class classwork_04_02 {
	public static void main(String [] args) {
		ArrayList <Employee> emp = new ArrayList<>();
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the Number of Employees");
		int size = scnr.nextInt();
		scnr.nextLine();
		
		for(int i = 0; i < size; i++) {
			System.out.println("Enter Employee Name: ");
			String name = scnr.nextLine();
			System.out.println("Enter Employee Age: ");
			int age = scnr.nextInt();
			scnr.nextLine();
			System.out.println("Enter Employee Id: ");
			int id = scnr.nextInt();
			scnr.nextLine();
			
			emp.add(new Employee(name, age, id));
		}
		Collections.sort(emp);
		for(Employee str:emp){
			System.out.println("Name: " + str.name + ", Age: " + str.age + ", ID: " + str.id);
		}
		scnr.close();
	}
}
