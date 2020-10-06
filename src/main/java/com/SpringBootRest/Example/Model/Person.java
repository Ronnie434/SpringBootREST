package com.SpringBootRest.Example.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	private String name;
	private int age;
	private String department;
	
	
	public Person() {
	
	}
	public Person(String name, int age, String department) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
