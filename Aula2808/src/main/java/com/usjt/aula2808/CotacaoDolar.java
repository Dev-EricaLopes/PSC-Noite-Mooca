/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usjt.aula2808;

import java.util.Scanner;

/*
** Ler a cotação do dólar e a quantidade de dólares. 
** Converter para real e mostrar o resultado.
 */
public class CotacaoDolar {
    public static void main(String[]args)
    {
        float cotDolar, qtDolar, real;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor Cotação Dolar: ");
        cotDolar = sc.nextFloat();
        
        System.out.print("Qtde Dolar: ");
        qtDolar = sc.nextFloat();
        
        real = cotDolar * qtDolar;
        
        System.out.println("Real R$ " + real);
        
        
        
    }
    
}
