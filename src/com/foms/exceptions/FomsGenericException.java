package com.foms.exceptions;

import org.apache.log4j.Logger;

@SuppressWarnings("serial")
public class FomsGenericException extends Exception {

	private static Logger log = Logger.getLogger(FomsGenericException.class);

	public FomsGenericException(String message, Throwable object) {
		super(message, object);
		log.info("Exception Message is :" + message);
	}
}
