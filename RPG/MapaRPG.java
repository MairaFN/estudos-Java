package RPG;

public class MapaRPG{
    public static void main(String[] args) {
        char[][] mapa = {
            {'_', '_', '_', '_', '_', '_', '_', '_', '_','_','_','_','_', '_','_','_','_'},
            {'º', ' ', ' ', '¥', '¥', '¥', ' ', ' ', '|',' ',' ',' ', ' ',' ',' ',' ', '|'},
            {'|', ' ', '¥', ' ', ' ', '¥', ' ', ' ', '|',' ',' ',' ', ' ','+',' ',' ', '|'},
            {'|', ' ', '¥', '¥', '¥', ' ', ' ', ' ', '|',' ',' ',' ', ' ',' ',' ',' ', '|'},
            {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',' ',' ',' ', ' ',' ',' ',' ', '|'},
            {'|', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ','~','8','~', ' ', ' ',' ',' ','|'},
            {'|', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ',' ',' ',' ', ' ','^','^',' ', '|'},
            {'|', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ',' ',' ',' ', '^','^','^','^', '|'},
            {'|', ' ', ' ', '|', ' ', ' ', '+', ' ', ' ',' ',' ',' ', '|','_','_','|', '|'},
            {'|', '_', '_', '_', '_', '_', '_', '_', '_','_','_','_', '_','_','_','_', '|'}
        };
        // Imprime o mapa
        for (char[] linha : mapa) {
            for (char celula : linha) {
                System.out.print(celula + " ");
            }
            System.out.println();
        }
    }
}

