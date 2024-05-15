package aula0805;

public class Cliente extends Pessoa {
    private int codigo;

    public Cliente(){
        super();
    }

    public void setCodigo(int codigo) {this.codigo = codigo;}

    @Override
    public void mostrarDados(){
        System.out.println("\n==============Sobrescrita==============\n");
        System.out.println("O seu nome é: " + getNome());
        System.out.println("O seu cpf é: " + getCpf());
        System.out.println("Seu codigo de Cliente é: " + codigo + "\n");
    }

    public void mostrarDados(int codigo){
        System.out.println("\n==============Sobrecarga==============\n");
        System.out.println("Seu codigo de Cliente é: " + codigo);
        System.out.println("O seu nome é: " + getNome());
        System.out.println("O seu cpf é: " + getCpf() + "\n");
    }
}
