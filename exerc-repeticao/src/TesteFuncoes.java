import java.util.Scanner;

/* criar funcoes de checagem de input que consigam validar o tipo de entrada, garantir
* a segurança do codigo e que repitam o processo de leitura caso o tipo de entrada seja
* incompativel */


public class TesteFuncoes {
   static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite um numero: ");
        int num = inputCheckSec();


    }

//    funcao simples que apenas le e repete em caso de erro
    public static int inputcheck () {
        int num = 0;
        boolean check = false;
        while (!check) {
            if (read.hasNextInt()) {
                /*a entrada apenas com hasNext pode permitir injecao de codigo
                * ou buffer overflow*/
                num = read.nextInt();
                check = true;
            } else {
                System.out.println("FORMATO INVALIDO! DIGITE NOVAMENTE: ");
            }
        }
        return num;
    }

    /* funcao com leitura e correcao, implementando seguranca conta injecao de codigo
     * e buffer overflow */
    public static int inputCheckSec () {
        int num = 0;
        boolean check = false;
        while (!check) {
            String input = read.nextLine();
            /*implementa a leitura a partir de uma string qualquer*/
            if (input.matches("[0-9]+")) {
                /*usa regex para buscar padroes numericos e garante que apenas
                * numeros inteiros serao aceitos na entrada, para acrescentar suporte
                * a numeros decimais, basta substituir o "[0-9]+" por "[0-9]+([\\.][0-9]+)?" */
                num = Integer.parseInt(input);
                /*caso seja digitado um numero na string, converte para int*/
                check = true;
            } else {
                System.out.println("FORMATO INVALIDO! DIGITE NOVAMENTE: ");
            }
        }
        return num;
    }


/* ok ate aqui, falta reescrever a funcao com correcao para erro DoS, tambem tentar escrever
* funcoes para outros tipos de variaveis na entrada, tentar fazer com Double */
}
