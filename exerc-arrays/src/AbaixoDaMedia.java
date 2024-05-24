import java.util.Scanner;
/*criar um programa que realize a leitura de N numeros inteiros a partir do teclado, armazene todos em um array
* de tamanho N, calcule a media geral dos numeros salvos e, em seguida, retorne quais deles
* estao abaixo dessa media*/


public class AbaixoDaMedia {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //painel inicial
        System.out.println("=== ABAIXO DA MEDIA ===");
        System.out.print("Quantos numeros voce ira digitar? > ");
        int tamanhoArray = read.nextInt();

        //array de armazenamento
        int[] numeros = new int[tamanhoArray];

        //leitura e armazenamento dos numeros
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.printf("Digite o numero %d/%d: ", i+1, tamanhoArray);
            numeros[i] = read.nextInt();
        }

        //calculo da media
        int somaNumeros = 0, mediaNumeros = 0;
        for (int numero : numeros) {
            somaNumeros += numero;
        }
        mediaNumeros = somaNumeros/tamanhoArray;

        //painel de saida
        System.out.println("__________________________________________");
        System.out.println("RESULTADOS:");
        System.out.println("Numeros digitados: ");
        System.out.print("|");
        for (int numero : numeros) {
            System.out.print(numero + "|");
        }
        System.out.println("\nMedia dos numeros = " + mediaNumeros);
        System.out.println("Numeros abaixo da media:");
        System.out.print("|");
        for (int i = 0; i < tamanhoArray; i++) {
            if (numeros [i] < mediaNumeros) {
                System.out.print(numeros[i] + "|");
            }
        }

        read.close();
    }
//    codigo funcionando em 23 mai 2024
}
