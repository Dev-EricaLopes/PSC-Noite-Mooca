/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usjt.apostila4.string1109;

import javax.swing.JOptionPane;

/**
 *
 * @author erica
 */
public class NewClass {
    public static void main(String[]args)
    {
        String nome;
        int idade;
        
        nome = JOptionPane.showInputDialog("Qual o seu nome:");
        JOptionPane.showMessageDialog(null, "Ola " + nome);
        
        idade = Integer.parseInt(
                JOptionPane.showInputDialog("Qual o sua idade:"));
        JOptionPane.showMessageDialog(null, "Idade " + idade);
    }
}
