package com.nttdata.patronBuilder;

public class Person {
	   private final String name;
	   private final int age;

	   public Person(PersonBuilder builder) {
	      this.name = builder.name;
	      this.age = builder.age;
	   }

	   // Métodos getter para los atributos
	   public String getName() {
	      return name;
	   }

	   public int getAge() {
	      return age;
	   }
	   
	   // Clase Builder para la clase Person
	   public static class PersonBuilder {
	      private final String name;
	      private final int age;

	      public PersonBuilder(String name, int age) {
	         this.name = name;
	         this.age = age;
	      }

	      // Método para construir un objeto de la clase Person
	      public Person build() {
	         return new Person(this);
	      }
	   }
	}

