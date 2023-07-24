import java.util.Scanner;

public class Scan{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome, sua idade e sua matricula: ");
        String nome = scan.next();
        int idade = scan.nextInt();
        int matricula = scan.nextInt();
        System.out.println("seu nome eh: " + nome);
        System.out.println("sua idade eh: " + idade);
        System.out.println("sua matricula eh: " + matricula);

    }
}