package com.SpringBootRest.Example.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootRest.Example.Model.Person;
import com.SpringBootRest.Example.Repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public List<Person> getAllPerson(){
		List<Person> persons = new ArrayList<>();
		personRepository.findAll()
		.forEach(persons::add);
		return persons;
		
	}
	
	public Person getPerson(String name) {
		return personRepository.findById(name).get();
	}

	public void addPerson(Person person) {
		personRepository.save(person);
		
	}

	public void updatePerson(String name, Person person) {
		personRepository.save(person);
		
	}

	public void deletePerson(String name) {
		personRepository.deleteById(name);;
		
	}
}
