import java.util.Scanner;

public class Questao4
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        int grade1 = scan.nextInt();
        System.out.println("Informe a segunda nota: ");
        int grade2 = scan.nextInt();
        System.out.println("Informe a terceira nota: ");
        int grade3 = scan.nextInt();
        System.out.println("Informe a quarta nota: ");
        int grade4 = scan.nextInt();
        float media = (grade1 + grade2 + grade3 + grade4);
        media = media / 4;
        System.out.println("A media das notas eh: " + media);
        /* making that kind of sum to make the media because i'm not doing loops yet.*/
    }
}
