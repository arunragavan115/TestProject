
public class Constructor2 {
	int i;
	
	
	Constructor2(){
		
		System.out.println("default constructor");
		i = 20;
	}
	
	Constructor2(int x){
		System.out.println("default constructor");
		i = x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Constructor2 c1 = new Constructor2();
			Constructor1 c2 = new Constructor1();
			Constructor c3;
			c3 = new Constructor();
			
			System.out.println(c1.i);
			System.out.println(c2.i);
			
			
		
	}

}
