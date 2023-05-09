package com.nttdata.patronDecorator;

public class PersonDecorator implements Person{
	protected Person person;
	
    public PersonDecorator(Person person) {
        this.person = person;
    }
    
    @Override
    public String getName() {
        return person.getName();
    }
    
    @Override
    public int getAge() {
        return person.getAge();
    }

}
