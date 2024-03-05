import java.util.Scanner;

public class TabuadaNum {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== TABUADA ===");
        System.out.print("DIGITE A TABUADA DESEJADA: ");
        int num = read.nextInt();
        cls();

        int cont = 0;
        while (cont <= 10) {
            System.out.printf("%d X %d = %d\n", num, cont, num*cont);
            cont++;
        }

        read.close();
    }

//funcao limpa tela
    public static void cls() {
        try
        {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception E)
        {
            System.out.println(E);
        }
    }
}
