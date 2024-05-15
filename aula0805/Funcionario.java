package aula0805;

public class Funcionario extends Pessoa {
    private String matricula;
    private double salario;

    public Funcionario(){}

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {this.salario = salario;}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {this.matricula = matricula;}

    @Override
    public void mostrarDados(){
        System.out.println("\n==============Sobrescrita==============\n");
        System.out.println("O seu nome é: " + getNome());
        System.out.println("O seu cpf é: " + getCpf());
        System.out.println("Sua Matrícula de Funcionário é: " + matricula);
        System.out.println("Seu Salário de Funcionário é: " + salario + "\n");
    }

    public void mostrarDados(String matricula, double salario){
        System.out.println("\n==============Sobrecarga==============\n");
        System.out.println("Sua Matrícula de Funcionário é: " + matricula);
        System.out.println("Seu Salário de Funcionário é: " + salario);
        System.out.println("O seu nome é: " + getNome());
        System.out.println("O seu cpf é: " + getCpf() + "\n");
    }
}
