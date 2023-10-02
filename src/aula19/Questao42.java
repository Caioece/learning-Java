import java.util.Scanner;

public class Questao42
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] vector = new int[10];
        for(int i = 0; i < vector.length ; i++)
        {
            vector[i] = scan.nextInt();
        }
        int[] aux = new int[10];
        for(int i = 0 ; i < vector.length ; i++)
        {
            for(int j = i+1 ; j < vector.length ; j++)
            {
                if(vector[j] < vector[i])
                {
                    aux[i] = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux[i];
                }
            }
            System.out.printf(" Espaço %d do vetor eh: %d %n" , (i), (vector[i]));
        }
    }
}