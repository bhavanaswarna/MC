package com.epam;

class Animal {
	void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Barking");
	}
}

class BabyDog extends Dog {
	void puppy() {
		System.out.println("baby dog");
	}
}

class Cat extends Animal {
	void sound() {
		System.out.println("meow");
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog b = new BabyDog();
		b.bark();
		b.eat();
		b.puppy();
		Cat c = new Cat();
		c.eat();
		c.sound();
	}

}
