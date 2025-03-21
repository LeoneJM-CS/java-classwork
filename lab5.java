package ClassWork;
import java.util.*;

abstract class UserInfo{
		String name;
		int accountNum;
	void SetUserDetails(){
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter user name: ");
		this.name = scnr.nextLine();
		System.out.println("Enter user account number: ");
		this.accountNum = scnr.nextInt();
		scnr.nextLine();
	}
	abstract void GetUserInfo();
}
interface Account {
	float Deposit(float amount);
	float Withdraw(float amount);
	void GetBalance();
}

public class lab5 extends UserInfo implements Account{
	float balance = 0;
	public float Deposit(float amount) {
		this.balance += amount;
		return balance;
	}
	
	public float Withdraw(float amount) {
		if ((this.balance - amount) <=0) {
			System.out.println("Unable to withdraw " + amount);
		}
		else {
			this.balance = balance - amount;
		}
		return balance;
	}

	public void GetBalance() {
		System.out.println("Balance: " + balance);
	}

	public void GetUserInfo() {
		System.out.println("Account Name: " + name);
		System.out.println("Account number: " + accountNum);
		
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		lab5 obj = new lab5();
		int z = 1;
		
		while (z ==1) {
			System.out.println("1. Add User details");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Get User Info");
			System.out.println("5. Exit");
			int choice = scnr.nextInt();
			scnr.nextLine();
			if(choice == 1) {
				obj.SetUserDetails();
			}
			else if(choice == 2) {
				System.out.println("Enter the amount to be deposited: ");
				float amount = scnr.nextFloat();
				scnr.nextLine();
				obj.Deposit(amount);
			}
			else if(choice == 3) {
				System.out.println("Enter the amount to be withdrawn: ");
				float amount = scnr.nextFloat();
				scnr.nextLine();
				obj.Withdraw(amount);
			}
			else if(choice == 4) {
				System.out.println("Displaying user info");
				obj.GetUserInfo();
				obj.GetBalance();
			}
			else if(choice == 5) {
				System.out.println("Exiting Program");
				break;
			}
			else {
				System.out.println("Please Enter a Valid input.");
			}
		}
	scnr.close();
	}
}