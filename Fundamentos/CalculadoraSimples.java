/*Criar um programa Java que realiza operações aritméticas básicas usando os operadores mencionados.*/

public class CalculadoraSimples {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        double divisao = (double) a / b;
        int resto = a % b;

        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtracao: " + subtracao);
        System.out.println("Resultado da multiplicacao: " + multiplicacao);
        System.out.println("Resultado da divisao: " + divisao);
        System.out.println("Resto da divisão: " + resto);


    }

}
