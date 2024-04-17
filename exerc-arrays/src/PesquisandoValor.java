/* Crie um programa que armazene ate 20 valores dentro de um array.
* A quantidade, entre 1 e 20, fica a criterio do usuario. Enviar
* mensagem de erro caso esteja fora dessa faixa e solicitar o input
* novamente. Apos isso, criar um mecanismo de pesquisa onde o usuario
* digita um numero e o programa verifica se este numero esta contido
* dentro desse vetor e, caso esteja, em qual posicao se encontra.
* Perguntar ao usuario se deseja pesquisar outro valor */

import java.util.Objects;
import java.util.Scanner;

public class PesquisandoValor {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("=== PESQUISA DE VALOR ===");
        System.out.print("digite quantos valores deseja armazenar (min. 5, max2 20): ");
        //le o valor desejado e compara com a faixa aceitavel
        int tamanhoVetor = read.nextInt();
        while (tamanhoVetor < 5 || tamanhoVetor > 20) {
            System.out.print("Valor fora da faixa, digite novamente: ");
            tamanhoVetor = read.nextInt();
        }

        int[] valores = new int[tamanhoVetor];

        //preenche o vetor
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.printf("Digite o valor %d: ", i + 1);
            valores[i] = read.nextInt();
        }

        //exibe o vetor preenchido na tela
        System.out.println("VALORES DIGITADOS:");
        System.out.print("| ");
        for (int valor : valores) {
            System.out.print(valor + " | ");
        }
        System.out.println();


        boolean desejaPesquisar = true;
        while (desejaPesquisar) {
            System.out.print("\nDeseja buscar por um valor? s/n > ");
            char resposta = read.next().charAt(0);
            if (resposta == 's') {
                System.out.print("Digite um valor: ");
                int valorPesquisado = read.nextInt();
                System.out.println(buscarValor(valorPesquisado, valores));
            } else {
                desejaPesquisar = false;
            }
        }
    }//fimmain

    public static String buscarValor (int valor, int[] array) {
        /* criar mecanismo de busca */
        // retornar String contendo a resposta se tem ou nao o valor
        // e a posicao no array em que o valor esta
        return "";
    }



}//fimclasse
