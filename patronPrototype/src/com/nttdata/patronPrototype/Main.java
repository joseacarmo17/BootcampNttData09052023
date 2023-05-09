package com.nttdata.patronPrototype;

public class Main {

	public static void main(String[] args) {
		// Crear una instancia de la clase Male
	      Person person = new Person("Juan", 30);

	      // Clonar la instancia de la clase Male
	      Person personClone =  (Person) person.clone();

	      System.out.println("Nombre: " + personClone.getName());
	      System.out.println("Edad: " + personClone.getAge());
	      System.out.println(person == personClone); 

	}

}
