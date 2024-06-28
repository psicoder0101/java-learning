import java.util.Scanner;

public class MenorQueX {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== NUMERO MENOR QUE X ===");

        // matriz pre definida
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

        //definir o parametro para comparacao
        System.out.print("Digite um valor para X: ");
        int x = read.nextInt();

        int valorAbaixoDeX = 0;

        //armazena os valores abaixo de X e os imprime sequencialmente
        for (int[] linha : valores) {
            for (int elemento : linha) {
                if (elemento < x){
                    valorAbaixoDeX = elemento;
                    System.out.print(valorAbaixoDeX + " ");
                }
            }
        }

        //caso nao haja valor menor que o parametro
        if (valorAbaixoDeX == 0) {
            System.out.println("NENHUM DOS VALORES É MENOR QUE X.");
        }

        read.close();
    }
    // codigo funcionando 27 jun 2024
}
