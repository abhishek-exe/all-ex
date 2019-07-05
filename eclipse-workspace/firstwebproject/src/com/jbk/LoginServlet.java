package com.jbk;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		System.out.println("i am in constructor");

	}

	@Override
	public void init() throws ServletException {
		System.out.println("i am in init");

	}

	@Override
	public void destroy() {

		System.out.println("i am in destroy");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("I am in service");

		// getdata
		String un = request.getParameter("uname");
		System.out.println("un >>" + un);
		String pw = request.getParameter("pass");
		System.out.println("pw >>" + pw);
		// process data
		if ("jbk".equals(un)) {
			System.out.println("i am in correct");
			// navigate to other page
			RequestDispatcher rd = request.getRequestDispatcher("success.html");
			rd.forward(request, response);
		} else {
			System.out.println("i am incorrect");
			RequestDispatcher rd = request.getRequestDispatcher("error.html");
			rd.forward(request, response);
		}

	}
}
