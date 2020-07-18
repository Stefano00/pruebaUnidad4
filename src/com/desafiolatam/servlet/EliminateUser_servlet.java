package com.desafiolatam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.facade.Facade;
import com.desafiolatam.modelo.Usuario;

/**
 * Servlet implementation class EliminateUser_servlet
 */
@WebServlet("/EliminateUser_servlet")
public class EliminateUser_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getSession().getAttribute("session") == null){
	    	request.getRequestDispatcher("sign_in.jsp").forward(request,response);
	    	
	    }else {
	    	Usuario user;
			user = (Usuario) request.getSession().getAttribute("session");
			request.setAttribute("user", user);
			request.getServletContext().getRequestDispatcher("/eliminate.jsp").forward(request,response);
	    }
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Estoy en el servletEliminar");
		Usuario user;
		user= (Usuario) request.getSession().getAttribute("session");
		request.setAttribute("user", user);
		Facade facade = new Facade();
		facade.eliminate(user);
		request.setAttribute("user", user);
		request.getServletContext().getRequestDispatcher("/eliminate.jsp").forward(request, response);
		
	}

}
