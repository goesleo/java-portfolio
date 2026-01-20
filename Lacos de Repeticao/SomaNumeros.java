/*Este exercício envolve a criação de um programa em Java
que calcula a soma dos números de 1 a 10 usando um loop for.*/

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            soma += i;
        }
        System.out.println("A soma dos numeros de 1 a 10 é: " + soma);

    }





}
