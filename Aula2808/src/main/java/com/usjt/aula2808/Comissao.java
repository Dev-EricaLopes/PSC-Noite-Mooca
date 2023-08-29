/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usjt.aula2808;

import java.util.Scanner;

/**
 *
 * @author erica
 */
public class Comissao {
        public static void main(String[] args)
    {
      double precoUnit, qtdeVenda, comissao;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Preço Unit - ");
      precoUnit = sc.nextDouble();
      
      System.out.print("Qtde Venda - ");
      qtdeVenda = sc.nextDouble();
      
      comissao = (precoUnit * qtdeVenda)*0.05;  
      
        System.out.println("Comissão - " + comissao);
    }
        
    
}
