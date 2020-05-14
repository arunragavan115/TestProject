package ClassesObjects;

import java.util.Scanner;

public class BankProj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// this program i changed to AccountStatement in same package.

		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();

		

	}

}

class Account{
	String custname;
	int accnum;
	float curbalance;
	static float miniBalance = 5000.0f;

	void getCustomerDetails() {
		Scanner in = new Scanner(System.in);

		System.out.println(" enter the custimer num: ");
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
