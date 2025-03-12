package ClassWork;
import java.util.Scanner;

public class Calculator{
	
	public static void main(String [] args) {
		
		int x;
		int y;
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter an expression: ");
		char z;
		z = scnr.next().charAt(0);
		switch(z) {
		case '+':
			System.out.println("Addition ");
			System.out.print("Enter the First Number: ");
			x = scnr.nextInt();
			System.out.print("Enter the Second Number: ");
			y = scnr.nextInt();
			System.out.print("The Sum is: " + (x + y));
			break;
		case '-':
			System.out.println("Subtraction ");
			System.out.print("Enter the First Number: ");
			x = scnr.nextInt();
			System.out.print("Enter the Second Number: ");
			y = scnr.nextInt();
			System.out.print("The Remainder is: " + (x - y));
			break;
		case '/':
			System.out.println("Division ");
			System.out.print("Enter the First Number: ");
			x = scnr.nextInt();
			System.out.print("Enter the Second Number: ");
			y = scnr.nextInt();
			System.out.print("The Quotient is: " + (x / y));
			break;
		case '*':
			System.out.println("Multiplication ");
			System.out.print("Enter the First Number: ");
			x = scnr.nextInt();
			System.out.print("Enter the Second Number: ");
			y = scnr.nextInt();
			System.out.print("The Product is: " + (x * y));
			break;
		default:
			System.out.print("Expression not found");
			break;
		}
		scnr.close();
	}
}

