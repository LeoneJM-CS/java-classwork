package ClassWork;

import java.util.*;
//import java.io.*;

public class exceptions {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		try {
			System.out.println("Enter your name: ");
			String name = scnr.nextLine();
			System.out.println("Enter your major: ");
			String major = scnr.nextLine();
			System.out.println("Enter your age: ");
			int age = scnr.nextInt();
			scnr.close();
			
			if(age < 18) {			//			Exception handling
				if (age < 0) {
				throw new Exception("Invalid age.");
				}
				else{
				throw new Exception("You are ineligible to go on this trip.");
				}
			}
			
			else {
				System.out.println(name + " - " + major + " - is eligible to be a part of the trip.");
			}
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
