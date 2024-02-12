import java.util.Scanner;
/* No exercicio "maior de dois" corrija o codigo de forma a evitar que
* o usuario faça input de codigos que nao sejam numeros inteiros
* utilize as funcoes da classe Scanner
* */

public class MaiorDeTresUpdated {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== MAIOR DE TRES ===");

        System.out.print("digite o primeiro número: ");
        int numA = 0;
        if (read.hasNextInt()) {
            numA = read.nextInt();
        } else {
            System.out.println("FORMATO INVÁLIDO!");
            System.exit(1);
        }

        System.out.print("digite o segundo número: ");
        int numB = 0;
        if (read.hasNextInt()) {
            numB = read.nextInt();
        } else {
            System.out.println("FORMATO INVÁLIDO!");
            System.exit(1);
        }

        System.out.print("digite o terceiro número: ");
        int numC = 0;
        if (read.hasNextInt()) {
            numC = read.nextInt();
        } else {
            System.out.println("FORMATO INVÁLIDO!");
            System.exit(1);
        }

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
//    codigo funcionando em 12 fev 2024
//    eh possivel implementar uso de funcoes para reduzir o codigo, mas ainda nao
//    foquei os estudos nesse tema
}
