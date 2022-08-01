/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorMenorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        double soma = 0;
        int maior = 0;
        int cont = 1;

        while(cont <=5){
            System.out.println("Digite a nota " + cont);
            numero = scan.nextInt();
            if(numero>maior) maior = numero;
            soma += numero;
            cont++;
        }
        System.out.println("A média é " + (soma/5));
        System.out.println("O maior número é " + maior);
    }
}

