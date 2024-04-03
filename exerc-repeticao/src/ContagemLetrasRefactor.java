import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ContagemLetrasRefactor {

    public static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("=== CONTAGEM DE LETRAS ===");
        System.out.print("Digite uma frase: ");
        String frase = read.nextLine();
        System.out.println("FRASE DIGITADA: \n > " + frase);

        String textoSemRepetidos = removerRepeticoes(removerEspacos(frase));

        char[] letras = textoSemRepetidos.toCharArray();

        for (char letra : letras) {
            System.out.println(letra);
        }

    }

    public static String removerRepeticoes(String texto) {
    /* funcao que recebe uma string e retorna outra com apenas um exemplar de cada caractere
     * que compoe a frase, em ordem alfabetica*/

        Pattern pattern = Pattern.compile("(.)(?=.*\\1)");
        Matcher matcher = pattern.matcher(texto);

        texto = matcher.replaceAll("");
        char[] textoChar = texto.toCharArray();
        Arrays.sort(textoChar);
        texto = String.valueOf(textoChar);

        return texto;
    }

    public static String removerEspacos(String texto) {
    //funcao que apaga todos os espacos em branco de uma string

        char[] letras = new char[texto.length()];

        for (int i = 0; i < letras.length; i++) {
            letras[i] = texto.charAt(i);
        }

        for (int i = 0; i < letras.length - 1; i++) {
            for (int j = i + 1; j < letras.length; j++) {
                if (letras[i] == ' ') {
                    char temp = letras[i];
                    letras[i] = letras[j];
                    letras[j] = temp;
                }
            }
        }

        texto = String.valueOf(letras);
        return texto.trim();
    }


    //funcao que mapeia a quantidade de ocorrencias de um char na frase


}
