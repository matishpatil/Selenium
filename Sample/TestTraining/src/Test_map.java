import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test_map {

	public static void main(String[] args) {		
		
		// key-value pair
		Map<String, String> mapt = new TreeMap<>(); //Sorting of keys
		Map<String, String> maph = new HashMap<>(); // Values displayed 
		Map<String, String> maplh = new LinkedHashMap<>(); //To maintain insertion order
		
		mapt.put("k3", "Abc");
		mapt.put("k2", "Xyz");
		mapt.put("k1", "Def");
		
		maph.put("6", "Abc");
		maph.put("5", "Abc");
		maph.put("4", "Abc");
		maph.put("k3", "Abc");
		maph.put("k1", "Xyz");
		maph.put("k2", "Def");
		
		maplh.put("6", "Abc");
		maplh.put("5", "Abc");
		maplh.put("4", "Abc");
		maplh.put("k3", "Abc");
		maplh.put("k2", "Xyz");
		maplh.put("k1", "Def");
		
		System.out.println("Treemap is "+ mapt);
		System.out.println("Hashmap is " + maph);
		System.out.println("LinkedHashMap is " + maplh);
		
		for(Map.Entry<String, String> entry: mapt.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());			
		}
		
		System.out.println(mapt.keySet());
		System.out.println(mapt.values());
	}

}
