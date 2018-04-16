package com.logger;

import org.apache.log4j.Logger;

public class ExceptionExample {
	final static Logger logger = Logger.getLogger(ExceptionExample.class);

	public static void main(String[] args) {
		logger.info("Entered in main() method");
		ExceptionExample obj = new ExceptionExample();
		try {
			obj.divide();
		} catch (ArithmeticException ex) {
			logger.error("Sorry, something wrong!", ex);
		}
		logger.info("Exiting from main() method");
	}

	private void divide() {
		logger.info("Entered in divide() method");
		int i = 10 / 0;
		logger.info("Exiting from divide() method");
	}
}