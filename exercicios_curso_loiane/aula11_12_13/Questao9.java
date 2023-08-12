import java.util.Scanner;

public class Questao9
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a temperatura em Farenheit!");
        double farenheit = scan.nextDouble();
        double celcius = (5 * (farenheit - 32) / 9);
        System.out.printf("A temperatura em celcius eh: %.2f" , (celcius));
        System.out.println(" graus celcius");

    }
}