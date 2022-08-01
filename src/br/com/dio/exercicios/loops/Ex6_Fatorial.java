/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("Digite um número para calcular o fatorial: ");
        int fatorial = scan.nextInt();
        int multiplica = 1;

        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--){
            multiplica *= i;
        }
        System.out.println(multiplica);
    }

}
