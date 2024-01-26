import java.util.Scanner;
/* crie um programa que realize a leitura da altura e o peso inseridos e
* em seguida retorne o resultado do IMC, e retorne se o indicador aponta
* abaixo, na média ou acima do peso, seguindo a classificação:
* menor que 18,5 - subpeso
* entre 18,5 e 24,99 - normal
* entre 25 e 29,99 - sobrepeso
* acima de 30 - obesidade
* */
public class calcIMC {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== CALCULO DO IMC ===");
        System.out.print("digite a altura em M: ");
        double alt = read.nextDouble();
        System.out.print("digite o peso em KG: ");
        double peso = read.nextDouble();

        double imc = peso / Math.pow(alt, 2);
        System.out.printf("IMC = %.2f\n", imc );

        if (imc < 18.5) {
            System.out.println("Classificacao de peso: SUBPESO.");
        } else if (imc < 24.99) {
            System.out.println("Classificacao de peso: NORMAL.");
        } else if (imc < 29.99) {
            System.out.println("Classificacao de peso: SOBREPESO.");
        } else if (imc < 39.99) {
            System.out.println("Classificacao de peso: OBESIDADE.");
        } else {
            System.out.println("Classificacao de peso: OBESIDADE GRAVE.");
        }

        read.close();
    }
//    codigo funcionando em 26 de jan de 2024
}
