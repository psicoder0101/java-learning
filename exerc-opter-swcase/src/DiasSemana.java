import java.util.Scanner;
/* crie um programa que receba um numero inteiro entre 1 e 7 e retorne
* o dia da semana correspondente */

public class DiasSemana {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== INDICADOR DE DIAS DA SEMANA ===");
        System.out.print("Digite o numero do dia (1 - 7): ");
        int num = 0;
        if (read.hasNextInt()) {
            num = read.nextInt();
            if (num < 1 || num > 7) {
                System.out.println("Dia invalido!");
                System.exit(1);
            }
        } else {
            System.out.println("Formato inválido");
            System.exit(1);
        }

       /* ==== Expressão feita com bloco switch/case padrão ====

       switch (num) {
           case 1:
               System.out.println("Domingp!");
               break;
           case 2:
               System.out.println("Segunda!");
               break;
           case 3:
               System.out.println("Terça!");
               break;
           case 4:
               System.out.println("Quarta!");
               break;
           case 5:
               System.out.println("Quinta!");
               break;
           case 6:
               System.out.println("Sexta!");
               break;
           case 7:
               System.out.println("Sabado!");
               break;
       }*/

        // Expressão com sintaxe switch expressions:
        String nomeDiaDaSemana = switch (num) {
            case 1 -> "Domingo!";
            case 2 -> "Segunda!";
            case 3 -> "Terça!";
            case 4 -> "Quarta!";
            case 5 -> "Quinta!";
            case 6 -> "Sexta!";
            case 7 -> "Sabado!";
            default -> "Erro: dia inválido!";
        };

        System.out.println("Dia da semana correspondente = " + nomeDiaDaSemana);

        read.close();
    }
//    codigo funcionando em 21 de fev 2024
}
