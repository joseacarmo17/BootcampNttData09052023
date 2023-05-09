package com.nttdata.patronSingleton;

public class Person {
	private static Person instance;
	private String name;
	private int age;
	
	// Método estático para obtener la instancia única de la clase Person
	   public static Person getInstance(String name, int age) {
	      if (instance == null) {
	         instance = new Person(name, age);
	      }
	      return instance;
	   }
	   
	   
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * 
	 */
	public Person() {
		super();
	}
	
	
	
	
}
