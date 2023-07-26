import java.util.Scanner;

public class Questao5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos metros deseja converter?");
        float metros = scan.nextFloat();
        float centimetros = metros * 100;
        System.out.println("A conversão da: " + centimetros);
    }
}