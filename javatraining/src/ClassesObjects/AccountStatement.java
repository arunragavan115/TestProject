package ClassesObjects;

import java.util.Scanner;

public class AccountStatement {

	public static void main(String[] args) {

		// BankProject

		Account1234 acc = new Account1234();

		acc.getCustomerDetails();
		acc.deposit(10000);
		acc.withDraw(15000);
		acc.printMiniStatement();

	}
}

class Account1234{
	String custname;
	int accnum;
	float curbalance;
	static float miniBalance = 5000.0f;

	void getCustomerDetails() {
		Scanner in = new Scanner(System.in);

		System.out.println(" enter the customer name: ");
		custname = in.next();
		System.out.println("enter the acc num :");
		accnum = in.nextInt();
		curbalance = 10000.0f;
		in.close();
	}
	void printMiniStatement() {
		System.out.println("abc bank , pondicherry");
		System.out.println("----------");
		System.out.println("customer Name:" + custname);
		System.out.println("acc number: "+accnum);
		System.out.println("curBalance :"+ curbalance);
	}

	void deposit (float amount) {
		curbalance = curbalance +  amount;
	}
	void withDraw(float amount) {
		if(curbalance - amount > miniBalance)
			curbalance = curbalance - amount;

		else
			System.out.println("Transaction declined- withdrawal amount");
	}
}





