/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5_tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int count = 1;
        System.out.println("Digite um número de 1 a 10 para fazer a tabuada: ");
        num = scan.nextInt();

//        do{
//            System.out.println(num + " X " + count + " = " + num*count);
//            count++;
//        }while(count<=10);

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}
