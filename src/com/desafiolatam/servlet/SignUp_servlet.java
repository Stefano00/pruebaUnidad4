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
 * Servlet implementation class SignUp_servlet
 */
@WebServlet("/SignUp_servlet")
public class SignUp_servlet extends HttpServlet {
	//Registro de usuarios
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email= request.getParameter("email");
		String phone= request.getParameter("phone");
		String date= request.getParameter("date");
		String name= request.getParameter("name");
		String pass= request.getParameter("pass");
		int intPhone;
		intPhone=Integer.parseInt(phone);


		
		Usuario user = new Usuario(name,intPhone,date,pass,email);
		Facade facade = new Facade();
		facade.insertUser(user);
		
		
		request.getServletContext().getRequestDispatcher("/sign_in.jsp").forward(request,response);

	}

}
