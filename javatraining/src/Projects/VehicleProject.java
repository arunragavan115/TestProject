package Projects;

public class VehicleProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle activa = new Vehicle();
		// Vehicle yamaha100 = new Vehicle();
		Vehicle yamaha100 = new Vehicle("yamaha 100","yamaha", 2, 5.0f);
		Vehicle hondashine = new Vehicle("honda", "shine", 2, 6.0f, 1.5f);

		activa.fillfuel(4.0f);
		activa.printVehicleDetails();
		System.out.println(activa.isfuelreserved());

		yamaha100.tankcapasity = 7.0f;
		yamaha100.printVehicleDetails();
		System.out.println(yamaha100.isfuelreserved());

		hondashine.printVehicleDetails();
		System.out.println(hondashine.isfuelreserved());


	}

}

class Vehicle{
	String modelname;
	String manufacturer;
	int numwheels;
	float tankcapasity;
	float reservecapasity = 1.0f;
	float curfuel = 0.0f;

	Vehicle(){
		modelname = "Activa i";
		manufacturer = "Honda";
		numwheels = 2;
		tankcapasity = 3.0f;
	}
	Vehicle(String n, String m, int w, float t){
		modelname = n;
		manufacturer = m;
		numwheels = w;
		tankcapasity = t;
	}
	Vehicle(String n, String m, int w, float t, float r){
		modelname = n;
		manufacturer = m;
		numwheels = w;
		tankcapasity = t;
	}

	void fillfuel(float n) {
		if (curfuel + n <tankcapasity) {
			curfuel = curfuel +n;
		}
		else {
			curfuel = tankcapasity;
			System.out.println("Info: can't fill more than tank capasity.");
		}
	}

	boolean isfuelreserved() {
		if (curfuel <= reservecapasity)
			return true;
		else
			return false;
	}

	void drivevehicle(int distance) {
		curfuel = curfuel - (distance*0.05f);
	}

	void PrintInfo() {
		System.out.println("===============");
		System.out.println(tankcapasity);
		System.out.println(reservecapasity);

	}

	void printVehicleDetails() {
		System.out.println("==============================");
		System.out.println("model:" + modelname);
		System.out.println("manufacturer:" + manufacturer);
		System.out.println("numwheels:" + numwheels);
		System.out.println("tankcapasity:" + tankcapasity);
		System.out.println("currentfuel (in ltrs):" + curfuel);
		System.out.println("==============================");
	}	
}