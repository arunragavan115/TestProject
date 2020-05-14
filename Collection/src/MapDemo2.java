import java.util.Map;
import java.util.TreeMap;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "c");
		map.put(1, "d");
		
		System.out.println(map.get(4));
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("c"));
		//map.remove(1);
		System.out.println(map);
		
	}

}
