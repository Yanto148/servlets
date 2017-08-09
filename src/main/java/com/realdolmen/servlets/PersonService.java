package com.realdolmen.servlets;

import java.util.Arrays;
import java.util.List;

/**
 * Like a backend
 */
public class PersonService {

	public List<Person> findAll() 
	{
		return Arrays.asList(new Person("Jimi", "Hendrix"), new Person("Jenis", "Joplin"), new Person("Kurt", "Cobain"));	
	}
	
	public Person findById(int id)
	{
		return new Person("Jimi", "Hendrix");
		
	}
	
	public void save(Person p)
	{
		
	}
}
