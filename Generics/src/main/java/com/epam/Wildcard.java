package com.epam;

import java.util.ArrayList;
import java.util.List;

abstract class Shapes {
	abstract void draw();
}

class Rectangle extends Shapes {
	void draw() {
		System.out.println("rectangle");
	}
}

class Circle extends Shapes {
	void draw() {
		System.out.println("circle");
	}
}

class Triangle extends Shapes {
	void draw() {
		System.out.println("triangle");
	}
}

public class Wildcard {
	public static void wildcardExample(List<? extends Shapes>list) {
		for(Shapes s:list) {
			s.draw();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Rectangle> l = new ArrayList<Rectangle>();
		l.add(new Rectangle());
		l.add(new Rectangle());
		List <Circle> l1 = new ArrayList<Circle>();
		l1.add(new Circle());
		List <Triangle> l2 = new ArrayList<Triangle>();
		l2.add(new Triangle());
	}
}
