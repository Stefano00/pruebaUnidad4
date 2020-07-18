package com.desafiolatam.dao;

import java.sql.Connection;

import com.desafiolatam.modelo.Usuario;
import com.desafiolatam.procesaconexion.Conexion_db_DTS;

public class DAO_Eliminate extends Conexion_db_DTS{
	
	public void eliminate(Usuario user) {
		generarConexion();
		
		//String query="UPDATE users SET name = ?, phone=?, dateOfBirth=?, pass=?, email=? where email=?";
		String query="DELETE FROM users WHERE email=? and pass=?";
		System.out.println("user.getEmail()"+user.getPass());
		try {
			pstm = conn.prepareStatement(query);
				
				pstm.setString(1, user.getEmail());
				pstm.setString(2, user.getPass());
				
				System.out.println("estoy borrando");
			rs2=pstm.executeUpdate();
		}catch(Exception ex) {
			System.out.println("error");
			ex.printStackTrace();
		}
	}
	
}
