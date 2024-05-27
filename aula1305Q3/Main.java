package aula1305Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas formas? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        FormaGeometrica[] formas = new FormaGeometrica[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Deseja criar um quadrado, retângulo ou círculo? ");
            String tipo = scanner.nextLine().toLowerCase();

            switch (tipo) {
                case "quadrado" -> {
                    System.out.print("Informe o tamanho do lado: ");
                    double lado = scanner.nextDouble();
                    formas[i] = new Quadrado(lado);
                }
                case "retangulo" -> {
                    System.out.print("Informe o tamanho da base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Informe o tamanho da altura: ");
                    double altura = scanner.nextDouble();
                    formas[i] = new Retangulo(base, altura);
                }
                case "circulo" -> {
                    System.out.print("Informe o tamanho do raio: ");
                    double raio = scanner.nextDouble();
                    formas[i] = new Circulo(raio);
                }
                default -> {
                    System.out.println("Tipo de forma não reconhecido.");
                    i--;
                }
            }
            scanner.nextLine();
        }

        System.out.println("\nResumo das formas criadas:");
        for (FormaGeometrica forma : formas) {
            if (forma instanceof Quadrado quadrado) {
                System.out.println("Quadrado - Lado: " + quadrado.getLado() + ", Perímetro: " + quadrado.calcularPerimetro() + ", Área: " + quadrado.calcularArea());
            } else if (forma instanceof Retangulo retangulo) {
                System.out.println("Retângulo - Base: " + retangulo.getBase() + ", Altura: " + retangulo.getAltura() + ", Perímetro: " + retangulo.calcularPerimetro() + ", Área: " + retangulo.calcularArea());
            } else if (forma instanceof Circulo circulo) {
                System.out.println("Círculo - Raio: " + circulo.getRaio() + ", Perímetro: " + circulo.calcularPerimetro() + ", Área: " + circulo.calcularArea());
            }
        }
        scanner.close();
    }
}