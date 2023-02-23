package com.tek.ticket.Exception;

public class ResourceNotFoundException extends RuntimeException {
	 String ResourceName;
	
	
	public ResourceNotFoundException(String resourceName) {
		super(String.format("%s",resourceName));
		ResourceName = resourceName;
	}
	
}
