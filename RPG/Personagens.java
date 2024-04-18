package RPG;

import java.util.Scanner;

public class Personagens {
    protected String nome;
    protected String classe;

    public void Escolhas() {
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
            sc.nextLine();
            if (escolha == 1) {
                System.out.println("Escolha seu nome: ");
                nome = sc.nextLine();
                classe = "Guerreiro";
                imprimirG();
                //LutaGuerreiro.batalhaGuerreiro();
            } else if (escolha == 2) {
                System.out.println("Escolha seu nome: ");
                nome = sc.nextLine();
                classe = "Feiticeiro";
                imprimirF();
                // LutaMago.batalhaMago();
            }
    }
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void imprimirF(){
        System.out.println("Nome do Personagem: " + nome);
        System.out.println("HP: 100");
        System.out.println("""    
                                  *.º
                            (o.o)/
                            / |
                             / \\""");
    }
    public void imprimirG(){
        System.out.println("Nome do Personagem: " + nome);
        System.out.println("HP: 150 ");
        System.out.println("""    
                            (o.o) |
                            / | \\_+
                             / \\""");
    }
    
    public void imprimirfada() {
            System.out.println("""     
                                      .--.   _,
              .--;    \\ /(_
             /    '.   |   '-._    . ' .
            |       \\  \\    ,-.)  -= * =-
             \\ /\\_   '. \\((` .(    '/. '
              )\\ /     \\ )\\  _/   _/
             /  \\\\    .-'   '--. /_\\
            |    \\\\_.' ,        \\/||
            \\     \\_.-';,_) _)\\ \\||
             '.       /`\\   (   '._/
               `\\   .;  |  . '.
                 ).'  )/|      \\
                 `    ` |  \\|   |
                         \\  |   |
                          '.|   |
                             \\  '\\__
                              `-.   '_
                                 \\`;-.` `._
                                  \\ \\ `'-._\\
                                   \\ |
                                    \\ )
                                     \\_\\""");
    }

    public void imprimirdragao(){
        System.out.println("""
                         ___====-_  _-====___
                   _--^^^#####//      \\\\#####^^^--_
                _-^##########// (    ) \\\\##########^-_
               -############//  |\\^^/|  \\\\############-
             _/############//   (@::@)   \\\\############\\_
            /#############((     \\\\//     ))#############\\
           -###############\\\\    (oo)    //###############-
          -#################\\\\  / VV \\  //#################-
         -###################\\\\/      \\//###################-
        _#/|##########/\\######(   /\\   )######/\\##########|\\#_
        |/ |#/\\#/\\/  \\#/\\##\\  |  |  /##/\\#/  \\/\\#/\\#| \\|
        `  |/  V  V  `   V  \\#\\| |  | |/#/  V   '  V  V  \\|  '
           `   `  `      `   / | |  | | \\   '      '  '   '
                            (  | |  | |  )
                           __\\ | |  | | /__
                          (vvv(VVV)(VVV)vvv)""");
    }
}
    
