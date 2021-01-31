import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) { 

		List<String> str = new ArrayList<>();
		str.add("Capco");
		str.add("Pune");
		int a = 1234;
		String b = "Banana";
		b = "Apple";
		
		System.out.println(b);
		
		String c = "Banana";
		
		String d = new String("Banana");
		
		// Mutable - Change the status quo/value
		a = 123;
		
		
		// Immutable - Can not change the value
		// String is immutable object
		
		
		String str1 = str.toString();
		List<String> str2 = str;
		
		System.out.println("Number is "+ a);
		System.out.println("Array str is "+ str1);
		System.out.println("String str is "+ str2);
	}

}
