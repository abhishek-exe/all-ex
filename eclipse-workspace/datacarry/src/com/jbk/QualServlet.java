package com.jbk;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SkillServlet
 */
@WebServlet("/QualServlet")
public class QualServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String qual = request.getParameter("qualname");
		System.out.println("qual >> " + qual);
		String skillName111 = request.getParameter("skillName111");
		request.setAttribute("qual", qual);
		request.setAttribute("skillName111", skillName111);
		System.out.println("skillName111 >> " + skillName111);
		System.out.println("qual >> " + qual);
		RequestDispatcher rd = request.getRequestDispatcher("preview.jsp");
		rd.forward(request, response);
	}

}







