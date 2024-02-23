import java.util.Scanner;
/* crie um programa  conversor de medidas que receba um determinado valor,
* permita o usuario informar qual a medida desse valor e, em seguida permita
* informar para qual escala deseja converter. Depois informe qual o resultado
* da conversao
* */

public class ConversorMedidas {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("=== TABELA DE CONVERSAO DE MEDIDAS ===");
        System.out.print("Digite o valor da medida: ");
        double medida = inputCheck();

        System.out.println("Selecione a escala atual da medida");
        int escalaAtual = menuEscala();

        System.out.println("Selecione a escala final da medida");
        int escalaFinal = menuEscala();

        System.out.printf("RESUMO: conversao de %.1f%s para %s\n",
                medida, medidaEmNumParaString(escalaAtual),
                medidaEmNumParaString(escalaFinal));

        int diferencaEntreEscalas = escalaFinal - escalaAtual;
        double medidaConvertida = medida * Math.pow(10,diferencaEntreEscalas);

        System.out.println("-----------------------------------");
        System.out.printf("Resultado: %.1f%s = %.1f%s", medida,
                medidaEmNumParaString(escalaAtual), medidaConvertida,
                medidaEmNumParaString(escalaFinal));

    }

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

    public static int menuEscala () {
        System.out.print("""
                SELECIONE A ESCALA:
                1 - KM
                2 - HM
                3 - DaM
                4 - M
                5 - Dm
                6 - Cm
                7 - mm
                Digite uma opcao >\s""");
        int opt = read.hasNextInt() ? read.nextInt() : 0;
        if (opt == 0) {
            System.out.println("OPCAO INVALIDA!");
            System.exit(1);
        }
        return opt;
    }

    public static String medidaEmNumParaString (int opt) {
        return switch (opt) {
            case 1 -> "KM";
            case 2 -> "HM";
            case 3 -> "DaM";
            case 4 -> "M";
            case 5 -> "Dm";
            case 6 -> "Cm";
            case 7 -> "mm";
            default -> throw new IllegalStateException("Unexpected value: " + opt);
        };
    }

//    codigo funcionando em 22 fev 24
}


/*
* logica:
* > o usuario insere o valor
* > o programa le o valor e pergunta em qual escala o valor esta atualmente
* > o programa recebe a indicacao da escala km/hm/dam/m/cm/dm/mm
* > o programa salva o indice da escala atual, por ex: se o usuario digitar
*   a medida DAM, entao o programa salva o numero 3 na variavel escalaAtual,
*   porque a escala DAM é a 3a escala do indice
* > o programa pergunta para qual escala o usuario deseja converter o valor
* > o programa salva o indice da escala desejada, por ex: se o usuario digitar
*   a medida CM, entao o programa salva o numero 6 na variavel escalaDesejada,
*   porque a escala CM é a 6a escala do indice
* > o programa calcula a diferenca entre a escala final e a escala atual
*   por ex: a diferenca da escala DAM para CM é de 3 casas, no sentido "--->"
*   ou seja, positivo. Entao o resultado da diferenca eh 3, porque (indice final)6
*   menos  (indice inicial)3 = 3(casas)
*   se, por exemplo, o usuario quisesse calcular um valor de CM para M, o programa
*   ira calcular a diferenca da escala CM para a escala M, considerando que M esta
*   localizado no indice 4 e CM no indice 5, o programa ira calcular (indice final)4
*   menos (indice inicial)5 = -1, ou seja, o valor final deverá retornar na reta pelo
*   sentido "<---", negativo;
* > o programa pega o resultado do valor inserido inicialmente pelo usuario
*   e multiplica por 10 elevado ao resultado da diferenca entre os indices,
*   no caso dos exemplos:
*   10DAM para CM = 10 x 10^(2) [ira andar 3 casas na reta] => 10dam = 10.000cm
*   10CM para M = 10 x 10^(-1) [ira voltar 1 casa na reta] => 10cm = 0,1m
* > o programa ira imprimir na tela o valor da conversao
* */