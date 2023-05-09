package com.nttdata.patronDecorator;

public class Main {

	public static void main(String[] args) {
		Person person = new BasicPerson("José Antonio", 23);
		Person personWithJob = new PersonWithJob(person, "Software Engineer");

		System.out.println(personWithJob.getName());
		System.out.println(personWithJob.getAge());
	}

}
