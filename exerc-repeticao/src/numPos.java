import java.util.Scanner;
/*crie um programa que receba do teclado um numero e aceite a sua inserção apenas
* se o numero for positivo. Caso contrário, solicitar novamente a entrada*/

public class numPos {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("=== CHEGCAGEM DE NUMEROS POSITIVOS ===");
        int num = inputcheck();
    }

    //impede que o usuario insira outros tipos na entrada
    public static int inputcheck() {
        int input = 0;
        boolean check = false;
        while (!check) {
            System.out.print("DIGITE UM NÚMERO POSITIVO MAIOR QUE ZERO: ");
            String inputStr = read.nextLine();
            if (inputStr.matches("[0-9]+")) {     //usar validacao com regex e converter para numero
                input = Integer.parseInt(inputStr);     //evita buffer overflow e injecao de codigo
                check = validaPositivo(input);
            } else {
                System.out.print("FORMATO INVÁLIDO! ");
            }
        }
        System.out.println("Positivo detectado!");
        return input;
    }

//    valida se o numero eh positivo
    public static boolean validaPositivo (int num) {
        return num > 0;
    }
}

