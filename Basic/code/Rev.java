package Basic.code;

public class Rev {
	
	public static void StringRev(String str) {
		
		char[] input=str.toCharArray();
		
		
		
		int size=input.length;
		
		for(int i=size-1;i>=0;i--) {
			System.out.print(input[i]);
		}
		
	}
	
	public static void main(String args[]) {
		
		String str= "AnjaliSingh";
		
		StringRev(str);
		
		
		
	}

}
