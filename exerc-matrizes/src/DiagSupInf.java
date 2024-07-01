/*crie um programa que imprima o triangulo superior ou o inferior de uma matriz
* a depender da escolha do usuario*/

public class DiagSupInf {

    public static void main(String[] args) {

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

        System.out.println("\nDIAGONAL INFERIOR: ");

        //imprime apenas os elementos abaixo da diagonal principal, incluindo a propria diagonal
        for (int i = 0; i < palavras.length; i++) {
            for (int j = 0; j < palavras[i].length; j++) {
                if (j < palavras[i].length - (i + 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print(palavras[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}

/*PARA CONTINUAR DEPOIS: Preciso transformar esse trecho de impressao da diagonal
* inferior em uma funcao. criar tambem uma funcao com o codigo do ultimo exercicio
* que imprime a diagonal superior*/