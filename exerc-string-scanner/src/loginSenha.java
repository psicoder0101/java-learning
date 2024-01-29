import java.util.Scanner;
/* Creie um programa que receba do usuario um nome de usuario e uma senha
* testanto a validade dessas insercoes: garantir que o usuario digite uma string no campo username
* e uma sequencia de 6 numeros no campo senha.
* */

public class loginSenha {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== TELA DE LOGIN E SENHA ===");
        System.out.println("""
                ----------------------------------------------------------------
                ATENCAO
                LOGIN: apenas caracteres minusculos e nao sao permitidos numeros
                SENHA: data de nascimento formato DDMMAA
                ----------------------------------------------------------------""");

        System.out.print("Username: ");
        if (read.hasNext("[a-z]+")) {
            String username = read.nextLine();
        } else {
            System.out.println("Formato inválido, tente novamente!");
            System.exit(1);
        }

        System.out.print("Senha: ");
        if (read.hasNext("[0-9]+")) {
            String pass = read.nextLine();
           if (pass.length() == 6) {
                System.out.println("ACESSO LIBERADO!");
            } else {
               System.out.println("Formato inválido, tente novamente!");
               System.exit(1);
           }
        } else {
            System.out.println("Formato inválido, tente novamente!");
        }

        read.close();
    }
// codigo funcionando em 29 jan 2024
}
