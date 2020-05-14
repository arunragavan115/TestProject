package Oops;

public class Polymorphism_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book();
		Book b2 = new Book();
		
		
		b1.setBookDetails("arun", "aah10001", "Arthur hailey", "E pub", 500.0f, 3.1f);
		b2.setBookDetails("arun", "aah10001", "Arthur hailey", "E pub", 500.0f, 3.1f);
		System.out.println(b1.bookid);
		System.out.println(b1.author);
		System.out.println(b1.edition);
		System.out.println(b1.bookName);
		
	}

}

class Book{
	String bookName;
	String author;
	String bookid;
	String publisher;
	float price;
	float edition;
	int numcopies;
	
	void setBookDetails(String bN, String id, String aut, String pub, float p, float ed) {
		
		 bookName = bN;
		 author= id;
		 bookid = aut;
		 publisher = pub;
		 price = p;
		edition= ed;
		
	}
	}
