package empresa.dados;
import empresa.dados.Funcionario;
public class FolhaDePagamento {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Maria", "Gerente de Projetos", 35, 6200.00);
        Funcionario funcionario2 = new Funcionario("Joao", "Desenvolvedor", 25, 4200.00);

        funcionario.mostrarDados();
        funcionario2.mostrarDados();


    }


}
