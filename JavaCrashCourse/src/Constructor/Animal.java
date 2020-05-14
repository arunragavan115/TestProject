package Constructor;

public class Animal {

	// Parameterzied Constructor. if v pass parameter that is called parameterized constructor

	String animal_name;
	String animal_type;

	Animal(String name, String type){

		animal_name=name;
		animal_type=type;

	}

	public void sayaboutanimal() {
		System.out.println("animal name is"+ animal_name + "type is " + animal_type);
	}
	public static void main(String[] args) {

		Animal animal1 = new Animal("DUCK","OMNIVORES");
		animal1.sayaboutanimal();

		Animal animal2 = new Animal("karadi", "omnivores");
		animal2.sayaboutanimal();
	}

}
