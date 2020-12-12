package com.javaex.ex01;

public class ThreadApp {

	public static void main(String[] args) {
		
		Thread t = new Thread(new DigitThread());
		
		
		t.start();
		
		for(int i=0; i<26;i++) {
			
			System.out.println((char)(65+i));
			
		}
		
		
		
		
		
	}

}

	
