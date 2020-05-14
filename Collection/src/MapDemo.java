import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "c");
		map.put(1, "d");
		
		System.out.println(map.get(4));
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("f"));
		//map.remove(1);
		System.out.println(map);
		
	}

}
