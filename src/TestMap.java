import java.util.*;

public class TestMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "value1");
		map.put("2", "value2");
		map.put("3", "value3");
		
		System.out.println("Loop key and value via Map.keySet");
		for(String key : map.keySet()) {
			System.out.println("key= " + key + " and value= " + map.get(key));
		}
	}

}
