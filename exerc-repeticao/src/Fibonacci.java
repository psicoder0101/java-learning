import java.util.Scanner;
/*desenvolva um programa que receba quantos numeros da sequencia de fibonacci
* o usuario quer ver, em seguida exiba esses caracteres na tela */


public class Fibonacci {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== SEQUENCIA DE FIBONACCI ===");
        System.out.print("Digite a quantidade de digitos desejada: ");
        int limite = read.nextInt();

        int termoA = 1, termoB = 1, resultado = 0;

        switch (limite) {
            case 0: {
                System.out.println("ERRO: nada a exibir.");
                System.exit(1);
            }
            case 1: {
                System.out.print(termoA);
                break;
            }
            case 2: {
                System.out.print(termoA + " " + termoB + " ");
                break;
            }
            default: {
                System.out.print(termoA + " " + termoB + " ");
                for (int i = 3; i <= limite; i++) {
                    resultado = termoA + termoB;
                    System.out.print(resultado + " ");
                    termoA = termoB;
                    termoB = resultado;
                }
                break;
            }
        }
        read.close();
    }
// codigo funcionando em 21 mar 24
}
