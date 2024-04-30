package Projeto;
import java.util.Scanner;

public class RPG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char [] escolha = new char[5];
        char op;
        String[] item = new String[2];
        MapaRPG mapa = new MapaRPG();
        String nome, classe = "";
        int p;

        System.out.println("""
        
        Qual o nome do seu personagem?
        
        Inserir:""");

        nome = sc.next();
        nome = nome.toUpperCase();

        System.out.println("""
        
        Escolha seu  personagem:
        1 - Guerreiro
        HP: 150
        Estamina: 10
        Ataques: Soco -7, Espada -20.
                         
        2 - Feiticeiro
        HP: 100
        Mana: 15
        Ataques: Cajado -5, Bola de Fogo -25.
        """);

        System.out.println("""
        Deseja jogar com qual personagem? (1- Guerreiro / 2- Feiticeiro)
        
        Inserir:""");

        p = sc.nextInt();

        if(p==1)
        {
            Guerreiro personagem = new Guerreiro();
            personagem.setNome(nome);
            personagem.setClasse("guerreiro");
            classe = personagem.getClasse();

            personagem.imprimirG();
        }
        else if(p==2)
        {
            Feiticeiro personagem = new Feiticeiro();
            personagem.setNome(nome);
            personagem.setClasse("feitceiro");
            classe = personagem.getClasse();

            personagem.imprimirF();
        }
        else {System.out.println("Opção inexistente.");}
        sc.nextLine();
        sc.nextLine();

        RPG.tituloRPG();
        sc.nextLine();

        System.out.println("""
        Há muito tempo em uma galáxia muito distante... opa, roteiro errado.
        Há muito tempo, em um reino cheio de alegria e riqueza, o rei comemorava o nascimento de seu novo filho, Owen Duncan.
        O rei Augustus de Valiryan estava em festa, afinal, o herdeiro do trono havia finalmente nascido,
        depois de muitas lutas com a doença de sua mulher, que poderia não estar mais entre o plano dos vivos por muito tempo.
        
        Anos se passaram e o rei ia cuidando de seu filho como podia, Owen estava crescendo forte e saudável,
        e sua mulher ainda doente fazia todo o esforço possível para ver seu pequeno feliz. E desde que o príncipe viera ao mundo,
        o reino de Valiryan nunca mais havia passado por uma crise.
        
        Mas as coisas não continuaram assim por muito tempo...
        
        
        
        """);
        sc.nextLine();

        System.out.println("""
        7 ANOS DEPOIS...
        
        Tarik Guiterrez era um antigo cavaleiro do rei Duncan, que após vencer orgulhosamente uma batalha em uma missão do rei,
        exigiu que Augustus cedesse seu título de rei a ele, ameaçou matar toda sua família em segredo caso não fizesse o que mandava
        e foi exilado do reino por tal feito.
        
        Tarik prometeu se vingar um dia.
        
        Aos 9 anos de idade, Owen desapareceu de sua cama no amanhecer...
        
        
        
        """);
        sc.nextLine();

        System.out.println("""
        5 anos se passaram e Owen continuava desaparecido. Nenhum dos cavaleiros do rei eram bons o suficiente para chegar
        aonde quer que o príncipe estivesse escondido, e se o conseguiam, nunca mais havia notícias sobre esse cavaleiro.
        Enquanto isso a esposa do rei ficava cada vez mais doente, sem saber quando seu filho voltaria e se estaria viva para ver isso acontecendo.
       
       
        """ + "Até que então, em um dia nublado e monótono, um "+ classe +
        """ 
        que passava por ali adentra os portões do reino a procura de um lugar para passar a noite.
        Uma cabana qualquer já o servia, desde que ele pudesse ter água e comida e não precisasse passar frio como na floresta.
        
        """);
        sc.nextLine();

        System.out.println(nome + " vinha de um lugar tão tão distante, passeava pelo mundo através de uma nova aventura" + """
        ou de alguém por quem valeria a pena se apaixonar, mas nada disso havia acontecido ainda.
        Até entrar em um bar levemente movimentado ali e ouvir a conversade alguns plebeus sobre o príncipe desaparecido,
        que em 8 dias faria aniversário, completando seus 15 anos, mas que mais uma vez, o reino não estaria em festa.
        
        """ + nome + " achou aquilo muito interessante e resolveu ir atrás de Augustus para recolher mais informações.");
        sc.nextLine();

        System.out.println("""
        
        NO CASTELO...
        
        Rei Augustus - Quem ousa atrapalhar o descanso de minha amada?"""
        + nome + " - Olá, vossa majestade, boa noite. Sou um " + classe + """ 
        que estava apenas passando por aqui, e ouviu falar sobre seu filho desaparecido.
        Rei Augustus - E o que você quer saber sobre?"""
        + nome + "- Talvez eu possa ajudar a encontrá-lo." + """
        Rei Augustus - Rá! Quanta audácia de sua parte meu jovem, nenhum dos meus cavaleiros jamais
        foi capaz de encontrar meu querido filho. Por que você acha que seria capaz de trazê-lo de volta para mim?
  
      
        a- Estou em busca de uma aventura há muito tempo, apenas gostaria de ajudar.
        b- Vossa majestade não sabe de minhas habilidades para estar questionando.
        c- Apenas acho que com meu conhecimento posso conseguir encontrá-lo.
        """);

        System.out.print("Escolha: ");
        op = sc.next().toUpperCase().charAt(0);
        escolha[0] = op;
        
        if(op == 'A')
        {
            System.out.println("""

        Rei Augustus - Então você acha que encontrar meu filho é uma aventura, jovem insolente.
        Ainda não vejo por que deveria deixar que faça isso.
        
    
        a- Acredito que posso ser sua última opção.
        b- Apenas confie em mim.
        """);

            System.out.print("Escolha: ");
            op = sc.next().toUpperCase().charAt(0);
            escolha[1] = op;

            if(op == 'A')
            {
                System.out.println("""
        
        Rei Augustus - É estou começando a acreditar que talvez você tenha razão.
        Um de meus criados irá te ajudar com o que precisa saber. Caso precise de algo, irei providenciar.
        """);
            }
            else if(op == 'B')
            {
                System.out.println("""
                        Rei Augustus - Muito corajoso de sua parte, meu jovem. Irei te dar meu voto de confiança."""
                        + nome + " - O senhor não irá se arrepender, vossa majestade.");
            }

            else{System.out.println("Opção Inválida.");}

        }
        else if(op == 'B')
        {
            System.out.println("""
        
        Rei Augustus - Um pouco rude de sua parte me questionar, mas você me mostra coragem e força de vontade.
        Um de meus criados irá te passar as informações que precisa saber.
        """);

            escolha[1] = op;

        }
        else if(op == 'C')
        {
            System.out.println("""
        
        Rei Augustus - Você não me parece muito convincente, mas não vejo porque não dar uma chance a você,
        já que é tão cheio de si. Me encontre pela manhã e irei providenciar o que precisa.
        """);

            escolha[1] = op;

        }
        else{System.out.println("Opção Inválida.");}
        
        sc.nextLine();

        System.out.println("""
        
        NO DIA SEGUINTE...
        
        Rei Augustus - Espero que tenha passado a noite bem... Ainda não sei seu nome, jovem."""
        + nome + " - Me chamo " + nome + " , venho de um lugar tão tão distante, que por muito não deve conhecer." + """
        Rei Augustus - Muito bom saber, apesar de ainda não ser nada. Bom, aqui está tudo de que precisa
        e você já pode sair logo depois do café da manhã.
        """);

        sc.nextLine();

        if(p == 1)
        {
            System.out.println("""
        Você recebeu 1 espada.
        Você recebeu 10 moedas.
        """);
            item[0] = "espada";
        }

        else
        {
            System.out.println("""
        Você recebeu 1 cajado.
        Você recebeu 10 moedas.
        """);
            item[0] = "cajado";
        }

        item[1] = "10 moedas";

        sc.nextLine();
        
        System.out.println("""
        
        Depois de andar por horas, passando por um vilarejo abandonado, um mendigo o para e pede por dinheiro.
        
        Mendigo - Você poderia me ajudar, jovem? Não tenho nada para comer.
        """+ nome + " - Por que estás andando por terras fantasmas, senhor?" + """
        Mendigo - Não tenho como sair daqui, meu companheiro."""
        + nome + " - Bem, só tenho " + item[1] + " que posso lhe dar, espero que te ajude de alguma forma." + """
        
        Você se vira para pegar o item e então, ao olhar de novo para o cidadão, ele já não está mais ali.
        De toda forma, você deixa as""" + item[1] + " pro caso dele voltar e dá uma olhada no papel que ele deixara para trás." +
        """
        É um mapa.
        Que leva em direção a uma fonte.
        
        
        a- Pegar o mapa.
        b- Procurar pelo velho.
        """);
        
        System.out.print("Escolha: ");
        op = sc.next().toUpperCase().charAt(0);
        escolha[2] = op;
        
        item[1] = "mapa";
        mapa.mapa();

        sc.nextLine();
        sc.nextLine();
        
        System.out.println("""
        
        Depois de andar por mais algumas horas, se depara com uma enorme pedra e árvores ao seu redor, impossibilitando a passagem.
        Então decide tentar escalar ela com seu cavalo.
        
        Andando pela floresta você vai apreciando o som dos pássaros cantando e o farfalhar das árvores,
        é tudo tão harmônico que você não tem vontade de sair dali. Mas já se passaram 3 dias e você ainda não chegou ao seu destino.
        
        Você avista uma fonte. A fonte do mapa!
        
        Se aproximando para pegar um pouco da água dali uma figura feminina aparece no topo do monumento.
        Ela é esbelta, com olhos castanhos escuros e um cabelo preto azulado. Veste um pedaço de pano que se comporta como um vestido.
        """);
        sc.nextLine();

        System.out.println("""
        Ninfa da água - O que te traz aqui, belo rapaz?
   
        Você dá um pulo para trás assustado.
        """
        + nome + " - Um mendigo em um vilarejo abandonado me deu esse mapa que me trouxe até aqui, bela dama." + """
        Ninfa da Água - Por favor, me chame de Náiade. Você está na Fonte das Águas Nebulosas."""
        + nome + " - Náiade, sabe por que aquele senhor me mandou aqui?" + """
        Náiade - Ora, você acha que sou algum tipo de vidente? Pergunte você mesmo a ele.
        
        O homem que havia lhe pedido dinheiro sai de detrás da fonte. Você só percebe agora o quão pálido ele é.
        
        
        
        
        """);
        sc.nextLine();

        System.out.println(nome + " - Você... você é um fantasma." + """
        Mendigo - Sim, eu morri queimado naquele vilarejo, assim como a maioria das almas sem lar que vivem ali."""
        + nome + " - Eu sinto muito. Mas... a pergunta que não quer calar, por que me trouxeste aqui?" + """
        Mendigo - Bem, o mapa é seu agora, vai saber na hora certa.
        
        E a figura some de novo misteriosamente. Você vira o olhar para Náiade.
        
        Náiade - Ele é cheio de graça, não teve uma vida muito longa apesar da aparência.
        As almas envelhecem quando não conseguem energia o suficiente."""
        + nome + "  - Certo, mas eu continuo sem saber o que estou fazendo aqui." + """
        Náiade - Oh, meu caro, você não veio fazer nada aqui.
        
        
        a- Então, com muito respeito, que se dane, irei embora.
        b- Muito engraçado de sua parte, bela moça, mas eu tenho o tempo contado.
        """);
        
        System.out.print("Escolha: ");
        op = sc.next().toUpperCase().charAt(0);
        escolha[3] = op;
        
        if(op == 'A')
        {
            System.out.println("""
        Náiade - Vejo como você tem audácia. Mas sinto em lhe informar jovem""" + classe + "que as coisas não funcionam assim por aqui." + """
        
        Você vê a bela moça de olhos castanhos e cabelos azulados se transformar em algo completamente diferente.
        Ela não era mais uma fada comum. Ela nunca foi uma fada comum.
        """);
        }

        else if(op == 'B')
        {
            System.out.println("""
        
        Náiade - Não tomarei seu tempo então. Pode continuar em frente.
            
        Você sobe no cavalo e começa a ir embora.
            
        Porém, para seu azar, você acaba pisando nos longos cabelos de Náiade. O que não é nem um pouco bom.
        E de repente, aquela fada gentil já não é mais uma fada comum. Sua aparência não é mais a mesma. Ela nunca fora comum.
        """);
        }

        else{System.out.println("Opção Inválida.");}

        System.out.println(" ");

        System.out.println("Você rapidamente consegue desviar da fada, usando suas habilidades, a despistando e conseguindo seguir caminho.");

        sc.nextLine();
        
        System.out.println("""
        
        Depois de andar e andar e andar parecendo que você nunca saiu do lugar, você chega ao seu destino.
        O pequeno castelo que indicava no mapa, na verdade é enorme.
        
        E como se já não fosse o suficiente quase ter lutado com uma ninfa-monstro, você agora precisa lutar com um DRAGÃO!
        """);

        sc.nextLine();

        if(p==1)
        {
            Guerreiro personagem = new Guerreiro();
            personagem.batalhaGuerreiro();

        }
        else if(p==2)
        {
            Feiticeiro personagem = new Feiticeiro();
            personagem.batalhaFeiticeiro();
        }

        sc.nextLine();

        System.out.println("""
        
        Adentrando o castelo, você se depara com o príncipe Owen amarrado pelas mãos e pelos pés em uma cadeira no fim do corredor.
        Assustado, corre até ele para tentar desamarrá-lo.
        Mas um homem aparece na sua frente.
        
        Tarik - Olá,""" + nome + ". A que devo a honra?"
        + nome + " - Como você sabe meu nome?"+
        "Tarik - Eu sei de tudo que acontece por aqui. Sabia que você viria hoje."
        + nome + " - Como... Você era cavaleiro do rei..." + """
        Tarik - Como adivinhou?
        
        Você pensa rapidamente e liga os pontos. O mendigo. A ninfa. Foram eles.
        
        Por alguns milésimos de segundo você pensa em um ação rápida.
        
        
        a- Atacar com as sua arma.
        b- Tentar se proteger.
        """);
        
        System.out.print("Escolha: ");
        op = sc.next().toUpperCase().charAt(0);
        escolha[4] = op;
        
        System.out.println(" ");
        sc.nextLine();
        
        System.out.println("Tarik empunha sua própria adaga e avança em um ataque implacável...");
        
        System.out.println(" ");
        sc.nextLine();
        
        System.out.println("""
            |--------------------|
            |                    |
            | to be continued... |
            |                    |
            |--------------------|
            \\  ^__^
            \\ (oo)\\_______
             (__)\\       )\\/\\
                ||----w |
                ||     ||
            """);

        System.out.println(" ");

        nivelEscolhas(escolha);

            sc.close();
        }
        
        public static void tituloRPG()
        {
            System.out.println("""
                 
                 
                 __      .              .     .__              __. .
                /  ` _  _|* _  _ __    _| _   [__) _ *._  _   (__ *| _ ._  _.* _ __ _
                \\__.(_)(_]|(_](_)_)   (_](_)  |  \\(/,|[ )(_)  .__)||(/,[ )(_.|(_)_)(_)
                           ._|
                                                                    ¡demo!
                           """);
        }

        public static void nivelEscolhas(char[] escolha)
        {
            int contadorA = 0;
            int contadorB = 0;

            for (char escolhas : escolha)
            {
                if (escolhas == 'A') {contadorA++;}

                else if (escolhas == 'B') {contadorB++;}
            }

            if (contadorA > contadorB) {System.out.println("Você foi mais corajoso nesse jogo. Total de escolhas corajosas: " + contadorA);}

            else if (contadorB > contadorA){System.out.println("Você foi mais amigável nesse jogo. Total de escolhas amigaveis: " + contadorB);}

            else {System.out.println("Você soube balancear suas escolhas. \n Total de escolhas corajosas: " + contadorA + "\nTotal de escolhas amigaveis: " + contadorB);}
        }
    }