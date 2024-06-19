package Basic.code;

public interface Abt {
	
	String s1="fortuner";
	
	void engine();
	
	default void suspensioon() {
		System.out.println("Default method");
	}
	
	public static void coolant() {
		System.out.println("Liquid cooled");
	}
	

}
