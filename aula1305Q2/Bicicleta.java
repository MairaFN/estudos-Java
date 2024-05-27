package aula1305Q2;

public class Bicicleta extends Veiculo {
    private float velocidadeAtual;
    public Bicicleta() {this.velocidadeAtual = 0;}
    @Override
    public void acelerar(float velocidade) {
        this.velocidadeAtual += velocidade;
        System.out.println("A Bicicleta está a " + this.velocidadeAtual + " km/h");
    }
    @Override
    public void parar() {
        this.velocidadeAtual = 0;
        System.out.println("A Bicicleta está parada.");
    }
}
