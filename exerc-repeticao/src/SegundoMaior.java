import java.util.Scanner;
/* escreva um programa que recebe um numero do teclado e verifica se este numero eh maior
* ou menor que o anterior, caso seja menor, solicitara novamente, caso seja maior, salvara
* o numero e repetira o processo. Tudo deve ser repetido infinitamente ate que o usuario
* digite "sair" */

public class SegundoMaior {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("=== Comparador de numeros ===");
        System.out.println(" ---> digite 'sair' para encerrar a qualquer momento... ");
        System.out.print("Inicie digitando um numero: ");
        int num = inputcheck();

        do {
            System.out.print("Digite um numero maior: ");
            int numMaior = inputcheck();
            if (numMaior > num) {
                num = numMaior;
            } else {
                System.out.printf("numero %d eh menor ou igual a %d. ", numMaior, num);
            }
        } while(true);
    }

    public static int inputcheck() {
        int num = 0;
        if(read.hasNextInt()){
            num = read.nextInt();
        } else if (read.hasNext("sair")) {
            System.exit(1);
        } else {
            read.next();
            System.out.println("Formato invalido! Convertido para zero...");
        }
      return num;
    }
//    codigo funcionando em 27 fev 2024
}
