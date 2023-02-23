package com.tek.ticket.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Object> resourceNotFoundExceptionHandler(ResourceNotFoundException ex) {

		String message = ex.getMessage();
		return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(CannotSaveDataException.class)
	public ResponseEntity<Object> CannotSaveDataExceptionHandler(CannotSaveDataException ex) {
		String message = ex.getMessage();
		return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
	}

}
