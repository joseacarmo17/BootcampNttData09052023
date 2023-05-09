package com.nttdata.patronProxy;

public class PersonProxy implements IPerson {
    private Person person;

    public PersonProxy(Person person) {
        this.person = person;
    }

    @Override
    public String getName() {
        before();
        String name = person.getName();
        after();
        return name;
    }

    @Override
    public int getAge() {
        before();
        int age = person.getAge();
        after();
        return age;
    }

    @Override
    public void setName(String name) {
        before();
        person.setName(name);
        after();
    }

    @Override
    public void setAge(int age) {
        before();
        person.setAge(age);
        after();
    }

    private void before() {
        System.out.println("Before method call");
    }

    private void after() {
        System.out.println("After method call");
    }
}

