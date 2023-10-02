import java.util.Scanner;

public class Questao2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("!!! ACOUGUE !!!");
        System.out.println("SELECIONE A OPCAO DE CARNE");
        System.out.println("1 - FILE");
        System.out.println("2 -ALCATRA");
        System.out.println("3 -PICANHA");
        int meet = scan.nextInt();
        System.out.println("PAGOU NO CARTAO TABAJARA? 1 - sim / 2 - nao");
        int tabajara = scan.nextInt();
        System.out.println("QUAL FOI A QUANTIDADE DE CARNE? (EM KG)");
        double quantity = scan.nextDouble();
        /* tabela de precos
        file - 4,90 ate 5kg  // 5,80 apos 5kg
        alcatra - 5,90 ate 5kg // 6,80 apos 5kg
        picanha - 6,90 ate 5kg // 7,80 apos 5kg */
        double finalPrice = 0;
        double discount = 0;
        if(meet == 1)
        {
            if(quantity <= 5)
            {
                finalPrice = 4.90 * quantity;
            }
            else
            {
                finalPrice = 5.80 * quantity;
            }
            System.out.printf("Tipo de carne escolhida: file");
        }
        else if(meet == 2)
        {
            if(quantity <= 5)
            {
                finalPrice = 5.90 * quantity;
            }
            else
            {
                finalPrice = 6.80 * quantity;
            }
            System.out.printf("Tipo de carne escolhida: alcatra");
        }
        else if(meet == 3)
        {
            if(quantity <= 5)
            {
                finalPrice = 6.90 * quantity;
            }
            else
            {
                finalPrice = 7.80 * quantity;
            }
            System.out.printf("Tipo de carne escolhida: picanha");
        }
        System.out.println("Tipo de carne escolhida: " + meet);
        System.out.println("A Quantidade de carne foi: " + quantity);
        if(tabajara == 1)
        {
            discount = 0.05 * finalPrice;
            finalPrice = 0.95 * finalPrice;
            System.out.printf("Preco total : %.2f reais %n" , (finalPrice));
            System.out.println("Tipo de pagamento: Cartao tabajara");
        }
        else
            System.out.println("Tipo de pagamento: cartao / dinheiro");
        System.out.printf("Desconto dado:  %.2f reais", (discount));
        
    }
}