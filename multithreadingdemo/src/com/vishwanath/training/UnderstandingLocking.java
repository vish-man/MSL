package com.vishwanath.training;

public class UnderstandingLocking {

	public static void main(String[] args) {
MyRunnable task = new MyRunnable();
		
		Thread firstThread = new Thread(task);
		Thread secondThread = new Thread(task);
		Thread thirdThread = new Thread(task);
		
		firstThread.setName("Sparsha");
		secondThread.setName("Mahendra");
		thirdThread.setName("Namrata");
		
		firstThread.start();
		secondThread.start();
		thirdThread.start();

		
	}

}

class MyRunnable implements Runnable{
	@Override
	public synchronized void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " running, i = " + i);
		}
	}
}
