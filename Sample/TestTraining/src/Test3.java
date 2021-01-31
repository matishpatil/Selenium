import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		
		Test_POJO obj = new Test_POJO();
		obj.setStr("Pune");
		obj.setAbc(2);
		obj.setB(true);

		List<Test_POJO> str = new ArrayList<>();
		
		/*
		 * str.add("Pune"); str.add("Mumbai"); str.add("Bangalore");
		 */
		
		
		str.add(obj);
		
		//iterator - used for Java 1.6 & below		
		System.out.println(str.toString());
		
		for (Test_POJO t : str) {
			System.out.println(t.getStr());
			System.out.println(t.getAbc());
			System.out.println(t.isB());
		}
	}

}
