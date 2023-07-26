import java.util.Scanner;

public class Questao14
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual foi o peso que o pescador trouxe?");
        double fishWeight = scan.nextDouble();
        if(fishWeight > 50)
        {
            double surplus = fishWeight - 50;
            surplus = surplus * 4;
            System.out.printf("Os excedentes somam %.2f" , (surplus));
            System.out.println(" reais.");
        }
        else
        {
            System.out.println("O pescador nao teve excedentes.");
        }
    }
}