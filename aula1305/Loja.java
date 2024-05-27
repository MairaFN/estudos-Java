package aula1305;


public abstract class Loja {
    protected String identificador;
    protected String cnpj;
    protected String razaoSocial;
    protected boolean aberta;

    public Loja(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getStatus() {
        return aberta ? "Aberta" : "Fechada";
    }

    public String getIdentificador() {
        return identificador;
    }
}
