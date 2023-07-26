import java.util.Scanner;

public class Questao13
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual eh o seu sexo? ( masc = 1 / fem = 2 )");
        int sexo = scan.nextInt();
        System.out.println("Qual eh a sua altura?");
        double altura = scan.nextDouble();
        double idealPound = 0;
        if(sexo == 1)
        {
            idealPound = (72.7 * altura) - 58;
        }
        else if(sexo == 2)
        {
            idealPound = (62.1 * altura) - 44.7;
        }
        System.out.println("Qual eh o seu peso?");
        double weight = scan.nextDouble();
        if(weight > idealPound)
        {
            System.out.println("Voce esta acima do peso ideal.");
        }
        else if(weight == idealPound)
        {
            System.out.println("Voce esta no peso ideal");
        }
        else
        {
            System.out.println("Voce esta abaixo do peso ideal");
        }
        
    }
}