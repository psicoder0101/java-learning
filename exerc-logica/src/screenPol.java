import java.util.Scanner;
/*crie um programa que receba as medidas de base e lateral de uma tela
e retorne o seu tamanho em polegadas, dada a fórmula:
tamanho em pol = raiz quadrada (base^2 + altura^2)
* */

public class screenPol {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== CALCULADORA DO TAMANHO DA TELA ===");
        System.out.print("digite a medida da base em CM: ");
        double base = read.nextDouble();
        System.out.print("digite a medida da altura em CM: ");
        double alt = read.nextDouble();

        double hipotenusa = Math.sqrt( Math.pow(base,2) + Math.pow(alt,2) );
        double pol = hipotenusa / 2.54;

        System.out.printf("TAMANHO DA TELA: %.2f polegadas", pol);

        read.close();
    }
//    codigo funcionando em 24 jan 2024
}
