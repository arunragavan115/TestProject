package ClassesObjects;

import java.security.acl.Acl;
import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount acc = new BankAccount();
		Acc b = new Acc();

		Acc.getCustomerDetails();
		Acc.printCustomerDetails();

	}

}
class Acc{
	static String custName;
	static int AccNum;

	static void getCustomerDetails() {
		Scanner in = new Scanner(System.in);

		System.out.println("enter the customer name:");
		custName = in.next();
		System.out.println("enter the acc number");
		AccNum = in.nextInt();
		in.close();
	}

	static void printCustomerDetails(){
		Scanner in = new Scanner(System.in);

		System.out.println("enter the name");
		System.out.println("----------------");

		System.out.println("customer name :" + custName);

		System.out.println("account number :" + AccNum);
		in.close();

	}

}

