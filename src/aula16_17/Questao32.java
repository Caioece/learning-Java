import java.util.Scanner;

public class Questao32
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        double preco;
        int i = 1;
        System.out.println("LOJAS TABAJARA");
        do{
            System.out.printf("Produto %d : ", (i));
            preco = scan.nextDouble();
            total += preco;
            i++;
        }while(preco != 0);
        System.out.println("TOTAL : " + total);
        System.out.printf("Dinheiro: ");
        double dinheiro = scan.nextDouble();
        double troco = dinheiro - total;
        System.out.println("Troco: " + troco);
    }
}