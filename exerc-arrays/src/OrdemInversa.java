import java.util.Scanner;
/* Criar um programa que armazena determinada quantidade de numeros em um vetor
* (a ser escolhida pelo usuario) em seguida, exibe os numeros digitados e mostra
* estes numeros na ordem inversa */

public class OrdemInversa {
        public static void main(String args[]) {
            Scanner read = new Scanner (System.in);

            System.out.println("===INVERSAO DE VETOR===");
            System.out.print("Informe quantos numeros voce ira armazenar: ");
            int tamanhoVetor = read.nextInt();

            int[] numeros = new int[tamanhoVetor]; // vetor com o tamanho indicado

            //leitura do vetor indice por indice
            for (int i = 0; i < tamanhoVetor; i++){
                System.out.printf("digite o numero %d: ", i+1);
                numeros[i] = read.nextInt();
            }

            System.out.println("_____________________________________");

            //resultados
            //mostra os numeros digitados na ordem original
            System.out.print("NUMEROS DIGITADOS: ");
            for (int i = 0; i < tamanhoVetor; i++){
                System.out.print(numeros[i] + " ");
            }
            System.out.println("");

            //mostra os numeros digitados na ordem inversa
            System.out.print("ORDEM INVERSA: ");
            for (int i = numeros.length-1; i >= 0; i--){
                System.out.print(numeros[i] + " ");
            }

            read.close();
        }
        // codigo funcionando 16 abr 2024
}
