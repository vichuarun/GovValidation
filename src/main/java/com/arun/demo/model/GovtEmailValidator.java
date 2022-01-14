package com.arun.demo.model;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

public class GovtEmailValidator implements  ConstraintValidator<EnsureGovt, String> {

	
	private String regex = "^(www.)"+"[_A-Za-z0-9-\\+]*."+
			 "(gov)*(\\.[A-Za-z]{2,})$";
	
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {


		{ 
			if (StringUtils.isEmpty(value))
			
			return true;
		  
		  Pattern pat = Pattern.compile(regex);
		  
		  return pat.matcher(value).matches(); }
		
		
	}
	
			 
}

///^((https?|ftp|smtp):\/\/)?(www.)?[a-z0-9]+(\.[a-z]{2,}){1,3}(#?\/?[a-zA-Z0-9#]+)*\/?(\?[a-zA-Z0-9-_]+=[a-zA-Z0-9-%]+&?)?$/;



/*
 * private String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
 * "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
 * 
 * @Override public boolean isValid(String email, ConstraintValidatorContext
 * context) { if (StringUtils.isBlank(email)) return true;
 * 
 * Pattern pat = Pattern.compile(regex); return pat.matcher(email).matches(); }
 */