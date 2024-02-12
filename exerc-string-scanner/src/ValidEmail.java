import java.util.Scanner;
/* crie um programa que receba um email e confirme a validade do endereco
* de acordo com a existencia do "@" na sequencia de caracteres */

public class ValidEmail {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("===VALIDACAO DE EMAIL===");
        System.out.print("Digite um email valido: ");
        String email = null;
        if (read.hasNextLine()) {
            email = read.nextLine();
        } else {
            System.out.println("FORMATO INVALIDO!");
            System.exit(1);
        }

        boolean validacao = email.contains("@");
        if (validacao) {
            System.out.println("EMAIL VALIDADO!");
        } else {
            System.out.println("EMAIL INVALIDO!");
        }

        read.close();
    }
//    codigo funcionando em 12 fev 2024
}