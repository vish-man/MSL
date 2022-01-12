package com.vishwanath.training;

public class UnderstandingSleep extends Thread {

	public static void main(String[] args) {

		UnderstandingSleep theThread = new UnderstandingSleep();
		
		theThread.setName("arcote");
		
		theThread.start();
		
	}
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " about to sleep");
		
		try {
			Thread.sleep(5000);
		
		} catch (InterruptedException e) {
			
			System.out.println("someone interrupted me:(");
		}
			System.out.println(Thread.currentThread().getName() + " woke up, resuming now");
		
		}
	}


