package com.vishwanath.training;

public class WorkingWithMultipleThreads extends Thread  {

	public static void main(String[] args) {

		WorkingWithMultipleThreads firstThread = new WorkingWithMultipleThreads();
		WorkingWithMultipleThreads secondThread = new WorkingWithMultipleThreads();
		WorkingWithMultipleThreads thirdThread = new WorkingWithMultipleThreads();
		
		firstThread.setName("Tanmay");
		secondThread.setName("Nandini");
		thirdThread.setName("Namdev");
		
		firstThread.start();
		secondThread.start();
		thirdThread.start();

	}
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " running, i = " + i);
		}
	}

}
