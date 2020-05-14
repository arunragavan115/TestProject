package String_Concepts;

public class StringBufferExamples {

	public static void main(String[] args) {
	
		//String is an immutable(non-change) object.[once v create means v cant destroy]
		String name ="arun";
		System.out.println("Appending a name to original : "+name.concat("ragavan"));
		System.out.println("Original name:  "+name);
		System.out.println("****************");
		
		//[StringBuffer is mutable(changing) object.
		StringBuffer name1 = new StringBuffer("Arya");
		System.out.println(name1);
		System.out.println("Appending a name to original :  "+name1.append("kumar"));
		System.out.println("Original name:  "+name1);
		System.out.println("****************");
		
		//StringBuffer Methods
		//reverse[reverse the order]  v cannot reverse string but do in StringBuffer {most asked interview qns}
		System.out.println(name1.reverse());
		//Replace
		StringBuffer replacethis = new StringBuffer("Arun");
		System.out.println(replacethis.replace(0, 3, "ragavan"));//add after 3 index to ragavan 
		
		//delete
		StringBuffer delete = new StringBuffer("xyzarun");
		System.out.println(delete.delete(0, 3));//delete 0 to 3 index of the xyzarun 
		
		//insert
		StringBuffer insert = new StringBuffer("moni");
		System.out.println(insert.insert(4,"sha"));//add sha after 4th index
		
		//capacity
		System.out.println(insert.capacity());
		
		//character at
		System.out.println(insert.charAt(3));
		
		//length
		System.out.println(insert.length());//[monisha]
		
		//substring
		System.out.println(insert.substring(1));//cut the 1st character of monisha
		
		System.out.println(insert.subSequence(1, 2));
		
	}

}

