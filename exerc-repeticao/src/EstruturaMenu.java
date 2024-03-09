import java.util.Scanner;
/*desenvolver uma estrutura de um pequeno menu com algumas opcoes de escolha, a selecao
* acontece com base na entrada do teclado do usuario, mas se este digitar uma opcao
* invalida, o programa inteiro repete até que seja digitada uma opcao valida*/

public class EstruturaMenu {
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);

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
        read.close();
    }
//         codigo funcionando 07 mar 2024
}
