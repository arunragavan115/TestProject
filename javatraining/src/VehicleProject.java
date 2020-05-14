
public class VehicleProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle activa = new Vehicle();
		//		Vehicle yamaha100 = new Vechicle();
		Vehicle yamaha100 = new Vehicle("yamaha 100", "yamaha", 2, 5.0f, 0);
		Vehicle hondashine = new Vehicle("honda","shine",2, 6.0f, 1.5f);

		activa.fillFuel(4.0f);
		activa.printVehicleDetails();
		
		yamaha100.tankCapacity = 7.0f;
		yamaha100.printVehicleDetails();
		System.out.println(yamaha100.isfuelreserved());
		
		hondashine.printVehicleDetails();
		System.out.println(hondashine.isfuelreserved());


	}

}
class Vehicle{
	String modelName;
	String Manufacturer;
	int numWheels;
	float tankCapacity;
	float reserveCapacity = 1.0f;
	float curFuel = 0.0f;

	Vehicle(){
		modelName = "Activa i";
		Manufacturer = "Honda";
		numWheels = 2;
		tankCapacity = 3.0f;
	}
	Vehicle(String n, String m, int w, float t,float r){
		modelName = n;
		Manufacturer = m;
		numWheels = 2;
		tankCapacity = t;
		reserveCapacity = 8.0f;

	}

	void fillFuel(float n) {
		if (curFuel + n < tankCapacity) {
			curFuel = curFuel + n;
		}

		else {
			curFuel = tankCapacity;
			System.out.println("Info : cant fill more than tank capacity.");
		}
	}
	boolean isfuelreserved() {
		if (curFuel <= reserveCapacity)
			return true;
		else
			return false;
	}
		
		void driveVehicle(float distance) {
			curFuel = curFuel - (distance * 0.05f);		
		
	}

	void printVehicleDetails() {

		System.out.println("=================");
		System.out.println("Model:" + modelName);
		System.out.println("Manufacturer:" + Manufacturer);
		System.out.println("numwheels:" + numWheels);
		System.out.println("tankcapacity:"+ tankCapacity);
		System.out.println("currentfuel(In ltrs)"+ curFuel);
		System.out.println("=================");

	}
}