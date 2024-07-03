/*crie um programa que imprima o triangulo superior ou o inferior de uma matriz
* a depender da escolha do usuario*/

import java.util.Scanner;
public class DiagSupInf {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== IMPRESSAO DE DIAGONAL ===");
        System.out.println("MATRIZ COMPLETA:");

        //matriz pre defininida
        char[][] palavras = {
                {'p', 'p', 'm', 'f', 'l'},
                {'e', 'a', 'a', 'a', 'u'},
                {'d', 'u', 'r', 'b', 'c'},
                {'r', 'l', 'c', 'i', 'a'},
                {'o', 'o', 'o', 'o', 's'}
        };

        //impressao de matriz completa
        for (char[] linha : palavras) {
            for (char elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        //selecao da diagonal a ser impressa
        System.out.print("Digite qual triângulo da matriz você deseja imprimir" +
                "\n[1] Superior" +
                "\n[2] Inferior" +
                "\nR> ");
        int resposta = read.nextInt();

        //processamento da saida
        switch (resposta){
            case 1 -> imprimirDiagSup(palavras);
            case 2 -> imprimirDiagInf(palavras);
            default -> System.out.println("ERRO: RESPOSTA INVALIDA!");
        };

        read.close();
    }

    public static void imprimirDiagSup (char[][] matriz) {
        System.out.println("_________________________________________________");
        System.out.println("\nDIAGONAL SUPERIOR: ");

        //imprime apenas os elementos acima da diagonal principal, incluindo a propria diagonal
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length - i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirDiagInf(char[][] matriz) {
        System.out.println("_________________________________________________");
        System.out.println("\nDIAGONAL INFERIOR: ");

        //imprime apenas os elementos abaixo da diagonal principal, incluindo a propria diagonal
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j < matriz[i].length - (i + 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    //codigo funcionando 02 de julho de 2024
}