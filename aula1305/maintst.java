package aula1305;

public class maintst {
    public static void main(String[] args) {
        LojaShopping loja1 = new LojaShopping("001", "12345678000101", "Loja 1", "Rua A, 123", "Gerente A");
        LojaShopping loja2 = new LojaShopping("002", "12345678000102", "Loja 2", "Rua B, 456", "Gerente B");
        LojaShopping loja3 = new LojaShopping("003", "12345678000103", "Loja 3", "Rua C, 789", "Gerente C");

        loja1.registra_abertura_dia();
        loja2.registra_abertura_dia();
        loja3.registra_abertura_dia();

        System.out.println("\nDados das Lojas:");
        loja1.mostrarDados();
        System.out.println();
        loja2.mostrarDados();
        System.out.println();
        loja3.mostrarDados();

        loja1.registra_fechamento_dia();
        loja2.registra_fechamento_dia();
        loja3.registra_fechamento_dia();

        System.out.println("\nDados das Lojas após fechamento:");
        loja1.mostrarDados();
        System.out.println();
        loja2.mostrarDados();
        System.out.println();
        loja3.mostrarDados();
    }
}
