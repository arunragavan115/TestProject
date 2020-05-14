package JavaLearning;

public class BankAccount {

	Long BankAccount =1234567890l;

	String holdername = "ARUN";

	Integer accountbalance = 350;

	public  void getbalance() {
		System.out.println("balance is" + accountbalance);

	}

	public static void main(String[] args) {
		//	 Classname objectName = new ClassName();  to create a object 
		
		BankAccount account = new BankAccount();
		account.getbalance();
	}} 


