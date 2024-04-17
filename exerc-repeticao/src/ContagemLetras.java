import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* criar um programa que recebe um determinado texto do teclado, processa o texto
* e retorna quais letras o compoem e qual a ocorrencia especifica de cada letra
* dentro do texto  */

public class ContagemLetras {

    public static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        // input
        System.out.println("=== CONTAGEM DE LETRAS ===");
        System.out.print("Digite uma frase: ");
        String frase = read.nextLine();
        System.out.println("FRASE DIGITADA: \n > " + frase);

        /* declara uma string e armazena processamento do input sem letras repetidas,
        * espacos e em ordem alfabetica */
        String textoSemRepetidos = removerRepeticoes(removerEspacos(frase));


        char[] letras = textoSemRepetidos.toCharArray(); //array que recebe as letras
        int [] numeros = contarLetras(letras, frase); //array que recebe as ocorrencias das letras na frase

        //output
        System.out.println("_____________________________________________________");
        System.out.println("CONTAGEM DE CARACTERES:");
        System.out.println("letra | quant. ocorrências");

        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i]);
            System.out.print(" = ");
            System.out.println(numeros[i]);
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

    public static int[] contarLetras (char[] arrayLetras, String frase){
        /* funcao que mapeia a quantidade de ocorrencias de um char na frase: recebe um array
        * com as letras a serem contadas e uma String com a frase na qual cada letra do array
        * vai ser buscada, contabiliza as ocorrências de cada letra do array e retorna um outro
        * array de inteiros com as ocorrências de cada letra ordenadas de acordo com as posicoes
        * das letras em arrayLetras */

        int[] ocorrencias = new int[arrayLetras.length];
        for (int i = 0; i < arrayLetras.length; i++) {
            for (int j = 0; j < frase.length(); j++) {
                if (frase.charAt(j) == arrayLetras[i]){
                    ocorrencias[i]++;
                }
            }
        }

        return ocorrencias;
    }

    // codigo funcionando em 03 abr 2024
}
