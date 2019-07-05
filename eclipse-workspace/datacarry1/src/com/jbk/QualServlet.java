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
@WebServlet("/QualServlet")
public class QualServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		System.out.println(session);
		if(session!=null) {
			System.out.println(session.getId());
			
		}
		if (session == null) {
			request.setAttribute("msg", "your session is not valid please login aganin");
			RequestDispatcher rd = request.getRequestDispatcher("skill.jsp");
			rd.forward(request, response);
		}else {
		String qual = request.getParameter("Qualname");
		System.out.println("qual >> " +qual);
		String skillname1 = request.getParameter("skillname1");
		request.setAttribute("qual", qual);
		request.setAttribute("skillname1", skillname1);
		System.out.println("skillname1 >>" +skillname1);
		System.out.println("qual >> " +qual);
		
RequestDispatcher rd =request.getRequestDispatcher("preview.jsp");
		rd.forward(request, response);

	}}}
