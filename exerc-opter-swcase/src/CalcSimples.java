import java.util.Scanner;
/* crie uma calculadora simples que receba dois numeros do teclado, exiba um
* pequeno menu de opcoes para calculo e mostre o resultado com base na
* opcao selecionada */

public class CalcSimples {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== CALCULADORA ===");
        System.out.println("Digite dois numeros: ");
        System.out.print("Numero a: ");
        double numa = inputCheck();
        System.out.print("Numero b: ");
        double numb = inputCheck();

        //selecionando opcao
        System.out.println("""
                1 - ADIÇÃO
                2- SUBTRAÇÃO
                3- MULTIPLICAÇÃO
                4- DIVISÃO""");
        System.out.print("DIGITE UMA OPCAO: ");
        int opt = 0;

        //validando opcao
        if (read.hasNextInt()) {
            opt = read.nextInt();
            if (opt < 1 || opt > 4) {
                System.out.println("OPCAO INVALIDA!");
                System.exit(1);
            }
        } else {
            System.out.println("FORMATO INVALIDO!");
            System.exit(1);
        }

        //calculando resultados
        double result = switch (opt) {
            case 1 -> numa + numb;
            case 2 -> numa - numb;
            case 3 -> numa * numb;
            case 4 -> numa / numb;
            default -> 0;
        };

        System.out.println("--------------------------------------");
        System.out.printf("Resultado: %.2f", result);
    }

    // checa validade dos inputs
    public static double inputCheck() {
        double value = 0;
        if (read.hasNextDouble()) {
            value = read.nextDouble();
        } else {
            System.out.println("FORMATO INVALIDO!");
            System.exit(1);
        }
        return value;
    }
// codigo funcionando 22 fev 2024
}
