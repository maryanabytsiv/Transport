package com.epam.lib.transport.control;

import org.apache.log4j.Logger;

public class InputNumberException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(InputNumberException.class);

	private String message;

	public InputNumberException() {
		super();             
		message = "unknown";
	}

	public InputNumberException(String err) {	
		super(err);     
		message = err;  
	}

	public void getError(){
		logger.error(message);
		System.out.println(message);
		ScannerOfMenuInputSingleton.getInstance().nextLine();
	}
}