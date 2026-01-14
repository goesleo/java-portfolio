import java.util.Scanner;

/*O objetivo deste exercício é criar um programa em Java que, com base em um número
fornecido pelo usuário (representando o nível de satisfação), determine e exiba o
feedback correspondente.*/
public class NivelSatisfacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De 1 a 5 qual a nota de feedback");
        int nivel = sc.nextInt();

        String feedback;

        switch(nivel){
            case 1 -> feedback = "Muito insatisfeito";
            case 2 -> feedback = "Insatisfeito";
            case 3 -> feedback = "Neutro";
            case 4 -> feedback = "Satisfeito";
            case 5 -> feedback = "Muito Satisfeito";
            default ->  feedback = "Opção inválida (deve estar entre 1 e 5)";

        }
        System.out.println("Nivel de Satisfação: " + feedback);

        sc.close();

    }


}
