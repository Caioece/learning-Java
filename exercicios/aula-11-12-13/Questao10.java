import java.util.Scanner;

public class Questao10
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a temperatura em celsius:");
        double celsius = scan.nextDouble();
        double farenheit = (celsius*1.8) + 32;
        System.out.printf("A temperatura em farenheit eh de aproximadamente %.2f" , (farenheit));
        System.out.println(" graus farenheit");
    }
}