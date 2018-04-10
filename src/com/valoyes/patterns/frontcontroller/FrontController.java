package com.valoyes.patterns.frontcontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Este Servlet gestionar'a cualquier request que llegue con la extension *.do
 * @author benito
 *
 */
@WebServlet("/*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestURI = request.getRequestURI();
		CommandHelper commandHelper = new CommandHelper();
		// esta linea demuestra todo el poder del Front Controller pattern,
		// haciendo el codigo completamente detached del command actual que
		// se esta ejecutando
		Command command = commandHelper.getCommand(requestURI);
		String vista = command.execute(request, response);
		
		Dispatcher dispatcher = new Dispatcher();
		dispatcher.dispatch(request, response, vista);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
