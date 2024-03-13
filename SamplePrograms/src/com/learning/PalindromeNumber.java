package com.learning;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num, PalNum = 0, temp, rem=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to check if it is Palindrome:");
		Num = sc.nextInt();
		temp=Num;
		while(Num>0) {
			rem = Num%10;
			PalNum = PalNum*10+rem;
			Num = Num/10;	
		}
		if(temp==PalNum) {
			System.out.println("It's a Palindrome Number");
		}
		else {
			System.out.println("It's not a Palindrome Number");
		}

	}

}
