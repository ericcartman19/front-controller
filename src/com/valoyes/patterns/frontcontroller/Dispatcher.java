package com.valoyes.patterns.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Esta clase redirige al usuario hacia la proxima vista
 * recibiendo coomo paamero, una request, una response, y una view
 * 
 *
 */
public class Dispatcher {

	public void dispatch(HttpServletRequest request, HttpServletResponse response, String vista) {

		if(vista != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(mapPageToView(vista));
			try {
				dispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Este metodo hace decoupling entre el command devuelto, o generado por 
	 * ViewStudentCommand, ie "showStudentDetails"
	 * de la vista en cuestion "vistaStudentDetails.jsp" si bien en este caso
	 * los nombres son intuitivos, no tienen pq serlo, la vista podria llamarse 
	 * "unaVistaCualquiera.jsp"
	 */
	private String mapPageToView(String vista) {
		if(vista.equals("showStudentDetails")) {
			return "vistaStudentDetails.jsp";
		}
		return null;
	}

}
