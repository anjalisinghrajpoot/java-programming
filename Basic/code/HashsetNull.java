package Basic.code;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetNull {
	
	private static Set<Comparable> set = new HashSet();
	private static Set tset = new TreeSet();

	public static void CheckHashset() {
		set.add("red");
		set.add("yellow");
		set.add(null);
		set.add(1000);
		set.add(null);
		System.out.println(set);
	}
	
	public static void CheckTreeset() {
	
		try {	
		
		tset.add("red");
		tset.add("yellow");
		//tset.add(1000);
		tset.add(null);
		}
		catch(NullPointerException e) {
			System.out.println("try again ");
			
		}
		finally {
			System.out.println("This is finally block");
		}
		System.out.println(tset);

	}
	
	
	
	
	public static void main(String[] args) {
		CheckHashset();
		CheckTreeset();
		
	}

}
