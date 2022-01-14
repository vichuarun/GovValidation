package com.arun.demo.control;

import java.io.Serializable;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arun.demo.model.Person;
import com.arun.demo.repositary.PersonRespositary;
@RestController
public class PersonControl implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private PersonRespositary personRespositary;
	
	
	@PostMapping("/person/adder")
	public Object addPerson(@Valid @RequestBody Person person) {
		return personRespositary.savePerson(person);
	}

}
