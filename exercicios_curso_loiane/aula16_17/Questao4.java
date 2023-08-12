import java.util.Scanner;

public class Questao4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double aPopulation = 80000;
        double bPopulation = 200000;
        int year = 0;
        System.out.printf("Ano : %d %n", year);
        System.out.printf("Populacao A: %.0f habitantes %n",  aPopulation);
        while(aPopulation < bPopulation)
        {
            aPopulation = aPopulation + (0.03 * aPopulation);
            bPopulation = bPopulation + (0.015 * bPopulation);
            year++;
            System.out.println("Ano :" + year);
            System.out.printf("Populacao A: %.0f %n" , (aPopulation));
            System.out.printf("Populacao B: %.0f %n", (bPopulation));
        }
        System.out.println("Populacao A eh maior ou igual a populacao B no ano: " + year);
        System.out.printf("Populacao A: %.0f %n" , (aPopulation));
        System.out.printf("Populacao B: %.0f %n", (bPopulation));

        
        
    }
}