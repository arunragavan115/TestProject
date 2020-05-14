package Static_Keyword;

public class StaticVariables {

	// example to show,static varibles are share among objects

	static int accountBalance=0;
	 String depositedby;

	public static void main(String[] args) {
		
		accountBalance=100;
		
		StaticVariables object1=new StaticVariables();
		object1.accountBalance=1000;
		object1.depositedby="arun";
		
		StaticVariables object2 = new StaticVariables();
		object2.accountBalance=2000;			 //static declares last given input by us
		object2.depositedby="ragavan";   
		
		System.out.println("object integer 1  "+object1.accountBalance);
		System.out.println("object String 1  "+ object1.depositedby);
		
		System.out.println("object integer 2 "+ object2.accountBalance);
		System.out.println("object string 2 "+ object2.depositedby);
	}

}
