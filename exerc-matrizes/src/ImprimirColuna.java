/*crie um programa que receba uma matriz, liste os elementos dela, solicite qual coluna o usuario
 * deseja imprimir e imprima apenas essa coluna*/
import java.util.Scanner;

public class ImprimirColuna {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== IMPRESSAO DE COLUNAS ===");
        System.out.println("MATRIZ COMPLETA:");

        //matriz pre defininida
        char[][] palavras = {
                {'p', 'p', 'm', 'f', 'l'},
                {'e', 'a', 'a', 'a', 'u'},
                {'d', 'u', 'r', 'b', 'c'},
                {'r', 'l', 'c', 'i', 'a'},
                {'o', 'o', 'o', 'o', 's'}
        };

        //exibicao da matriz
        for (char[] linha : palavras){
            for (char letra : linha){
                System.out.print(letra + " ");
            }
            System.out.println();
        }

        //define o numero da coluna
        System.out.print("Digite a coluna que deseja imprimir: ");
        int coluna = read.nextInt();

        //imprime apenas os elementos dessa coluna
        for (char[] linha : palavras) {
            for (int j = 0; j < linha.length; j++) {
                if (j == coluna) {
                    System.out.print(linha[j]);
                }
            }
            System.out.println();
        }

        read.close();
    }
//    codigo funcionando 28 jun 2024
}
