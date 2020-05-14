import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Treeset2 {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>(); //
		
		set.add("a");
		set.add("b");
		set.add("b");
		set.add("c");
		set.add("d");
		
		System.out.println(set);

	}

}
