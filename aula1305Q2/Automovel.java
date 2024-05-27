package aula1305Q2;

public class Automovel extends Veiculo {
    private float velocidadeAtual;
    private float nivelOleo;
    public Automovel() {
        this.velocidadeAtual = 0;
        this.nivelOleo = 0;
    }
    @Override
    public void acelerar(float velocidade) {
        this.velocidadeAtual += velocidade;
        System.out.println("O Automóvel está a " + this.velocidadeAtual + " km/h");
    }
    @Override
    public void parar() {
        this.velocidadeAtual = 0;
        System.out.println("O Automóvel está parado.");
    }
    public void trocarOleo(float litros) {
        this.nivelOleo += litros;
        System.out.println("O Óleo foi trocado. O Nível atual de óleo é " + this.nivelOleo + " litros");
    }
}
