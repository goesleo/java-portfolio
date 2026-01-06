/*Neste exercício, você usará diferentes operadores de atribuição para manipular o valor de uma variável inteira.*/

import java.util.Scanner;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 5;

        numero += 3;
        numero -= 2;
        numero *= 4;
        numero /= 2;

        System.out.println("Valor final:" + numero);

    }
}
