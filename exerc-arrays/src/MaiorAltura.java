import java.util.Scanner;
/*crie um programa que receba informações sobre 5 pessoas: nome e altura. O programa deve armazenas
* esses dados em dois arrays, um para os nomes e outro para as alturas. Em seguida, ira definir
* qual altura e a maior e retornar o nome e a altura dessa pessoa.*/


public class MaiorAltura {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //painel inicial
        System.out.println("==== MAIOR ALTURA ====");
        String[] pessoas = new String[5];
        Double[] altura = new Double[5];

        //preenchimento das informacoes
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o nome da pessoa %d: ", i+1);
            pessoas[i] = read.nextLine();
            System.out.printf("Digite a altura de %s: ", pessoas[i]);
            altura[i] = read.nextDouble();
            read.nextLine();
        }

        //calculo da maior altura
        Double maiorAltura = 0D;
        int indiceAltura = 0;
        for (int i = 0; i < 5; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
                indiceAltura = i;
            }
        }

        //retorno dos resultados
        System.out.println("-----------------------------------");
        System.out.println("MAIOR ALTURA:");
        System.out.println("NOME: " + pessoas[indiceAltura]);
        System.out.println("ALTURA: " + maiorAltura);

     read.close();
    }
//    codigo funcionando em 24 mai 2024
}
