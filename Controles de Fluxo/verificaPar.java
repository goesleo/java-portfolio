import java.sql.SQLOutput;
import java.util.Scanner;

public class verificaPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        int valor = sc.nextInt();

        if(valor %2 == 0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }

        sc.close();
    }

}
