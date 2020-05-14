import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("a");
		set.add("b");
		set.add("b");
		set.add("c");
		set.add("d");
		
		System.out.println(set);

	}

}
