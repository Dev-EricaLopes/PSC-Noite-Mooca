
package com.usjt.apostila3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Digite um número: ");
        num = sc.nextInt();
        
        if(num > 0)
        {
            System.out.println("Positivo");
        }
        else if(num < 0)
        {
            System.out.println("Negativo");
        }
        else if(num == 0)
        {
            System.out.println("Neutro");
        }
        
    }
    
}
