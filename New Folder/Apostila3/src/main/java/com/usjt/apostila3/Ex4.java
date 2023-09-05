/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usjt.apostila3;

import java.util.Scanner;

/**
Ler um inteiro no intervalo [1, 7] e exibir o dia da semana associado a ele, como a
seguir: 1: Domingo, 2: Segunda, 3: Terça. E assim por diante.
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Digite um número de 1-7: ");
        byte n = sc.nextByte();
        
        switch(n)
        {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;     
            case 7:
                System.out.println("Domingo");
                break;                
            default:
                System.out.println("Número Inválido!");
        }
        
        
        
    } 
}
