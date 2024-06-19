package Basic.code;

import java.util.Scanner;

public class ArrayOp {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Enter the number of elements you want to store: ");
		n=sc.nextInt();
		System.out.println("Enter elements: ");
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		//33 44 66 23 55 33 23
	int count=1;	
		
	for(int j=0;j<n;j++) {
		
		for(int k=1;k<n;k++) {
			if(arr[j]==arr[k]) {
				count=count+1;
			}	
		}
		System.out.println("Number and Repeatition"+ arr[j]+":"+count);
		
	}
		
	}

}
