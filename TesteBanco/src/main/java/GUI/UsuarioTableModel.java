/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Cadastros.Usuario;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author erica
 */
public class UsuarioTableModel extends AbstractTableModel{
    
    
    
    private List<Usuario> dados = new ArrayList<>();
    private String[] colunas = {"Nome", "E-mail", "Usuário","Senha", "Tipo de Usuário"};
  
    
    @Override 
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {

        switch (coluna) {
            case 0:
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getEmail();
            case 2:
                return dados.get(linha).getUsuario();
            case 3:
                return dados.get(linha).getSenha();
            case 4:
                return dados.get(linha).getTipoUsu();
        }
        return null;
    }
    
}
