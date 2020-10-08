package com.SpringBootRest.Example.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Persons")
public class Person {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
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
	@Column(name="Name", unique=false, nullable=false, length = 100)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="Age", unique=false, nullable=true, length=100)
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	@Column(name="Department", unique=false, nullable=true, length=100)
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
