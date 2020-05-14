package Abstraction;

public class Bmw extends Car implements UpcomingProjects{

	@Override
	public void engineSecret() {
		System.out.println("BMW Engine Secret");
	}
	
	@Override
	public void companyVault() {
		System.out.println("BMW CompanyVault");
	}

	public static void main(String[] args) {
		
		Car car =new Bmw(); //here v are using dynamic polymorphism
		car.companyVault();
		car.engineSecret();

	}

	@Override
	public void employee1() {
		System.out.println("this is employee 1");
		
	}

	@Override
	public void employee2() {
		System.out.println("this is employee 2");
		
		
	}

}
