package com.patterns;

public class Pattern1ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A',temp;
		int cnt = -1;
		for(int i='A';i<='M';i++) {
			cnt = cnt+1;
			if(cnt>=3 && cnt%3==0) {
				System.out.println();
				cnt=0;
			}
			temp=(char)i;
			
			System.out.print(temp);
		}

	}

}
