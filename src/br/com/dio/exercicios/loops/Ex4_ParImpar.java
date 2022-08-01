/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNum;
        int count = 1;
        int num;
        int par = 0;
        int impar = 0;

        System.out.println("Digite a quantidade de números que deseja incluir: ");
        quantNum = scan.nextInt();

        do{
            System.out.println("Digite o número " + count);
            num = scan.nextInt();
            if (num%2 == 0)
                par++;
            else
                impar++;
            count++;
        }while(count<=quantNum);

        System.out.println("A quantidade de números pares é: " + par);
        System.out.println("A quantidade de números ímpares é: " + impar);
    }
}
