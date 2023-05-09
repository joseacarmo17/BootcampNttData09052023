package com.nttdata.patronDecorator;

public class PersonWithJob extends PersonDecorator {
    private String jobTitle;
    
    public PersonWithJob(Person person, String jobTitle) {
        super(person);
        this.jobTitle = jobTitle;
    }
    
    public String getJobTitle() {
        return jobTitle;
    }
}
