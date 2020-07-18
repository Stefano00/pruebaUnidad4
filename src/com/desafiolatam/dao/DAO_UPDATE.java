package com.desafiolatam.dao;

import com.desafiolatam.modelo.Usuario;
import com.desafiolatam.procesaconexion.Conexion_db_DTS;

public class DAO_UPDATE extends Conexion_db_DTS{
	public void modify(Usuario userModify, Usuario user) {
		generarConexion();
		//	String query="INSERT INTO users VALUES (?,?,?,?,?)";
		String query="UPDATE users SET name = ?, phone=?, dateOfBirth=?, pass=?, email=? where email=?";
		try {
			pstm = conn.prepareStatement(query);
			
				pstm.setString(1, userModify.getName());
				pstm.setInt(2, userModify.getPhone());
				pstm.setString(3, userModify.getDate());
				pstm.setString(4, userModify.getPass());
				pstm.setString(5, userModify.getEmail());
				pstm.setString(6, user.getEmail());

		
			rs2=pstm.executeUpdate();
		}catch(Exception ex) {
			System.out.println("error");
			ex.printStackTrace();
		}
		
		
	
	}

}
