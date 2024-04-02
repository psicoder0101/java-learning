import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ContagemLetrasRefactor {

    public static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("=== CONTAGEM DE LETRAS ===");
        System.out.print("Digite uma frase: ");
        String frase = read.nextLine();
        if (frase.length() > 30) {
            System.out.println("ERRO: Frase muito longa!");
            System.exit(1);
        }
        System.out.println("FRASE DIGITADA: \n > " + frase);

        Pattern pattern = Pattern.compile("(.)(?=.*\\1)");
        Matcher matcher = pattern.matcher(frase);

        String textoSemRepetidos = matcher.replaceAll("");
        System.out.println("String sem caracteres repetidos: " + textoSemRepetidos);

        char[] letras = new char[textoSemRepetidos.length()];

        for (int i = 0; i < textoSemRepetidos.length(); i++) {
            letras[i] = textoSemRepetidos.charAt(i);
        }

        for (char letra : letras) {
            System.out.println(letra);
        }

    }


    //funcao que apaga todos os espacos em branco de uma string
    /*
    for (int i = 0; i < palavra.length - 1; i++) {
        for (int j = i + 1; j < palavra.length; j++) {
            if (palavra[i] == ' ') {
                char temp = palavra[i];
                palavra[i] = palavra[j];
                palavra[j] = temp;
            }
        }
    }*/
    // trabalhar nessa parte acima amanhã. preciso transformar isso aqui em uma funcao
    // e implementar no codigo pra pegar a frase do teclado e remover os espacos
    // a funcao vai executar esse bubble sort e levar os espacos todos pras ultimas
    // casas do array. depois eu passo um replaceAll no array substituindo os espacos
    // por '\u0000', e finalizo lendo o array até o primeiro '\u0000'
    //obs: verificar se posso transformar esse array direto em uma string, ignorando as casas vazias
    // se nao, fazer dentro da propria funcao um algoritmo que lê esse array ate a primeira casa vazia
    // e vai jogando as palavras pra um outro array do tamanho certo.

    //funcao que mapeia a quantidade de ocorrencias de um char na frase


    /*andamento: consegui fazer o codigo identificar as palavras que se repetem dentro da frase
    * e consegui fazer o ele armazenar essas letras em outro array, sem contar as que se repetem
    * criando assim um array com todas as letras que sao usadas na frase. tive um obstaculo: nao
    * conheco nenhuma forma de fazer uma String ser reescrevida sem os espacos em branco
    * precisarei criar uma funcao especificamente pra isso. apos, falta a criacao do procedimento
    * de calculo da quantidade de ocorrencias de cada letra*/
}
