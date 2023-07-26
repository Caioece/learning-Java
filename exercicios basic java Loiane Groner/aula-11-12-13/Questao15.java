import java.util.Scanner;

public class Questao15
{
    public static void main(String[ ] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas horas trabalhou nessa semana?");
        int workedHours = scan.nextInt();
        System.out.println("Quanto voce ganha por hora?");
        double salaryPerHour = scan.nextDouble();
        double salary = salaryPerHour * workedHours;
        double incomeTax = 0.11 * salary;
        double inss = 0.08 * salary;
        double sindicate = 0.05 * salary;
        double liquidSalary = salary - incomeTax - inss - sindicate;
        System.out.println("Salario bruto : "  + salary);
        System.out.println("Importo de renda: "  + incomeTax);
        System.out.println("INSS : "  + inss);
        System.out.println("Sindicato : "  + sindicate);
        System.out.println("Salario liquido: "  + liquidSalary);
    }
}