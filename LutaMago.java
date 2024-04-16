package RPG;
import java.util.Random;
import java.util.Scanner;
public class LutaMago {
    //clase personagem
    // escolhas
    static Scanner sc = new Scanner(System.in);
    // if (personagem == mago){
    static int ataqueMago(){
        System.out.println("""
                    Escolha seu ataque:
                    1 - Cajado
                    2 - Bola de fogo (-1 mana)""");
        return sc.nextInt();
    }
    static int ataqueNCP(){
        Random gerador = new Random();
        return gerador.nextInt(3)+1; //retorna valor entre 1 e 3
    }
    static void imprimeHP(int hpMago, int hpNPC, int mana){
        System.out.println("========================");
        System.out.println("-MAGO  HP:" + hpMago);
        System.out.println("* Mana  " + mana);
        System.out.println("========================");
        System.out.println("-nomeNPC  HP:" + hpNPC);
    }
    static void batalhaMago(){
        int hpMago = 100;
        int hpNPC = 30;
        int mana = 5;
        int escAtaque;
        //turnos
        while(hpMago > 0 && hpNPC > 0){
            imprimeHP(hpMago, hpNPC, mana);
            escAtaque = ataqueMago();
            switch (escAtaque) {
                case 1 -> {
                    System.out.println("O Mago ataca com seu cajado!\n-5");
                    hpNPC -= 5;
                }
                case 2 -> {
                    System.out.println("O Mago lanca uma bola de fogo!\n-25");
                    hpNPC -= 25;
                    mana--;
                }
                default -> System.out.println("Opcao invalida! ");
            }
            if (hpNPC > 0){
                escAtaque = ataqueNCP();
                switch (escAtaque) {
                    case 1 -> {
                        System.out.println("O NOMENPC ataca com um soco! \n -2");
                        hpMago -= 2;
                    }
                    case 2 -> {
                        System.out.println("O NOMENPC ataca com um chute! \n -3");
                        hpMago -= 3;
                    }
                    case 3 -> {
                        System.out.println("O NOMENPC ataca com sua faca! \n -5");
                        hpMago -= 5;
                    }
                }
            }
            else {
                System.out.println("Inimigo derrotado");
            }
        }
    }
}