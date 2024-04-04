package aula0204;

import java.util.Scanner;

public class Endereco {
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private int numero;

    public Endereco() {

    }

    public void cadastro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Logradouro: ");
        this.logradouro = sc.nextLine();
        System.out.println("Bairro: ");
        this.bairro = sc.nextLine();
        System.out.println("Cidade: ");
        this.cidade = sc.nextLine();
        System.out.println("Estado: ");
        this.estado = sc.nextLine();
        System.out.println("CEP: ");
        this.cep = sc.nextLine();
        System.out.println("Numero: ");
        this.numero = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Logradouro: " + logradouro.toUpperCase() +'\n'+
                "Bairro: " + bairro.toUpperCase() +'\n'+
                "Cidade: " + cidade.toUpperCase() + '\n'+
                "Estado: " + estado.toUpperCase() + '\n'+
                "CEP: " + cep + '\n'+
                "Numero: " + numero;
    }
}