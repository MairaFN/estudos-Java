package RPG;

public class Main {
    public static void main(String[] args) {
        Personagens personagens = new Personagens();
        App app = new App();
        personagens.Escolhas();
        String escolha = "a";
        String[] item = new String[2];
        app.introducao(personagens);
        app.interacaoComRei(personagens, escolha, item);
        app.interacaoComNinfa(personagens, escolha);
        }
    }
