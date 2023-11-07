/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadastros;

import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author erica
 */
public class Usuario {


    private int id;
    private String nome;
    private String email;
    private String usuario;
    private String senha;
    private int tipoUsu;
    
    
    
    public Usuario(int id, String nome, String email, String usuario, String senha, int tipoUsu) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.tipoUsu = tipoUsu;
    }

    public Usuario(String nome, String email, String usuario, String senha, int tipoUsu) {
        this.nome = nome;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.tipoUsu = tipoUsu;
    }

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipoUsu() {
        return tipoUsu;
    }

    public void setTipoUsu(int tipoUsu) {
        this.tipoUsu = tipoUsu;
    }
    
    public void inserir() throws SQLException
    {
        
        String sql = "INSERT INTO tb_usuario(nome, email, usuario, senha, tipousu) "
                + "VALUES (?, ?, ?, ?, ?)";
        
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, email);
            ps.setString(3, usuario);
            ps.setString(4, senha);
            ps.setInt   (5, tipoUsu);
            ps.execute();

            JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso!!");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERRO no cadastro do usuário!!!");
        }
    
    }
    
    public void Consultar(){

        String sql = "SELECT * FROM tb_usuario where usuario = ?";
    
         ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();
            //5: itera sobre o resultado
            while (rs.next()){
            setNome(rs.getString("nome"));
            setEmail(rs.getString("email"));
            setSenha(rs.getString("senha"));
            setTipoUsu(rs.getInt("tipoUsu"));

            }
    }
    catch (Exception e){
    e.printStackTrace();
    }
    }
    
    public int ValidarSenha(String usu, String senhat){

        String sql = "SELECT * FROM tb_usuario where usuario = ? and senha = ?";
         ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, usu);
            ps.setString(2, senhat);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next())
            {
                setNome(rs.getString("nome"));
                setUsuario(rs.getString("usuario"));
                setTipoUsu(rs.getInt("tipoUsu"));             
                JOptionPane.showMessageDialog(null, "Olá " + nome);
                return 0;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "ERRO!! Usuário e/ou Senha Inválido!");
                return 1;
            }   
            

        }
        catch (Exception e){
        e.printStackTrace();
        return 99;
        
        }
    
    }
}
