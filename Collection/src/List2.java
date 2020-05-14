import java.util.ArrayList;
import java.util.List;

public class List2 {
	

	public static void main(String[] args) {
		
		
		
		List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("d");

		//contains
		System.out.println(list.contains("a"));
		
		//get
		System.out.println(list.get(3));
		
		//set 
		list.set(2,"s");
		System.out.println(list);
		
		//Index
		list.remove(0);
		
		//object
		list.remove("d");
		
		//size
		System.out.println(list.size());
		
		//clear
		list.clear();
		
		//Empty
		System.out.println(list.isEmpty());
	}

}
