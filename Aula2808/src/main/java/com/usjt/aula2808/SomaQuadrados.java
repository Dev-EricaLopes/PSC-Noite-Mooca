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
public class SomaQuadrados {
    public static void main(String[] args)
    {
      int a,b,c,d, result;
      Scanner sc = new Scanner(System.in);
      
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      d = sc.nextInt();
      
      result = (a*a)+(b*b)+(c*c)+(d*d);
      
      System.out.println("Resultado - " + result) ;
              
      
    }
}
