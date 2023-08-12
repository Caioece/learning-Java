import java.util.Scanner;

public class Questao1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int firstNumber = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int secondNumber = scan.nextInt();
        if(firstNumber > secondNumber)
            System.out.println("O primeiro numero eh maior que o segundo");
        else if(firstNumber == secondNumber)
            System.out.println("Os numeros sao iguais");
        else if(firstNumber < secondNumber)
            System.out.println("O segundo numero eh maior que o primeiro");
    }
}