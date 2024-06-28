/*crie um programa que receba uma matriz, liste os elementos dela, solicite qual linha o usuario
* deseja imprimir e imprima apenas essa linha*/
import java.util.Scanner;

public class ImprimirLinha {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== IMPRESSAO DE LINHAS ===");
        System.out.println("MATRIZ COMPLETA:");

        //matriz pre defininida
        char[][] palavras = {
                {'p', 'e', 'd', 'r', 'o'},
                {'p', 'a', 'u', 'l', 'o'},
                {'j', 'o', 'a', 'o'}
        };

        //exibicao da matriz
        for (char[] linha : palavras){
            for (char letra : linha){
                System.out.print(letra);
            }
            System.out.println();
        }

        //define o numero da linha
        System.out.print("Digite a linha que deseja imprimir: ");
        int linha = read.nextInt();

        //imprime apenas os elementos dessa linha
        for (int i = 0; i < palavras.length; i++) {
            for (int j = 0; j < palavras[i].length ; j++) {
                if (i == linha) {
                    System.out.print(palavras[i][j]);
                }
            }
        }

        read.close();
    }
//    codigo funcionando 28 jun 2024
}
