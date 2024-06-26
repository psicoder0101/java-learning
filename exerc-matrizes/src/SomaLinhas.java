/*crie um programa que realize a soma dos numeros de cada linha de uma matriz e
* retorne a visualização dos numeros da matriz seguidos do resultado da soma a cada linha*/

public class SomaLinhas {
    public static void main(String[] args) {

        /*declaracao da matriz*/
        int[][] valores = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //visualização dos resultados
        for (int i = 0; i < valores.length; i++) {
            int resultado = 0;
            for (int j = 0; j < valores[i].length; j++) {
                System.out.print(valores[i][j] + " ");
                resultado += valores[i][j];
            }
            System.out.printf(" = %d\n", resultado);
            resultado = 0;
        }

    }
//    codigo funcionando 25 jun 2024
}
