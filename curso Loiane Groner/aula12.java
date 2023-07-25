import java.util.Scanner; 

public class LerDadosTeclado{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu primeiro nome");
        String firstName = scan.next();
        System.out.println("Digite seu sobrenome");
        String lastName = scan.next();
        System.out.println("seu primeiro nome eh: " + firstName);
        
    }



}