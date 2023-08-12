import java.util.Scanner;

public class Questao10
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        for(int i = firstNumber; i < secondNumber ; i++)
        {
            System.out.println(i);
        }
    }
}