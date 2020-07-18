package com.desafiolatam.facade;

import java.util.List;

import com.desafiolatam.dao.DAO_Eliminate;
import com.desafiolatam.dao.DAO_Insert;
import com.desafiolatam.dao.DAO_Select;
import com.desafiolatam.dao.DAO_UPDATE;
import com.desafiolatam.modelo.Usuario;

public class Facade {
	
	public void insertUser(Usuario user) {
		
		DAO_Insert dao = new DAO_Insert();
		dao.insertQuery(user);
	}
	
	public Usuario signIn(String email, String pass) {
		
		DAO_Select dao = new DAO_Select();
		return dao.signIn(email, pass);		
		
	}
	
	public void modify(Usuario userModify, Usuario user) {
		DAO_UPDATE dao = new DAO_UPDATE();
	    dao.modify(userModify,user);
	}
	public void eliminate(Usuario user) {
		DAO_Eliminate dao = new DAO_Eliminate();
		dao.eliminate(user);
	}
	
	public List<Usuario> users(){
		DAO_Select dao = new DAO_Select();
		return dao.users();
	}
	
}
