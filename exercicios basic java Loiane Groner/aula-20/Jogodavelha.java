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
            System.out.printf("DIGITE '1' PARA JOGAR.%n");
            System.out.printf("DIGITE '0' PARA SAIR.%n");
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
        int rounds = 0;
        int velha = 0;
        /*printando o jogo da velha*/
        while(jogar == 1 && jogando == 1)
        {
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
            int validTurn = 0;
            int linha;
            int coluna;
            do{
                System.out.printf("JOGADOR %d - DIGITE A LINHA E COLUNA DE SUA JOGADA%n", (turn));
                linha = scan.nextInt();
                coluna = scan.nextInt();
                if(matrix[linha][coluna] != null)
                    System.out.printf("JOGADA INVALIDA!%n");
                else
                    validTurn = 1;
            }while(validTurn == 0);
            if(turn == 1)
            {
                matrix[linha][coluna] = "O";
                rounds++;
            }
            else
            {
                matrix[linha][coluna] = "X";
                rounds++;
            }
                /*VERIFICANDO VENCEDOR OU VELHA*/
                for(int i = 0 ; i < matrix.length ; i++)
                {
                    /*verificando horizontal e vertical)*/
                    if(( (matrix[i][0] == matrix[i][1] && matrix[i][0] == matrix [i][2]) && (matrix[i][0] != null) ) || ( (matrix[0][i] == matrix[1][i] && matrix[0][i] == matrix[2][i]) && (matrix[0][i] != null) ))
                        jogando = 0;
                    /*verificando diagonais*/
                    if( ( (matrix[0][0] == matrix[1][1] && matrix[0][0] == matrix[2][2]) && matrix[0][0] != null) || ( (matrix[0][2] == matrix[1][1] && matrix[0][2] == matrix[2][0]) && (matrix[0][2] != null) ) )
                        jogando = 0;
                    
                    if(jogando == 0)
                        ganhador = turn;
                    if(jogando == 1 && rounds == 9)
                    {
                        jogando = 0 ;
                        velha = 1;
                    }

                }
            if(turn == 1)
                turn = 2;
            else
                turn = 1;
        }
        if(jogar != 2)
        {
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
            if(velha != 1)
                System.out.printf("%nJOGADOR %d GANHOU !!", (ganhador));
            else
                System.out.printf("%nDEU VELHA :( !!%n");
        }
    }
}


/*
20 espacos
                    |    |
16 espacos fT       |    |    
16 espacos      ____|____|____
                    |    |
                    |    |   
                ____|____|____
                    |    |
                    |    |    
                    |    |
*/