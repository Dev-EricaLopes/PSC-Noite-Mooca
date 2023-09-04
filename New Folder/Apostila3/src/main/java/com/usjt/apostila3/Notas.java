/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usjt.apostila3;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) 
    {
        float nota;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a nota: ");
        nota = sc.nextFloat();
        
        if (nota >= 70 && nota <= 100)
        {
            System.out.println("Aprovado");
        }
        else if (nota >= 40 && nota < 70)
        {
            System.out.println("Fazer AI");
        }
        else if (nota < 40)
        {
            System.out.println("Reprovado");
        }
        else
        {
            System.out.println("Nota Inválida!|!|");
        }
                
        System.out.println("* * * FIM DO CÓDIGO * * *");           
        
    }
    
}
