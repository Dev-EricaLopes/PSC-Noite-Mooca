/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

import DAO.ConnectionFactory;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TestePessoa {

    public static void main(String[] args) throws SQLException {
        
        ConnectionFactory fat = new ConnectionFactory();
        
        String menu = "1- Cadastrar \n2-Atualizar \n3-Deletar \n4-Listar"
                + " \n0-Sair";
        int opcao;
        
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcao) {
                case 1:
                    System.out.println("cadastrar");
                    fat.inserir();
                    break;
                case 2:
                    System.out.println("Atualizar");
                    break;    
                default:
                    System.out.println("Opção Inválida!!");
            }
            
            
        } while (opcao != 0);
        
        
        
 
    }
}
