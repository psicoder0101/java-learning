import java.util.Scanner;
/* Repetindo o exercicio do estrutura de menu, mas criando opcoes de submenus com telas
* navegaveis */

public class EstruturaSub {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        menuPrincipal();
    }
    public static void menuPrincipal (){ /*menu principal para escolha da opcao desejada*/
        int opcaoDesejada = 0;
        while (opcaoDesejada == 0) { /*repete as opcoes ate que um numero valido seja digitado*/
            System.out.println("=== MENU ===");
            System.out.println("""
                        1. Opcao A
                        2. Opcao B
                        3. Opcao C
                        4. Sair""");
            System.out.print("Selecione uma opcao: ");
            int teste = read.nextInt();
            if (teste < 1 || teste > 4) {
                System.out.println("Opcao invalida!");
            } else {
                opcaoDesejada = teste;
            }
        }
        if (opcaoDesejada == 4) {
            System.out.println("Saindo...");
        } else {
            opcoes(opcaoDesejada);
        }
    }

    public static void opcoes (int numeroDaOpcao){
        /*seletor de opcoes, ele recebe como parametro o numero que foi armazenado na
         * variavel opcaoDesejada no menu principal. Se parece com o seletor da classe
         * EstruturaMenuEditavel, mas esse seletor eh unificado e retorna o mesmo metodo
         * mudando apenas a letra do da tela, ou seja, nao sao telas diferentes, é apenas
         * a mesma tela com letras diferentes a depender do parametro recebido*/
            switch (numeroDaOpcao) {
                case 1 -> System.out.println("Dentro da opcao A!");
                case 2 -> System.out.println("Dentro da opcao B!");
                case 3 -> System.out.println("Dentro da opcao C!");
            }
        int opcaoDesejadaSubmenu = 0;
        while (opcaoDesejadaSubmenu == 0) {
            System.out.println("""
                    1. Voltar
                    2. Sair""");
            System.out.print("Selecione uma opcao: ");
            int teste = read.nextInt();
            if (teste < 1 || teste > 2) {
                System.out.println("Opcao invalida!");
            } else {
                opcaoDesejadaSubmenu = teste;
            }
        }
        switch (opcaoDesejadaSubmenu) {
            case 1 -> menuPrincipal();
            case 2 -> {break;}
            default -> System.exit(1);
        }
    }

// codigo funcionando em 08/03/24
}

