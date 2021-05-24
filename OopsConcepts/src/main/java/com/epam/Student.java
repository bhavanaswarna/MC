package com.epam;

public class Student {

	int id;  
	String name;  
	Address address;  
	  
	public Student(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	  
	public static void main(String[] args) {  
	Address address1=new Address("Khammam","TS","india");  
	Address address2=new Address("Vijayawada","AP","india");  
	  
	Student e=new Student(111,"bhavana",address1);  
	Student e2=new Student(112,"nikhila",address2);  
	      
	e.display();  
	e2.display();  
	      
	} 

}
