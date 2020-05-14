package Abstraction;

	interface motorcycle {
		void car();
		void scooty();
		void bus();
	}
	
class aeroplane implements motorcycle{	// if we use interface means we only use implements not extends
	
	public void car() {
		System.out.println("car");
	}
	
	public void scooty() {
		System.out.println("scooty");
	}
	
	public void bus() {
		System.out.println("bus");
	}
	
	public class interfacee {
		
	
	public void main(String[] args) {
		
		aeroplane v = new aeroplane();
			v.bus();
			v.car();
			v.scooty();
	}

	}}
