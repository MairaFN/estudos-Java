package Projeto;

public abstract class Personagem
{
    protected String nome;
    public Personagem(){}

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public static void imprimirdragao(){
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
