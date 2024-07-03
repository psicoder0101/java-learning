/*crie um programa que faca a soma de duas matrizes, armazene tudo em uma nova matriz e imprima
 *na tela os resultados na ordem correta*/

public class SomaMatrizes {
    public static void main(String[] args) {

        //declarando matrizes
        int[][] matrizA = {
                {6, 25, 35, 48},
                {145, 2, 315, 44},
                {12, 512, 53, 41},
        };

        int[][] matrizB = {
                {145, 27, 332, 458},
                {51, 52, 358, 784},
                {11, 52, 35, 42},
        };

        int[][] matrizSoma = new int[3][4];

        //processando soma e armazenando em uma nova matriz
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        //exibindo matriz de soma
        for (int[] linha : matrizSoma) {
            for (int elemento: linha){
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

    }
//    codigo funcionando 02 julho 2024
}
