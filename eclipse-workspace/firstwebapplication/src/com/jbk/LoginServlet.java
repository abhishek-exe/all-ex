package com.jbk;

import java.io.IOException;
import java.util.ArrayList;

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
		System.out.println("I am in const..");
	}

	public void init() throws ServletException {
		System.out.println(" I am in init..");
	}

	public void destroy() {
		// email
		System.out.println("I am in destroy");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("I am in service");
		// get data
		String un = request.getParameter("uname");
		System.out.println("un >> " + un);
		String pw = request.getParameter("passwd");
		System.out.println("pw >> " + pw);
		//insert
		// process data
		if ("jbk".equals(un)) {
			System.out.println("I am in correct");
			ArrayList<Integer> al=new ArrayList<>();
			al.add(45);
			al.add(45);
			al.add(45);
			al.add(45);
			al.add(45);
			request.setAttribute("data",al);
			// navigate to other page
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
		} else {
			System.out.println("I am in in correct");
			request.setAttribute("msg", "your uname is wrong...");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}

	}

}






