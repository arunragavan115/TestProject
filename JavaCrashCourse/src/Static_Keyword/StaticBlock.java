package Static_Keyword;

public class StaticBlock {

	{
		// its a block
	}
	//appart from main method highest priority is static only so only static main method runs 1st

	static {										// it's static block 
		System.out.println("inside static block1");
	}

	static {										//one class may contains many static blocks
		System.out.println("inside static block2");
	}


	public static void main(String[] args) {		//but one class contains only one static main method 
		System.out.println("inside main method");
	}

}
