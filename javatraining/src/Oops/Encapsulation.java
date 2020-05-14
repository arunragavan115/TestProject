package Oops;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a1 = new Account();
		a1.setName("ragavan");
		a1.setAmount(10000);
		a1.acc_no(12355);
		a1.setEmail();

		System.out.println(a1.getAmount());
		System.out.println(a1.getEmail());
		System.out.println(a1.getacc_no());
		System.out.println(a1.getName());
	}

}
class Account{
	private long acc_no;
	private String name;
	private String email;
	private float amount;

	public long getacc_no() {
		return acc_no;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public long setacc_no() {
		return this.acc_no = acc_no;
	}

	public void acc_no(long i){
		this.acc_no = acc_no;
	}

	public void setEmail() {
		this.email=email;
	}

	public String getEmail() {
		return email;
	}

	public float getAmount() {
		return amount;

	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
}