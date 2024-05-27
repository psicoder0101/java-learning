import java.util.Scanner;

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
        int abaixoDezPorCento = 0, entreDezEVintePorCento = 0, acimaVintePorCento = 0;
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











    read.close();
    }
}
