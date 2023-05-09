package com.nttdata.patronProxy;

public class PersonProxy implements Person {
    private RealPerson realPerson;
    private String username;
    private String password;
    
    public PersonProxy(String name, int age, String username, String password) {
        this.realPerson = new RealPerson(name, age);
        this.username = username;
        this.password = password;
    }
    
    public String getName() {
        if (this.isAuthenticated()) {
            return this.realPerson.getName();
        } else {
            return "Access Denied";
        }
    }
    
    public int getAge() {
        if (this.isAuthenticated()) {
            return this.realPerson.getAge();
        } else {
            return 0;
        }
    }
    
    private boolean isAuthenticated() {
        // Aquí podrías implementar la lógica para autenticar al usuario
        // en base a las credenciales proporcionadas en el constructor.
        return true;
    }
}
