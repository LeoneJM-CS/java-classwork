import java.util.*;

// Class to represent Employee
class Employee {
    String name;
    int age;
    int id;

    // Constructor to initialize Employee object
    public Employee(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}

// Interface for Employee operations
interface Employeeinfo {
    void add_employee(ArrayList<Employee> empList);
    void display_employees(ArrayList<Employee> empList);
}

// Class to manage Employee operations
class EmployeeManager implements Employeeinfo {
    public void add_employee(ArrayList<Employee> empList) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        String name = scnr.nextLine();

        System.out.println("Enter Employee Age:");
        int age = scnr.nextInt();

        System.out.println("Enter Employee ID:");
        int id = scnr.nextInt();
        scnr.nextLine(); // Consume newline

        // Add the new employee to the list
        empList.add(new Employee(name, age, id));
        System.out.println("Employee added successfully!");
    }

    public void display_employees(ArrayList<Employee> empList) {
        if (empList.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee emp : empList) {
                System.out.println("Name: " + emp.name + ", Age: " + emp.age + ", ID: " + emp.id);
            }
        }
    }

    public void sort_employees_by_id(ArrayList<Employee> empList) {
        empList.sort(Comparator.comparingInt(emp -> emp.id)); // Sort by ID in ascending order
        System.out.println("Employees sorted by ID.");
    }
    
}

// Main class
public class compare_int {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Employee> empList = new ArrayList<>();
        EmployeeManager empManager = new EmployeeManager();
        System.out.println("Enter the number of employees:");
        int numEmp = scnr.nextInt();
        scnr.nextLine();
        for(int i = 0; i < numEmp; i++){
            empManager.add_employee(empList);
        }
        System.out.println("Sorting employees by ID...");
        empManager.sort_employees_by_id(empList);
        System.out.println("Sorted Employee List:");
        empManager.display_employees(empList);
        scnr.close();
    }
}
