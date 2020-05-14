package Abstraction;

public class Benz extends Car implements UpcomingProjects {
	//a class always implements an interface [important]
	
	 // how a class can use an interface ?? using implement keyword v can use 
	 
	@Override
	public void engineSecret() {
		System.out.println("BENZ Engine Secret");
	}

	@Override
	public void companyVault() {
		System.out.println("BENZ CompanyVault");
	}

	public static void main(String[] args) {

		Car car=new Benz();
		car.engineSecret();
		car.companyVault();

	}

	@Override
	public void employee1() {
		System.out.println("employee1");

	}

	@Override
	public void employee2() {
		System.out.println("employee2");
	}

}
