package aula0204;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    Data dataNasc = new Data();
    Endereco endereco = new Endereco();
    Contato contato = new Contato();
    public Pessoa(){
    }
    public void preencher(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome = sc.nextLine();
        System.out.println("Digite sua data de nascimento: ");
        this.dataNasc.aniversario();
        System.out.println("Digite seu endreco: ");
        this.endereco.cadastro();
        System.out.println("Digite seu contato: ");
        this.contato.contatar();
    }
    public void imprimir(){
        System.out.println("Pessoa-- " +'\n'+
                "Nome: "
                +'\n' + nome.toUpperCase() + '\n' +
                "Data de nascimento: "+
                '\n' + dataNasc + '\n' +
                "Endereco-- "
                +'\n' + endereco + '\n' +
                "Contato-- "
                +'\n' + contato);
    }
}
