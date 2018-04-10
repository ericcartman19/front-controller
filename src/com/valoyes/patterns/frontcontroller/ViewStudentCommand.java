package com.valoyes.patterns.frontcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Este command, crea un SudentVO lo mete dentro de la request
 * y despues devuelve una view "showStudentDetails" que es el 
 * proximo jsp al cual sera reenviado el usuario
 *
 */
public class ViewStudentCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		StudentVO studentVo = new StudentVO(1, "Elio");
		request.setAttribute("studentDetails", studentVo);
		return "showStudentDetails";
		
	}

}
