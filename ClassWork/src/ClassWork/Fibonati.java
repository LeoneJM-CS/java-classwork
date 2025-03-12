package ClassWork;
import java.util.Scanner;
public class Fibonati {
	public static void main(String [] args) {

	int firstNum = 0;
	int secondNum = 1;
	int n;
	Scanner scnr = new Scanner(System.in);
	System.out.print("Enter the series number: ");
	n = scnr.nextInt();
	for(int i=0; i<=n; i++) {
		System.out.print(firstNum + " + ");
		int nextNum = firstNum + secondNum;
		firstNum = secondNum;
		secondNum = nextNum;
	}
	scnr.close();
}

}
