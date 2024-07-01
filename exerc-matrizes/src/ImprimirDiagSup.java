/*crie um programa que imprima apenas a diagonal superior de uma matriz*/

public class ImprimirDiagSup {

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
            for (char elemento : linha){
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        System.out.println("\nDIAGONAL SUPERIOR: ");

        //imprime apenas os elementos acima da diagonal principal, incluindo a propria diagonal
        for (int i = 0; i < palavras.length; i++) {
            for (int j = 0; j < palavras[i].length - i; j++) {
                System.out.print(palavras[i][j] + " ");
            }
            System.out.println();
        }

    }
//    codigo funcionando 01 julho 2024
}
