import java.util.Scanner;

public class Questao11
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual eh o primeiro numero inteiro?");
        int firstInteger = scan.nextInt();
        System.out.println("Qual eh o segundo numero inteiro?");
        int secondInteger = scan.nextInt();
        System.out.println("Qual eh o primeiro numero real?");
        double firstDouble = scan.nextDouble();
        double aLeter = (2*firstInteger) * (secondInteger/2);
        double bLeter = (3*firstInteger) + (firstDouble);
        double cLeter = (firstDouble * firstDouble * firstDouble);
        System.out.println("A letra A eh: " + aLeter);
        System.out.println("A letra B eh: " + bLeter);
        System.out.println("A letra C eh: " + cLeter);

    }
}