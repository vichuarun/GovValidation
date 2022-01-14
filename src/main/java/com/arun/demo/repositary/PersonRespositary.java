package com.arun.demo.repositary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.arun.demo.model.Person;
@Component

public class PersonRespositary {
	
	private static final String INSERT_USER_QUERY="insert into emaildemo(email) values(?)";
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	

	public Object savePerson(Person person)  {
		
	
	return jdbctemplate.update(INSERT_USER_QUERY,new Object[] {person.getEmail()});
	
	}

}
