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
public class Ex13 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1, n2, n3;
        
            System.out.println("n1:");
            n1 = sc.nextInt();

            System.out.println("n2:");
            n2 = sc.nextInt();
            
            System.out.println("n3:");
            n3 = sc.nextInt();
            
            
            if (n1==n2 && n1==n3 && n2==n3)
            {
                System.out.println("Finalizar"); 
                System.exit(0);
            }
            else if(n1<n2 && n2<n3)
            {
                System.out.println("ordem crescente: " + n1 + n2 + n3);
            }
            else if(n1<n3 && n3<n2)
            {
                System.out.println("ordem crescente: " + n1 + n3 + n2);
            }
            else if(n2<n1 && n1<n3)
            {
                System.out.println("ordem crescente: " + n2 + n1 + n3);

            }
        }
    
}
