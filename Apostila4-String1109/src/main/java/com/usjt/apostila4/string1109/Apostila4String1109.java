/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.usjt.apostila4.string1109;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author erica
 */
public class Apostila4String1109 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome,  nomeUp;
        int tam;
        
        System.out.print("Digite seu nome:");
        nome = sc.next();
        
        tam = nome.length();
        nomeUp = nome.toUpperCase();
        System.out.println("Tamanho: " + tam);
        JOptionPane.showMessageDialog(null, "nomeUp");

    }
}
