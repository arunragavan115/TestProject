package Constructor;

public class Draw {

	// Constructor Overloading 

	String draw;

	Draw(){                               //no argument constructor
		System.out.println("draw object orinted");
	}

	Draw(String todraw){					//parameterized constructor
		draw=todraw;
		System.out.println("drawing" + todraw);

	}

	public static void main(String[] args) {

		Draw draw = new Draw();
		Draw draw1 = new Draw("circle");     // which parameter v r passing due to that constructor overloading is working here
	}

}
