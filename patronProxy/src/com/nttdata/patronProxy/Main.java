package com.nttdata.patronProxy;

public class Main {

	public static void main(String[] args) {
		 Person person = new Person("José Antonio", 23);
		 IPerson proxy = new PersonProxy(person);
		 System.out.println(proxy.getName());
		 System.out.println(proxy.getAge());

	}

}
