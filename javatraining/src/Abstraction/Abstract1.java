package Abstraction;

abstract class Abstract12 {
	abstract void start();
	abstract void stop();
	void display() {
		System.out.println("vehicle:concrate Display Method");
	}

}

class Mycar extends Abstract12 {
	
	void start() {
		System.out.println("Mycar: Overside Start Method");
	}
	void stop() {
		System.out.println("Mycar: Overside Stop Method");
	}

}
		public class Abstract1 {
			public static void main(String[] args) {
				Mycar car = new Mycar();
				
				car.display();
				car.start();
				car.stop();
				
			}
		}