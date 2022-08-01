/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

package br.com.dio.exercicios.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int [] array = {-5, -6, 15, 50, 8, 4};

        for (int i = (array.length-1); i >= 0; i--){
            System.out.println(array[i]);
        }

    }
}
