import java.util.Scanner;
/*CRIE UM PROGRAMA QUE RECEBA UM NUMERO E EM SEGUIDA RETORNE
* SE O NUMERO DIGITADO EH POSITIVO, NEGATIVO OU ZERO*/
public class positivoNegativoOuZero {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("===VERIFICADOR DE NUMEROS===");
        System.out.print("Digite um numero: ");
        int num = read.nextInt();

        if (num <0){
            System.out.println("NUMERO NEGATIVO");
        } else if (num == 0) {
            System.out.println("ZERO");
        } else {
            System.out.println("NUMERO POSITIVO");
        }

        read.close();
    }
// codigo funcionando 12 jan 24
}
