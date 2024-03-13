package com.learning;
import java.util.Scanner;
public class CalculatePower {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num,pow,temp=1,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to Calculate Power:");
		num = sc.nextInt();
		System.out.println("Enter power as a value to Calculate:");
		pow = sc.nextInt();
		for(int i=1;i<=pow;i++) {
			result = temp*num;
			temp=result;
			
		}
		System.out.println("Result:"+temp);

	}

}
