import java.util.Scanner;
/*Crie um programa que receba certa quantidade de itens de um mercado, solicite as informações "nome, preco de compra e
* preco de venda" para cada um desses itens e armazene adequadamente dentro de vetores. Em seguida, o programa deve
* retornar uma lista de visualização desses itens seguida pela classificação de quantos itens no total obtiveram
* lucros nas três seções: abaixo de 10%, entre 10 e 20% e acima de 20%. Exibir ao final a soma total dos precos
* de compra, venda e o lucro total (venda - compra) */
public class Comerciante {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("=== COMERCIANTE ===");
        System.out.print("Digite quantos itens ira cadastrar: ");
        int quantItens = read.nextInt();

        //declaracao dos vetores
        String[] nomes = new String[quantItens];
        Float[] precoCompra = new Float[quantItens];
        Float[] precoVenda = new Float[quantItens];

        //cadastramento dos itens
        for (int i = 0; i < quantItens; i++) {
            System.out.printf("Digite as informações do item %d:\n", i+1);
            read.nextLine();
            System.out.print("Nome: ");
            nomes[i] = read.nextLine();
            System.out.print("Preco de compra: ");
            precoCompra[i] = read.nextFloat();
            System.out.print("Preco de venda: ");
            precoVenda[i] = read.nextFloat();
        }

        //processamento de classificacoes
        int abaixoDezPorCento = 0;
        int entreDezEVintePorCento = 0;
        int acimaVintePorCento = 0;
        for (int i = 0; i < quantItens; i++) {
            if ((precoVenda[i] - precoCompra[i]) < (precoCompra[i] * 10) / 100) {
                abaixoDezPorCento++;
            } else if ((precoVenda[i] - precoCompra[i]) > (precoCompra[i] * 10) / 100
                    && (precoVenda[i] - precoCompra[i]) < (precoCompra[i] * 20) / 100 ) {
                entreDezEVintePorCento++;
            } else {
                acimaVintePorCento++;
            }
        }

        //soma dos precos compra
        float somaCompra = 0;
        for (float preco : precoCompra) {
            somaCompra += preco;
        }

        //soma dos precos compra
        float somaVenda = 0;
        for (float preco : precoVenda) {
            somaVenda += preco;
        }

        //calculo do lucro total
        float lucroTotal = somaVenda - somaCompra;

        //saida de dados
        System.out.println("\nLISTA DE ITENS");
        System.out.println("______________________________________________________");
        System.out.println("NOME   |   PRECO COMPRA    |   PRECO VENDA");
        for (int i = 0; i < quantItens; i++) {
            System.out.printf("%S   |   %.2f    |   %.2f\n", nomes[i], precoCompra[i], precoVenda[i]);
        }
        System.out.println("______________________________________________________");
        System.out.println("CLASSIFICACAO DOS ITENS POR LUCRO:");
        System.out.println("Abaixo de 10%: " + abaixoDezPorCento);
        System.out.println("Entre 10% e 20%: " + entreDezEVintePorCento);
        System.out.println("Acima de 20%: " + acimaVintePorCento);
        System.out.println("______________________________________________________");
        System.out.println("VALOR TOTAL COMPRA: " + somaCompra);
        System.out.println("VALOR TOTAL VENDA: " + somaVenda);
        System.out.println("LUCRO BRUTO: " + lucroTotal);

    read.close();
    }
//    codigo funcionando em 28 maio 2024
}
