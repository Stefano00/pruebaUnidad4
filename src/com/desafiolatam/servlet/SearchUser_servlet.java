package com.desafiolatam.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.facade.Facade;
import com.desafiolatam.modelo.Usuario;

/**
 * Servlet implementation class SearchUser_servlet
 */
@WebServlet("/SearchUser_servlet")
public class SearchUser_servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getSession().getAttribute("session") == null){
	    	request.getRequestDispatcher("sign_in.jsp").forward(request,response);
	    	
	    }else {
	    	Usuario user;
			user = (Usuario) request.getSession().getAttribute("session");
			request.setAttribute("user", user);
			Facade facade = new Facade();
			List<Usuario> listUsers;
			listUsers=facade.users();
			request.setAttribute("listUsers", listUsers);
			request.getServletContext().getRequestDispatcher("/users.jsp").forward(request,response);
	    }
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
