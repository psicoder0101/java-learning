import java.util.Scanner;

public class SomaIntervalo {
    /* crie um programa que receba dois inputs do teclado, sendo um numero de inicio
    * e um numero de final de um intervalo entre dois numeros e realize a soma entre todos
    * os numeros existentes entre esse intervalo. O programa precisa testar automaticamente
    * o tipo de input para evitar erros. Precisa também validar automaticamente qual o menor
    * e o maior numero entre os dois inputs, para que possa ordena-los e conseguir calcular
    * os valores corretamente a partir do menor ate o maior. O programa deve exibir, no fim
    * da execucao, um pequeno relatorio contendo:
    * -> todos os numeros do intervalo separados por virgula
    * -> quantidade total de numeros impressos
    * -> quantidade de numeros pares
    * -> quantidade de numeros impares
    * -> soma dos numeros */

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== SOMA DE NUMEROS ===");
        System.out.print("Digite o primeiro numero: ");
        int numA = validarInput();
        System.out.print("Digite o segundo numero: ");
        int numB = validarInput();
        cls();

        int[] numerosOrdenados = ordenarNumeros(numA, numB);
        int intervaloIncial = numerosOrdenados[0];
        int intervaloFinal = numerosOrdenados[1];
        exibirIntervalo(intervaloIncial, intervaloFinal);
        mostraPares(intervaloIncial, intervaloFinal);
        mostraImpares(intervaloIncial, intervaloFinal);
        somaIntervalo(intervaloIncial, intervaloFinal);
    }

    public static int validarInput () { /*garante a insercao de numeros inteiros*/
        int input = 0;
        while (input == 0) {
            if (read.hasNextInt()) {
                input = read.nextInt();
            } else {
                read.next();
                System.out.println("ERRO: Formato invalido!");
                System.out.print("Digite novamente: ");
            }
        }
        return input;
    }

    public static int[] ordenarNumeros (int a, int b) {
    /* ordena os valores e retorna um array com eles em ordem crescente */
        int[] numerosOrdenados = new int[2];
        if (a < b){
            numerosOrdenados[0] = a;
            numerosOrdenados[1] = b;
        } else if (b < a) {
            numerosOrdenados[0] = b;
            numerosOrdenados[1] = a;
        } else {
            System.out.println("ERRO FATAL: Numeros iguais, intervalo impossivel!");
            System.exit(1);
        }
        return numerosOrdenados;
    }

    public static void exibirIntervalo (int inicio, int fim) {
        System.out.println("---------------------------------------");
        System.out.printf("Intervalo Selecionado: \n> Inicio: %d \n> Fim: %d\n", inicio, fim);
        System.out.println("Numeros dentro deste intervalo: ");
        int cont = 0;
        for (int i = inicio; i <= fim ; i++) {
            System.out.print(i + "  ");
            cont++;
            if (cont % 10 == 0) {
                System.out.println("\n");
            }
        }
    }

    public static void mostraPares (int inicio, int fim){
        System.out.println("\n---------------------------------------");
        System.out.println("LISTA DE NUMEROS PARES:");
        int cont = 0;
        for (int i = inicio; i <= fim ; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "  ");
                cont++;
                if (cont % 10 == 0) {
                    System.out.println("\n");
                }
            }
        }
    }

    public static void mostraImpares (int inicio, int fim){
        System.out.println("\n---------------------------------------");
        System.out.println("LISTA DE NUMEROS IMPARES:");
        int cont = 0;
        for (int i = inicio; i <= fim ; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "  ");
                cont++;
                if (cont % 10 == 0) {
                    System.out.println("\n");
                }
            }
        }
    }

    public static void somaIntervalo (int a, int b) {
        int soma = 0;
        for (int i = a; i <= b; i++) {
            soma += i;
        }
        System.out.println("\n---------------------------------------");
        System.out.print("SOMA DO INTERVALO TOTAL = " + soma);
    }

    public static void cls()
    {
        try
        {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception E)
        {
            System.out.println(E);
        }
    }
//   cod funcionando 14/03/24
}
