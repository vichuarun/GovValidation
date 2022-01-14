package com.arun.demo.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = GovtEmailValidator.class)
public @interface EnsureGovt {
	 String message() default "{email.invalid}";

	 Class<?>[] groups() default {};

	 Class<? extends Payload>[] payload() default {};

}
