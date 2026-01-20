/*O objetivo deste exercício é criar um programa em Java que conte quantos doces
 o filho pode comer enquanto a condição estabelecida pela mãe for verdadeira
 (ou seja, no máximo 3 doces).*/

import java.util.Scanner;

public class ContagemDeDoces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos doces o filho pode comer");
        int limiteDoces = sc.nextInt();

        int contadorDoces = 1;
        while (contadorDoces <= limiteDoces) {
            System.out.println("O filho comeu o doce número: " + contadorDoces);
            contadorDoces++;
        }

        System.out.println("Acabaram os doces! A mãe agradece ");
        sc.close();
    }

}
