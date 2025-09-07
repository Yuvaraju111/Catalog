package com.sample.project;

public class Test {

	public static void main(String[] args) {
		//For Forward Triangle
//		for(int i=1;i<=4;i++) 
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//		}
		
		// For Reverse Triangle
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=i;j<=4;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" * ");
//			}
//			System.out.println("");
//		}
		
		int num=121;
		int b=num;
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(b==rev)
		{
			System.out.println("palindrome");
		}
		else 
		{
			System.out.println("not");
		}
	}

}
