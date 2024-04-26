import java.util.Scanner;
/* Desenvolver um programa que recebe uma sequencia de 10 inteiros, salva todos em um array
* e, em seguida, faz a leitura do array em busca do maior numero. Ao final, retorna o maior
* numero, o indice do array onde esse valor esta armazenado e uma pequena visualizacao dessa
* posicao com o numero em destaque.*/

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //entrada dos dados
        System.out.println("==== MAIOR NUMERO ====");
        System.out.println("Digite abaixo uma sequencia de 10 numeros inteiros:");
        int[] numeros = new int[10];
        //leitura do vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("#%d > ", i+1 );
            numeros[i] = read.nextInt();
        }

        //exibe os valores
        System.out.println("---------------------------------");
        System.out.println("Vetor recebido: ");
        System.out.print("|");
        for (int num : numeros) {
            System.out.print(num + "|");
        }
        System.out.println("\n---------------------------------");

        //busca pelo maior valor
        int numeroMaior = 0, posicao = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numeroMaior) {
                numeroMaior = numeros[i];
                posicao = i;
            }
        }

        //exibicao dos resultados
        System.out.printf("O maior numero no vetor e %d, no indice %d:\n", numeroMaior, posicao);
        System.out.print("|");
        for (int i = 0; i < numeros.length; i++) {
            if (i == posicao){
                System.out.printf(" <%d> |", numeroMaior);
            } else {
                System.out.print(numeros[i] + "|");
            }
        }

        read.close();
    }
    // codigo funcionando em 26 abr 24
}