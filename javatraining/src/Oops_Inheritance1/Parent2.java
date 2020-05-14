package Oops_Inheritance1;

class arun {
	int x;
	arun()
	{
		System.out.println("  hlo 1");
		x = 25;
	}
	arun(int a){
		{

			System.out.println(" hlo 2");
			x= a;
		}
	}
	class ragavan extends arun {

		int y;
		ragavan()
		{
			System.out.println(" hlo 3");
			int y = 30;
		}
		ragavan(int b)
		{
			System.out.println(" hlo 4");
		}


		public class parent{


			public void main(String[] args) {

				arun p = new arun();
				ragavan c = new ragavan();

				System.out.println();
				System.out.println();
			}

		}

	}
}
