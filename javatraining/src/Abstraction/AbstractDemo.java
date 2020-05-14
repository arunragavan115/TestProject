package Abstraction;

abstract class Vehicle {
	
	final int i =1;
	abstract void start();
	abstract void stop();
	void display() {
		System.out.println("vehicle:concrate Display Method");
	}

}

class Car2 extends Vehicle {
	
	void start() {
		System.out.println("Mycar: Overside Start Method");
	}
	void stop() {
		System.out.println("Mycar: Overside Stop Method");
	}
	
	void pause() {
		System.out.println("Mycar2: overside pause Method");
	}

}
		public class AbstractDemo {
			public static void main(String[] args) {
				Car2 car = new Car2();
				
				car.display();
				car.start();
				car.stop();
				car.pause();
				
			}
		}