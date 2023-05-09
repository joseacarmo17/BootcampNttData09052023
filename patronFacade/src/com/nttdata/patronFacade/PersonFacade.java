package com.nttdata.patronFacade;

import java.util.Arrays;
import java.util.List;

public class PersonFacade {
	
	public List<Person> getPersons(){
		List<Person> lista = Arrays.asList(
				new Person("a", 20),
				new Person("b", 25),
				new Person("c", 30));
		
		return lista;
		
	}
    
}
