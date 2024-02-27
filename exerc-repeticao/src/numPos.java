import java.util.Scanner;
/*crie um programa que receba do teclado um numero e aceite a sua inserção apenas
* se o numero for positivo. Caso contrário, solicitar novamente a entrada*/

public class numPos {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("=== CHEGCAGEM DE NUMEROS POSITIVOS ===");
        int num = validaPositivo();

    }

    public static int inputcheck() {
        int input = 0;
        boolean check = false;
        while (!check) {
            if (read.hasNextInt()) {
                input = read.nextInt();
                check = true;
            } else {
                read.next();
                System.out.println("Formato inválido");
                System.out.println("Digite um umero: ");
            }
        }
        return input;
    }

    public static int validaPositivo () {
        int num = 0;
        while (num <= 0) {
            System.out.println("Digite um numero positivo diferente de zero: ");
            num = inputcheck();
            if (num > 0) {
                System.out.println("NUMERO DETECTADO!");
            }
        }
        return num;
    }
}

/*codigo funcionando, mas falta melhorar a logica: a funcao valida positivo deve apenas validar
* nao solicitar a entrada, preciso retirar a chamada do inputcheck() de dentro da funcao
* validaPositvo e fazer com que ela apenas cheque a validade da variavel ja armazenada */
