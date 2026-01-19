import java.util.Scanner;

/*Você está desenvolvendo um sistema de notas para uma escola.
O sistema deve verificar se um aluno foi aprovado em uma disciplina com base em suas notas.
Implemente um programa que utilize operadores lógicos para
determinar se um aluno foi aprovado ou não.*/
public class VerificaAprovacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota: ");
        int nota2 = sc.nextInt();

        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Aprovado");

        }
        else {
            System.out.println("Reprovado");
        }


    }
}
