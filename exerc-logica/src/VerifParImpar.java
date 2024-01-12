import java.util.Scanner;
/* CRIAR UM PROGRAMA QUE RECEBA UM NUMERO E VERIFIQUE SE EH PAR OU IMPAR
* */
public class VerifParImpar {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num;

        System.out.println("VERIFICACAO PAR/IMPAR");
        System.out.print( "DIGITE UM NUMERO: ");
        num = read.nextInt();

        if (num%2 == 0) {
            System.out.println("NUMERO PAR!");
        } else {
            System.out.println("NUMERO IMPAR!");
        }

        read.close();
    }
//    CODIGO FUNCIONANDO 12 JAN 24
}
