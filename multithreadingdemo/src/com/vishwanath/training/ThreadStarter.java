package com.vishwanath.training;

public class ThreadStarter extends Thread {

	public static void main(String[] args) {

		ThreadStarter thethread = new ThreadStarter();
				thethread.start(); //indirectly calls run
				System.out.println(Thread.currentThread().getName());

	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}


