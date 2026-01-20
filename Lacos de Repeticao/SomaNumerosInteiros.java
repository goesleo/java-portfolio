public class SomaNumerosInteiros {
    public static void main(String[] args) {
        int numero = 10;
        int soma = 0;

        do {
            soma += numero;
            numero--;
        } while (numero >0 );
        System.out.println("A Soma dos numeros inteiros positivos é " + soma);


    }
}
