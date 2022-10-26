package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;

/**
 * @author Juliao LB
 */

public class ConnectarBDpostgreSQL {
	
	private static Connection con;
    public static Connection  getConnection() throws Exception {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/nameBD";
        String usuario = "postgres";//User
        String senha = "postgres";//password
        try {
            con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão estabelecida com BD \nConnection established with BD \n["+con+"]");
        } catch(Exception e){
            System.out.println("Erro de Conexão com BD \nDB Connection Error \n["+e.getMessage()+"]");
        }
        return con;
    }//end  getConnection
    
    public static void main(String[] args) throws Exception {
        //Testando Conexão|| Testing Connection
        System.out.println(getConnection()); 
    }//end main
}
