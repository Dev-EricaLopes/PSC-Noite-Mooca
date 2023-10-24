/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory {  
    private String usuario = "root";
    private String senha = "root";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_pessoa";
    
    public Connection obtemConexao() throws SQLException
    {
        try{
        Connection c = DriverManager.getConnection(
        "jdbc:mysql://"+ host + ":" + porta + "/" + bd + 
                "?useTimezone=true&serverTimezone=UTC",
                usuario, senha);
            System.out.println("Conexão efetuada com sucesso!!");
        return c;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Erro na conexão com o banco de dados!");
            return null;
        }
        
    }
   
}
