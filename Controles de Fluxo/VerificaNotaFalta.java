import java.sql.SQLOutput;
import java.util.Scanner;

public class VerificaNotaFalta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota: ");
        int nota2 = sc.nextInt();
        System.out.println("Digite a frequencia: ");
        int frequencia = sc.nextInt();
        double media = (nota1 + nota2) / 2;

        boolean aprovado = media >= 7 && frequencia >= 75 ;

        if (aprovado) {
            System.out.println("Aluno aprovado");
        }
        else {
            System.out.println("Aluno reprovado");
        }




    }


}
