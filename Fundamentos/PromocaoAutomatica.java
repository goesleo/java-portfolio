/*Criar um programa Java que demonstre a promoção automática de tipos em expressões.*/

import java.util.Scanner;

public class PromocaoAutomatica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte a = 10;
        short b = 20;
        char c = 'A';  // O tipo char é usado para representar caracteres, como letras e símbolos
        int d = 30;
        long e = 40L;
        float f = 1.5f;
        double g = 2.5;

        int resultado = a + b;

        System.out.println("Resultado da soma: " + resultado);
        System.out.println("Valor do char: " + c );



    }
}
