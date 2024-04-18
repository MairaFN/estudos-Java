package RPG;

public class App {
    Personagens personagem = new Personagens();
    public void introducao(Personagens personagem){
            System.out.println("""
                     __      .              .     .__              __. .
                    /  ` _  _|* _  _  __   _| _   [__) _ *._  _   (__ *| _ ._  _.* _  __ _
                    \\__.(_)(_]|(_](_)_)   (_](_)  |  \\(/,|[ )(_)  .__)||(/,[ )(_.|(_)_) (_)
                               ._|
                                                                        ¡demo!
                               """);

            System.out.println("Há muito tempo em uma galáxia muito distante... opa, roteiro errado.");
            System.out.println("Há muito tempo, em um reino cheio de alegria e riqueza, o rei comemorava o nascimento de seu novo filho, Owen Duncan. O rei Augustus de Valiryan estava em festa, afinal, o herdeiro do trono havia finalmente nascido, depois de muitas lutas com a doença de sua mulher, que poderia não estar mais entre o plano dos vivos por muito tempo.");
            System.out.println("Anos se passaram e o rei ia cuidando de seu filho como podia, Owen estava crescendo forte e saudável, e sua mulher ainda doente fazia todo o esforço possível para ver seu pequeno feliz. E desde que o príncipe viera ao mundo, o reino de Valiryan nunca mais havia passado por uma crise.");
            System.out.println("Mas as coisas não continuaram assim por muito tempo...");
            System.out.println("7 ANOS DEPOIS");
            System.out.println("Tarik Guiterrez era um antigo cavaleiro do rei Duncan, que após vencer orgulhosamente uma batalha em uma missão do rei, exigiu que Augustus cedesse seu título de rei a ele, ameaçou matar toda sua família em segredo caso não fizesse o que mandava e foi exilado do reino por tal feito.");
            System.out.println("Tarik prometeu se vingar um dia.");
            System.out.println("Aos 9 anos de idade, Owen desapareceu de sua cama no amanhecer...");

            System.out.println(" ");

            System.out.println("5 anos se passaram e Owen continuava desaparecido. Nenhum dos cavaleiros do rei eram bons o suficiente para chegar aonde quer que o príncipe estivesse escondido, e se o conseguiam, nunca mais havia notícias sobre esse cavaleiro. Enquanto isso a esposa do rei ficava cada vez mais doente, sem saber quando seu filho voltaria e se estaria viva para ver isso acontecendo.");
            System.out.println("Até que então, em um dia nublado e monótono, um " + personagem.getClasse() + " que passava por ali adentra os portões do reino a procura de um lugar para passar a noite. Uma cabana qualquer já o servia, desde que ele pudesse ter água e comida e não precisasse passar frio como na floresta.");
            System.out.println(personagem.getNome() + " vinha de um lugar tão tão distante, passeava pelo mundo através de uma nova aventura ou de alguém por quem valeria a pena se apaixonar, mas nada disso");
            System.out.println("havia acontecido ainda. Até entrar em um bar levemente movimentado ali e ouvir a conversa de alguns plebeus sobre o príncipe desaparecido, que em 8 dias faria aniversário, completando seus 15 anos, mas que mais uma vez, o reino não estaria em festa.");
            System.out.println(personagem.getNome() + " achou aquilo muito interessante e resolveu ir atrás de Augustus para recolher mais informações.");

            System.out.println(" ");
        }
        public void interacaoComRei(Personagens personagem, String escolha, String[] item){
            System.out.println("NO CASTELO");
            System.out.println("Rei Augustus - Quem ousa atrapalhar o descanso de minha amada?");
            System.out.println(personagem.getNome() + " - Olá, vossa majestade, boa noite. Sou um " + personagem.getClasse() + " que estava apenas passando por aqui, e ouviu falar sobre seu filho desaparecido.");
            System.out.println("Rei Augustus - E o que você quer saber sobre?");
            System.out.println(personagem.getNome() + " - Talvez eu possa ajudar a encontrá-lo.");
            System.out.println("Rei Augustus - Rá! Quanta audácia de sua parte meu jovem, nenhum dos meus cavaleiros jamais foi capaz de encontrar meu querido filho. Por que você acha que seria capaz de trazê-lo de volta para mim?");

            System.out.println("a- Estou em busca de uma aventura há muito tempo, apenas gostaria de ajudar.");
            System.out.println("b- Vossa majestade não sabe de minhas habilidades para estar questionando.");
            System.out.println("c- Apenas acho que com meu conhecimento posso conseguir encontrá-lo.");
            //escolha

            switch (escolha) {
                case "a" -> {
                    System.out.println("Rei Augustus - Então você acha que encontrar meu filho é uma aventura, jovem insolente. Ainda não vejo por que deveria deixar que faça isso.");
                    System.out.println("a- Acredito que posso ser sua última opção.");
                    System.out.println("b- Apenas confie em mim.");
                    //escolha
                    if (escolha.equals("a")) {
                        System.out.println("Rei Augustus - E estou começando a acreditar que talvez você tenha razão. Um de meus criados irá te ajudar com o que precisa saber. Caso precise de algo, irei providenciar.");
                    } else if (escolha.equals("b")) {
                        System.out.println("Rei Augustus - Muito corajoso de sua parte, meu jovem. Irei te dar meu voto de confiança.");
                        System.out.println(personagem.getNome() + " - O senhor não irá se arrepender, vossa majestade.");
                    }
                }
                case "b" -> System.out.println("Rei Augustus - Um pouco rude de sua parte me questionar, mas você me mostra coragem e força de vontade. Um de meus criados irá te passar as informações que precisa saber.");
                case "c" -> System.out.println("Rei Augustus - Você não me parece muito convincente, mas não vejo porque não dar uma chance a você, já que é tão cheio de si. Me encontre pela manhã e irei providenciar o que precisa.");
            }

            System.out.println(" ");

            System.out.println("NO DIA SEGUINTE");
            System.out.println("Rei Augustus - Espero que tenha passado a noite bem... Ainda não sei seu nome, jovem.");
            System.out.println(personagem.getNome() + " - Me chamo " + personagem.getNome() + " , venho de um lugar tão tão distante, que por muito não deve conhecer.");
            System.out.println("Rei Augustus - Muito bom saber, apesar de ainda não ser nada. Bom, aqui está tudo de que precisa e você já pode sair logo depois do café da manhã.");

            System.out.println(" ");

            if (personagem.classe.equals("guerreiro")) {
                System.out.println("Você recebeu 1 espada");
                System.out.println("Você recebeu 10 moedas");
                item[0] = "espada";
                item[1] = "10 moedas";
            } else if (personagem.classe.equals("feiticeiro")) {
                System.out.println("Você recebeu 1 cajado");
                System.out.println("Você recebeu 10 moedas");
                item[0] = "cajado";
                item[1] = "10 moedas";
            } else {
                System.out.println("personagem não existe");
            }

            System.out.println(" ");

            System.out.println("Depois de andar por horas, passando por um vilarejo abandonado, um mendigo o para e pede por dinheiro.");
            System.out.println("Mendigo - Você poderia me ajudar, jovem rapaz? Não tenho nada para comer.");
            System.out.println(personagem.getNome() + " - Por que estás andando por terras fantasmas, senhor?");
            System.out.println("Mendigo - Não tenho como sair daqui, meu companheiro.");
            System.out.println(personagem.getNome() + " - Bem, só tenho " + item[1] + " que posso lhe dar, espero que te ajude de alguma forma.");
            item[1] = null;
            System.out.println("Você se vira para pegar o item e então, ao olhar de novo para o cidadão, ele já não está mais ali. De toda forma, você deixa as " + item[1] + " pro caso dele voltar e dá uma olhada no papel que ele deixará para trás.");
            System.out.println("É um mapa.");
            System.out.println("Ele vai em direção a uma fonte.");
            System.out.println("a- Pegar o mapa.");
            System.out.println("b- Procurar pelo velho.");
            //escolha

            System.out.println(" ");
    }
    public void interacaoComNinfa(Personagens personagem, String escolha) {
            System.out.println("Depois de andar por mais algumas horas, se depara com uma enorme pedra e árvores ao seu redor, impossibilitando a passagem. Então decide tentar escalar ela com seu cavalo.");
            System.out.println("Andando pela floresta você vai apreciando o som dos pássaros cantando e o farfalhar das árvores, é tudo tão harmônico que você não tem vontade de sair dali. Mas já se passaram 3 dias e você ainda não chegou ao seu destino.");
            System.out.println("Você avista uma fonte. A fonte do mapa!");
            System.out.println("Se aproximando para pegar um pouco da água dali uma figura feminina aparece no topo do monumento. Ela é esbelta, com olhos castanhos escuros e um cabelo preto azulado. Veste um pedaço de pano que se comporta como um vestido.");
            System.out.println("Ninfa da água - O que te traz aqui, belo rapaz?");
            System.out.println("Você dá um pulo para trás assustado.");
            System.out.println(personagem.getNome() + " - Um mendigo em um vilarejo abandonado me deu esse mapa que me trouxe até aqui, bela dama.");
            System.out.println("Ninfa da Água - Por favor, me chame de Náiade. Você está na Fonte das Águas Nebulosas.");
            System.out.println(personagem.getNome() + " - Náiade, sabe por que aquele senhor me mandou aqui?");
            System.out.println("Náiade - Ora, você acha que sou algum tipo de vidente? Pergunte você mesmo a ele.");
            System.out.println("O homem que havia lhe pedido dinheiro sai de detrás da fonte. Você só percebe agora o quão pálido ele é.");
            System.out.println(personagem.getNome() + " - Você... você é um fantasma.");
            System.out.println("Mendigo - Sim, eu morri queimado naquele vilarejo, assim como a maioria das almas sem lar que vivem ali.");
            System.out.println(personagem.getNome() + " - Eu sinto muito. Mas... a pergunta que não quer calar, por que me trouxeste aqui?");
            System.out.println("Mendigo - Bem, o mapa é seu agora, vai saber na hora certa.");
            System.out.println("E a figura some de novo misteriosamente. Você vira o olhar para Náiade.");
            System.out.println("Náiade - Ele é cheio de graça, não teve uma vida muito longa apesar da aparência. As almas envelhecem quando não conseguem energia o suficiente.");
            System.out.println(personagem.getNome() + "  - Certo, mas eu continuo sem saber o que estou fazendo aqui.");
            System.out.println("Náiade - Oh, meu caro, você não veio fazer nada aqui.");
            System.out.println("a- Então, com muito respeito, que se dane, irei embora.");
            System.out.println("b- Muito engraçado de sua parte, bela moça, mas eu tenho o tempo contado.");
            //escolha

            if (escolha.equals("a")) {
                System.out.println("Náiade - Vejo como você tem audácia. Mas sinto em lhe informar jovem " + personagem.getClasse() + " que as coisas não funcionam assim por aqui.");
                System.out.println("Você vê a bela moça de olhos castanhos e cabelos azulados se transformar em algo completamente diferente. Ela não era mais uma fada comum. Ela nunca foi uma fada comum.");
            } else if (escolha.equals("b")) {
                System.out.println("Náiade - Não tomarei seu tempo então. Pode continuar em frente.");
                System.out.println("Você sobe no cavalo e começa a ir embora. Porém, para seu azar, você acaba pisando nos longos cabelos de Náiade. O que não é nem um pouco bom.");
                System.out.println("E de repente, aquela fada gentil já não é mais uma fada comum. Sua aparência não é mais a mesma. Ela nunca fora comum.");
            }

            System.out.println(" ");
    }
            //LUTAAAA
        /*if(ganhou){
            System.out.println("Você ganhou 10 de XP.");
            System.out.println("Você ganhou uma poção de ataque. (5 de dano)");
        } */

