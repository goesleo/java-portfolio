import java.util.Scanner;

public class DiasNoMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o mês e descubra a quantidade de dias que ele possui: ");
        String mes = sc.nextLine();

        int numeroDeDias = switch (mes){
            case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> 31;
            case "Abril", "Junho", "Setembro", "Novembro" -> 30;
            case "Fevereiro" -> 28;
            default -> -1;
        };

        if (numeroDeDias != -1){
            System.out.println("Numero de dias em " + mes + ": " + numeroDeDias);
        }else {
            System.out.println("Mês desconhecido. ");
        }





    }


}
