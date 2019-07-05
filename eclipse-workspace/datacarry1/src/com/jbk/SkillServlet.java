package com.jbk;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SkillServlet
 */
@WebServlet("/SkillServlet")
public class SkillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		System.out.println(session.getId());
		
		if (!session.isNew()) {
			session.invalidate();
			session = request.getSession();
		}
		else {
		System.out.println(session.getId());
		String skill = request.getParameter("skillname");
		System.out.println("skill >> " + skill);
		request.setAttribute("skill", skill);
		session.setAttribute("SkillSession", skill);
		//session.invalidate();
		RequestDispatcher rd = request.getRequestDispatcher("qual.jsp");
		rd.forward(request, response);

	}
}
}