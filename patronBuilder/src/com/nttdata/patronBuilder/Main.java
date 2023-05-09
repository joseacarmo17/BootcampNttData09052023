package com.nttdata.patronBuilder;

import com.nttdata.patronBuilder.Person.PersonBuilder;

public class Main {

	public static void main(String[] args) {
		Person person = new Person.PersonBuilder("José Antonio", 23).build();
		
		System.out.println(person.getAge());
		System.out.println(person.getName());

	}

}
