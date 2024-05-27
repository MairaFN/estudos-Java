package aula1305Q2;

public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        Automovel automovel = new Automovel();

        System.out.println("Andando de Bicicleta:");
        bicicleta.acelerar(15);
        bicicleta.parar();

        System.out.println("\nDirigindo o Automóvel:");
        automovel.acelerar(50);
        automovel.trocarOleo(5);
        automovel.parar();
    }
}
