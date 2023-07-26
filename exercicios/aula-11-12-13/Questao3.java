import java.util.Scanner;

public class Questao3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        int number1 = scan.nextInt();
        System.out.println("Informe o primeiro numero");
        int number2 = scan.nextInt();
        int sum = number1 + number2;
        System.out.println("A soma dos dois numeros eh: " + sum);
    }
}