import java.util.Scanner;

public class Questao18
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o tamanho do arquivo para download ? (em MB)");
        double archiveSize = scan.nextDouble();
        System.out.println("Qual a velocidade de download? (Mpbs)");
        double downloadSpeed = scan.nextDouble();
        double aproximateTime = archiveSize/downloadSpeed;
        aproximateTime = aproximateTime/60;
        System.out.printf("O tempo aproximado do download em minutos eh de: %.2f",  (aproximateTime));
        System.out.println(" minutos");
    }
}