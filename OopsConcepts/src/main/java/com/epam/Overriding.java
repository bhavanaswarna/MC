package com.epam;

class Bank {
	void bankname() {
		System.out.println("Bank");
	}
}

class SBI extends Bank {
	void bankname() {
		System.out.println("SBI");
	}
}

class HDFC extends Bank {
	void bankname() {
		System.out.println("HDFC");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s = new SBI();
		s.bankname();
		HDFC h = new HDFC();
		h.bankname();

	}

}
