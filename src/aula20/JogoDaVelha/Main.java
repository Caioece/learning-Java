import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        PropriedadesJogo game = new PropriedadesJogo();
        int opcao;
        /*LOOP DE MENU*/
        FunctionsJogo.menu(game);
        String[][] matrix = new String[3][3];
        while(game.getJogar() == 1 && game.getJogando() == true)
        {
            FunctionsJogo.printMatrix(matrix);
            int linha;
            int coluna;
            /*LOOP PARA FAZER A JOGADA*/
            do{
                System.out.printf("JOGADOR %d - DIGITE A LINHA E COLUNA DE SUA JOGADA%n", (game.getTurn()));
                linha = scan.nextInt();
                coluna = scan.nextInt();
                if(matrix[linha][coluna] != null)
                    System.out.printf("JOGADA INVALIDA!%n");
                else
                    game.setValidTurn(1);
            }while(game.getValidTurn() == 0);
            /*validação da jogada*/
            if(game.getTurn() == 1){
                matrix[linha][coluna] = "O";
                game.increaseRounds();

            }
            else
            {
                matrix[linha][coluna] = "X";
                game.increaseRounds();
            }
            FunctionsJogo.verificarGanhador(matrix, game);
            FunctionsJogo.changeTurn(game);
        }
        /*PRINT JOGO DA VELHA*/
        if(game.getJogar() != 2)
        {
            FunctionsJogo.printMatrix(matrix);
            /*RESULTADO DO JOGO*/
            FunctionsJogo.finishGame(game);
        }
    }
}