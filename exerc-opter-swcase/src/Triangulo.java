import java.util.Scanner;
/* crie um programa que receba tres valores do teclado e processe informacoes sobre
* se estes tres valores podem representar as medidas de um triangulo (considerando que
* para ser possivel formar um triangulo, a soma das medidas de dois dos lados precisa ser
* maior que o lado restante). Se sim, entao classificar o triangulo a partir das medidas em:
* isoceles - dois lados iguais
* escaleno - todos os lados diferentes
* equilatero - todos os lados iguais
*/

public class Triangulo {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("=== CLASSIFICACAO DE TRIANGULOS ===");
        System.out.println("digite abaixo a medida dos lados:");

        //entrada de dados
        System.out.print("lado a = ");
        int ladoa = inputCheck();
        System.out.print("lado b = ");
        int ladob = inputCheck();
        System.out.print("lado c = ");
        int ladoc = inputCheck();

        //checando medidas
        if (isTriang(ladoa, ladob, ladoc)) {
            System.out.print("As medidas inseridas formam um triangulo ");
        } else {
            System.out.println("MEDIDAS INVALIDAS PARA UM TRIANGULO!");
            System.exit(1);
        }

        //classificando triangulo
        if (ladoa == ladob && ladob == ladoc){
            System.out.println("equilatero!");
        } else if (ladoa == ladob || ladob == ladoc || ladoa == ladoc) {
            System.out.println("isoceles!");
        } else {
            System.out.println("escaleno!");
        }
    }

    // recebe as medidas e valida os requisitos de um triangulo
    public static boolean isTriang (int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }

    // garante que apenas numeros inteiros sejam lidos do teclado
    public static int inputCheck() {
        int value = read.hasNextInt()? read.nextInt() : 0;
        if (value == 0) {
            System.out.println("formato invalido!");
            System.exit(1);
        }
        return value;
    }
//    codigo funcionando em 12 fev 2024
}