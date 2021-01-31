import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Sample_List {

	public static void main(String[] args) {

		List<Integer> lst = new ArrayList<>();
		
		lst.add(4);
		lst.add(5);
		lst.add(1);
		lst.add(2);
		lst.add(3);
		
		lst.add(2, 20); // add item to list based on index
		lst.remove(2); // remove based on index
		
		System.out.println(lst);
		
		Collections.sort(lst);
		
		System.out.println(lst);
		
		
		List<String> strList = new LinkedList<>();
		
		strList.add("It");
		strList.add("is");
		strList.add("a");
		strList.add("sunny");
		strList.add("day");
		
		System.out.println(strList);
		
		for(Iterator<String> i = strList.iterator(); i.hasNext();) {
			//System.out.println(i.next());
		}
		
		Iterator<String> it = strList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		int i = 123;
		i = 345; // By value
	}

}
