import java.util.Scanner;
/*desenvolver uma estrutura de um pequeno menu com algumas opcoes de escolha, a selecao
* acontece com base na entrada do teclado do usuario, mas se este digitar uma opcao
* invalida, o programa inteiro repete até que seja digitada uma opcao valida*/

public class EstruturaSub {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        int opt = menuPrincipal();
//        switch (opt) {
//            case 1 -> opcaoA();
//            case 2 -> System.out.println("falta implementar");
//            case 3 -> System.out.println("tb falta implementar");
//            case 4 -> System.out.println("saindo...");
//            default -> System.exit(1);
//        }

    }

    public static int menuPrincipal (){
        int count = 0;
        while (count == 0) {
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
                count = teste;
            }
        }
        switch (count) {
            case 1 -> opcaoA();
            case 2 -> System.out.println("falta implementar");
            case 3 -> System.out.println("tb falta implementar");
            case 4 -> System.out.println("saindo...");
            default -> System.exit(1);
        }
        return count;
    }

    public static void opcaoA (){
        int count = 0;
        while (count == 0) {
            System.out.println("Dentro da opcao A!");
            System.out.println("""
                    1. Voltar
                    2. Sair""");
            System.out.print("Selecione uma opcao: ");
            int teste = read.nextInt();
            if (teste < 1 || teste > 2) {
                System.out.println("Opcao invalida!");
            } else {
                count = teste;
            }
        }
        switch (count) {
            case 1 -> menuPrincipal();
            case 2 -> {break;}
            default -> System.exit(1);
        }
    }

    /* codigo funcionando ate aqui 07-03-24. implementei uma das telas, ainda falta implementar o resto
    * corrigi a chamada do menu principal dentro do metodo submenu (opcaoA), retirei o processo de selecao
    * de dentro da classe main e inseri dentro do metodo menuPrincipal() preciso estudar a possibilidade
    * de transformar esse metodo pra tipo void, porque ja que a selecao acontece dentro dele mesmo, entao
    * ele eh um procedimento.
    * depois disso so falta implementar o restante das opcoes*/

}

