import java.util.Scanner;

public class Questao6
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o raio do circulo que deseja calcular? ");
        double radius = scan.nextDouble();
        double pi = 3.14;
        double area = pi * (radius * radius);
        /* I Could  do a (pi * radius ^ 2), but that's not the best option for performance improvement
        (or that's what i tought)*/
        System.out.println("A area do circulo eh: " + area);
    }
}