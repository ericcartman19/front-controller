package com.valoyes.patterns.frontcontroller;

/**
 * Filtra a partir del requestUri cual command (implementacion de la
 * interface "Command" se debe utilizar
 */
public class CommandHelper {

	public Command getCommand(String requestURI) {
		if(requestURI.equals("viewStudentsDetails.do")) {
			return new ViewStudentCommand();
		}
		return null;
	}
	

}
