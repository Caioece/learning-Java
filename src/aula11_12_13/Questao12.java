import java.util.Scanner;

public class Questao12
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual eh a sua altura?");
        double height = scan.nextDouble();
        double idealWeight = (72.7 * height) - 58;
        System.out.println("O peso ideal eh de: " + idealWeight); 
    }
}