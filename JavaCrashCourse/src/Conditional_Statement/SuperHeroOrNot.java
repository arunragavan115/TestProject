package Conditional_Statement;

public class SuperHeroOrNot {

	// conditional statement - switch, case break

	String hero = "cap";

	public void heroornot() {
		switch (hero) {
		case "cap":
			System.out.println("cap is superhero");
			break;    // v one condtion is true means switch case will print all of the othercases also so only v use break here
		case "superman":
			System.out.println("superman is super hero");
			break;
		case "batman":
			System.out.println("batman is super hero");
			break;

		default:
			System.out.println(hero   + "is not a super hero");
		}
	}

	public static void main(String[] args) {
		SuperHeroOrNot hero = new SuperHeroOrNot();
		hero.heroornot();

	}

}
