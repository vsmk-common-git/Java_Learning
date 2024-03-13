package com.learning;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, ArmNumber=0, temp, rem=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is Armstrong Number:");
		num = sc.nextInt();
		temp = num;
		while(num>0) {
			rem = num%10;
			ArmNumber = ArmNumber+(rem*rem*rem);
			num = num/10;
			
		}
		if(temp == ArmNumber) {
			System.out.println("It is a ArmStrong Number");
		}
		else {
			System.out.println("It is not a ArmStrong Number");
		}

	}

}
