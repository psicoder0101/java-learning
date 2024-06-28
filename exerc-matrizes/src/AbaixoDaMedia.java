/*crie um programa que faca a leitura de uma matriz, em seguida calcule a media geral de
* todos os valores que a compoem e retorne quais dos valores estao abaixc da media */

public class AbaixoDaMedia {

    public static void main(String[] args) {
        System.out.println("===ABAIXO DA MEDIA===");

        int[][] valores = {
                {10, 54, 45},
                {6, 58, 46},
                {132, 798, 45}
        };

        //exibicao dos valores na matriz
        System.out.println("VALORES NA MATRIZ: ");
        for (int[] linha : valores) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        //calculo da media
        int somaGeral = 0;
        int quantElementos = 0;
        for (int[] linha : valores) {
            for (int elemento : linha) {
                somaGeral += elemento;
                quantElementos++;
            }
        }
        int mediaGeral = somaGeral / quantElementos;
        System.out.println("MEDIA GERAL = " + mediaGeral);

        //identificacao dos valores abaixo da media
        System.out.println("___________________________________________________");
        System.out.println("Valores abaixo da media:");
        for (int[] linha : valores) {
            for (int elemento : linha) {
                if (elemento < mediaGeral){
                    System.out.print(elemento + " ");
                }
            }
        }

    }
//    codigo funcionando 20 jun 2024
}
