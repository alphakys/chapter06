package com.javaex.ex01;

public class MultiThread {

	public static void main(String[] args) {
		
		Thread tD = new DigitThread();
		Thread tL = new LowerThread();
		Thread tU = new UpperThread();
		
		tD.start();
		tL.start();
		tU.start();
		
		
		
		
	}

}
