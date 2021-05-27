package com.epam;

class MtHi implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 3; i++) {
			System.out.println("HI");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}	
}

class MtHello implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 3; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MTUsingInterface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MtHi hi = new MtHi();
		MtHello hello = new MtHello();
		Thread t = new Thread(hi);
		Thread t1 = new Thread(hello);
		t.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		
		t.join();
		t1.join();
		
		System.out.println(t1.isAlive());
		
		System.out.println("Bye");
	}

}
