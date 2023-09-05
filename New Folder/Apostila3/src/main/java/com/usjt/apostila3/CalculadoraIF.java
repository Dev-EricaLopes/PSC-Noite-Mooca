/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usjt.apostila3;

import java.util.Scanner;

/**
 *
 * @author erica
 */
public class CalculadoraIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, result, opera;
        
        System.out.print("Digite um número: ");
        num1 = sc.nextInt();
        
        System.out.print("Digite outro número: "); 
        num2 = sc.nextInt();
        
        System.out.print("Digite: 1-Soma 2-Subt 3-Div 4-Mult"); 
        opera = sc.nextInt();
        
        if(opera == 1)
        {
            result = num1 + num2;
            System.out.println("Resultado: " + result);
        }
        else if(opera == 2)
        {
            result = num1 - num2;
            System.out.println("Resultado: " + result);
        }
        else if(opera == 3)
        {
            result = num1 / num2;
            System.out.println("Resultado: " + result);
        }
        else if(opera == 4)
        {
            result = num1 * num2;
            System.out.println("Resultado: " + result);
        }
    }    
}
