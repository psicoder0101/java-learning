import java.util.Scanner;

public class IntervaloPrimos {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== CHECAGEM DE N* PRIMOS ===");

        System.out.print("Digite o intervalo inicial: ");
        int intervaloInicial = read.nextInt();
        System.out.print("Digite o intervalo Final: ");
        int intervaloFinal = read.nextInt();

        System.out.printf("Exibindo os numeros primos entre %d e %d: \n",
                intervaloInicial, intervaloFinal);
        System.out.println("--------------------------------------------------");

        for (int i = intervaloInicial; i <= intervaloFinal; i++) {
        /* checa se eh primo todos os numeros um a um entre o intervalo definido,
        * imprime o numero se for primo */
            if (checarPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n--------------------------------------------------");
    }

    public static boolean checarPrimo (int num) {
        /* recebe um int e verifica se ele eh primo */
        boolean primo = num != 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
// codigo funcionando em 21 mar 23
}
