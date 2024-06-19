package Basic.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Swaping {
	
	 private static int x;
	 private static int y;
	
	// swaping by 2 variable
	 public static void swap(int x, int y) {
	   System.out.println("Before swap");
	   System.out.println("value of x: "+x+" value of y: "+y);
		x =x+y;
		y= x-y;
		x=x-y;
		System.out.println("After swap");	
	System.out.println("value of x: "+x+" value of y: "+y);
	}
	 // swaping with 3rd variable
	 public static void swap(int x, int y,int temp) {
		  System.out.println("Before swap");
		   System.out.println("value of x: "+x+" value of y: "+y);
		   temp=x;
		   x=y;
		   y=temp;
		   System.out.println("After swap");	
			System.out.println("value of x: "+x+" value of y: "+y);
	 }
	 //name of Array's duplicate element
	 public static void ArrayDup(int a[]) {
		 
		 for(int i=0;i<a.length;i++) {
			 
			 for(int j=i+1;j<a.length;j++) {
				 
				 if(a[i]==a[j]) {
					 System.out.println(a[j]);
				 }
				 
			 }
		 }
		 
	 }
	 //removed duplicate array
	 public static void RemoveDup(int a[]) {
		 Set<Integer> set = new LinkedHashSet<>();
		 
		 for(int i=0;i<a.length;i++) {
			 set.add(a[i]); 
			 
		 }
		 System.out.println(set);
	 }
	 
	 //reversing array
	 public static void arrayReverse(int a[]) {
		 
		 for(int i=a.length-1;i>=0;i--) {
			 System.out.println(a[i]);
		 }
	 }
	 
	 //using list reverse array
	 public static void Reverse(int a[]) {
		 
		 List<Integer> list = new ArrayList<>();
		 
		 for(int i=0;i<a.length;i++){
			 list.add(a[i]);
		 }
		 
		 Collections.reverse(list);
		 System.out.println(list);
	 }
	 
	 //sorting array
	 
	 public static void ArraySort(int a[]) {
		 int temp=0;
		System.out.println(a.length);
		 for(int i=0;i<a.length;i++) {
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i]>a[j]) {
					 
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		 
		 }
		 
		 for(int i=0;i<a.length;i++) {
			 System.out.print(a[i]+" ");
		 }
		 System.out.println();
	 }
	 
	 
	 public static void Sorting(int a[]) {
		 
		 Arrays.sort(a);
		 for(int i=0;i<a.length;i++) {
			 System.out.print(a[i]+" "); 
			 System.out.println();
		 }	 
		 
	 }
	 
	 public static void sorts(int a[]) {
		 List<Integer>list = new ArrayList<>();
		 for(int i=0;i<a.length;i++) {
			 list.add(a[i]); 
		 }
		 Collections.sort(list);
		 System.out.println(list);
	 }
	 
	 public static void palindrome(String x) {
		 StringBuffer sb = new StringBuffer(x);
		 
		sb.reverse();
		
		String s = new String(sb);
		
		if(s.matches(x)) {
			System.out.println("it is pallindrone");
		}
		else {
			System.out.println("not pallindrome");
		}
		
	 }
	 
	 

}
