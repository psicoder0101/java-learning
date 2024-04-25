import java.util.Scanner;
/* crie um programa que receba uma sequencia de numeros conforme escolhida pelo usuario
* em seguida, preencha um vetor com esses numeros e solicite ao final uma constante de
* multiplicacao. essa constante ira multiplicar todos os valores do vetor e substituir
* o valor original pelo resultado da operacao*/

public class ProdutoDaMatriz {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("==== MULTIPLICADOR DE VALORES ====");
        System.out.print("Quantos valores voce irá inserir? (min. 5 max. 20.) R: ");
        int quantValores = read.nextInt();
        // define a faixa aceitavel entre 5 e 20 valores
        while (quantValores < 5 || quantValores > 20) {
             System.out.print("Valor fora da faixa, digite outro: ");
             quantValores = read.nextInt();
        }

        //declaracao do array de armazenamento
        int[] valores = new int[quantValores];

        //preenchimento dos valores
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("digite o valor %d: ", i+1);
            valores[i] = read.nextInt();
        }

        //visualização dos valores preenchidos
        System.out.println("Valores preenchidos com sucesso!");
        System.out.println("Visualização dos valores:");
        System.out.print("|");
        for (int valor : valores) {
            System.out.print(valor + "|");
        }

        //declaracao da constante de multiplicacao
        System.out.print("\nDigite uma constante de multiplicacao (min. 1  max. 10): ");
        int constmultiplicacao = read.nextInt();
        //define a faixa aceitavel entre 1 e 10
        while (constmultiplicacao < 1 || constmultiplicacao > 10) {
            System.out.print("Valor fora da faixa, digite outro: ");
            constmultiplicacao = read.nextInt();
        }

        //processamento e substituicao dos valores
        for (int i = 0; i < valores.length; i++) {
            valores[i] *= constmultiplicacao;
        }

        //exibicao dos valores multiplicados
        System.out.println("--------------------------------");
        System.out.println("Valores multiplicados:");
        System.out.print("|");
        for (int valor : valores) {
            System.out.print(valor + "|");
        }

        read.close();
    }
    //codigo funcionando 24 abr 24
}
