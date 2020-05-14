package Conditional_Statement;

public class WhosTheHero {

	String myheroname ="super man";
	// conditional statement if ,else if, else

	public void superheroguesser() {     
		if(myheroname.equals("ironman")) {				//if myheroname and string ironman name same means output come so v use equals here
			System.out.println("u thought about iron man");
			
		}else if(myheroname.equals("super man")) {
			System.out.println(" u thought about super man");
			
		}else if(myheroname.equals("thor")) {
			System.out.println("u thought about thor");
			
		}else {
			System.out.println("sry i cant guess");
		}
	}

	public static void main(String[] args) {
		WhosTheHero  hero = new WhosTheHero ();
		hero.superheroguesser();

	}

}
