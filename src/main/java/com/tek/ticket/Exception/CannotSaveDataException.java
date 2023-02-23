package com.tek.ticket.Exception;

public class CannotSaveDataException extends RuntimeException {
	 String ResourceName;
	 
	
	public CannotSaveDataException(String resourceName) {
		super(String.format("%s",resourceName));
		ResourceName = resourceName;
		
	}
}
