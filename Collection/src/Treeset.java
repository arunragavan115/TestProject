import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();
		
		set.add("a");
		set.add("b");
		set.add("b");
		set.add("c");
		set.add("d");
		
		System.out.println(set);

	}

}
