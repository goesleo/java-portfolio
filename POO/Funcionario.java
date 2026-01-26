public class Funcionario {
    String nome;
    String cargo;
    int idade;

    Funcionario(String nomeInit, String cargoInit, int idadeInit) {
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;

    }

    public static void  main(String[] args) {
        Funcionario funcionario = new Funcionario("João", "Desenvolvedor", 18);
        Funcionario funcionario2 = new Funcionario("Maria", "Gerente", 33);


        System.out.println("Nome: "  + funcionario.nome);
        System.out.println("Cargo: "  + funcionario.cargo);
        System.out.println("Idade: "  + funcionario.idade);
        System.out.println("----------------------");
        System.out.println("Nome: "  + funcionario2.nome);
        System.out.println("Cargo: "  + funcionario2.cargo);
        System.out.println("Idade: "  + funcionario2.idade);



    }



}
