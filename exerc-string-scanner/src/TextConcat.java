import java.util.Scanner;
/*recebe nome, sobrenome, idade e sexo do teclado e retorna a frase concatenada*/

public class TextConcat {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("DESCRICAO DE PERFIL");
        System.out.println("_____________________________________________");
        System.out.print("Digite seu nome: ");
        String nome = null;
        if (read.hasNext("[a-zA-Z]+")) {
            nome = read.nextLine();
        } else {
            System.out.println("TEXTO INVALIDO!");
            System.exit(1);
        }

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = null;
        if (read.hasNext("[a-zA-z]+")) {
            sobrenome = read.nextLine();
        } else {
            System.out.println("TEXTO INVALIDO!");
            System.exit(1);
        }

        System.out.print("Digite sua idade: ");
        int idade = 0;
        if (read.hasNextInt()) {
            idade = read.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("IDADE INVALIDA!");
                System.exit(1);
            }
        } else {
            System.out.println("FORMATO INVALIDO!");
            System.exit(1);
        }
        read.nextLine();

        System.out.print("Digite seu sexo: ");
        String sexo = null;
        if (read.hasNext("[a-zA-z]+")) {
            sexo = read.nextLine();
        } else {
            System.out.println("TEXTO INVALIDO!");
            System.exit(1);
        }
        System.out.println("_____________________________________________");
        System.out.printf("Descricao: %s %s tem %d anos e eh do sexo %s", nome, sobrenome, idade, sexo);

        read.close();
    }
//    codigo funcionando 12 fev 2024
}
