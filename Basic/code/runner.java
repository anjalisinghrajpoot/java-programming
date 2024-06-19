package Basic.code;

public class runner extends Car{
	
	public void engine() {
		
		System.out.println("Thar: Mhawk");
	}
	
	
	public static void main(String args[]) {
		
		runner r = new runner();
		r.engine();
		r.color();
		r.suspensioon();
		Abt.coolant();
		
		String s = r.s1;
		System.out.println(s);
	}

}
