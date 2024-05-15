package aula0805;
import java.util.Scanner;


public class Applic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, cpf, mat, area;
        int cod, op;
        double salario;
        System.out.println("Qual seu nome? ");
        nome = sc.nextLine();

        System.out.println("Qual seu cpf? ");
        cpf = sc.nextLine();

        Pessoa p1 = new Pessoa();
        p1.setNome(nome);
        p1.setCpf(cpf);

        System.out.print("""
                Escolha sua categoria para cadastro:
                 1 - Cliente
                 2 - Funcionario
                 3 - Gerente
                """);
        op = sc.nextInt();

        switch (op) {
            case 1 -> {
                Cliente c1 = new Cliente();
                System.out.println("Qual seu codigo de Cliente? ");
                cod = sc.nextInt();
                c1.setCodigo(cod);

                c1.setNome(nome);
                c1.setCpf(cpf);

                c1.mostrarDados(); //sobreescrita
                c1.mostrarDados(cod); //sobrecarga
            }
            case 2 -> {
                Funcionario f1 = new Funcionario();
                sc.nextLine();
                System.out.println("Qual sua matrícula? ");
                mat = sc.nextLine();
                f1.setMatricula(mat);

                System.out.println("Qual seu Salário? ");
                salario = sc.nextInt();
                f1.setSalario(salario);

                f1.setNome(nome);
                f1.setCpf(cpf);

                f1.mostrarDados();//sobreescrita
                f1.mostrarDados(mat, salario);//sobrecarga
            }
            case 3 -> {
                Gerente g1 = new Gerente();
                sc.nextLine();
                System.out.println("Qual sua Área? ");
                area = sc.nextLine();
                g1.setArea(area);

                System.out.println("Qual sua matrícula? ");
                mat = sc.nextLine();
                g1.setMatricula(mat);

                System.out.println("Qual seu Salário? ");
                salario = sc.nextInt();
                g1.setSalario(salario);

                g1.setNome(nome);
                g1.setCpf(cpf);

                g1.mostrarDados();//sobreescrita
                g1.mostrarDados(area);//sobrecarga
            }
            default -> System.out.println("Opção inválida");
        }
        p1.mostrarDados();
    }
}
