package Basic.code;

public class C extends B {
	public void b() {
		System.out.println("This is b");
	}
	public void c() {
		System.out.println("This is c");
	}
	public void d() {
		System.out.println("This is d");
	}
	
	
	public static void main(String args[]) {
		A aa = new C();
		
		aa.a();
		aa.b();
		aa.c();
		aa.d();
		
	}

}
