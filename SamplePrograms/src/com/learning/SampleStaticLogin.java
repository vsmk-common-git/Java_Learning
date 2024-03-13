package com.learning;

public class SampleStaticLogin {

	public boolean login(String uname,String pass) {
		if(uname=="root" && pass=="") {
		return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String uname="root",pass="";
		SampleStaticLogin s = new SampleStaticLogin();
		boolean res= s.login(uname, pass);
		if(res==true) {
			System.out.println("Login Success");
		}
		else {
			System.out.println("Login Failure");
		}
	}

}
