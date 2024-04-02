import java.util.Scanner;
/*desenvolver um programa que recebe uma frase (no maximo 30 caracteres) do teclado
* analisa essa frase e retorna quais letras aparecem nessa frase e quantas vezes
* cada letra aparece */

public class ContagemLetras {

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

        char[] letras = new char[frase.length()];

        for (int i = 0; i < frase.length(); i++) {
            if (!buscarChar(letras,frase.charAt(i))) {
                letras[indexVazio(letras)] = frase.charAt(i);
            }
        }

        for (int i = 0; i < indexVazio(letras); i++) {
            System.out.println(letras[i]);
        }
    }


    //funcao que percorre um array atras de um caractere
    public static boolean buscarChar (char[] arrayChar, char procurado) {
        boolean resultado = false;
        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar [i] == procurado) {
                resultado = true;
            }
        }
        return resultado;
    }

    //funcao que identifica o primeiro index vazio de um array
    public static int indexVazio (char[] arrayChar) {
        int index = -1;
        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == '\u0000') {
                index = i;
                break;
            }
        }
        return index;
    }




    //funcao que mapeia a quantidade de ocorrencias de um char na frase


    /*andamento: consegui fazer o codigo identificar as palavras que se repetem dentro da frase
    * e consegui fazer o ele armazenar essas letras em outro array, sem contar as que se repetem
    * criando assim um array com todas as letras que sao usadas na frase. tive um obstaculo: nao
    * conheco nenhuma forma de fazer uma String ser reescrevida sem os espacos em branco
    * precisarei criar uma funcao especificamente pra isso. apos, falta a criacao do procedimento
    * de calculo da quantidade de ocorrencias de cada letra*/
}
