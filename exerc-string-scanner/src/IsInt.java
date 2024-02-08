import java.util.Scanner;
/* CRIE UM PROGRAMA QUE FACA A LEITURA DE UM NUMERO DO TECLADO
* E EM SEGUIDA VERIFIQUE SE FOI DIGITADO UM NUMERO INTEIRO
* USE METODOS DA CLASSE SCANNER*/

public class IsInt {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== VERIFICAR INTEIRO ===");
        System.out.print("Digite um numero: ");

        if (read.hasNextInt()){
            System.out.println("NUMERO INTEIRO DETECTADO!");
        } else if (read.hasNextLine()){
            System.out.println("FORMATO INVALIDO: TEXTO");
        } else {
            System.out.println("NUMERO NAO INTEIRO!");
        }

        read.close();
    }
//    codigo funcionando em 07 fev 24
}
