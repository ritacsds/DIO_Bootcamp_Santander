/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensionais {
    public static void main(String[] args) {
        Random random = new Random();
        //primeiros colchetes linha | segundo colchetes coluna
        int[][] M = new int[4][4];
        //cada linha representa um array unidimensional
        //enquanto cada coluna representa os elementos desse array

        //for para navegar na matriz geral
        for (int i=0; i<M.length; i++){
            //quando entra no for, entra em uma linha, por isso precisa criar outro for
            //o j representa cada coluna dentro da linha i
            for (int j = 0; j<M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }
        //criar dois for each, um pra linha, outro pra coluna
        System.out.println("Matriz: ");
        for (int [] linha : M ) {
            for (int elementoDaColuna : linha) {
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println();
        }

    }
}
