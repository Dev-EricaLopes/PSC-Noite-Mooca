/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usjt.aula2808;

import java.util.Scanner;

/**
 *
 * @author chatgpt
 */

public class Antecessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor = scanner.nextInt();
        int antecessor = valor - 1;

        System.out.println("O antecessor de " + valor + " é " + antecessor);

        scanner.close();
    }
}


