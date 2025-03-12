package ClassWork;
import java.util.Scanner;

public class ClassWork2 {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
//		int x;
//		int y;
//		int c;
//		x = scnr.nextInt();
//		y = scnr.nextInt();
//		System.out.println(x + " " + y);
//		c = y;
//		y = x;
//		x = c;
//		System.out.print(x + " " + y);
// ======================================================================================
		int a;
		int b;
		a = scnr.nextInt();
		b = scnr.nextInt();
		System.out.println(a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);
		
		scnr.close();
	}
}
