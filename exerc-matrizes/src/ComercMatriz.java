import java.util.Scanner;

public class ComercMatriz {

        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            System.out.println("=== COMERCIANTE ===");
            System.out.print("Digite quantos itens ira cadastrar: ");
            int quantItens = read.nextInt();

            //declaracao dos vetores
            String[] nomes = new String[quantItens];
            // indice 0 = preco de compra
            // indice 1 = preco de venda

            float[][] precos = new float[2][quantItens];
            //Float[] precoCompra = new Float[quantItens];
            //Float[] precoVenda = new Float[quantItens];

            //cadastramento dos itens
            for (int i = 0; i < quantItens; i++) {
                System.out.printf("Digite as informações do item %d:\n", i+1);
                read.nextLine();
                System.out.print("Nome: ");
                nomes[i] = read.nextLine();
                System.out.print("Preco de compra: ");
                precos[0][i] = read.nextFloat();
                System.out.print("Preco de venda: ");
                precos[1][i] = read.nextFloat();
            }


            System.out.println("TABELA: ");

            for (int i = 0; i < precos.length; i++) {
                System.out.println(nomes[i] + " " + precos[0][i] + " " + precos[1][i]);
            }



            //processamento de classificacoes
            int abaixoDezPorCento = 0;
            int entreDezEVintePorCento = 0;
            int acimaVintePorCento = 0;
            for (int i = 0; i < quantItens; i++) {
                if ((precos[1][i] - precos[0][i]) < (precos[0][i] * 10) / 100) {
                    abaixoDezPorCento++;
                } else if ((precos[1][i] - precos[0][i]) > (precos[0][i] * 10) / 100
                        && (precos[1][i] - precos[0][i]) < (precos[0][i] * 20) / 100 ) {
                    entreDezEVintePorCento++;
                } else {
                    acimaVintePorCento++;
                }
            }

            System.out.println("______________________________________________________");
            System.out.println("CLASSIFICACAO DOS ITENS POR LUCRO:");
            System.out.println("Abaixo de 10%: " + abaixoDezPorCento);
            System.out.println("Entre 10% e 20%: " + entreDezEVintePorCento);
            System.out.println("Acima de 20%: " + acimaVintePorCento);


            /* PARA CONTINUAR DEPOIS:
            * Estao funcionando o algoritmo de armazenamento dos valores e o de classificacao dos lucros
            * imprimi separadamente as tabelas dos valores e dos lucros pra testar e tudo esta ok
            * seguir na construcao do calculo das somas de compra e venda e do lucro total
            * depois fazer a impressao da saida */





            /*
            //soma dos precos compra
            float somaCompra = 0;
            for (float preco : precoCompra) {
                somaCompra += preco;
            }

            //soma dos precos venda
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


             */
        }


}
