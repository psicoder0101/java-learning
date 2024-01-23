import java.util.Scanner;
/*CRIE UM PROGRAMA QUE RECEBA UMA TEMPERATURA EM
* GRAUS ºC E RETORNE O VALOR EQUIVALENTE EM ºF
* usando a formula F = C x 1,8 + 32 */

public class celciusParaFahrenheit {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
//        testando primeiro uso do git no terminal

        System.out.println("CONVERSAO DE TEMPERATURA");
        System.out.print("DIGITE UMA TEMPERATURA EM *C: ");
        double tempC = read.nextInt();

        double tempF = tempC * 1.8 + 32;

        System.out.print("TEMPERATURA EM *F = " + tempF);

        read.close();
    }
//    codigo funcionando em 23 jan 2024
}
