package Exception_Handling;

public class You {

	public void YourGfLaugh() {

		try {
			throw new Exception("machan is coming to hit u");
			
			//after try immediately catch block will come to handle exception
			
		} catch(Exception e) {

			e.printStackTrace();
			System.out.println("ur frnd: give thiis pose da");
			System.out.println("and u r acting like u r posing like instagram");
		}
	}

			public static void main(String[] args) {

				You you = new You();
				//you.YourGfLaugh();
				
			}

		}
