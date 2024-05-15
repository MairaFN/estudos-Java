package aula0805Q3;

class ContaPadrao extends Conta {
    private double taxaRendimento;

    public ContaPadrao(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor * (1 + taxaRendimento);
        System.out.println("Depósito de R$" + valor + " realizado com sucesso (Rendimento aplicado).");
    }
}