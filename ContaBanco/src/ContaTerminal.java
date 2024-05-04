import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, Digite o múmero da Agencia.");

        int numero = scanner.nextInt();

        System.out.println("Por favor, Digite a agencia.");

        String agencia  = scanner.next();

        System.out.println("Por favor, Digite o seu nome.");

        String nome = scanner.next();

        System.out.println("Por favor, Digite o seu saldo.");

        Double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome+" obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia +", conta " + numero +" e seu saldo " + saldo + " já está disponível para saque.");
        
       




    }
}
