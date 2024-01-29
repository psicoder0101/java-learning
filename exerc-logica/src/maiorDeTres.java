import java.util.Scanner;
/*crie um programa que receba do teclado tres numeros inteiros e retorne
* o numero maior entre eles
* */

public class maiorDeTres {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== MAIOR DE TRES ===");
        System.out.print("digite o primeiro número: ");
        int numA = read.nextInt();
        System.out.print("digite o segundo número: ");
        int numB = read.nextInt();
        System.out.print("digite o terceiro número: ");
        int numC = read.nextInt();
        System.out.printf("NUMEROS DIGITADOS: %d, %d, e %d.\n", numA, numB, numC);

        if (numA > numB && numA > numC){
            System.out.println("MAIOR NUMERO: " + numA);
        } else if (numB > numC) {
            System.out.println("MAIOR NUMERO: " + numB);
        } else {
            System.out.println("MAIOR NUMERO: " + numC);
        }

        read.close();
    }
//    codigo funcionando em 26 de janeiro de 2024
}
