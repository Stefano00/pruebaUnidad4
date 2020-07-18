package com.desafiolatam.dao;

import com.desafiolatam.modelo.Usuario;
import com.desafiolatam.procesaconexion.Conexion_db_DTS;

public class DAO_Insert extends Conexion_db_DTS {

public String  insertQuery(Usuario user) {
		
		String query="INSERT INTO users VALUES (?,?,?,?,?)";
	
		System.out.println(generarConexion());
		String datoGuardado="";
	//	System.out.println(user.getEmail()+" "+user.getPass());
		
		try {
			pstm = conn.prepareStatement(query);
			
				pstm.setString(1, user.getName());
				pstm.setInt(2, user.getPhone());
				pstm.setString(3, user.getDate());
				pstm.setString(4, user.getPass());
				pstm.setString(5, user.getEmail());
			
			
			rs2=pstm.executeUpdate();
		}catch(Exception ex) {
			System.out.println("error");
			ex.printStackTrace();
		}
		return datoGuardado;
	}
}
