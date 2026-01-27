package empresa.dados;
public class Funcionario {
    String nome;
    String cargo;
    int idade;
    double salario;

    Funcionario(String nomeInit, String cargoInit, int idadeInit,  double salarioInit) {
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
        salario = salarioInit;

    }

    public static void  main(String[] args) {


    }
    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("------------------");
    }



}
