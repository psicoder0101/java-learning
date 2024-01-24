import java.util.Scanner;
/*CONVERSOR DE POLEGADAS EM CM, CRIAR UM PROGRAMA QUE RECEBA UMA MEDIDA EM
* POLEGADAS E RETORNE O EQUIVALENTE EM CENTIMETROS*/

public class polToCm {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== CONVERSOR POLEGADAS EM CM ===");
        System.out.print("Digite o valor em polegadas: ");
        double pol = read.nextFloat();

        System.out.printf("Resultado: %.2f polegadas equivalem a %.2f centímetros.", pol, pol * 2.54);

        read.close();
    }
//    codigo funcionando em 24 jan 2024
}