    public void conclusaoDoJogo() {
        Personagens personagem = new Personagens();
        System.out.println(" ");
        System.out.println("Depois de andar e andar e andar parecendo que você nunca saiu do lugar, você chega ao seu destino. O pequeno castelo que indicava no mapa, na verdade é enorme.");
        System.out.println("E como se já não fosse o suficiente ter lutado com uma ninfa-monstro, você agora precisa lutar com um dragão.");
        System.out.println("Adentrando o castelo, você se depara com o príncipe Owen amarrado pelas mãos e pelos pés em uma cadeira no fim do corredor. Assustado, corre até ele para tentar desamarrá-lo. Mas um homem aparece na sua frente.");
        System.out.println("Tarik - Olá, " + personagem.getNome() + ". A que devo a honra?");
        System.out.println(personagem.getNome() + " - Como você sabe meu nome?");
        System.out.println("Tarik - Eu sei de tudo que acontece por aqui. Sabia que você viria hoje.");
        System.out.println(personagem.getNome() + " - Como... Você era cavaleiro do rei...");
        System.out.println("Tarik - Como adivinhou?");
        System.out.println("Você pensa rapidamente e liga os pontos. O mendigo. A ninfa. Foram eles. Mais alguns milésimos de segundo e você pensa em um ataque rápido.");
        System.out.println("a- Jogar poção de ataque.");
        System.out.println("b- Dar soco.");
                //escolha
        System.out.println("O príncipe está a salvo. A felicidade e a paz no reino foram restauradas. Você agora tem dinheiro para fazer o que quiser na sua vida. E uma bela moça no reino de Valiryan lhe chama a atenção.");
        System.out.println("No fim, Tarik não conseguiu sua vingança. Pelo menos não dessa vez.");

        System.out.println(" ");

        System.out.println("PARABÉNS! VOCÊ GANHOU!");
        System.out.println("Jogo encerrado...");
    }
}
