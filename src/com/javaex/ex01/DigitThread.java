package com.javaex.ex01;

public class DigitThread extends Thread {

	@Override
	public void run() {
	
		for(int i=0;i<10;i++) {
			System.out.print(i);
		}

	}
	
	
}