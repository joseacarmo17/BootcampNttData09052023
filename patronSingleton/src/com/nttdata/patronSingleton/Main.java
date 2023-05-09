package com.nttdata.patronSingleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = Person.getInstance("Juan", 30);
		System.out.println(person.getAge() + " " + person.getName());
	}

}
