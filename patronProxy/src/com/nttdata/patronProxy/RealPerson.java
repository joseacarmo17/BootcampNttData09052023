package com.nttdata.patronProxy;

public class RealPerson implements Person {
    private String name;
    private int age;
    
    public RealPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
}
