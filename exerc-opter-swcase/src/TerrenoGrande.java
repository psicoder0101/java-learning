import java.util.Scanner;
/*crie um programa que receba as dimensões de um terreno retangular,
* calcule a area e, caso o resultado seja superior a 100m2, retorne
* "terreno grande", caso contrario, "terreno pequeno"*/

public class TerrenoGrande {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== CHECAGEM DE TERRENO ===");
        System.out.println("Digite abaixo as dimensões do terreno: ");
        System.out.print("Altura: ");
        double altura = 0;
        if (read.hasNextDouble()) {
            altura = read.nextDouble();
        } else {
            read.next();
            System.out.println("FORMATO INVALIDO!");
            System.exit(1);
        }
        System.out.print("Largura: ");
        double largura = 0;
        if (read.hasNextDouble()) {
            largura = read.nextDouble();
        } else {
            read.next();
            System.out.println("FORMATO INVALIDO!");
            System.exit(1);
        }


        double area = altura * largura;
        System.out.println((area >= 100) ? "Terreno grande!" : "Terreno pequeno!");

        read.close();
    }
//    codigo funcionando em 15/02/24
}
