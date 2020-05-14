package Conditional_Statement;

public class LetsHaveAcoffe {

	// datatype boolean- true or false

	boolean iscupempty= false;

	public static void main(String[] args) {

		LetsHaveAcoffe coffee = new LetsHaveAcoffe();

		//conditional statement - if else statement
		if(coffee.iscupempty) {   //true
			System.out.println("fill the cup");
		}else {
			System.out.println("drink the coffee");

		}

	}

}
