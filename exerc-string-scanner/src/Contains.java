import java.util.Scanner;
/*crie um programa que receba uma mensagem de até 150 caracteres do teclado
* verifique se a mensagem contem apenas texto e em seguida solicite uma palavra
* e diga se essa palavra esta contida no texto*/

public class Contains {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== VERIFICACAO DE TEXTO ===");
        System.out.println("Digite um texto de até 150 caracteres abaixo:");
        String texto = null;
        if (read.hasNext("[a-zA-z]+")){
            texto = read.nextLine();
            if (texto.length() > 150){
                System.out.println("TEXTO MUITO LONGO!!!");
                System.exit(1);
            }
        } else {
            System.out.println("FORMATO INVALIDO!");
            System.exit(1);
        }

        System.out.println("Digite uma palavra: ");
        String palavra = null;
        if (read.hasNext("[a-zA-z]+")){
            palavra = read.nextLine();
        } else {
            System.out.println("FORMATO INVALIDO!");
            System.exit(1);
        }

        if (texto.contains(palavra)){
            System.out.println("O texto contem a palabra mencionada.");
        } else {
            System.out.println("PALAVRA NAO ESTA PRESENTE NO TEXTO!");
        }

        read.close();
    }
//codigo funcionando em 13 fev 2024
}
