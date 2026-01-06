/*Criar um programa Java que calcule a área de um retângulo com base em sua largura e altura.*/

import java.util.Scanner;

public class CalculadoraAreaRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largura = 5.0;
        double altura = 3.0;

        double area = largura * altura;
        System.out.println("O valor total da area é: " + area);
    }
}
