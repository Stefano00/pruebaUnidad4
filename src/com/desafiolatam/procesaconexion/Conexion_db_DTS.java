package com.desafiolatam.procesaconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conexion_db_DTS {
	protected Connection conn = null;
	protected PreparedStatement pstm = null;
	protected ResultSet rs = null;
	protected int rs2;
	
	public Connection generarConexion() {
		String usr = "system";
		String pass = "admin";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:/prueba_unidad_4@//localhost:1521/xe";
		
		try {
			//levantar el driver
			Class.forName(driver);
			conn=DriverManager.getConnection(url,usr,pass);
		}
		catch(Exception ex) {
			ex.printStackTrace();	
		}
		
		return conn;
	}

}
