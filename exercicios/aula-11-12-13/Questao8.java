import java.util.Scanner;

public class Questao8
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto voce ganha por hora?");
        double hourSalary = scan.nextDouble();
        System.out.println("Quantas horas voce trabalhou no mes? ");
        double hoursWorked = scan.nextDouble();
        double salary = hourSalary * hoursWorked;
        System.out.println("Seu salario no mes foi de : " + salary); 
        

    }
}