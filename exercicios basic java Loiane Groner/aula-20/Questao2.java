import java.util.Random;

public class Questao2
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        int[][] matrix = new int[10][10];
        int lineFiveLower = 10;
        int lineFiveBigger = 0;
        int columSevenBigger = 0;
        int columSevenLower = 10;
        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int j = 0 ; j < matrix.length ; j++)
            {
                matrix[i][j] = generator.nextInt(10);
                System.out.printf("%d " , (matrix[i][j]));
                if(i == 5 && j == 0)
                {
                    lineFiveBigger = matrix[i][j];
                    lineFiveLower = matrix[i][j];
                }
                else
                {
                    if(i == 5 && (matrix[i][j] > lineFiveBigger))
                        lineFiveBigger = matrix[i][j];
                    if(i == 5 && (matrix[i][j] < lineFiveLower))
                        lineFiveLower = matrix[i][j];
                }
                if(j == 7 && i == 0)
                {   
                    columSevenBigger = matrix[i][j];
                    columSevenLower = matrix[i][j];
                }
                else
                {
                    if(j == 7 && (matrix[i][j] > columSevenBigger))
                        columSevenBigger = matrix[i][j];
                    if(j == 7 && (matrix[i][j] < columSevenLower))
                        columSevenLower = matrix[i][j];
                }
            }
            System.out.printf("%n");
        }
        System.out.println("O maior valor da linha 5 eh: " + lineFiveBigger);
        System.out.println("O menor valor da linha 5 eh: " + lineFiveLower);
        System.out.println("O maior valor da coluna 7 eh: " + columSevenBigger);
        System.out.println("O menor valor da colune 7 eh: " + columSevenLower);
    }
}
