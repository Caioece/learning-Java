import java.util.Scanner;

public class Questao1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        for(int i = 0 ; i < b.length ; i++)
        {
            System.out.printf("Digite o valor %d do vetor a: ", (i));
            a[i] = scan.nextInt();
        }
        for(int i = 0 ; i < a.length ; i++)
        {
            b[i] = a[i];
            System.out.printf("espaco %d vetor b : ", (i));
            System.out.println(b[i]);
        }
    }
}