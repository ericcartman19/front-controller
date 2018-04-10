package com.valoyes.patterns.frontcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {

	// it will return the page that the user will be sent to
	String execute(HttpServletRequest request, HttpServletResponse response);
}
