package com.desafiolatam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CloseSession_servlet
 */
@WebServlet("/CloseSession_servlet")
public class CloseSession_servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.getSession().setAttribute("session", null);
	
	request.getServletContext().getRequestDispatcher("/sign_in.jsp").forward(request,response);
	}
}
