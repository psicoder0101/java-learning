/*crie um pograma que realize a soma de todos os valores de uma matriz e retorne o resultado*/

public class SomaTotal {
    public static void main(String[] args) {

        /*declaracao da matriz*/
        int[][] valores = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // armazenar resultado
        int resultado = 0;

        /* funcionamento usando loop for
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                resultado += valores[i][j];
            }
        } */

        // funcionamento com foreach
        for (int[] linha : valores) {
            for (int valor : linha) {
                resultado += valor;
            }

        }

        System.out.println("SOMA DOS VALORES: " + resultado);
    }
//codigo funcionando 02 jun 2024
}
