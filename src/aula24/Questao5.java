package aula24;

public class Questao5
{
    public static void main(String[] args)
    {
        Conta conta_do_caio = new Conta();
        conta_do_caio.numero = 1001;
        conta_do_caio.saldo = 60;
        conta_do_caio.especial = true;
        conta_do_caio.limite = 50;
        System.out.printf("numero da conta: %d %n" , (conta_do_caio.numero));
        System.out.printf("numero da conta: %.2f %n" , (conta_do_caio.saldo));
        if(conta_do_caio.especial)
            System.out.printf("A conta eh especial. %n");
        else
            System.out.printf("A conta nao eh especial. %n");
    }
}