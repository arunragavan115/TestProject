package Polymorphism;

public class TheWayWeTalk {

	/* this class is to illustrate method overloading
	with practical example 
	 */
	
	//if there is any (change in data type,or change in order of passing)in the parameter passed to a method,then its overloading.
	
	public void talk(Parents styleofTalking) {   			// overloading must be same method name.
		System.out.println("police and respectful!!!!?????");
	}

	public void talk(Partner styleofTalking) {	
		System.out.println("love,romantic and a misture of everything");
	}

	public void talk(Boss styleofTalking) {
		System.out.println("nothing personal pure business");
	}

	public static void main(String[] args) {
		TheWayWeTalk talk = new TheWayWeTalk();

		Parents parents =new Parents();
		talk.talk(parents);

		Partner partner = new Partner();
		talk.talk(partner);

		Boss boss = new Boss();
		talk.talk(boss);

	}

}
