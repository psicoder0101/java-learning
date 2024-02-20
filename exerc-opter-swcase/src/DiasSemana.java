import java.util.Scanner;
/* crie um programa que receba um numero inteiro entre 1 e 7 e retorne
* o dia da semana correspondente */

public class DiasSemana {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== INDICADOR DE DIAS DA SEMANA ===");
        System.out.println("Digite o numero do dia (1 - 7): ");
        int num = 0;
        if (read.hasNextInt()) {
            num = read.nextInt();
            if (num <= 1 || num >= 7) {
                System.out.println("Dia invalido!");
                System.exit(1);
            }
        } else {
            System.out.println("Formato inválido");
            System.exit(1);
        }

        //até aqui ok. falta fazer a logica da escolha do dia com switch/case








        read.close();
    }
}
