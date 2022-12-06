package br.com.edurio.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.edurio.model.Person;

@Service
public class PersonService {
	
	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Mayke");
		person.setLastName("Ferreira");
		person.setAdress("Belo Horizonte - Minas Gerais");
		person.setGender("Masculino");
		return person;
	}
	
	public List<Person> findAll(){
		List<Person> list = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			list.add(person);
		}
		return list;
	}
	
	public Person create(Person person) {
		return person;
	}
	
	public Person update(Person person) {
		return person;
	}
	
	public void delete(String id) {
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person Name " + i);
		person.setLastName("Last Name");
		person.setAdress("Some Adress in Brazil");
		person.setGender("Male");
		return person;
	}

}
