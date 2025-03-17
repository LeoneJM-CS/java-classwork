package ClassWork;
import java.util.*;

interface CalcInf{
	float add();
	float sub();
	float mult();
	float div();
}
interface ManipulateInf extends CalcInf{
	String addDigits();
	String checkSign();
}
class TnfTest implements CalcInf, ManipulateInf{
	Scanner scnr = new Scanner(System.in);
	public float add() {
		float num1 = scnr.nextFloat();
		float num2 = scnr.nextFloat();
		float addition = num1 + num2;
		return addition;
	}
	public float sub() {
		float num1 = scnr.nextFloat();
		float num2 = scnr.nextFloat();
		float subtraction = num1 - num2;
		return subtraction;
	}
	
	public float mult() {
		float num1 = scnr.nextFloat();
		float num2 = scnr.nextFloat();
		float multiplication = num1 * num2;
		return multiplication;
	}
	
	public float div() {
		float num1 = scnr.nextFloat();
		float num2 = scnr.nextFloat();
		float divition = num1 / num2;
		return divition;
	}
	
	public String addDigits() {
		String input = scnr.next();
		String [] intigers = new String[input.length()];
		for (int i=0; i < input.length(); i++) {
			
		}
		scnr.nextLine();
		
		return ;
	}
	public String checkSign() {
		return "";
	}
}

public class interface_test {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
		scnr.close();
	}
}
