package ClassWork;
import java.util.Scanner;

public class java_02_14 {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		int num_vals, minVal, maxVal;
		double avg;
		System.out.print("Enter the length of the list: ");
		num_vals = scnr.nextInt();
		System.out.println();
		System.out.println("Enter the elements of the list: ");
		int [] values = new int[num_vals];
		for(int i=0; i<values.length; i++) {
			values[i] = scnr.nextInt();
		}
		function fun = new function();
		maxVal = fun.max(values);
		minVal = fun.min(values);
		avg = fun.avg(values);
		System.out.println("Max: " + maxVal);
		System.out.println("Min: " + minVal);
		System.out.println("Average: " + avg);
		scnr.close();
	}
}
