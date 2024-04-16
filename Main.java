package RPG;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;
        System.out.println("""
                Escolha seu  personagem:
                1 - Guerreiro HP:150 Estamina:5
                Ataques: Soco, Espada.
                          -7    -20
                2 - Mago HP:100 Mana:5
                Ataques: Cajado, Bola de Fogo
                            -5      -25 \n""");
        escolha = sc.nextInt();
        if (escolha == 1) {
            LutaGuerreiro.batalhaGuerreiro();
        } else if (escolha == 2) {
            LutaMago.batalhaMago();
        }
    }
}
