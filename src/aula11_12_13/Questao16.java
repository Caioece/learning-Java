import java.util.Scanner;

public class Questao16
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual eh o tamanho em metros da area a ser pintada?");
        int area = scan.nextInt();
        double liters = (double)area / 3;
        int latas = (int)liters / 18;
        if((liters % 18) != 0)
            latas +=1;
        double custo = latas * 80;
        System.out.printf("Voce devera comprar: " + latas);
        System.out.println(" latas de tinta");
        System.out.printf("Deu um total de %.2f", (custo));
        System.out.println(" reais");

    }
}