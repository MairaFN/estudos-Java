package aula0805;


public class Pessoa {
    private String nome;
    private String cpf;
    Pessoa(){
        super();
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getCpf() {return cpf;}

    public void mostrarDados() {
        System.out.println("\n==============PESSOA==============\n");
        System.out.println("O seu nome é: " + nome);
        System.out.println("O seu cpf é: " + cpf);

    }
}

