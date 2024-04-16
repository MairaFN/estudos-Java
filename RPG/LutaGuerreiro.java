package RPG;
import java.util.Scanner;
import java.util.Random;
public class LutaGuerreiro {
    //clase personagem
    // escolhas
    static Scanner sc = new Scanner(System.in);
    // if (personagem == guerreiro){
    static int ataqueGuerreiro(){
        System.out.println("""
                    Escolha seu ataque:
                    1 - Soco
                    2 - Espada (-1 estamina)""");
        return sc.nextInt();
    }
    static int ataqueNCP(){
        Random gerador = new Random();
        return gerador.nextInt(3)+1; //retorna valor entre 1 e 3
    }
    static void imprimeHP(int hpGuerreiro, int hpNPC, int estamina){
        System.out.println("========================");
        System.out.println("-GUERREIRO  HP:" + hpGuerreiro);
        System.out.println("* Estamina  " + estamina);
        System.out.println("========================");
        System.out.println("-nomeNPC  HP:" + hpNPC);
    }
    static void batalhaGuerreiro(){
        int hpGuerreiro = 150;
        int hpNPC = 30;
        int estamina = 10;
        int escAtaque;
        //turnos
        while(hpGuerreiro > 0 && hpNPC > 0){
            imprimeHP(hpGuerreiro, hpNPC, estamina);
            escAtaque = ataqueGuerreiro();
            switch (escAtaque) {
                case 1 -> {
                    System.out.println("O guerreiro ataca com seus punhos! \n -7");
                    hpNPC -= 7;
                }
                case 2 -> {
                    System.out.println("O guerreiro ataca com a Espada! \n -20");
                    hpNPC -= 20;
                    estamina--;
                }
                default -> System.out.println("Opcao invalida! ");
            }
            if (hpNPC > 0){
                escAtaque = ataqueNCP();
                switch (escAtaque) {
                    case 1 -> {
                        System.out.println("O NOMENPC ataca com um soco! \n -2");
                        hpGuerreiro -= 2;
                    }
                    case 2 -> {
                        System.out.println("O NOMENPC ataca com um chute! \n -3");
                        hpGuerreiro -= 3;
                    }
                    case 3 -> {
                        System.out.println("O NOMENPC ataca com sua faca! \n -5");
                        hpGuerreiro -= 5;
                    }
                }
            }
            else {
                System.out.println("Inimigo derrotado");
            }
        }
    }
}