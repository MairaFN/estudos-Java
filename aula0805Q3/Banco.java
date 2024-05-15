package aula0805Q3;
import java.util.Scanner;


public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do titular da conta especial:");
        String titularContaEspecial = scanner.nextLine();
        System.out.println("Informe o saldo inicial da conta especial:");
        double saldoInicialContaEspecial = scanner.nextDouble();
        System.out.println("Informe o valor para saque da conta especial:");
        double saqueContaEspecial = scanner.nextDouble();
        System.out.println("Informe o valor para depósito na conta especial:");
        double depositoContaEspecial = scanner.nextDouble();

        System.out.println("Informe o nome do titular da conta padrão:");
        scanner.nextLine();
        String titularContaPadrao = scanner.nextLine();
        System.out.println("Informe o saldo inicial da conta padrão:");
        double saldoInicialContaPadrao = scanner.nextDouble();
        System.out.println("Informe o valor para saque da conta padrão:");
        double saqueContaPadrao = scanner.nextDouble();
        System.out.println("Informe o valor para depósito na conta padrão:");
        double depositoContaPadrao = scanner.nextDouble();

        ContaEspecial contaEspecial = new ContaEspecial(titularContaEspecial, saldoInicialContaEspecial, 1000);
        ContaPadrao contaPadrao = new ContaPadrao(titularContaPadrao, saldoInicialContaPadrao, 0.05);

        System.out.println("\nConta Especial:");
        contaEspecial.depositar(depositoContaEspecial);
        contaEspecial.sacar(saqueContaEspecial);
        System.out.println("Saldo: R$" + contaEspecial.getSaldo());

        System.out.println("\nConta Padrão:");
        contaPadrao.depositar(depositoContaPadrao);
        contaPadrao.sacar(saqueContaPadrao);
        System.out.println("Saldo: R$" + contaPadrao.getSaldo());
    }
}