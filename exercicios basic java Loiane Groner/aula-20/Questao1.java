import java.util.Random;

public class Questao1
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        int[][] matrix = new int[4][4];
        int bigger = 0;
        int posjbigger = 0;
        int posibigger = 0;
        for(int i = 0 ; i < matrix.length; i++)
        {
            for(int j = 0 ; j < matrix.length ; j++)
            {
                matrix[i][j] = generator.nextInt(10);
                System.out.printf("%d  ", (matrix[i][j]));
                if(i == 0 && j == 0)
                {
                    bigger = matrix[i][j];
                    posibigger = i;
                    posjbigger = j;
                }
                else
                {
                    if(bigger < matrix[i][j])
                    {
                        bigger = matrix[i][j];
                        posibigger = i;
                        posjbigger = j;
                    }
                }
            }
            System.out.printf("%n");
        }
        System.out.printf("O maior numero eh: %d | linha : %d | coluna: %d", (bigger) , (posibigger) , (posjbigger));
    }
}