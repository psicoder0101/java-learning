import java.util.Scanner;
/* crie um programa que receba tres valores do teclado e processe informacoes sobre
* se estes tres valores podem representar as medidas de um triangulo (considerando que
* para ser possivel formar um triangulo, a soma das medidas de dois dos lados precisa ser
* maior que o lado restante). Se sim, entao classificar o triangulo a partir das medidas em:
* isoceles - dois lados iguais
* escaleno - todos os lados diferentes
* equilatero - todos os lados iguais
* */

public class Triangulo {
    public static void main(String[] args) {

        System.out.println("=== CLASSIFICACAO DE TRIANGULOS ===");
        System.out.println("digite abaixo a medida dos lados:");
        System.out.print("lado a = ");
        int ladoa = inputcheck();
        System.out.print("lado b = ");
        int ladob = inputcheck();
        System.out.print("lado c = ");
        int ladoc = inputcheck();



    }

    public static int inputcheck () {
        Scanner read = new Scanner(System.in);
        int value = 0;
        if (read.hasNextInt()) {
             value = read.nextInt();
        } else {
            read.next();
            System.out.println("formato invalido!");
            System.exit(1);
        }
        read.close();
        return value;
    };

}
