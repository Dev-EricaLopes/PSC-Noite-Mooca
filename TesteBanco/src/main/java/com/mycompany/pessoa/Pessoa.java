
package com.mycompany.pessoa;

import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Pessoa {

    private int codigo;
    private String nome;
    private String fone;
    private String email;
    
    //constructor

    public Pessoa() {
    }

    public Pessoa(int codigo, String nome, String fone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public Pessoa(String nome, String fone, String email) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }
     
    //getters //setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void inserir() throws SQLException
    {
        
        String sql = "INSERT INTO tb_pessoas(nome, fone, email) "
                + "VALUES (?, ?, ?)";
        
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.execute();

            System.out.println("Cadastrado com sucesso!!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("ERRO no cadastro!!!");
        }
    
    } 
    
    public void atualizar (){
        //1: Definir o comando SQL
        String sql = "UPDATE tb_pessoas SET nome = ?, fone = ?, "
                + "email = ? WHERE codigo = ?";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
        //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.setInt(4, codigo);
            //5: Executa o comando
            ps.execute();
            System.out.println("Atualizado com sucesso!!");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Não ATUALIZADO!!");
        }
        }
    
    public void apagar (){
    //1: Definir o comando SQL
    String sql = "DELETE FROM tb_pessoas WHERE codigo = ?";
    //2: Abrir uma conexão
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection c = factory.obtemConexao()){
        //3: Pré compila o comando
        PreparedStatement ps = c.prepareStatement(sql);
        //4: Preenche os dados faltantes
        ps.setInt(1, codigo);
        //5: Executa o comando
        ps.execute();
    }
    catch (Exception e){
    e.printStackTrace();
    }
    }
    
    public void listar (){
    //1: Definir o comando SQL
    String sql = "SELECT * FROM tb_pessoas";
    //2: Abrir uma conexão
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection c = factory.obtemConexao()){
        //3: Pré compila o comando
        PreparedStatement ps = c.prepareStatement(sql);
        //4: Executa o comando e guarda
        //o resultado em um ResultSet
        ResultSet rs = ps.executeQuery();
        //5: itera sobre o resultado
        while (rs.next()){
        int codigo = rs.getInt("codigo");
        String nome = rs.getString("nome");
        String fone = rs.getString("fone");
        String email = rs.getString("email");
        String aux = String.format(
        "Código: %d, Nome: %s, Fone: %s, Email: %s",
        codigo,
        nome,
        fone,
        email
        );
        JOptionPane.showMessageDialog (null, aux);
        }
    }
    catch (Exception e){
    e.printStackTrace();
    }
    }
    
}
