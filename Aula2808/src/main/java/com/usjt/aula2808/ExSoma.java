/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.usjt.aula2808;

import java.util.Scanner;

/**
 *
 * @author erica
 */
public class ExSoma {

    public static void main(String[] args)
    {
      int num1;
      int num2;  
      int result;
      
      Scanner sc = new Scanner(System.in);
        
      System.out.print("Num1 - ");
      num1 = sc.nextInt();
      System.out.print("Num2 - ");
      num2 = sc.nextInt();
      
      result = num1 + num2;
      
      System.out.println(result);
        
    }
}
