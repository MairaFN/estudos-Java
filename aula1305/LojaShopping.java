package aula1305;

class LojaShopping extends Loja implements Registro {
    private String endereco;
    private String gerente;

    public LojaShopping(String identificador, String cnpj, String razaoSocial, String endereco, String gerente) {
        super(cnpj, razaoSocial);
        this.identificador = identificador;
        this.endereco = endereco;
        this.gerente = gerente;
    }

    @Override
    public void registra_abertura_dia() {
        if (!aberta) {
            aberta = true;
            System.out.println("Loja " + identificador + " aberta com sucesso.");
        } else {
            System.out.println("A loja " + identificador + " já está aberta.");
        }
    }

    @Override
    public void registra_fechamento_dia() {
        if (aberta) {
            aberta = false;
            System.out.println("Loja " + identificador + " fechada com sucesso.");
        } else {
            System.out.println("A loja " + identificador + " já está fechada.");
        }
    }

    public void mostrarDados() {
        System.out.println("Identificador: " + identificador);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("Endereço: " + endereco);
        System.out.println("Gerente: " + gerente);
        System.out.println("Status: " + getStatus());
    }
}
