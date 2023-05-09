package com.nttdata.patronProxy;

public class Main {

	public static void main(String[] args) {
	    Person person = new PersonProxy("José Antonio", 23, "username", "password");
	    
	    // Imprimir los valores de los atributos de la persona
	    System.out.println(person.getName());
	    System.out.println(person.getAge());

	}

}
