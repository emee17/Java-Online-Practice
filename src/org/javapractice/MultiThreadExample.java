package org.javapractice;

public class MultiThreadExample {

	public static void main(String[] args) {
	
		Thread ti = new Thread(new ThreadByRunnableInterface());
		ti.start();
		
//		Thread t2 = new Thread(new ThreadByRunnableInterface());
//		t2.start();
		
		ThreadByClass tc = new ThreadByClass();
		
		tc.start();
		
		System.out.println(tc.getName());
		System.out.println(ti.getName());
		
		
	}
	
}

class ThreadByClass extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println("Decimal : "+i);
			
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadByRunnableInterface implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println("Number : "+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
