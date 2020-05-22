import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List2 {


	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("bentely");
		list.add("benz");
		list.add("bmw");
		list.add("bugatti");
		list.add("bugatti");

		//insertion order maintaining by what v give by order
		System.out.println(list);

		//contains
		System.out.println(list.contains("a"));

		//get by index
		System.out.println(list.get(0));
		
		//retrive indexof element
		System.out.println(list.indexOf("bugatti"));

		//set 
		list.set(2,"s");
		System.out.println("bmw set as s "+list);

		//Index
		list.remove(0);
		System.out.println(list);
		
		//v can add null also
		System.out.println(list.add("null"));
		System.out.println(list);
		
		//object
		list.remove("d");

		//size
		System.out.println(list.size());

		//clear
	//	list.clear();
	//	System.out.println("list is clear"+list);

		//Empty
		System.out.println(list.isEmpty());
		
		//Iterate
		for(String string:list) {
			System.out.println(string);
			
		}
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		ListIterator<String> iterator=list.listIterator();
		while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	}
}
