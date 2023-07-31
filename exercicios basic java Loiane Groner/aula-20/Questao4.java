import java.util.Scanner;

public class Questao4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String[][] agenda = new String[25][31];
        int ok = 1;
        int opcao;
        int dia = 0;
        while(ok == 1)
        {
            System.out.println("=====MENU DO CALENDARIO=====");
            System.out.println("1 - alterar/adcionar item a agenda");
            System.out.println("2 - consultar agenda");
            System.out.println("0 - sair da agenda");

            opcao = scan.nextInt();
            if(opcao == 1)
            {
            System.out.println("digite o dia que deseja alterar o compromisso e a hora.");
            dia = scan.nextInt();
            System.out.println("digite a hora que deseja alterar");
            int hora = scan.nextInt();
            agenda[hora][dia] = scan.next();
            }
            if(opcao == 2)
            {
                for(int i = 0 ; i < agenda.length ; i++)
                {
                    if(i != 0)
                    {
                        System.out.printf("Hora %d:00", (i));
                    }
                    for(int j = 0; j < agenda.length ; j++)
                    {
                        if(i == 0)
                            System.out.printf("\t Dia %d", (j+1));
                        else
                        {
                            if(agenda[i][j] == null && j != 1)
                                    System.out.printf("\t");
                            if(agenda[i][j]!=null)
                            {
                                System.out.printf("%s", (agenda[i][j]));
                            }
                        }
                    }
                    System.out.printf("%n");
                }
            }
            if(opcao == 0)
            {
                ok = 0;
            }
        }
    }
}