/* CALCULADORA SIMPLES, exercício básico que calcula as operações matemáticas
 * básicas entre dois numeros inteiros
 */
import java.util.Scanner;

public class CalcSimples {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        int numa = 0, numb = 0, select = 0;

        System.out.println("CALCULADORA SIMPLES");
        System.out.println("EM SEGUIDA, DIGITE DOIS NUMEROS...");
        System.out.print("DIGITE UM NUMERO: ");
        numa = read.nextInt();
        System.out.print("DIGITE UM NUMERO: ");
        numb = read.nextInt();
        System.out.println("SELECIONE QUAL OPERAÇÃO DEVERÁ SER FEITA ENTRE ELES: ");
        System.out.println("1 - ADIÇÃO" +
                         "2- SUBTRAÇÃO" +
                         "3- MULTIPLICAÇÃO" +
                         "4- DIVISÃO");
        System.out.print("DIGITE UMA OPÇÃO: ");
        select = read.nextInt();

        









        read.close();
    }



}
