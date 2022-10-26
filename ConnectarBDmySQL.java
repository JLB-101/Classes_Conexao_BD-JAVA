package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectarBDmySQL {
	
	private static Connection con;
	public static Connection getConnection() {
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.cj.jdbc.Driver //com.mysql.jdbc.Driver
		String dburl = "jdbc:mysql://localhost:3306/NameBD";
		String username = "root";
		String password = "root";
		con = (Connection)DriverManager.getConnection( dburl, username, password);
		System.out.println("Conexão estabelecida com BD \nConnection established with BD \n["+con+"]");
		
	}catch(Exception e){
			System.out.println("Erro de Conexão com BD \nDB Connection Error \n["+e.getMessage()+"]");
	}
	return con;
	}//end getConnection
	
	//Testing--Testando
	public static void main(String[] args) {
		System.out.println(getConnection());
	}

}
