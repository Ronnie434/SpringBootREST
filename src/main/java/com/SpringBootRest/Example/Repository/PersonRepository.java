package com.SpringBootRest.Example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootRest.Example.Model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, String>{

}
