import java.util.Scanner;
/* Exercitando a criacao de estruturas de menu e submenu, mas essa classe ficara
* salva como ferramenta para a criacao de uma estrutura base de menus e submenus
* navegaveis. Por isso fiz ela de maneira que fique mais editavel e que facilite
* a adicao ou remocao de estruturas e implementacao de codigo nas subtelas */

public class EstruturaMenuEditavel {
    static Scanner read = new Scanner (System.in);

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
            int testeInput = read.nextInt();
            if (testeInput < 1 || testeInput > 4) {
                System.out.println("Opcao invalida!");
            } else {
                opcaoDesejada = testeInput;
            }
        }
        if (opcaoDesejada == 4) {
            System.out.println("Saindo...");
        } else {
            validarOpcao(opcaoDesejada);
        }
    }

    public static void validarOpcao (int opcoes){
        /*seletor de opcoes, ele recebe como parametro o numero que foi armazenado na
        * variavel opcaoDesejada no menu principal*/
        switch (opcoes) {
            case 1 -> telaA();
            case 2 -> telaB();
            case 3 -> telaC();
        }
    }

    // telas implementaveis

    public static void telaA (){
        System.out.println("Dentro da tela A");
    }

    public static void telaB (){
        System.out.println("Dentro da tela B");
    }

    public static void telaC (){
        System.out.println("Dentro da tela C");
    }
//    codigo funcionando em 08/03/24
}
