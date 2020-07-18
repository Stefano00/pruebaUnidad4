package com.desafiolatam.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.desafiolatam.modelo.Usuario;
import com.desafiolatam.procesaconexion.Conexion_db_DTS;

public class DAO_Select extends Conexion_db_DTS{
	
	public List<Usuario> users() {
		
		generarConexion();
		String query="select * from users";
		
		
		try {
			pstm = conn.prepareStatement(query);
			rs=pstm.executeQuery();
			List<Usuario> users = new ArrayList<Usuario>();
			while(rs.next()) {
				Usuario user = new Usuario(rs.getString("name"),rs.getInt("phone"),rs.getString("dateOfBirth"),rs.getString("pass"),rs.getString("email"));
				 users.add(user);
			}
			return users;
		}catch(Exception ex) {
			return null;
		}
		
	}
	
	
	public Usuario signIn(String emailUser, String passUser) {
		generarConexion();
		String name="";
		int phone=0;
		String date="";
		String email="";
		String pass="";
		String query="select * from users where email=\'"+emailUser+"\' and pass=\'"+passUser+"\'";
		//String query="select * from users where email='x@x.x' and pass='x'";

		//String query ="select * from users";
		System.out.println(query);
		try {
			pstm = conn.prepareStatement(query);
//			pstm.setString(1,emailUser);
//			pstm.setString(2,passUser);
			rs=pstm.executeQuery();
		//	System.out.println(rs.);
		
			boolean entro =rs.next();
			System.out.println(entro);
			if(entro) {		
				System.out.println("entré");
				phone=rs.getInt("phone");
				date = rs.getString("dateOfBirth");
				name = rs.getString("name");
				email=rs.getString("email");
				pass = rs.getString("pass");
				
		} else {
			System.out.println("me pase el if por la raja");
		}
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		Usuario user = new Usuario(name,phone,date, pass, email);
		return user;
		
	}

}
