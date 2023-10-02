import java.util.Scanner;

public class Questao7
{
    public static void main(String[] agrs )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tamanho do lado do quadrado: ");
        double side = scan.nextDouble();
        double area = 2 * side;
        double doubleArea = 2 * area;
        System.out.println("O dobro da area do quadrado eh:" + doubleArea);
    }

}