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
 * Servlet implementation class ModifyUser_servlet
 */
@WebServlet("/ModifyUser_servlet")
public class ModifyUser_servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getSession().getAttribute("session") == null){
	    	request.getRequestDispatcher("sign_in.jsp").forward(request,response);
	    	
	    }else {
	    	Usuario user;
			user = (Usuario) request.getSession().getAttribute("session");
			request.setAttribute("user", user);
			//System.out.println("probando modify " + user.getName());
			
			request.getServletContext().getRequestDispatcher("/modify.jsp").forward(request,response);
	    }
		

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email= request.getParameter("emailModify");
		String phone= request.getParameter("phoneModify");
		String date= request.getParameter("dateModify");
		String name= request.getParameter("nameModify");
		String pass= request.getParameter("passModify");
		int intPhone;
		intPhone=Integer.parseInt(phone);
		Usuario user;
		user = (Usuario) request.getSession().getAttribute("session");
		Usuario userModify=new Usuario(name,intPhone,date, pass, email);
		request.setAttribute("userModify", userModify);
		Facade facade = new Facade();
		facade.modify(userModify, user);
		request.setAttribute("user", userModify);
		request.getSession().setAttribute("session", userModify);
		request.getServletContext().getRequestDispatcher("/modify.jsp").forward(request,response);

	}
}
