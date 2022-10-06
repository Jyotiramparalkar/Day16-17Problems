package com.bridgelabz;

public class StringPermutation
{
	public static void fun(char[] a , int b, int c) {
		if (b==c) 
		{
			for (int i=0; i<c; i++) 
				System.out.print(a[i]);
				System.out.println();
			}
			
		else 
				for (int i=b; i<c; i++) {
					char t=a[i];
					a[i]=a[b];
					a[b]=t;
				fun(a,b+1,c);
				char s=a[i];
				a[i]=a[b];
				a[b]=s;
				}
			}
	public static void main(String[] args) {
		String str = "Jack";
		char []arr=str.toCharArray();
		
		fun(arr,0,arr.length);
		

	}


}
