package com.nttdata.patronDecorator;

public class BasicPerson implements Person {
    private String name;
    private int age;
    
    public BasicPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int getAge() {
        return age;
    }
}
