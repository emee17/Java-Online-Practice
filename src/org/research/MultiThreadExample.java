package org.research;

public class MultiThreadExample {
	
	public static void main(String[] args) {
		
		TExample tc = new TExample();// New state
		
		tc.start(); // Runnable State
		
		//Running State
		
		// wait sleep
		
		//Destroyed
		System.out.println("for TC : "+tc.getPriority());
//		
		///////////////////////////////////////////////////
		
		ThreadByInterface ti = new ThreadByInterface();// This is not thread
		
		
		Thread t = new Thread(ti,"t1"); // Here you have to pass the object of class which implements Runnable Iterface
		
		Thread t2 = new Thread(ti, "t2");
		
		t2.setPriority(10);
		
//		Thread t2 = new Thread(ti);
//		
//		Thread t3 = new Thread(ti);
//		
//		Thread t4 = new Thread(ti);
		
		t.start();// if we directly use run method it will be executed as normal method
		
		System.out.println(t.getName());
//		t2.start();
//		System.out.println(t2.getName());
		
		
		
		
		
		
	}

}

class ThreadByInterface implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println(" Bruce :  "+i );
			
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}


class TExample extends Thread  {
	
	
	@Override
	public void run() {
		
		for (int i = 0; i < 15; i++) {
			System.out.println(" Tony :  "+i);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
