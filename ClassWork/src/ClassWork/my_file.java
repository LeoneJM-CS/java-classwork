package ClassWork;
import java.util.*;
import java.io.*;

public class my_file {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		String word;
		System.out.println("Enter a word or phrase: ");
		word = scnr.nextLine();
		
//		Create File
		try {
			File myFile = new File("javaFile.txt");
			if(myFile.createNewFile()) {
				System.out.println(myFile.getName());
			}
			else {
			System.out.println("File already exists");
			}
		}
		catch(IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		
//		Write file
		try {
			FileWriter myFile = new FileWriter("javaFile.txt");
			myFile.write(word);
			myFile.close();
			System.out.println("File written successfully");
		}
		catch(IOException e){
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
//		Read file
		try {
			File myFile = new File("javaFile.txt");
			Scanner reader = new Scanner(myFile);
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
				}
			reader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		scnr.close();
	}
}
