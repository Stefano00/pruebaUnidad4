package com.desafiolatam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.desafiolatam.facade.Facade;
import com.desafiolatam.modelo.Usuario;

/**
 * Servlet implementation class Sign_in_servlet
 */
@WebServlet("/SignIn_servlet")
public class SignIn_servlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String email= request.getParameter("email");
		String pass= request.getParameter("pass");
	
		Facade facade = new Facade();
		
		Usuario user = facade.signIn(email, pass);
		
		System.out.println("Nombre "+user.getName()+" Pass "+ user.getPass() + " Phone "+user.getPhone() + " Address "+user.getDate()+ " Email "+user.getEmail());
		
		if(email.equals(user.getEmail()) && pass.equals(user.getPass())) {
			//System.out.println("Usuario correcto");
			request.setAttribute("user", user);
//			HttpSession session = request.getSession(true);
			request.getSession().setAttribute("session", user);
		/*	request.setAttribute("name", user.getName());
			request.setAttribute("pass", user.getPass());
			request.setAttribute("phone", user.getPhone());
			request.setAttribute("date", user.getDate());
			request.setAttribute("email", user.getEmail());*/
			request.getServletContext().getRequestDispatcher("/Horoscope_servlet").forward(request,response);
		}
		else {
			System.out.println("Usuario incorrecto, intentelo nuevamente");
			request.getServletContext().getRequestDispatcher("/sign_in.jsp").forward(request,response);
		}
		

	}
	
	
	
	

}
