package com.example.demo;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ResponseHandler  extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	
	public final ResponseEntity<Object> handleAllException(Exception ex , WebRequest request) {
		
		ExceptionTypes exceptiontype = new ExceptionTypes(new Date(), ex.getMessage(), request.getDescription(false));
		
		
		return new ResponseEntity<>(exceptiontype, HttpStatus.NOT_FOUND);
	}
	

}
