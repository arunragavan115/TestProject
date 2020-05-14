package JavaLearning;

public class CollectAmount {

	public Integer collectamount = 1000;

	public Integer collectedamountandgiveitme() {
		System.out.println("daady have collected rupees"+  collectamount  +"and sent it to you");
		return collectamount; 				// to return the value return is used here
	}

	public static void main(String[] args) {
		// void is a Return type that means that did not return any thing //this method is not returning any type of value

		CollectAmount myson = new CollectAmount();
		Integer amount = myson.collectedamountandgiveitme();
		System.out.println("got the amount son" +  amount);
	}

}
