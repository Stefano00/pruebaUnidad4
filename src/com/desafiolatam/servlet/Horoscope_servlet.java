package com.desafiolatam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.desafiolatam.modelo.Horoscopo;
import com.desafiolatam.modelo.Usuario;

/**
 * Servlet implementation class Horoscope_servlet
 */
@WebServlet("/Horoscope_servlet")
public class Horoscope_servlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String email= (String) request.getAttribute("email");
		String pass= (String) request.getAttribute("email");
		String date= request.getParameter("date");
		String name= request.getParameter("name");
		String phone= request.getParameter("phone");*/
		Usuario user;
		//user=(Usuario) (request.getAttribute("user"));
	//	int intPhone=0;
	//	intPhone=Integer.parseInt(phone);
		
		user = (Usuario) request.getSession().getAttribute("session");
		Horoscopo horoscopo = new Horoscopo();
		request.setAttribute("user", user);
		request.setAttribute("horoscopo", horoscopo.lecturaHoroscopoChino(user.getDate()));
		request.setAttribute("descripcion", horoscopo.descripcion(user.getDate()));
		//System.out.println(request.getAttribute("user"));
		horoscopo.lecturaHoroscopoChino(user.getDate());
		//System.out.println(user.getName()+" "+user.getEmail()+" "+user.getPass()+" "+ user.getDate()+" "+ user.getPhone());
		request.getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		if (request.getSession().getAttribute("session") == null){
	    	request.getRequestDispatcher("sign_in.jsp").forward(request,response);
	    	
	    }else {
	    	Usuario user;
			
			
			user = (Usuario) request.getSession().getAttribute("session");
			Horoscopo horoscopo = new Horoscopo();
			request.setAttribute("user", user);
			request.setAttribute("horoscopo", horoscopo.lecturaHoroscopoChino(user.getDate()));
			request.setAttribute("descripcion", horoscopo.descripcion(user.getDate()));
			//System.out.println(request.getAttribute("user"));
			horoscopo.lecturaHoroscopoChino(user.getDate());
			request.getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
	    }
		
		
	}

}
