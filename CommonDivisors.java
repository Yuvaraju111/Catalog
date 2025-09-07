package com.sample.project;

import java.util.Scanner;

public class CommonDivisors {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		int min;
		
		if(a<b) {
			min=a;
		}
		else {
			min=b;
		}
		
		for(int i=1;i<=min;i++) {
			if(a%i==0 && b%i==0) {
				System.out.println(i);
			}
		}

	}

}
