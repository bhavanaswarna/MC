package com.epam;

class Hi extends Thread {
	public void run() {
		for(int i = 0;i < 3;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Hello extends Thread {
	public void run() {
		for(int i = 0;i < 3;i++) {
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

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi hi = new Hi();
		Hello hello = new Hello();
		hi.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hello.start();

	}

}
