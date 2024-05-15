package aula0805Q3;

class ContaEspecial extends Conta {
    private double limiteChequeEspecial;

    public ContaEspecial(String titular, double saldo, double limiteChequeEspecial) {
        super(titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso (Cheque Especial utilizado).");
        } else {
            System.out.println("Limite de Cheque Especial excedido.");
        }
    }
}