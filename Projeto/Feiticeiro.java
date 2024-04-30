package Projeto;
import java.util.Scanner;

public class Feiticeiro extends Personagem
{
    private String classe;
    public String getClasse() {return classe;}
    public void setClasse(String classe) {this.classe = classe;}
    public Feiticeiro(){}

    public void imprimirF()
    {
        System.out.println("Nome do Personagem: " + nome);
        System.out.println("""    
                                  *.º
                            (o.o)/
                            / |
                             / \\""");
    }

    public void imprimeHP(int hpF, int hpD, int mana)
    {
        System.out.println("""
                            ========================
                            -FEITICEIRO  HP:""" + hpF);
        System.out.println("* Mana  " + mana);
        System.out.println("""
                            ========================
                            -DRAGÃO  HP:""" + hpD);
    }

    static int ataqueFeiticeiro()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                    Escolha seu ataque:
                    1 - Cajado
                    2 - Bola de fogo (-1 mana)""");

        return sc.nextInt();
    }

    public void batalhaFeiticeiro()
    {
        int hpFeiticeiro = 100, hpDragao = 180, mana = 15, escAtaque;

        imprimirdragao();

        //turnos
        while(hpFeiticeiro > 0 && hpDragao > 0)
        {
            imprimeHP(hpFeiticeiro, hpDragao, mana);
            escAtaque = ataqueFeiticeiro();

            switch (escAtaque)
            {
                case 1 ->
                {
                    System.out.println("O Feiticeiro ataca com seu cajado!\n -5");
                    hpDragao = hpDragao - 5;
                }
                case 2 ->
                {
                    System.out.println("O Feiticeiro lanca uma bola de fogo!\n -25");
                    hpDragao = hpDragao - 25;
                    mana = mana - 1;
                }

                default -> System.out.println("Opcao invalida! ");
            }

            if (hpDragao > 0)
            {
                switch (escAtaque)
                {
                    case 1 ->
                    {
                        System.out.println("O DRAGÃO ataca com sua garra! \n -3");
                        hpFeiticeiro = hpFeiticeiro - 3;
                    }
                    case 2 ->
                    {
                        System.out.println("O DRAGÃO ataca com fogo! \n -10");
                        hpFeiticeiro = hpFeiticeiro - 10;
                    }
                }
            }

            else
            {
                System.out.println("O DRAGÃO foi derrotado");
                System.out.println(" ");
            }
        }
    }
}

