/*Desenvolva um programa que faca a leitura de uma matriz e, em seguida, retorne qual o maior elemento
* de cada linha */

public class MaiorDaLinha {
    public static void main(String[] args) {

        int[][] valores = {
                {10, 54, 45},
                {6, 58, 46},
                {132, 798, 45}
        };

        for (int[] linha : valores) {
            int maior = 0;
            System.out.print("maior valor entre { ");
            for (int valor : linha) {
                if (valor > maior) {
                    maior = valor;
                }
                System.out.print(valor + " ");
            }
            System.out.println("} = " + maior);
        }

    }
//    codigo funcionando 06 jun 2024
}
