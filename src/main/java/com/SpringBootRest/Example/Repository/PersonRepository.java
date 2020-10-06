package com.SpringBootRest.Example.Repository;

import org.springframework.data.repository.CrudRepository;

import com.SpringBootRest.Example.Model.Person;

public interface PersonRepository extends CrudRepository<Person, String>{

}
