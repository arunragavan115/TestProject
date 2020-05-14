package String_Concepts;

public class String_Examples {

	public static void main(String[] args) {

		//in java STRING is an immutable object which means it is constant and cannot be changed once it has been created.
		
		//here v will see list of String methods and String concepts.
		
		String name = "arun";
		name ="ragavan";	//now string pointer goes to  ragavan in [heap memory]
		int number =3;
		System.out.println(name);

		//returns character value for the particular index.
		System.out.println(name.charAt(0));

		//returns String length.[total no of index +1]
		System.out.println(name.length());

		//check the equality of string with the given object.
		System.out.println(name.equals("Ragavan"));

		//check the equality of string with the given string object without case sensitivity.
		System.out.println(name.equalsIgnoreCase("Ragavan"));

		//check the name is empty or not
		System.out.println(name.isEmpty());
		
		//returns true or false based on the given value is present or not
		System.out.println(name.contains("r"));
		
		//take or cut a particular portion of the String
		System.out.println(name.substring(1));
		
		//take particular portion of the string begin and end index. [begin index wont include , upto end index only include]
		System.out.println(name.substring(1, 7));
		
		//appends/add  the string to the given string
		System.out.println(name.concat("1996"));
		
		//replaces the existing char with  given  char
		System.out.println(name.replace("a", "A"));
		System.out.println(name.replace("ragavan", "mangai"));
		
		//find the position of the character in the string
		System.out.println(name.indexOf("g"));
		//finds the character specified from the index position[beggining index included,end index not included]
		System.out.println(name.indexOf("a",4));
		//finds the character specified from the index position
		System.out.println(name.indexOf("r",1));
		System.out.println(name.lastIndexOf("gavan", 3));
		
		//Trim will remove the white space before and after.
		System.out.println(name.trim());
		
		//convert the given data type to string [most asked interview qns (valueof)]
		System.out.println(String.valueOf(number));
		
		String uppercase= "MANGAI";
		System.out.println(uppercase.toLowerCase());
		
		String lowercase="umadevan";
		System.out.println(lowercase.toUpperCase());
		
		//returns joined string with given delimiter[this will include delimiter- by every string]
		System.out.println(String.join("-", "automation","online" ));
		//this will include / by every gap [here delimiter is /]
		System.out.println(String.join("/", "30","07","1996"));
		
		//split
		String splitthis="am ,i ,good ,guy??";
		String[] splitedwords=splitthis.split(",");
		for(String arun:splitedwords) {
			System.out.println(arun);
		}

	}

}
