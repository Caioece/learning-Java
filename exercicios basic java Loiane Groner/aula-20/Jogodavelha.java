import java.util.Scanner;


public class Jogodavelha
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int jogar = 0;
        int opcao;
        while(jogar == 0)
        {
            System.out.printf("=== JOGO DA VELHA ===%n");
            System.out.printf("JOGADOR 1 - O%n");
            System.out.printf("JOGADOR 2 - X%n");
            System.out.printf("DIGITE '1' PARA JOGAR.");
            System.out.printf("DIGITE '0' PARA SAIR.");
            opcao = scan.nextInt();
            if(opcao == 1)
                jogar = 1;
            else if(opcao == 0)
                jogar = 2;
        }
        int jogando = 1;
        String[][] matrix = new String[3][3];

        int turn = 1;
        int ganhador = 0;
        /*printando o jogo da velha*/
        while(jogar == 1 && jogando == 1)
        {
            System.out.println("\t\t\t|    |"); /*primeira linha*/
            for(int i = 0 ; i < matrix.length ; i++)
            {
                int firstTime = 1;
                for(int j = 0 ; j < matrix.length ; j++)
                {
                    if(firstTime == 1 && matrix[i][j] == null)
                    {
                        System.out.printf("\t\t\t");
                    }
                    else if(firstTime == 1 && matrix[i][j] != null)
                    {
                        System.out.printf("\t\t     ");
                    }
                    if((matrix[i][j] == null && j < 2))
                        System.out.printf("|    ");
                    else if(matrix[i][j] != null && j< 2)
                        System.out.printf("%s  | ", (matrix[i][j]));
                    else if(matrix[i][j] != null && j == 2)
                        System.out.printf("%s", matrix[i][j]);
                    firstTime = 0;
                    
                }
                if(i<2)
                {
                    System.out.printf("%n\t\t    ____|____|____%n"); /*linhas com underline*/
                    System.out.printf("\t\t\t|    |%n");/*linha pos underline*/
                } 
            }
            System.out.printf("%n\t\t\t|    |%n"); /*ultima linha*/
            System.out.printf("JOGADOR %d - DIGITE A LINHA E COLUNA DE SUA JOGADA%n", (turn));
            int linha = scan.nextInt();
            int coluna = scan.nextInt();
            if(turn == 1)
                matrix[linha][coluna] = "O";
            else
                matrix[linha][coluna] = "X";
                /*VERIFICANDO VENCEDOR*/
                for(int i = 0 ; i < matrix.length ; i++)
                {
                    /*verificando horizontal e vertical)*/
                    if(( (matrix[i][0] == matrix[i][1] && matrix[i][0] == matrix [i][2]) && (matrix[i][0] != null) ) || ( (matrix[0][i] == matrix[1][i] && matrix[0][i] == matrix[2][i]) && (matrix[0][i] != null) ))
                        jogando = 0;
                    /*verificando diagonais*/
                    if( ( (matrix[0][0] == matrix[1][1] && matrix[0][0] == matrix[2][2]) && matrix[0][0] != null) || ( (matrix[0][2] == matrix[1][1] && matrix[0][2] == matrix[2][0]) && (matrix[0][2] != null) ) )
                        jogando = 0;

                    ganhador = turn;
                }
            if(turn == 1)
                turn = 2;
            else
                turn = 1;
        }
        if(jogar != 2)
            System.out.printf("%nJOGADOR %d GANHOU !!", (ganhador));
    }
}


/*
            |    |
            |    |    
        ____|____|____
            |    |
            |    |   
        ____|____|____
            |    |
            |    |    
            |    |
*/