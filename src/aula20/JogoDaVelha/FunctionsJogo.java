import java.util.Scanner;

public class FunctionsJogo {
    public static void printMatrix(String [][] matrix){
        System.out.printf("                 C0    C1    C2%n");
            System.out.println("                    |    |"); /*primeira linha*/
            for(int i = 0 ; i < matrix.length ; i++)
            {
                int firstTime = 1;
                for(int j = 0 ; j < matrix.length ; j++)
                {
                    if(firstTime == 1)
                        System.out.printf("          L%d    ", (i));
                    if(matrix[i][j] == null && j < 2)
                        System.out.printf("    |");
                    if(matrix[i][j] != null && j < 2)
                        System.out.printf(" %s  |", (matrix[i][j]));
                    else if(matrix[i][j] != null & j==2)
                        System.out.printf(" %s", (matrix[i][j]));
                    firstTime = 0;
                }
                if(i<2)
                {
                    System.out.printf("%n                ____|____|____"); /*linhas com underline*/
                    System.out.printf("%n                    |    |%n");/*linha pos underline*/
                } 
            }
            System.out.printf("%n                    |    |%n"); /*ultima linha*/
    }
    public static void verificarGanhador(String [][] matrix, PropriedadesJogo game) {
        for(int i = 0 ; i < matrix.length ; i++){
            /*verificando horizontal e vertical)*/
            if(( (matrix[i][0] == matrix[i][1] && matrix[i][0] == matrix [i][2]) && (matrix[i][0] != null) ) || ( (matrix[0][i] == matrix[1][i] && matrix[0][i] == matrix[2][i]) && (matrix[0][i] != null) ))
                game.setJogando(false);
            /*verificando diagonais*/
            if( ( (matrix[0][0] == matrix[1][1] && matrix[0][0] == matrix[2][2]) && matrix[0][0] != null) || ( (matrix[0][2] == matrix[1][1] && matrix[0][2] == matrix[2][0]) && (matrix[0][2] != null) ) )
                game.setJogando(false);
                //substituidas pelo objeto da classe PropriedadesJogo
            if(game.getJogando() == false){
                //substituidas pelo objeto da classe PropriedadesJogo
                game.setGanhador(game.getTurn());
            }
            if(game.getJogando() == true && game.getRounds() == 9){
                game.setJogando(false);
                game.setVelha(1);
            }
        }
    }
    public static void menu(PropriedadesJogo game){
        Scanner scan = new Scanner(System.in);
        while(game.getJogar() == 0)
        {
            System.out.printf("=== JOGO DA VELHA ===%n");
            System.out.printf("JOGADOR 1 - O%n");
            System.out.printf("JOGADOR 2 - X%n");
            System.out.printf("DIGITE '1' PARA JOGAR.%n");
            System.out.printf("DIGITE '0' PARA SAIR.%n");
            game.setOpcao(scan.nextInt());
            if(game.getOpcao() == 1){
                game.setJogar(1);
            }
            else if(game.getOpcao() == 0){
                game.setJogar(2);
            }
        }
    }
    public static void changeTurn(PropriedadesJogo game){
        if(game.getTurn() == 1)
                game.setTurn(2);
            else
                game.setTurn(1);
    }
    public static void finishGame(PropriedadesJogo game){
        if(game.getVelha() != 1)
                System.out.printf("%nJOGADOR %d GANHOU !!%n", (game.getGanhador()));
            else
                System.out.printf("%nDEU VELHA :( !!%n");
    }
}