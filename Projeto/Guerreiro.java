package Projeto;

import java.util.Scanner;

public class Guerreiro extends Personagem
{
    private String classe;
    public String getClasse() {return classe;}
    public void setClasse(String classe) {this.classe = classe;}
    public Guerreiro(){}

    public void imprimirG()
    {
        System.out.println("Nome do Personagem: " + nome);
        System.out.println("""    
                            (o.o) |
                            / | \\_+
                             / \\""");
    }
    public void imprimeHP(int hpG, int hpD, int estamina)
    {
        System.out.println("""
                            ========================
                            -GUERREIRO  HP:""" + hpG);
        System.out.println("* Estamina  " + estamina);

        System.out.println("""
                            ========================
                            -DRAGAO  HP:""" + hpD);
    }
    static int ataqueGuerreiro()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                    Escolha seu ataque:
                    1 - Soco
                    2 - Espada (-1 estamina)""");

        return sc.nextInt();
    }

    public void batalhaGuerreiro()
    {
        int hpGuerreiro = 150, hpDragao = 180, estamina = 10, escAtaque;

        imprimirdragao();

        while(hpGuerreiro > 0 && hpDragao > 0)
        {
            imprimeHP(hpGuerreiro, hpDragao, estamina);
            escAtaque = ataqueGuerreiro();

            switch (escAtaque)
            {
                case 1 ->
                {
                    System.out.println("O guerreiro ataca com seus punhos! \n -7");
                    hpDragao -= 7;
                }
                case 2 ->
                {
                    System.out.println("O guerreiro ataca com a Espada! \n -20");
                    hpDragao -= 20;
                    estamina--;
                }

                default -> System.out.println("Opcao invalida! ");
            }

            if (hpDragao > 0)
            {
                switch (escAtaque)
                {
                    case 1 ->
                    {
                        System.out.println("O DRAGÃO ataca com uma asa! \n -5");
                        hpGuerreiro -= 5;
                    }
                    case 2 ->
                    {
                        System.out.println("O DRAGÃO ataca com fogo! \n -10");
                        hpGuerreiro -= 10;
                    }
                }
            }
            else
            {
                System.out.println("O dragão foi derrotado");
                System.out.println(" ");
            }
        }
    }
}

