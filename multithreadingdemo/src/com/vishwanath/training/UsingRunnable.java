package com.vishwanath.training;

public class UsingRunnable {

	public static void main(String[] args) {
//		MyTask task = new MyTask();
//		
//		Thread theThread = new Thread(task);
//		
//		theThread.setName("Devadharshini");
//		
//		theThread.start();
		
		new Thread(new MyTask()).start();
		
		

	}

}

class MyTask implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " running...");	
	}
}
