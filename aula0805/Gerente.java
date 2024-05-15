package aula0805;

public class Gerente extends Funcionario {
    private String area;

    public Gerente(){}

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void mostrarDados(){
        System.out.println("\n==============Sobrescrita==============\n");
        System.out.println("O seu nome é: " + getNome());
        System.out.println("O seu cpf é: " + getCpf());
        System.out.println("Sua Matrícula de Gerente é: " + getMatricula());
        System.out.println("Seu Salário de Gerente é: " + getSalario());
        System.out.println("Sua Área de Gerencia é: " + area + "\n");
    }

    public void mostrarDados(String area){
        System.out.println("\n==============Sobrecarga==============\n");
        System.out.println("Sua Área de Gerencia é: " + area);
        System.out.println("Sua Matrícula de Gerente é: " + getMatricula());
        System.out.println("Seu Salário de Gerente é: " + getSalario());
        System.out.println("O seu nome é: " + getNome());
        System.out.println("O seu cpf é: " + getCpf() + "\n");
    }
}