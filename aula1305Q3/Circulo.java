package aula1305Q3;

public class Circulo implements FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * 3.14 * raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * raio * raio;
    }
    public double getRaio() {
        return raio;
    }
}

