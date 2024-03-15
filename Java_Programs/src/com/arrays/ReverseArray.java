package com.arrays;

import java.util.Scanner;

class ReverseArray {
	static int[] reversearray(int n, int a[]) {
		int i, j, temp;
		for (i = 0, j = n - 1; i < n / 2; i++, j--) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		return a;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		a = reversearray(n, a);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
