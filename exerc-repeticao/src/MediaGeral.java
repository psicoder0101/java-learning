import java.util.Scanner;
/*crie um programa que receba do teclado vários numeros inteiros, mostre os numeros
digitados e calcule a media de todos eles */

public class MediaGeral {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        int[] memoria = new int[100];

        System.out.println("=== MEDIA GERAL ===");
        System.out.println("digite '-1' para encerrar");

        int count = 0;
        int soma = 0;
        int input;

        // le inputs ate que seja digitado "-1"
        while (true) {
            System.out.print("Digite um numero: ");
            input = read.nextInt();
            if (input == -1) {
                break;
            }
            soma += input;
            memoria[count] = input;
            count++;
        }

        //exibe um array com os numeros digitados
        System.out.println("_________________________________");
        System.out.println("NUMEROS DIGITADOS:");
        for (int i = 0; i <= 100;) {
            if (memoria[i] == 0 && memoria[i+1] == 0){
                break;
            }
            System.out.print(memoria[i] + " ");
            i++;
        }

        //exibe a soma dos numeros digitados
        System.out.println("\n_________________________________");
        System.out.println("MEDIA GERAL: " + (float)soma/count);
    }
//    codigo funcionando 15/3/24
}
